package com.lq.lq1;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/16 9:14
 *
 * 平闰年判断
 */
public class Main13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (((y % 4 == 0 ) && (y % 100 !=0))||(y % 400 == 0 )){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
