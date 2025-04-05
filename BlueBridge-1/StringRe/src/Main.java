
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdef";
		System.out.println(f(str));
	}
	public static String f(String s) {
		if(s.length()==1) {
			return s;
		}
		return s.charAt(s.length()-1)+f(s.substring(0, s.length()-1));
	}
}
