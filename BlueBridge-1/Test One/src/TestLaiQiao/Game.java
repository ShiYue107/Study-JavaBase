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
			System.out.println("��ȭ��Ϸ��0-----ʯͷ�� 1------���ӣ� 2------��  ��������������ĳ�ȭ��");
			my = sc.nextInt();
			switch (my) {
			case 0:
				System.out.println("������ǣ�ʯͷ");
				break;
			case 1:
				System.out.println("������ǣ�����");
				break;
			case 2:
				System.out.println("������ǣ���");
				break;
			default:
				System.out.println("������Ĵ�������������");
				gamePlayer();
				break;
			}
		}

		public static void computerPlayer() {
			pc = (int) (Math.random() * 3);
			switch (pc) {
			case 0:
				System.out.println("���Գ����ǣ�ʯͷ");
				break;
			case 1:
				System.out.println("���Գ����ǣ�����");
				break;
			case 2:
				System.out.println("���Գ����ǣ���");
				break;
			}

		}

		public static void judge() {
			if (my == pc) {
				equal++;
				System.out.println("�����ƽ�֣���");
			} else if ((my == 0 && pc == 1) ||( my == 1 && pc == 2 )||( my == 2 && pc == 0) ){
				gamePlanyerWin++;
				System.out.println("��ϲ�㣬��Ӯ�ˣ���");
			} else {
				computerWin++;
				System.out.println("�����ˣ��ٽ���������");
			}
		}

		public static void and() {
			System.out.println("������Ϣ���£�");
			System.out.println("��Ӯ��" + gamePlanyerWin + "��," + "����" + computerWin + "��,");
			System.out.println("����Ӯ��" + computerWin + "��" + "����" + gamePlanyerWin + "��,");
			System.out.println("һ��ƽ����" + equal + "��");
			 int sum=gamePlanyerWin + computerWin + equal;
			System.out.println("��������" + sum + "�֡�");
		}

		public static void contiune() {
			String answer;
			do {

				Scanner sc = new Scanner(System.in);
				System.out.println("�Ƿ�Ҫ�����棿y/n");
				answer = sc.next();
				if (answer.equals("y")) {
					gamePlayer();
					computerPlayer();
					judge();
				} else if (answer.equals("n")) {
					and();
				} 
				else {
					System.out.println("���벻��ȷ�����������룺");
					contiune();
				}

			} while (answer.equals("y"));

		}

		public static void result() {
			System.out.println("*********************************************************");
			System.out.println("                   ��ӭ������ȭ��Ϸ                                         ");
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

