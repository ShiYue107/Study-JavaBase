package com.java.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("H:\\text\\wen.txt");
		File nf=new File("H:\\text\\wirte.txt");
		if(f.exists()) {
			String str=readFile(f);
			writeFile(str+"\n【来自新华社】", nf);
			System.out.println("读出成功！");
			try {
				FileInputStream fis=new FileInputStream(nf);
				byte[] byt=new byte[(int) nf.length()];
				String nstr=new String(byt);
				System.out.println("读出成功后："+nstr);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("文件不存在，无法读入！");
		}
	}
	//创建写出方法
	public static void writeFile(String str,File nf) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(nf);
			byte[] byt=str.getBytes();
			fos.write(byt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//创建读入方法
	public static String readFile(File f) {
		//创建获取的字符串
		String str=null;
		//定义输入流
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			byte [] byt=new byte[(int) f.length()];
			fis.read(byt);
			str=new String(byt);
			System.out.println("原文为："+str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return str;
	}
}
