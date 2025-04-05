package test;

public class GetMax {
	public static void main(String[] args) {
		System.out.println("1~100之间能够同时被3和4整除的最大的五个数字：");
		int count=0;
		for (int i = 100; i >0; i--) {
			if (i%3==0&&i%4==0) {
				System.out.println(i);
				count++;
			}
			if (count==5) {
				break;
			}
		}
	}
}
