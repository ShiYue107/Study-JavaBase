package TestTree;

import java.util.Arrays;
import java.util.Scanner;

//��Ϸ��
public class LOL {
	//Ӣ�۶�������
	Hero [] heros = new Hero[5];
	//�����������
	Monster[] monsters = new Monster[100];
	//װ����������
	Equitpment [] equitpments = new Equitpment[6];
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("           Ӣ������");
		System.out.println("-----------------------------------");
		System.out.println("��ӭ����Ӣ�����ˣ����¼");
		String username = "admin";
		String password = "123456";
		LOL lol = new LOL();
		//boolean res;
		//do {
		//	res = lol.login(username, password);//���õ�¼����
		//}while(res==false);
		while(true) {//��ѭ����ֱ���û���������������ȷ��breakѭ��
			if(lol.login(username, password)) {
				break;
			}
		}
		lol.initData();//��ʼ����Ϸ����
		System.out.println("�ٻ�ʦ����ӭ����Ӣ������~");
		System.out.println("��������!");
		System.out.println("׼�������𣿾��ʵĶ�ս������ʼ��");
		Hero selectHero = lol.selectHero();//ѡ��Ӣ��
		lol.showHero(selectHero);//չʾӢ����Ϣ
		System.out.println("���Ѿ�ѡ����Ӣ��:"+selectHero.getName()+"���濪ʼ���Ͽ��֮�ðɣ�");
		System.out.println("-----------------------------------");
		System.out.println("             ���ִ�                                          ");
		System.out.println("-----------------------------------");
		String agin;
		do {
			System.out.println("�˵�ѡ��");
			System.out.println("1.����װ��");
			System.out.println("2.��������");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				lol.buyEquipment(selectHero);//����װ��
				break;
			case 2:
				//��������
				lol.upgrade(selectHero, lol.monsters[lol.monsters.length-1]);
				break;
			}
			System.out.println("�Ƿ������Ϸ? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
		
	}
	//����װ��
	public void buyEquipment(Hero hero) {
		//�������������ʼ���õ�װ��    չʾ��Ϣ
		for (int i = 0; i < equitpments.length; i++) {
			System.out.println((i+1)+".װ����:"+equitpments[i].getName()+
					",������:"+equitpments[i].getAttack()+
					",������:"+equitpments[i].getDefense()+
					",�۸�:"+equitpments[i].getPrice());
		}
		System.out.println("��ѡ���Ź���:");
		int select = sc.nextInt();
		//�������Ӣ�۵�����װ��
		for (int i = 0; i < hero.getEquitpments().length; i++) {
			//�ж�Ӣ���Ƿ���Ǯ����
			if(hero.getMoney()>=equitpments[select-1].getPrice()) {
				//�ж�Ӣ�۵�ǰװ�����Ƿ��п�λ
				if(hero.getEquitpments()[i]==null) {
					//����װ����Ӣ��
					hero.getEquitpments()[i] = equitpments[select-1];
					//����
					hero.setMoney(hero.getMoney()-equitpments[select-1].getPrice());
					System.out.println("����ɹ����Ѿ��õ���������ȥ����һ�°�~");
					break;
				}
			}else {
				System.out.println("��Ҳ�������Ҫ��ǿ��������ֵ�������!");
				break;
			}
		}
		showHero(hero);
	}
	//��������
	public void upgrade(Hero hero,Monster monster) {
		//Ӣ����ɶ����˺�
		int hurt = hero.getAttack() / 2;
		boolean isFight = false;//�Ƿ�������
		do {
			monster.setLife(monster.getLife()-hurt);//����֮����ﻹʣ����Ѫ
			if(monster.getLife()<=0) {
				//����һֻ�֣��ʹ����������Ƴ�һֻ��
				monsters = Arrays.copyOf(monsters, monsters.length-1);
				System.out.println("������������ʣ�������:"+monsters.length);
				hero.setMoney(hero.getMoney()+monster.getKillMoney());//��ý��
				hero.setExp(hero.getExp()+monster.getKillExp());//��þ���ֵ
				//������ֵ�ﵽ��ǰӢ�۵ȼ���60��������
				if(hero.getExp()>=hero.getLevel()*60) {
					hero.setExp(hero.getExp()-hero.getLevel()*60);
					hero.setLevel(hero.getLevel()+1);//����
					hero.setAttack((int)(hero.getAttack()+hero.getAttack()*0.1));//����֮������10%�Ĺ�����
					hero.setDefense((int)(hero.getDefense()+hero.getDefense()*0.1));//����֮������10%�ķ�����
				}
				showHero(hero);
				System.out.println("�������:"+monsters.length);
				isFight = false;
			}else {
				System.out.println("�Թ������"+hurt+"���˺�,���ﻹʣ"+monster.getLife()+"������ֵ��");
				System.out.println("�Ƿ������֣� y/n");
				String agin = sc.next();
				if(agin.equals("y")) {
					isFight = true;
				}
			}
		}while(isFight==true);
	}
	
