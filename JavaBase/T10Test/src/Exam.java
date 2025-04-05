import java.util.Scanner;

public class Exam {
	
		
	public static void main(String[] args) {
		
		int [] write=new int[5];
			
		int [] lab=new int[5];
		
		double [] scores =new double[5];
		
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("��"+(i+1)+"λԱ���Ĳ���������");
			System.out.print("���۳ɼ���");
			write[i]=sc.nextInt();
			System.out.print("���Գɼ���");
			lab[i]=sc.nextInt();
			scores[i]=write[i]*0.4+lab[i]*0.6;
		}
		System.out.println("���ճɼ���");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
			
	}
}
