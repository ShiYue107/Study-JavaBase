package TestTree;

import java.util.Arrays;
import java.util.Scanner;

//游戏类
public class LOL {
	//英雄对象数据
	Hero [] heros = new Hero[5];
	//怪物对象数据
	Monster[] monsters = new Monster[100];
	//装备对象数据
	Equitpment [] equitpments = new Equitpment[6];
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("           英雄联盟");
		System.out.println("-----------------------------------");
		System.out.println("欢迎来到英雄联盟，请登录");
		String username = "admin";
		String password = "123456";
		LOL lol = new LOL();
		//boolean res;
		//do {
		//	res = lol.login(username, password);//调用登录方法
		//}while(res==false);
		while(true) {//死循环，直到用户名和密码输入正确，break循环
			if(lol.login(username, password)) {
				break;
			}
		}
		lol.initData();//初始化游戏数据
		System.out.println("召唤师，欢迎来到英雄联盟~");
		System.out.println("碾碎他们!");
		System.out.println("准备好了吗？精彩的对战即将开始！");
		Hero selectHero = lol.selectHero();//选择英雄
		lol.showHero(selectHero);//展示英雄信息
		System.out.println("你已经选择了英雄:"+selectHero.getName()+"下面开始你的峡谷之旅吧！");
		System.out.println("-----------------------------------");
		System.out.println("             新手村                                          ");
		System.out.println("-----------------------------------");
		String agin;
		do {
			System.out.println("菜单选项");
			System.out.println("1.购买装备");
			System.out.println("2.出村练级");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				lol.buyEquipment(selectHero);//购买装备
				break;
			case 2:
				//出村练级
				lol.upgrade(selectHero, lol.monsters[lol.monsters.length-1]);
				break;
			}
			System.out.println("是否继续游戏? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
		
	}
	//购买装备
	public void buyEquipment(Hero hero) {
		//遍历数组里面初始化好的装备    展示信息
		for (int i = 0; i < equitpments.length; i++) {
			System.out.println((i+1)+".装备名:"+equitpments[i].getName()+
					",攻击力:"+equitpments[i].getAttack()+
					",防御力:"+equitpments[i].getDefense()+
					",价格:"+equitpments[i].getPrice());
		}
		System.out.println("请选择编号购买:");
		int select = sc.nextInt();
		//遍历这个英雄的所有装备
		for (int i = 0; i < hero.getEquitpments().length; i++) {
			//判断英雄是否有钱来买
			if(hero.getMoney()>=equitpments[select-1].getPrice()) {
				//判断英雄当前装备栏是否有空位
				if(hero.getEquitpments()[i]==null) {
					//购买装备给英雄
					hero.getEquitpments()[i] = equitpments[select-1];
					//付款
					hero.setMoney(hero.getMoney()-equitpments[select-1].getPrice());
					System.out.println("购买成功！已经得到提升！快去体验一下吧~");
					break;
				}
			}else {
				System.out.println("金币不够，想要变强，请点击充值或出村打怪!");
				break;
			}
		}
		showHero(hero);
	}
	//出村练级
	public void upgrade(Hero hero,Monster monster) {
		//英雄造成多少伤害
		int hurt = hero.getAttack() / 2;
		boolean isFight = false;//是否继续打怪
		do {
			monster.setLife(monster.getLife()-hurt);//打完之后怪物还剩多少血
			if(monster.getLife()<=0) {
				//打死一只怪，就从数组里面移除一只怪
				monsters = Arrays.copyOf(monsters, monsters.length-1);
				System.out.println("怪物死亡！还剩怪物个数:"+monsters.length);
				hero.setMoney(hero.getMoney()+monster.getKillMoney());//获得金币
				hero.setExp(hero.getExp()+monster.getKillExp());//获得经验值
				//当经验值达到当前英雄等级的60倍就升级
				if(hero.getExp()>=hero.getLevel()*60) {
					hero.setExp(hero.getExp()-hero.getLevel()*60);
					hero.setLevel(hero.getLevel()+1);//升级
					hero.setAttack((int)(hero.getAttack()+hero.getAttack()*0.1));//升级之后提升10%的攻击力
					hero.setDefense((int)(hero.getDefense()+hero.getDefense()*0.1));//升级之后提升10%的防御力
				}
				showHero(hero);
				System.out.println("怪物个数:"+monsters.length);
				isFight = false;
			}else {
				System.out.println("对怪物造成"+hurt+"点伤害,怪物还剩"+monster.getLife()+"点生命值。");
				System.out.println("是否继续打怪？ y/n");
				String agin = sc.next();
				if(agin.equals("y")) {
					isFight = true;
				}
			}
		}while(isFight==true);
	}
	
