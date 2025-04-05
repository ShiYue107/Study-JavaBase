package dome02;

import java.util.Scanner;

public class Hero {
    int output;
    int count = 0;

    public void battle() {
        this.output = output-10;
        count++;
        if (output <= 0) {
            System.out.println("您的英雄已牺牲！");
            System.exit(0);//结束程序
        } else {
            System.out.println("第"+count+"次攻击，您的英雄当前的血量为"+output);
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
            System.out.println("战斗结束后您的英雄的血量为"+h1.output);
    }
}
