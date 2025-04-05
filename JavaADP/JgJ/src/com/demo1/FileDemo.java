package com.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			File file=new File("test.txt");
			File fileW=new File("new.txt");
			fis=new FileInputStream(file);
			fos=new FileOutputStream(fileW);
			byte [] byt=new byte[(int)file.length()];
			fis.read(byt);
			String data=new String(byt);
			System.out.println("接收到的内容为：\n"+data);
			byte [] bytNew=data.getBytes();
			fos.write(bytNew);
			System.out.println("写入成功！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
