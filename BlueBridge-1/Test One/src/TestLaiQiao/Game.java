package TestLaiQiao;

import java.util.Scanner;
	
public class Game {
		static int my;
		static int pc;
		static int gamePlanyerWin = 0;
		static int computerWin = 0;
		static int equal = 0;

		public static void gamePlayer() {
			Scanner sc = new Scanner(System.in);
			System.out.println("猜拳游戏：0-----石头， 1------剪子， 2------布  请在下面输入你的出拳：");
			my = sc.nextInt();
			switch (my) {
			case 0:
				System.out.println("你出的是：石头");
				break;
			case 1:
				System.out.println("你出的是：剪子");
				break;
			case 2:
				System.out.println("你出的是：布");
				break;
			default:
				System.out.println("你输入的错误，请重新输入");
				gamePlayer();
				break;
			}
		}

		public static void computerPlayer() {
			pc = (int) (Math.random() * 3);
			switch (pc) {
			case 0:
				System.out.println("电脑出的是：石头");
				break;
			case 1:
				System.out.println("电脑出的是：剪子");
				break;
			case 2:
				System.out.println("电脑出的是：布");
				break;
			}

		}

		public static void judge() {
			if (my == pc) {
				equal++;
				System.out.println("这次是平局！！");
			} else if ((my == 0 && pc == 1) ||( my == 1 && pc == 2 )||( my == 2 && pc == 0) ){
				gamePlanyerWin++;
				System.out.println("恭喜你，你赢了！！");
			} else {
				computerWin++;
				System.out.println("你输了，再接再厉！！");
			}
		}

		public static void and() {
			System.out.println("数据信息如下：");
			System.out.println("你赢了" + gamePlanyerWin + "次," + "输了" + computerWin + "次,");
			System.out.println("电脑赢了" + computerWin + "次" + "输了" + gamePlanyerWin + "次,");
			System.out.println("一共平局了" + equal + "次");
			 int sum=gamePlanyerWin + computerWin + equal;
			System.out.println("共进行了" + sum + "局。");
		}

		public static void contiune() {
			String answer;
			do {

				Scanner sc = new Scanner(System.in);
				System.out.println("是否要继续玩？y/n");
				answer = sc.next();
				if (answer.equals("y")) {
					gamePlayer();
					computerPlayer();
					judge();
				} else if (answer.equals("n")) {
					and();
				} 
				else {
					System.out.println("输入不正确，请重新输入：");
					contiune();
				}

			} while (answer.equals("y"));

		}

		public static void result() {
			System.out.println("*********************************************************");
			System.out.println("                   欢迎来到猜拳游戏                                         ");
			System.out.println("*********************************************************");
			gamePlayer();
			computerPlayer();
			judge();
			contiune();
		}

		public static void main(String[] args) {
			Game md = new Game();
			result();

		}

	}

