package com.fivan.demo;
/**
 * @author fivan
 * @version 1.0
 * @Date 2023-8-22
 */
public class TestTool {
	public void testTool() {
		String str = "str";
		System.out.println(sperak(str));
	}
	
	public String sperak(String str) {
		char a = '死';
		char b = '掉';
		int aa = a;
		int bb = b;
		System.out.println(aa+","+bb);
		return str;
	}
	public static void main(String[] args) {
		new TestTool().testTool();
	}
}
