package domeTest;

public class Tools {

	private Tools() {
		
	}
	
	//加法
	public static int add(int x,int y) {
		return x+y;
	} 
	
	//减法
	public static int minus(int x,int y) {
		return x-y;
	}
	
	//乘法
	public static int multiplicate(int x,int y) {
		return x*y;
	}
	
	//除法
	public static int divide(int x,int y) {
		if (y==0) {
			System.out.println("除数不能为0");
			return 0;
		}else {
			return x/y;
		}
	}
	
	
}