	//显示英雄信息
	public void showHero(Hero hero) {
		System.out.println("名字:"+hero.getName());
		System.out.println("简介:"+hero.getIntroduction());
		for (Equitpment e:hero.getEquitpments()) {//遍历装备
			if(e==null) {
				break;
			}
			hero.setAttack(hero.getAttack()+e.getAttack());//攻击力：英雄本身攻击力+装备攻击力
			hero.setDefense(hero.getDefense()+e.getDefense());//防御力
		}
		System.out.printf("等级:%d,攻击力:%d,防御力:%d,经验值:%d,金币:%d\n",hero.getLevel(),hero.getAttack(),
				hero.getDefense(),hero.getExp(),hero.getMoney());
		
	}
	//初始化数据
	public void initData() {
		//初始化英雄
		heros[0] = new Hero("周权城", 999, 50, 0, 1, "大数据2班精神小伙，必杀技是吐木糖醇", 0);
		heros[1] = new Hero("卡特琳娜", 62, 30, 0, 1, "她对刀剑的精通和她残酷的性格为她赢得了“不祥之刃”的称号。",0);
		heros[2] = new Hero("盖伦", 47, 37,0, 1, "拥有\"德玛西亚之力\"头衔的英勇勇士，就是军队的模范。",0);
		heros[3] = new Hero("赵信", 45, 32, 0, 1, "人称\"德邦总管\"的赵信是光盾王朝的私人管家。",0);
		heros[4] = new Hero("艾希", 45, 70, 0, 1, "艾希继承了祖先精通的箭术，因此也继承了阿瓦罗萨\"寒冰射手\"的称号。",0);
		//初始化装备
		equitpments[0] = new Equitpment("木糖醇",10,0,300);
		equitpments[1] = new Equitpment("海克斯科技枪刃", 60, 0,3625);
		equitpments[2] = new Equitpment("奥秘之剑", 10, 0,1369);
		equitpments[3] = new Equitpment("无用大棒", 53, 0,1600);
		equitpments[4] = new Equitpment("熔岩巨剑", 45, 0,1650);
		equitpments[5] = new Equitpment("幽梦之灵", 65, 0,3200);
		//初始化怪兽
		for (int i = 0; i < monsters.length; i++) {
			monsters[i] = new Monster("怪物"+i+1,20,20,300,50,450);
		}
	}
	//选择英雄
	public Hero selectHero() {
		System.out.println("------------------------------");
		System.out.println("             英雄列表    ");
		System.out.println("------------------------------");
		for (int i = 0; i < heros.length; i++) {
			System.out.println((i+1)+"."+heros[i].getName());//遍历初始化好的数组里面的每一个英雄
		}
		System.out.println("请选择英雄编号,查看英雄属性!");
		int selectNo = sc.nextInt();
		return heros[selectNo-1];
	}
	
	//登陆游戏
	public boolean login(String username,String password) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String uname = sc.next();
		System.out.println("请输入密码:");
		String pwd = sc.next();
		//拿用户输入的用户名和密码与正确的作比较
		if(uname.equals(username)&&pwd.equals(password)) {
			System.out.println("登录成功!");
			flag = true;
		}else {
			System.out.println("用户名或密码错误，登录失败!");
		}
		return flag;
	}
}
