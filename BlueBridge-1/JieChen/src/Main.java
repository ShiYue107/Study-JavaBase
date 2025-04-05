
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		jj(9);
//		System.out.println(f(10));
		String str="abcde";
		System.out.println(new StringBuffer(str).reverse());
	}
	public static int f(int n) {
		if(n==1) {
			return 1;
		}else {
			int Ji=n*f(n-1);
			return Ji;
		}
	}
	public static void jj(int n) {
		if(n==1) {
			System.out.print(1+"*"+1+"="+1);
			System.out.println();
		}else {
			jj(n-1);
			for (int i = 1; i <=n; i++) {
				System.out.print(i+"*"+n+"="+(i*n)+"\t");
			}
			System.out.println();
		}
	}
}
