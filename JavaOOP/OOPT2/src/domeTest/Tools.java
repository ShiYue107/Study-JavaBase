package domeTest;

public class Tools {

	private Tools() {
		
	}
	
	//�ӷ�
	public static int add(int x,int y) {
		return x+y;
	} 
	
	//����
	public static int minus(int x,int y) {
		return x-y;
	}
	
	//�˷�
	public static int multiplicate(int x,int y) {
		return x*y;
	}
	
	//����
	public static int divide(int x,int y) {
		if (y==0) {
			System.out.println("��������Ϊ0");
			return 0;
		}else {
			return x/y;
		}
	}
	
	
}
