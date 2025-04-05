package Test0412;

import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    char [] s=new char[s1.length()];
        for (int i=0;i<s.length;i++){
            s[i]=s1.charAt(i);
            switch (s[i]){
                case '1':
                    a++;
                    break;
                case '2':
                    b++;
                    break;
                case '3':
                    c++;
                    break;
                case '4':
                    d++;
                    break;
            }
        }
        System.out.println(1+a+2+b+3+c+4+d);
    }
}
