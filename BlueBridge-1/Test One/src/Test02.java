import java.util.Random;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		
}

//	int num = rdm.nextInt(1000);
//	System.out.println(num);
	//3��3��
	//���ֲ�ѯ
//	int num = sc.nextInt();
//	int [] score = new int[num];
//		for (int i = 0; i < num; i++) {
//			score[i] = sc.nextInt();
//		}
//	int cet = sc.nextInt();
//	int list = 1;
//		for (int i = 0; i < num; i++) {
//			if (score[i]==cet) {
//				list = i;
//				break;
//			}
//		}
//		System.out.println(list);
	
	//3��4��
	//һ������λ��֮��
//	System.out.println("������һ����:");
//	int num = sc.nextInt();
//	int sum = 0;
//	while (num>0) {
//		sum = sum+num%10;
//		num = num/10;
//	}System.out.println(sum);

//	System.out.println("����������");
//	int num = sc.nextInt();
//	int sum = 0;
//	do{
//		//�õ���λ
//		int ge = num % 10;  //  1588%10   8
//		//ȥ����ǰ��λ
//		num = num/10;  //1588/10   158
//		//��λ���
//		sum = sum + ge;
//	}while(num!=0);
//	System.out.println(sum);
	
	//�����С������
//	int num = sc.nextInt();
//	int multiple = num*(num-1)*(num-2);
//	System.out.println(multiple);

	//K����
	
	//���·
//	int n = sc.nextInt();
//	int m = sc.nextInt();
//	int u =0;
//	int v,l;
//	for (int i = 0; i < m; i++) {
//		u = sc.nextInt();
//		v = sc.nextInt();
//		l = sc.nextInt();
//	}
//	for (int i = 0; i < n-1; i++) {
//		System.out.println(0-u);
//	}

	
	//3��5��
	//��Сдת��
//	Scanner get =new Scanner(System.in);
//	String str=get.next();
//	char ch[]=str.toCharArray();
//	for(int i=0;i<ch.length;i++) {
//		if(ch[i]>'Z') {//AΪ65��aΪ97����Сдת��Ϊ��д
//			ch[i]-=('a'-'A');
//		}else if(ch[i]<='Z') {
//			ch[i]+=('a'-'A');
//		}
//	}
//
//	for(int i=0;i<ch.length;i++) {
//		System.out.print(ch[i]);
//	}
//	get.close();
	
	//�ַ����ϲ�
//	String name1 = sc.next();
//	String name2 = sc.next();
//	System.out.println(name1+name2);
	
	//RP��ð��
//	int n=sc.nextInt();
//	System.out.println((int)(n*Math.random()));//Math.random()�������һ��С��		
	
	//Queries on Young Machine - Sample
//	int MaxLen = 600000;
//	int MaxStep = 1500;
//	int MaxOp = 7000000;
//	int N = sc.nextInt();
//	if (MaxLen%N==0&&MaxStep%N==0&&MaxOp%N==0) {
//		System.out.println("����ͨ����");
//	} else {
//		System.out.println("����ͨ����");
//	}
	
	//3��6��
	//���ݽ���
//	int x = sc.nextInt();
//	int y = sc.nextInt();
//	swap(x, y);
	
	//�ӷ�����
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	numt(num1, num2);
	
	//3��7��
	//��������
//	int num = sc.nextInt();
//	int [] scoers = new int[num];
//	int i,j;
//	for (i = 0; i < num; i++) {
//		scoers[i]= sc.nextInt();
//	}
//	for (i = 0; i < num-1; i++) {
//		for (j = 0; j < num-1-i; j++) {
//			if (scoers[j]<scoers[j+1]) {
//				int min = scoers[j];
//				scoers[j] = scoers[j+1];
//				scoers[j+1] = min;
//			}
//		}
//	}
//	for ( i = 0; i < num; i++) {
//		System.out.print(scoers[i]+" ");
//	}
	
	//Bit Compressor
