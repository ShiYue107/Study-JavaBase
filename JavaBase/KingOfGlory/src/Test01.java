import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("欢迎使用koma游戏");
		System.out.println("------------------------");
		System.out.println("开始游戏");
		Scanner rc = new Scanner(System.in);
		System.out.println("请输入英雄名称");
		String name1 = rc.next();
		System.out.println("请输入攻击力【1-100】");
		int attack1 = rc.nextInt();
		System.out.println("请输入防御值【1-50】");
		int defense1 = rc.nextInt();
		System.out.println("请输入生命值【1-100】");
		int life1 = rc.nextInt();
		
		String name2 = "怪物1";
		int attack2 = 60;
		int defense2 = 20;
		int life2 = 60;
		
		int harm = attack2-defense1;
		life1 -=harm;
		if (life1>0) {
			System.out.println(name2+"发动攻击，"+name1+"掉了"+harm+"生命值。");
			System.out.println(name1+"挡住了攻击");
			System.out.println(name1+"生命值还剩"+life1);
		} else {
			System.out.println(name1+"没有挡住"+name2+"攻击");
			life1 = 0;
			System.out.println(name1+"生命值为"+life1);
		}
	}
}
