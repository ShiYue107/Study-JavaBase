package dome02;

import java.util.Scanner;

public class Hero {
    int output;
    int count = 0;

    public void battle() {
        this.output = output-10;
        count++;
        if (output <= 0) {
            System.out.println("����Ӣ����������");
            System.exit(0);//��������
        } else {
            System.out.println("��"+count+"�ι���������Ӣ�۵�ǰ��Ѫ��Ϊ"+output);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int output=sc.nextInt();
        Hero h1=new Hero();
        h1.output=output;
        for (int i = 0; i < 5; i++) {
            h1.battle();
        }
            System.out.println("ս������������Ӣ�۵�Ѫ��Ϊ"+h1.output);
    }
}
