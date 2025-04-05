package com.lq.lq1;

/**
 * @author IT_Koma
 * @version 1.0
 * @date 2021/3/15 11:34
 */
public class Main12 {

    public static void main(String[] args) {
        for (int i = 0; i <=32; i++) {
            String str = Integer.toBinaryString(i);
            if (str.length() ==1){
                System.out.println("0000"+str);
            }else if (str.length() ==2){
                System.out.println("000"+str);
            }else if (str.length() ==3){
                System.out.println("00"+str);
            }else if (str.length() ==4){
                System.out.println("0"+str);
            }else if (str.length() ==5){
                System.out.println(str);
            }
        }
    }

}
