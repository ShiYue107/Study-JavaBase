package com.lqb.demo1;

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i =1; i <1000; i++) {
            int he=0;
            for (int j = 1; j <i; j++) {
                int num=i;
                if (num%j==0) {
                    he+=j;
                }else {
                    continue;
                }
                if (he==i) {
                    count++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(count);
    }
}
