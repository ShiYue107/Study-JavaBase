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
        System.out.println("英雄名字："+name+"初始化横坐标="+x+"，纵坐标="+y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个士兵的名字：");
            String name=sc.next();
            System.out.println("请输入横坐标：");
            int x=sc.nextInt();
            System.out.println("请输入纵坐标：");
            int y=sc.nextInt();
            new Soldiers(name,x,y);
        }
    }
}
