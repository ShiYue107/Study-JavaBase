package com.shiyi1;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int [] arr= new int[10];
	    	for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
	    	for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k <j; k++) {
					
				}
			}
	    	Arrays.sort(arr);
	    	for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	    
}
