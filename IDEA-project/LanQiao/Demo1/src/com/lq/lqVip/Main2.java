package com.lq.lqVip;

import java.util.Scanner;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/18 19:19
 *
 *FJ的字符串
 */
public class Main2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(solution(a));
        }

        public static String solution(int m) {
            // 思路：1.输出形式：字符1+字符2+字符1
            if (m == 1){
                return "A";
            }else{
                char b = 'B';
                String str=null;
                for (int i = 2; i <= m ; i++) {
                    str = (solution(m - 1)+(b++)+solution(m - 1));
                }
                return str;
            }
        }
}
