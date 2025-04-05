package com.lq.lqVip;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/24 19:15
 *
 * 报时助手
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        String[] time = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen",
                        "eighteen", "nineteen", "twenty","thirty","forty","fifty"};
//      先处理时
        if ((h >= 0 && h <=24)&&(m >= 0 && m <60)) {
            if (h <= 20) {
                System.out.print(time[h] + " ");
            } else {
                System.out.print(time[20] + " " + time[h % 20] + " ");
            }
            //      处理分
            if (m != 0) {
                switch (m / 10) {
                    case 2:
                        if (m == 20) {
                            System.out.println(time[20]);
                        } else {
                            System.out.print(time[20] + " " + time[m % 20] + " ");
                        }
                        break;
                    case 3:
                        if (m == 30) {
                            System.out.println(time[21]);
                        } else {
                            System.out.print(time[21] + " " + time[m % 30] + " ");
                        }
                        break;
                    case 4:
                        if (m == 40) {
                            System.out.println(time[22]);
                        } else {
                            System.out.print(time[22] + " " + time[m % 40] + " ");
                        }
                        break;
                    case 5:
                        if (m == 50) {
                            System.out.println(time[23]);
                        } else {
                            System.out.print(time[23] + " " + time[m % 50] + " ");
                        }
                        break;
                    default:
                        System.out.println(time[m]);
                        break;
                }
            } else {
                System.out.println("o'clock");
            }
        }
    }
}