	//��ʾӢ����Ϣ
	public void showHero(Hero hero) {
		System.out.println("����:"+hero.getName());
		System.out.println("���:"+hero.getIntroduction());
		for (Equitpment e:hero.getEquitpments()) {//����װ��
			if(e==null) {
				break;
			}
			hero.setAttack(hero.getAttack()+e.getAttack());//��������Ӣ�۱�������+װ��������
			hero.setDefense(hero.getDefense()+e.getDefense());//������
		}
		System.out.printf("�ȼ�:%d,������:%d,������:%d,����ֵ:%d,���:%d\n",hero.getLevel(),hero.getAttack(),
				hero.getDefense(),hero.getExp(),hero.getMoney());
		
	}
	//��ʼ������
	public void initData() {
		//��ʼ��Ӣ��
		heros[0] = new Hero("��Ȩ��", 999, 50, 0, 1, "������2�ྫ��С���ɱ������ľ�Ǵ�", 0);
		heros[1] = new Hero("��������", 62, 30, 0, 1, "���Ե����ľ�ͨ�����п���Ը�Ϊ��Ӯ���ˡ�����֮�С��ĳƺš�",0);
		heros[2] = new Hero("����", 47, 37,0, 1, "ӵ��\"��������֮��\"ͷ�ε�Ӣ����ʿ�����Ǿ��ӵ�ģ����",0);
		heros[3] = new Hero("����", 45, 32, 0, 1, "�˳�\"�°��ܹ�\"�������ǹ��������˽�˹ܼҡ�",0);
		heros[4] = new Hero("��ϣ", 45, 70, 0, 1, "��ϣ�̳������Ⱦ�ͨ�ļ��������Ҳ�̳��˰�������\"��������\"�ĳƺš�",0);
		//��ʼ��װ��
		equitpments[0] = new Equitpment("ľ�Ǵ�",10,0,300);
		equitpments[1] = new Equitpment("����˹�Ƽ�ǹ��", 60, 0,3625);
		equitpments[2] = new Equitpment("����֮��", 10, 0,1369);
		equitpments[3] = new Equitpment("���ô��", 53, 0,1600);
		equitpments[4] = new Equitpment("���Ҿ޽�", 45, 0,1650);
		equitpments[5] = new Equitpment("����֮��", 65, 0,3200);
		//��ʼ������
		for (int i = 0; i < monsters.length; i++) {
			monsters[i] = new Monster("����"+i+1,20,20,300,50,450);
		}
	}
	//ѡ��Ӣ��
	public Hero selectHero() {
		System.out.println("------------------------------");
		System.out.println("             Ӣ���б�    ");
		System.out.println("------------------------------");
		for (int i = 0; i < heros.length; i++) {
			System.out.println((i+1)+"."+heros[i].getName());//������ʼ���õ����������ÿһ��Ӣ��
		}
		System.out.println("��ѡ��Ӣ�۱��,�鿴Ӣ������!");
		int selectNo = sc.nextInt();
		return heros[selectNo-1];
	}
	
	//��½��Ϸ
	public boolean login(String username,String password) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String uname = sc.next();
		System.out.println("����������:");
		String pwd = sc.next();
		//���û�������û�������������ȷ�����Ƚ�
		if(uname.equals(username)&&pwd.equals(password)) {
			System.out.println("��¼�ɹ�!");
			flag = true;
		}else {
			System.out.println("�û�����������󣬵�¼ʧ��!");
		}
		return flag;
	}
}
