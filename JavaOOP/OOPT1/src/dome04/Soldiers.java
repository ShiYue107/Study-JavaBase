package dome04;

import java.util.Scanner;

public class Soldiers {
    String name;
    int x;
    int y;

    public Soldiers() {

    }

    public Soldiers(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println("Ӣ�����֣�"+name+"��ʼ��������="+x+"��������="+y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("�������"+(i+1)+"��ʿ�������֣�");
            String name=sc.next();
            System.out.println("����������꣺");
            int x=sc.nextInt();
            System.out.println("�����������꣺");
            int y=sc.nextInt();
            new Soldiers(name,x,y);
        }
    }
}
