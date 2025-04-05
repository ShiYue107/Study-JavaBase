package TestJavaEr;
import java.util.Scanner;

public class Rectangle {
	double length,width;
	
	public void getArea(double length,double width) {
		System.out.println("长方形的面积为："+length*width);
	}
	public void getPerimenter(double length,double width) {
		double perimenter= 2*(length+width);
		System.out.println("长方形的周长为："+perimenter);
	}
	public static void main(String[] args){
		Scanner sca= new Scanner(System.in);
		System.out.println("请输入长方形的的长：");
		double length = sca.nextDouble();
		System.out.println("请输入长方形的的宽：");
		double width = sca.nextDouble();
		
		Rectangle ret = new Rectangle();
		ret.getArea(length, width);
		ret.getPerimenter(length, width);
	}
}
