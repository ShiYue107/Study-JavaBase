package com.lq.lq1; /**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/11 19:16
 */

/**
 * 百元买白鸡
 * 公鸡(i)5文
 * 母鸡(j)3文
 * 公鸡(k)1/3文
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int k = 100 - i - j ;
                if ((i+j+k == 100) && (5*i + 3*j + 1/3 * k == 100) && k%3 ==0){
                    System.out.println("公鸡："+i+",母鸡："+j+"小鸡："+k);
                }
            }
        }
    }
}