//	int l = sc.nextInt();
//	int n = sc.nextInt();
//	String j = sc.next();
//	int sum = l+n;
//	String k = Integer.toBinaryString(sum);
//	if (j.equals(k)) {
//		System.out.println("YES");
//	} else {
//		System.out.println("No");
//	}
	
	//����������
//	int num1 =sc.nextInt();
//	int num2 = sc.nextInt();
//	int sum = 0;
//	for (int i = num1; i <= num2; i++) {
//		String binary= Integer.toBinaryString(i);
//		int binarys =Integer.parseInt(binary);
//		do {
//			int temp=binarys%10;
//			binarys/=10;
//			if (temp==1) {
//				sum++;
//			}
//		} while (binarys!=0);
//	}
//	System.out.println(sum);
	
//	3��10��
	//�����n����С��ȫƽ����
//	int i =1;
//	int num = sc.nextInt();
//	do {
//		if (num/i==i) {
//			i=i*i;
//			System.out.println(num);
//			break;
//		}
//		i++;
//		num++;
//	
//	} while (num>0);
	
	//1�ĸ���
//	int n = sc.nextInt();
//	sc.close();
//	int sum = 0;
//	int a,b;
//	for (int i = 1; i <= n; i++) {
//		a=i;
//		while (a!=0) {
//			b =a%10;
//			if (b==1) {sum++;
//			a/=10;
//			}
//		}
//	}
//	System.out.println(sum);
	
	//3��11��
	//������ȥ��
//	int n = sc.nextInt();
//	System.out.println();
	
	//P0505
//	int n = sc.nextInt();
//	long fec = 1;
//	for (int i = 1; i <= n; i++) {
//		fec*=i;
//	}
//	while (fec>0) {
//		long m = fec%10;
//		fec/=10;
//		if (m!=0) {
//			System.out.println(m);
//			break;
//		}
//	}
	
	//3��14��
	//P0103
//	String name=sc.next();
//    String name1=name.toLowerCase();
//    char c=name1.charAt(0);
//    System.out.println(c);
//    sc.close();
	
	//���ʽ����
//	String name = sc.next();
//	int n;
//    n =Integer.parseInt(name);
//	System.out.println(n);
	
	//��С������
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	int att = num1*num2;
//	for (int i = num1+num2; i <=att; i++) {
//		int n1 = i%num1;
//		int n2 = i%num2;
//		if (n1==0&&n2==0) {
//			int m = i;
//			System.out.println(m);
//			break;
//		}
//	}
	
	//3��15��
//	int N = sc.nextInt();
//	int K =sc.nextInt();
//	int max=1; 
//	for (int i = 0; i < N; i++) {
//		int num = sc.nextInt();
//		max*=num;
//	}
//	System.out.println(max);
	
	//3��16��
	//С������
	
	//���ҵ�����
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();
//	int num3 = sc.nextInt();
//	int att = num1 * num2 * num3;
//	for (int i = 1; i <=att; i++) {
//		int n1 = i%num1;
//		int n2 = i%num2;
//		int n3 = i%num3;
//		if (n1==0&&n2==0&&n3==0) {
//			int max = i;
//			System.out.println(max);
//			break;
//		}
//	}
	
	//ͼ����ʾ
//	int num = sc.nextInt();
//	for (int i = num; i >=0; i--) {
//		for (int j = i; j >0; j--) {
//			System.out.print("*"+" ");
//		}
//		System.out.println();
//	}
	//3��17��
	//����Ʊ��
