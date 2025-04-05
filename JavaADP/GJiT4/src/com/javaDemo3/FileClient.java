package com.javaDemo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	
	public void uploadFile(Socket skt) {
		BufferedReader reader=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			System.out.println("请输入要上传文件的完整路径：");
			InputStream in=System.in;
			OutputStream os=skt.getOutputStream();
			reader =new BufferedReader(new InputStreamReader(in));
			String fileName=reader.readLine();
			FileInputStream fis=new FileInputStream(fileName);
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(os);
			byte[]nbt=fileName.getBytes();
			bos.write(nbt.length);
			bos.write(nbt);
			int data=0;
			while ((data=bis.read())!=-1) {
				bos.write(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(reader!=null) {
					reader.close();
				}
				if(bis!=null) {
					bis.close();
				}
				if(bos!=null) {
					bos.close();
				}
				skt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Socket client=null;
		try {
			client = new Socket("127.0.0.1",8881);
			new FileClient().uploadFile(client);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
