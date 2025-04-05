import java.util.Scanner;

public class Doc {
/**
 * 圆的面积
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	double s=num*num*Math.PI;
	System.out.printf("%.7f",s);
}
序列的和
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for (int i =1; i <=n; i++) {
		sum+=i;
	}
	System.out.println(sum);
}
A+B问题
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Integer a = sc.nextInt();
    Integer b = sc.nextInt();
    System.out.println(a + b);
}
整商问题
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the dividend:");
		int dividend=sc.nextInt();
		System.out.println("Please enter the divisor:");
		int divisor=sc.nextInt();
		for (;;) {
			if (divisor==0) {
				System.out.println("Error: divisor can not be zero! Please enter a new divisor:");
				divisor=sc.nextInt();
			}else {
				break;
			}
		}
		System.out.println(dividend/divisor);
	}
	//小写转大写
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		System.out.println(x.toUpperCase());
	}
	水仙花数
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int num=i;
			int g=num%10;
			int s=num/10%10;
			int b=num/100;
			if(g*g*g+s*s*s+b*b*b==num) {
				System.out.println(num);
			}
		}
	}
	求大数
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] num=new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		int max=num[num.length-1];
		System.out.println(max);
	}
	递归输出
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=n+"";
		System.out.println(f(str));
	}
	public static String f(String str) {
		if(str.length()==1) {
			return str+"-";
		}
		return str.charAt(0)+"-"+f(str.substring(1, str.length()));
	}
	空心菱形
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int k =0; k<=n-i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j <(2*i-1); j++) {
				System.out.print(" ");
			}
			for (int k =0; k<=n-i; k++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		for (int a = 2; a <n+1; a++) {
			for (int b = 0; b <a; b++) {
				System.out.print("*");
			}
			int num=n;
			for (int j =0; j <(2*num-(2*a-1)); j++) {
				System.out.print(" ");
			}
			for (int b = 0; b <a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	冒泡排序
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []nums=new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		for (int j = 0; j < nums.length-1; j++) {
			for (int k = 0; k < nums.length-1-j; k++) {
				if(nums[k]>nums[k+1]) {
					int temp;
					temp=nums[k];
					nums[k]=nums[k+1];
					nums[k+1]=temp;
				}
			}
		}
		System.out.print("从小到大的顺序：");
		for (int d = 0; d < nums.length; d++) {
			System.out.print(nums[d]+" ");
		}
		System.out.println();
		System.out.print("从大到小的顺序：");
		for (int x = nums.length-1; x >=0; x--) {
			System.out.print(nums[x]+" ");
		}
	}
 */
}
