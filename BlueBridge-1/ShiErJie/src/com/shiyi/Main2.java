package com.shiyi;

public class Main2 {
	
	public static int f(String s,int begin,int end){
		int mid;
		if(end-begin==1) return s.charAt(begin) - '0';
		mid = (end+begin) / 2;
		return f(s,mid,s.length()-1);  //МоїХ
	}

	public static void main(String[] args){
		String s = "368"; 
		System.out.println(f(s, 0, s.length()));    
	}
}
