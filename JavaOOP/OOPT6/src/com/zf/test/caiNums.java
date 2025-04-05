package com.zf.test;

public class caiNums {
	
	public static int[] arrayToString() {
		//创建静态数组
		int [] arr={12,13,15,20,22};
		return arr;
	}
	
	public static StringBuffer arrToString2(int[] arr) {
		StringBuffer sb=new StringBuffer();
		//在sb中添加左边框
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			//如果不是数组的最后一个，在sb中添加元素和逗号
			if (i!=arr.length-1) {
				sb.append(arr[i]).append(",");
			}else {
				//如果是数组的最后一个，直接在sb中添加元素
				sb.append(arr[i]);
			}
		}
		//在sb中添加左边框
		sb.append("]");
		
		return sb;
	}
	public static void main(String[] args) {
		StringBuffer sb = caiNums.arrToString2(caiNums.arrayToString());
		System.out.println(sb);
	}
}
