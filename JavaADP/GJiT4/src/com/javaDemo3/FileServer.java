package com.javaDemo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public ServerSocket server;
	public Socket skt;
	
	public void downloadFile() {
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			InputStream in=skt.getInputStream();
			bis=new BufferedInputStream(in);
			int len=bis.read();
			byte[] byt=new byte[len];
			bis.read(byt);
			String fileName=this.getFileName(new String(byt));
			FileOutputStream fos=new FileOutputStream("E://"+this.getFileName(fileName));
			bos=new BufferedOutputStream(fos);
			int data=0;
			while ((data=bis.read())!=-1) {
				bos.write(data);
			}
			System.out.println("客户端"+skt.getInetAddress()+":上传文件["+fileName+"]成功！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
				try {
					if(bis!=null) {
					bis.close();
					}
					if(bos!=null) {
						bos.close();
					}
					server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	private String getFileName(String str) {
		String [] files=str.split("//");
		return files[files.length-1];
	}
	public void createServer() {
		try {
			server=new ServerSocket(8881);
			while (true) {
				skt=server.accept();
				System.out.println("客户端已连接");
				downloadFile();
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new FileServer().createServer();
	}
}
