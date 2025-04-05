package TestLaiQiao;
	//《248--272》
/**
 * 
 * @author Beyond
 *  输入两个整数，判断第一个数能否被第二个数整除（即第一个数除第二个数能否除尽），
	如果能够除尽，输出1，否则输出0.
 */
	
	
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
	//4月29号
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//
	}
}
	/*	4月28日
	瓷砖铺放
	static Scanner sc=new Scanner(System.in);

	static int N;
	static int count=0;
	public static void main(String[] args) {
		N=sc.nextInt();
		puf(0);
		System.out.println(count);
	}
	public static void puf(int val){
		if (val==N){
			count++;
			return;
		}
		if (val+1<=N){
			puf(val+1);
		}
		if (val+2<=N){
			puf(val+2);
		}
	}

	进制转换
		int n=sc.nextInt();
		int n1 = 0;
		int j=sc.nextInt();
		int j1=-j;
		if (n<0){
			n1=-n;
		}else{
			n1=n;
		}
		String s=Integer.toString(n1,j1);
		System.out.println(n+"="+s+"(base"+j+")");

	删除多余括号 集合那有点懵

	-2进制	负号那里不会
		int n=sc.nextInt();
		String s1=Integer.toBinaryString(n);
		System.out.println(s1);

	报数		循环 判断那里不会

	步与血	题目看不懂
	 */

	/*	4月27日
	除法运算
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if (n1%n2==0){
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	单词翻转		输入换行结束输入流不会
		String [] arr=new String[3];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next();
		}
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}

	非递归 题目不懂
	 */

	/*	4月25日
	矩阵对角线元素之和
		int [] arr=new int[16];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=arr[0]+arr[3]+arr[5]+arr[6]+arr[9]+arr[10]+arr[12]+arr[15];
		System.out.println(sum);

	连续平方和
		int min=sc.nextInt();
		int max=sc.nextInt();
		int num=0;
		for (int i = min; i <=max; i++) {
			num+=i*i;
		}
		System.out.println(num);

	每月的天数
		int n=sc.nextInt();
		switch (n){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(30);
				break;
			case 2:
				System.out.println(28);
				break;
			default:
				break;
		}

	求1加到x的和(number)
		int n=sc.nextInt();
		int number=0;
		for (int i = 1; i <= n; i++) {
			number+=i;
		}
		System.out.println(number);

	求1000以内的完数
		for (int i=2;i<1000;i++){
			int a=i;
			int sum=0;
			for (int j=1;j<a;j++){
				if (a%j==0){
					sum+=j;
				}
			}
			if (sum==i){
				System.out.println(i);
			}
		}
	 */

	/*	4月24日
	求数列的项
		int [] arr=new int[20];
		arr[0]=1;
		arr[1]=2;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	十进制转2进制输出
		int n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		System.out.println(s);

	时间转换
		int n=sc.nextInt();
		int h=n/3600;
		int m=n%3600/60;
		int s=n%3600%60;
		System.out.println(h+":"+m+":"+s);

	最大质因数	数组 循环 算最大质因数那里有点晕
	*/

	/*	4月23日
	快速排序
		int n=sc.nextInt();
		int [] nums=new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] =sc.nextInt();
		}
		for (int i=0;i<n-1;i++){
			for (int j=0;j<n-i-1;j++){
				if (nums[j]>nums[j+1]){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	A+B Problem
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);

	判定数字
		String str=sc.next();
		boolean falt= isNum(str);
		if (falt){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	public static boolean isNum(String str){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)<'0'||str.charAt(i)>'9'){
				return false;
			}
		}
		return true;

	字符串逆序
		String s=sc.next();
		char [] ar=new char[s.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=s.charAt(i);
		}
		for (int i = ar.length-1; i >= 0; i--) {
			System.out.print(ar[i]);
		}

	最长字符串		比较那里有点困难
		String [] arr=new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next();
		}
		String maxLong=arr[0];
		for (int i = 1; i <arr.length; i++) {
			if (arr[i].length()>arr[0].length()){
				maxLong=arr[i];
			}
		}
		System.out.println(maxLong);

	比较字符串		输出ASCII那里不懂
		String s1=sc.next();
		String s2=sc.next();
		if (s1.length()==s2.length()){
			System.out.println(0);
		}else if(s1.length()>s2.length()){
			char a=s1.charAt(0);
			System.out.println(a);
		}else {
			char b=s1.charAt(0);
			System.out.println(b);
		}

	成绩的等级输出
		int cores =sc.nextInt();
		if (cores>=90 && cores<=100){
		System.out.println("A");
		}
		if (cores>=80 && cores<=89){
		System.out.println("B");
		}
		if (cores>=70 && cores<=79){
		System.out.println("C");
		}
		if (cores>=60 && cores<=69){
		System.out.println("D");
		}
		if (cores>=0 && cores<=59){
		System.out.println("E");
		}*/

	/*	4月21日
	奇偶判断
		int n=sc.nextInt();
		if (n%2==0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}

	平方计算
		int a=sc.nextInt();
		int m=sc.nextInt();
		int c=a*a%m;
		System.out.println(c);

	乘法表
		math(9);
	}
	public static void math(int num){
		if (num==1){
			System.out.print(1+"*"+1+"="+1*1);
			System.out.println();
		}else {
			math(num-1);
			for (int i=1;i<=num;i++){
				System.out.print(num+"*"+i+"="+num*i+"\t");
			}
			System.out.println();
		}

	大小写判断
		char a=sc.next().charAt(0);
		if (a<='A'&&a<='Z'){
			System.out.println("upper");
		}else {
			System.out.println("lower");
		}

	字符串编辑 集合 删除那里不会

	最大值与最小值的计算
		int n=11;
		int [] nums=new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] =sc.nextInt();
		}
		for (int i=0;i<n-1;i++){
			for (int j=0;j<n-i-1;j++){
				if (nums[j]<nums[j+1]){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		int max=nums[0];
		int min=nums[n-1];
		System.out.println(max+" "+min);
	 */

	/*	4月20日
	统计字符次数
		String s=sc.next();
		int count =0;
		for (int i = 0; i <s.length(); i++) {
			char a=s.charAt(i);
			if (a>='0'&&a<='9'){
				count++;
			}
		}
		System.out.println(count);

	连接字符串
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(s1+s2);

	筛选号码	算法 枚举、标记数组

	十进制数转八进制数
		int n=sc.nextInt();
		String b=Integer.toOctalString(n);
		System.out.println(b);

	斜率计算
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			if (x1==x2){
			System.out.println("INF");
			}else if (y1==y2){
			System.out.println(0);
			}else {
			System.out.println(y2/y1);
			}*/

	/*	4月19日
	确定元音字母位置
		String s=sc.next();
		char a;
		for (int i = 0; i <s.length(); i++) {
			a=s.charAt(i);
			if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
				System.out.println(i+1);
				break;
			}
			if (a!='a'||a!='e'||a!='i'||a!='o'||a!='u'){
				System.out.println(0);
				break;
			}
		}

	整数平均值
			int n=sc.nextInt();
			int sum=0;
			for (int i = 0; i <n ; i++) {
			sum+=sc.nextInt();
			}
			System.out.println(sum/n);*/

	/*	4月18日
	阶乘取 ！=2
		int n=sc.nextInt();
		int act=1;
		for (int i=1;i<=n;i++){
			act*=i;
		}
		do {
			int a=act%10;
			if (a==0){
				act/=10;
				continue;
			}else {
				System.out.println(a);
				break;
			}
		}while (true);

	String s=sc.next();
	int n=Integer.parseInt(s,2);
		System.out.println(n);*/

	/*	4月15日
	System.out.println("Hello World!");

	String n=sc.next();
		for (int i=0;i<n.length();i++){
			System.out.print(n.charAt(i)+" ");
		}

	double n=sc.nextDouble(), m=sc.nextDouble();
		double sum=0;
		if (n<=40){
			sum=n*m;
			System.out.printf("%.2f",sum);
		}else if (n>40&&n<=50){
			sum=40*m+(n-40)*(m*1.5);
			System.out.printf("%.2f",sum);
		}else {
			sum=55*m+(n-50)*(m*2);
			System.out.printf("%.2f",sum);
		}

	int min =sc.nextInt();
		int max = sc.nextInt();
		int factor=sc.nextInt();
		for (int i=min;i<=max;i++){
			if (i%factor==0){
				System.out.print(i+" ");
			}
		}

	int n=sc.nextInt();
		for (int i=1;i<=n;i++){
				for (int j=1;j<=n;j++){
				if (i*j==n){
				System.out.println(i+" * "+j+" = "+n);
				}
				}
				}*/

	/*	4月13日
	int num=sc.nextInt();
	int sum=0;
		for (int i=1;i<num;i++){
		if (num%i==0){
		sum+=i;
		}
		}
		if (sum==num){
		System.out.println("yes");
		}else{
		System.out.println("no");
		}*/

	/*	4月10日
	long n=sc.nextLong();
		long add=1;
		if(n < 10)
			 add=1;
		while(n>0)
		{
			if(n%10!=0)
				add*=n%10;
			n/=10;
		}
		System.out.println(add);

	String s=sc.next();
		System.out.println(ret(s));
	}
	public static int ret(String s){
		for (int i=0;i<s.length();i++){
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u'){
				return i+1;
			}
		}
		return 0;

	Random rdm=new Random();
		int n=sc.nextInt();
		int [] num=new int[n];
		for (int i=0;i<num.length;i++){
			num[i]=rdm.nextInt(1000)+1;
		}
		for (int j=0;j<num.length;j++){
			System.out.print(num[j]+" ");
		}

	int n=sc.nextInt();
	int[] num=new int[n];
		for (int i=0;i<num.length;i++){
		num[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		int sum=0;
		for (int i=0;i<num.length;i++){
		for (int j=0;j<num.length;j++){
		for (int k=0;k<num.length;k++){
		if (num[i]+num[j]+num[k]==s){
		System.out.println(num[i]+" "+num[j]+" "+num[k]+" ");
		sum++;
		}
		}
		}
		}
		System.out.println(sum);*/

	/*	4月9日
	int n=sc.nextInt();
		int m=sc.nextInt();
		int sumn=0;
		int summ=0;
		for (int i=1;i<n;i++){
			if (n%i==0){
				sumn+=i;
			}
		}
		for (int i=1;i<m;i++){
			if (m%i==0){
				summ+=i;
			}
		}
		if (summ==n && sumn==m){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	int num1=sc.nextInt();
	int num2=sc.nextInt();
		System.out.println(num1+num2);*/

	/*	4月8日
	int n=sc.nextInt();
		int a=n%10;
		int b=n/10%10;
		int c=n/100;
		if (a*a*a+b*b*b+c*c*c==n){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	for (int i=1000;i<=9999;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100%10;
			int d=i/1000;
			if (a+b+c+d==10){
				System.out.println(i);
			}
		}

	int n=sc.nextInt();
		double sum=0;
		for (int i=0;i<n;i++){
			String mc =sc.next();
			double dj=sc.nextDouble();
			double sl=sc.nextDouble();
			double c=dj*sl;
			sum+=c;
		}
		System.out.printf("%.6f",sum);

	int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			for (int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for (int k=0;k<2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}

	for (int i=1;i<=1000;i++){
			if (i%11==0&&i%17==0){
			System.out.println(i);
			}
			}*/

	/*	4月7日
	for (int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100;
			if (a*a*a+b*b*b+c*c*c==i){
				System.out.println(i);
			}
		}

	int n=sc.nextInt();
		int m=sc.nextInt();
		int act=1;
		for (int i=1;i<=m;i++){
			act*=n;
			System.out.printf("%12d\t",act);
			if (i%5==0){
				System.out.println();
			}
		}

	int n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		System.out.println(s.length());

	for (int i=1;i<10000;i++){
			int sum=0;
			for (int j=1;j<i;j++){
				if (i%j==0){
					sum+=j;
				}
			}
			if (sum==i){
				System.out.println(i);
			}
		}

	double x=sc.nextDouble();
		if (x<0){
		System.out.println("-1");
		}else if (x==0){
		System.out.println("0");
		}else {
		System.out.println("1");
		}*/

	/*	4月6日
	double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double del=b*b-4*a*c;
		double x1=0.0;
		double x2=0.0;
		if (del<0){
			System.out.println("Error");
		}else {
			if (del==0){
				x1=-b/(2*a);
				System.out.println("x1 = "+x1);
			}else{
				x1=(-b+del)/(2*a);
				x2=(-b-del)/(2*a);
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}

	int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1*num2);

	char x=sc.next().charAt(0);
	double s=0;
	double s1=sc.nextDouble();
	double s2=sc.nextDouble();
		if (x=='1'){
				s=(s1+s2)/2*1.08;
				}else if (x=='0'){
				s=(s1*0.923+s2)/2;
				}
				System.out.printf("%.3f",s);

	int t=1;
		int n=sc.nextInt();
		for (int i=0;i<n;i++){
			t=t+i;
		}
		System.out.println(t);

		String s1=sc.next();
		String s2=sc.next();
		char [] s3=new char[s1.length()];
		char [] s4=new char[s2.length()];
		for (int i=0;i<s3.length;i++){
			s3[i]=s1.charAt(i);
		}
		for (int i=0;i<s4.length;i++){
			s4[i]=s2.charAt(i);
		}
		Arrays.sort(s3);
		Arrays.sort(s4);
		for (int j=0;j<s3.length;j++){
			if (s3[j]==s4[j]){
				System.out.println("yes");
				break;
			}else {
				System.out.println("no");
				break;
			}
		}

		int n=sc.nextInt();
		int [] nums=new int[n];
		for (int i=0;i<nums.length;i++){
			nums[i]=sc.nextInt();
		}
		for (int j=0;j<nums.length;j++){
			if (nums[j]==nums[j+1]){
				System.out.println(nums[j]);
				break;
			}
		}
		*/

	/*	4月4日
	String s=sc.next();
		switch (s){
			case "a":
				System.out.println("zab");
				break;
			case "b":
				System.out.println("abc");
				break;
			case "c":
				System.out.println("bcd");
				break;
			case "d":
				System.out.println("cde");
				break;
			case "e":
				System.out.println("def");
				break;
			case "f":
				System.out.println("efg");
				break;
			case "g":
				System.out.println("fgh");
				break;
			case "h":
				System.out.println("ghi");
				break;
			case "i":
				System.out.println("hij");
				break;
			case "j":
				System.out.println("ijk");
				break;
			case "k":
				System.out.println("jkl");
				break;
			case "l":
				System.out.println("klm");
				break;
			case "m":
				System.out.println("lmn");
				break;
			case "n":
				System.out.println("mno");
				break;
			case "o":
				System.out.println("nop");
				break;
			case "p":
				System.out.println("opq");
				break;
			case "q":
				System.out.println("pqr");
				break;
			case "r":
				System.out.println("qrs");
				break;
			case "s":
				System.out.println("rst");
				break;
			case "t":
				System.out.println("stu");
				break;
			case "u":
				System.out.println("tuv");
				break;
			case "v":
				System.out.println("uvw");
				break;
			case "w":
				System.out.println("vwx");
				break;
			case "x":
				System.out.println("wxy");
				break;
			case "y":
				System.out.println("xyz");
				break;
			case "z":
				System.out.println("yza");
				break;
			case "A":
				System.out.println("ZAB");
				break;
			case "B":
				System.out.println("ABC");
				break;
			case "C":
				System.out.println("BCD");
				break;
			case "D":
				System.out.println("CDE");
				break;
			case "E":
				System.out.println("DEF");
				break;
			case "F":
				System.out.println("EFG");
				break;
			case "G":
				System.out.println("FGH");
				break;
			case "H":
				System.out.println("GHI");
				break;
			case "I":
				System.out.println("HIJ");
				break;
			case "J":
				System.out.println("IJK");
				break;
			case "K":
				System.out.println("JKL");
				break;
			case "L":
				System.out.println("KLM");
				break;
			case "M":
				System.out.println("LMN");
				break;
			case "N":
				System.out.println("MNO");
				break;
			case "O":
				System.out.println("NOP");
				break;
			case "P":
				System.out.println("OPQ");
				break;
			case "Q":
				System.out.println("PQR");
				break;
			case "R":
				System.out.println("QRS");
				break;
			case "S":
				System.out.println("RST");
				break;
			case "T":
				System.out.println("STU");
				break;
			case "U":
				System.out.println("TUV");
				break;
			case "V":
				System.out.println("UVW");
				break;
			case "W":
				System.out.println("VWX");
				break;
			case "X":
				System.out.println("WXY");
				break;
			case "Y":
				System.out.println("XYZ");
				break;
			case "Z":
				System.out.println("YZA");
				break;
			default:
				break;
			}

	String s=sc.next();
	String t=sc.next();
	int n=sc.nextInt();
		if (s.length()>t.length()){
				System.out.println(1);
				}else if (s.length()<t.length()){
		System.out.println(-1);
		}else {
		System.out.println(0);
		}

		int [] nums=new int[20];
		int num=0;
		for (int i=0;i<nums.length;i++){
			int temp=sc.nextInt();
			if (temp==0){
				sc.close();
				break;
			}
			nums[i]=temp;
			num++;
		}
		for (int i=num-1;i>=0;i--){
			System.out.print(nums[i]+" ");
		}
		*/

	/*	4月3日
	int n=sc.nextInt();
	int [] nums =new int[n+1];
	int max=0;
			for (int i=0;i<nums.length;i++){
		nums[i]=sc.nextInt();
		max+=nums[i];
		}
		System.out.println(max);*/

	/*
		4月2日
	int num=sc.nextInt();
	int sum=0;
	int []nums =new int[num];
			for (int i=0;i<nums.length;i++){
		nums[i]=sc.nextInt();
		}
		for (int i=0;i<nums.length;i++){
		for (int j=0;j<nums.length;j++){
		if (nums[i]-nums[j]==1){
		sum++;
		}
		}
		}
		System.out.println(sum);*/

		//4月1日
		/*int num=sc.nextInt();
	int [] nums=new int[num];
		for (int i=0;i<nums.length;i++){
		nums[i]=sc.nextInt();
		}
		for (int i=0;i<nums.length-1;i++){
		if (nums[i]>=nums[i+1]-25){
		System.out.println("YES");
		}else{
		System.out.println("NO");
		}
		}

		String name=sc.next();
	char [] arr=new char[name.length()];
		for (int i=0;i<arr.length;i++){
		arr[i]=name.charAt(i);//将第i个字符赋给第i个数组元素
		}
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
		}

		String name =sc.next();
	int num=name.length();
		System.out.println(num);

		double ab [] =new double[10];
	double sum=0;
	double avg=0;
		for (int i=0;i<ab.length;i++){
		ab[i]=sc.nextDouble();
		sum+=ab[i];
		}
		avg=sum/ab.length;
		System.out.printf("%.0f",sum);
		System.out.println();
		System.out.println(avg);

		int add=0;
	double act=0;
	int [] a=new int [2];
	double [] b=new double[2];
		for (int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		add+=a[i]*a[i];
		}
		for (int i=0;i<b.length;i++){
		b[i]=sc.nextDouble();
		act+=b[i]*b[i];
		}
		System.out.println(add);
		System.out.println(act);

	int days=0;
	int year=sc.nextInt();
	int month=sc.nextInt();
	int day=sc.nextInt();
		for (int i=1;i<month;i++){
		switch (i){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		days+=31;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		days+=30;
		break;
		case 2:
		if ((year%400==0&&year%100!=0)||(year%4==0)){
		days+=29;
		}else {
		days+=28;
		}
		break;
		}
		}
		days+=day;
		System.out.println(days);*/


		/*3月31日
	System.out.println("yes");

	int n=sc.nextInt();
	int max =0;
	int downMax=0;
	int [] nums=new int [n];
		for (int i=0;i<nums.length;i++){
		nums[i]=sc.nextInt();
		}
		for (int i=0;i<nums.length-1;i++){
		for (int j=0;j<nums.length-i-1;j++){
		if (nums[j]>nums[j+1]){
		max=nums[j];
		downMax=j;
		}else {
		continue;
		}
		}
		}
		System.out.println(max+" "+downMax);

		int n=sc.nextInt();
	int []a=new int [n];
	int []b=new int [n];
	int act=0;
		for (int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		for (int j=0;j<b.length;j++){
		b[j]=sc.nextInt();
		}
		for (int i=0;i<n;i++){
		act+=a[i]*b[i];
		}
		System.out.println(act);

	int n=sc.nextInt();
	int sum=0;
	int [] nums = new int [n];
		for (int i=0;i<nums.length;i++){
		nums[i]=sc.nextInt();
		}
		for (int i=0;i<nums.length-1;i++){
		for (int j=0;j<nums.length-i-1;j++){
		if (nums[j]<nums[j+1]){
		int temp=nums[j];
		nums[j]=nums[j+1];
		nums[j+1]=temp;
		}
		}
		}
		for (int i=0;i<nums.length;i++){
		if (nums[i]!=0){
		sum++;
		}
		}
		System.out.println(sum);
		for (int i=0;i<sum;i++){
		System.out.print(nums[i]+" ");
		}*/

		/*3月30日
		int n=sc.nextInt();
	int sum=0,avg=0;
	int [] nums=new int [n];
		for (int i=0;i<n;i++){
		nums[i]=sc.nextInt();
		sum+=nums[i];
		}
		avg=(int)(sum/n);
		System.out.println(sum+" "+avg);

	int n=sc.nextInt();
	int []a=new int [n];
	int more=0;
		for (int i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		for (int i=0;i<n-1;i++){
		for (int j=0;j<n-1-i;j++){
		if (a[i]==a[i+1]){
		more=a[i];
		}
		}
		}
		System.out.println(more);*/

		/*3月29日
		String add=sc.next();
	int num1=sc.nextInt();
	int num2=sc.nextInt();
		switch (add){
				case "+":
				System.out.println(num1+num2);
				break;
				case "-":
				System.out.println(num1-num2);
				break;
				case "*":
				System.out.println(num1*num2);
				break;
				case "/":
				System.out.println(num1/num2);
				break;
default:
		break;
		}

		int []a=new int [3];
		for (int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length-1;i++){
		for (int j=0;j<a.length-1-i;j++){
		if (a[j]<a[j+1]){
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}
		}
		}
		for (int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}

	int n=sc.nextInt();
	int k=sc.nextInt();
	int act=1;
		for (int i=0;i<n;i++) {
		int n1 = sc.nextInt();
		act *= n1;
		}
		System.out.println(act);

	int num=sc.nextInt();
	for (int i=num;i>0;i--){
		for (int j=0;j<i;j++) {
		System.out.print("* ");
		}
		System.out.println();
		}*/

	/*3月28日
	int x=sc.nextInt();
	int x1=sc.nextInt();
	int y=sc.nextInt();
	int y1=sc.nextInt();
	int z=sc.nextInt();
	int z1=sc.nextInt();
	int t=sc.nextInt();
	double n=x1/x+y1/y+z1/z;
		System.out.print(n);

	int m=sc.nextInt();
	int s,t,c;
		 	for (int i=0;i<m;i++){
		s=sc.nextInt();
		t=sc.nextInt();
		c=sc.nextInt();
		}*/

	/*3月27日
	int m=sc.nextInt();
	int n=sc.nextInt();
	int wi,hi;
	for (int i = 0; i < n; i++) {
		wi=sc.nextInt();
		hi=sc.nextInt();
	}

	int n=sc.nextInt();
	String m1,m2,m3,m4;
	for (int i = 0; i < n; i++) {
		m1=sc.next();
		m2=sc.next();
		m3=sc.next();
		m4=sc.next();
	}*/

		/*3月26日
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int num=-1;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		for (int j = 1; j <= sum; j++) {
			int temp=sum;
			if (j%k==0) {
				num++;
			}
		}
		System.out.println(num);

	int n=sc.nextInt();
	int x1,y1,x2,y2;
	int width,longer,act=0;
	for (int i = 0; i < n; i++) {
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		width=x2-x1;
		longer=y2-y1;
		act+=width*longer;
	}
	System.out.println(act);

	int n=sc.nextInt();
	int k=sc.nextInt();
	int h=0,w=0;
	for (int i = 0; i < n; i++) {
		h=sc.nextInt();
		w=sc.nextInt();
	}
	int act=h*w;
	for (int i = 1; i < 10; i++) {
			int max=act;
			int sum=i*i*k;
		if (sum<max) {
			System.out.println(i);
		}else {
			System.out.println(1);
			break;
		}
	}*/

	
	/*3月25号
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ai=sc.nextInt();
		int ai2=sc.nextInt();
		int num=ai+ai2;
		int sum=0;
		for (int i = 2; i <= args.length; i++) {
			int temp=num;
			if (temp%i==0) {
				sum++;
			}
		}
		if (sum==0) {
			System.out.println("INF");
		}else {
			System.out.println(sum);
		}
	}
	
	int n=sc.nextInt();
	int sum=0;
	int [] arn=new int [n];
	for (int i = 0; i < arn.length; i++) {
		arn[i]=sc.nextInt();
	}
	for (int i = n; i >0; i--) {
		arn[n-1]+=arn[n]/2;
	}
	for (int i = 0; i < arn.length; i++) {
		if (arn[i]%2!=0) {
			sum++;
		}else {
			continue;
		}
	}
	System.out.println(sum);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j]<a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			sum+=i;
		}
		System.out.println(sum);
	}*/
	
	
	/*3月24号
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int []array=new int [n*m];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		for (int i = 0; i < array.length-1; i++) {
			if (array[i+1]<=k)
				sum++;
		}
		System.out.println(sum);
	}
	
	蚂蚁感冒
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1;
		int [] array=new int [n];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]+array[i+1]<=0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int adt=n*m;
		int sum=0;
		int[]array=new int [adt];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
			if (array[i]>0)
				sum+=array[i];
		}
		System.out.println(sum);
	}*/
	
	
	/*3月23
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int t=sc.nextInt();
		int sum=0;
		int []a=new int [100];
		a[0]=1;
		for (int i = 1; i < 1000000; i++) {
			a[i]=a[i-1]+i;
			if (a[i]>=k-1) {
				sum+=a[2*i];
			}
			t++;
			break;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 10000; i < 1000000; i++) {
			int j =i,x,sum=0;
			while (j!=0){
				x=i%10;
				i/=10;
				sum+=x;
				break;
			}
			for (int k = i; k < i; k++) {
				int w=k,m,sum1=0;
				while (k!=0) {
					m=k%10;
					i/=10;
					sum1+=m;
					break;
				}
				for (int l = 0; l < n; l++) {
					if (sum==sum1) {
						System.out.println(i);
					}
				}
			}
		}
	}*/

