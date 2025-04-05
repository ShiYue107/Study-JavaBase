import java.util.Scanner;

public class Main {
			//三月二十二日 校内模拟考第一个大题
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num = sc.nextInt();
//		Main mi = new Main();
//		if (num<100) {
//			int sum=mi.liangWei(num);
//			System.out.println(sum);
//		}else if (num<1000) {
//			int sum=mi.sanWei(num);
//			System.out.println(sum);
//		}else if (num<10000) {
//			int sum=mi.siWei(num);
//			System.out.println(sum);
//		}
//		 
//	}
//	public int liangWei(int num) {
//		int sum =0;
//		int n =num;
//		for (int i = 01; i <=num; i++) {
//			int m = i;
//			int n1=i%10;
//			int n2=i/10;
//			if (n1>=n2) {
//				sum++;
//			}
//		}
//		return sum;
//	}
//	public int sanWei(int num) {
//		int sum =0;
//		int n =num;
//		for (int i = 01; i <=num; i++) {
//			int m = i;
//			int n1=i%10;
//			int n2=i/10%10;
//			int n3=i/100%10;
//			if (n1>=n2&&n1>=n3) {
//				sum++;
//			}
//		}
//		return sum;
//	}
//	public int siWei(int num) {
//		int sum =0;
//		int n =num;
//		for (int i = 01; i <=num; i++) {
//			int m = i;
//			int n1=i%10;
//			int n2=i/10%10;
//			int n3=i/100%10;
//			int n4=i/1000%10;
//			if (n1>=n2&&n1>=n3&&n1>=n4) {
//				sum++;
//			}
//		}
//		return sum;
//	}
	
				//三月二十二日 校内模拟考第二个大题
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			String name = sc.next();
//			if (name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u') {
//				System.out.println("no");
//			}else if (name.charAt(2)=='a'||name.charAt(2)=='e'||name.charAt(2)=='i'||name.charAt(2)=='o'||name.charAt(2)=='u') {
//				System.out.println("yes");
//			}else if (name.charAt(4)=='a'||name.charAt(4)=='e'||name.charAt(4)=='i'||name.charAt(4)=='o'||name.charAt(4)=='u') {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
//		}
		
	
//				//三月二十二日 校内模拟考第三个大题
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum=0;
//		int [] a = new int [num];
//		for (int i = 0; i < a.length; i++) {
//			a[i]=sc.nextInt();
//		}
//		for (int i = 1; i < a.length-1; i++) {
//			if (a[i-1]<a[i]&&a[i]<a[i+1]) {
//				sum++;
//			}
//		}
//		System.out.println(sum);
//	}
	
				//三月二十二日 校内模拟考第四个大题
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		double [][] nums = new double[n][m]; 
//		for (int i = 0; i < nums.length; i++) {
//			nums[i][i]=sc.nextDouble();
//		}
//		System.out.println(nums[1][1]);
//	}
	
	
				//三月二十二日 校内模拟考第五个大题
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] a ={0,1, 2, 4, 7, 14, 26, 53, 106, 220, 452, 946, 1967, 4128, 8638, 8144, 8068};
//		System.out.println(a[n]);
//	}
	
				//三月二十二日 校内模拟考第六个大题
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		int [] nums=new int [n];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i]=sc.nextInt();
//		}
//		for (int i = 0; i < nums.length-1; i++) {
//			for (int j = 0; j < nums.length-1-i; j++) {
//				if (nums[j]<nums[j+1]) {
//					int temp = nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1]=temp;
//				}
//			}
//		}
//		for (int i = 0; i < m; i++) {
//			System.out.print(nums[i]+" ");
//		}
//	}
}
