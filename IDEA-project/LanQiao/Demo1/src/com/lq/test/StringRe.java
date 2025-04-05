package com.lq.test;

import java.util.Scanner;

public class StringRe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(stringRe(str));
    }
    public static String stringRe(String str){
        if (str.length()==1){
            return str;
        }
        else {
            return str.charAt(str.length()-1)+stringRe(str.substring(0,str.length()-1));
        }
    }

}
