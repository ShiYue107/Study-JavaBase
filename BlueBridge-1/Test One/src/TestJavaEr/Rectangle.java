package TestJavaEr;
import java.util.Scanner;

public class Rectangle {
	double length,width;
	
	public void getArea(double length,double width) {
		System.out.println("�����ε����Ϊ��"+length*width);
	}
	public void getPerimenter(double length,double width) {
		double perimenter= 2*(length+width);
		System.out.println("�����ε��ܳ�Ϊ��"+perimenter);
	}
	public static void main(String[] args){
		Scanner sca= new Scanner(System.in);
		System.out.println("�����볤���εĵĳ���");
		double length = sca.nextDouble();
		System.out.println("�����볤���εĵĿ�");
		double width = sca.nextDouble();
		
		Rectangle ret = new Rectangle();
		ret.getArea(length, width);
		ret.getPerimenter(length, width);
	}
}