//	int N = sc.nextInt();
//	int num = 5*N;
//	int [] array = new int [num];
//	int i,j;
//	for (i = 0; i <num; i++) {
//		array[i] = sc.nextInt();
//	}
//	for (i = 0; i < num-1; i++) {
//		for (j = 0; j < num-1-i; j++) {
//			if (array[j]>array[j+1]) {
//				int temp = array[j];
//				array[j] = array[j+1];
//				array[j+1] = temp;
//			}
//		}
//	}
//	for (i = 0; i < num; i++) {
//		if (array[i]+1!=array[i+1]) {
//			System.out.print(array[i]+1+" ");
//			break;
//		}
//	}
//	for (i = 0; i < num; i++) {
//		if (array[i]==array[i+1]) {
//			System.out.print(array[i]);
//			break;
//		}
//	}
	
	//δ�����ϵķ���
//	int m = sc.nextInt();
//	int n = sc.nextInt();
//	System.out.println(fun(m, n));
	
	//3��18��
	//����������
//	int N = sc.nextInt();
//    int[] number = new int[N];
//    for(int i = 0;i < N;i++)
//        number[i] = sc.nextInt();
//    int result = 0;
//    for(int i = 0;i < N;i++) {
//        int max = number[i];
//        int min = number[i];
//        for(int j = i;j < N;j++) {
//            max= Math.max(max, number[j]);
//            min = Math.min(min, number[j]);
//            if(max - min == j - i)
//                result++;
//        }
//    }
//    System.out.println(result);
	
	//�򲻵�����Ŀ
//	int n=sc.nextInt();
//	int m=sc.nextInt();
//	for (int i = 1; i < 100000; i++) {
//		for (int j = 1; j < 1000; j++) {
//			if (i!=n*j+m*j) {
//				System.out.println(i);
//				
//			}break;
//		}
//	}
	
	//�󳼵��÷�
//	int n=sc.nextInt();
//	int sum=0;
//	int money=0;
//	for (int i = 1; i < n; i++) {
//		int Pi=sc.nextInt();
//		int Qi=sc.nextInt();
//		int Di=sc.nextInt();
//		sum+=Di;
//	}
//	for (int i = 1; i <= sum; i++) {
//		int expenses = 10+i;
//		money+=expenses;
//	}
//	System.out.println(money);
	
	
	//3��19��
	//������
//	int m=sc.nextInt();
//	int n=sc.nextInt();
//	int sum = 0;
//	int [] nums = new int [1000];
//	for (int i = 0; i < nums.length; i++) {
//		nums[i] = 2*i+1;
//	}
//	for (int i = 0; i < n; i++) {
//		if (nums[i+2]<=n) {
//			System.out.print(nums[i+2]+" ");
//			sum++;
//		}
//	}
//	System.out.println();
//	System.out.println(sum);
	
	//Σ��ϵ��
		//��ά����
	
	//����ˢ����
//	int n=sc.nextInt();
//	long a[]=new long[n+1];
//	long b[]=new long[n+1];
//	long sum;
//	b[1]=1;
//	for(int i=2;i<=n;i++){
//		b[i]=2*b[i-1]%1000000007;
//	}
//	a[1]=1;a[2]=6;
//	for(int i=3;i<=n;i++){
//		a[i]=(2*a[i-1]+b[i]+4*a[i-2])%1000000007;
//	}
//	sum=(4*a[n])%1000000007;
//	for(int i=2;i<n;i++){
//		sum+=((8*b[i-1]*a[n-i])%1000000007+(8*b[n-i]*a[i-1])%1000000007)%1000000007;
//		sum%=1000000007;
//	}
//	System.out.println(sum);

	
	//3��20��

	//���ݽ���
//	public void swap(int x,int y) {
//		int temp = y;
//		y = x;
//		x = temp;
//		System.out.println(x+" "+y);
//	}
	
	//�ӷ�����
//	public void numt(int num1,int num2) {
//		int sum = num1 + num2;
	
//		System.out.println(sum);
//	}
	
	//δ�����ϵķ���
//	public static int fun(int m, int n) {
//        if(m<n) return 0;
//        if(n==0) return 1;
//
//        return fun(m-1, n) + fun(m, n-1);
//    }
}
