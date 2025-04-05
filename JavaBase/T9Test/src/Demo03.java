import java.util.Scanner;

public class Demo03 {
	
	public static char getLeve(int num) {
		char leve;
		if (num>=90) {
			leve='A';
		}else if (num>=80) {
			leve='B';
		}else if (num>=60) {
			leve='C';
		}else {
			leve='D';
		}
		return leve;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请您录入学生的英语成绩：");
		int num=sc.nextInt();
		char leve = getLeve(num);
		System.out.println("成绩测评结果："+leve);
		
	}
}
