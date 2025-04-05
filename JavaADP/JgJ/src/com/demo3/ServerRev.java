package com.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRev {
	public static void main(String[] args) {
		ServerSocket server=null;
		BufferedReader reader=null;
		try {
			server =new ServerSocket(8809);
			String data=null;
			while (true) {
				Socket socket=server.accept();
				InputStream in=socket.getInputStream();
				reader =new BufferedReader(new InputStreamReader(in));
				while ((data=reader.readLine())!=null) {
					System.out.println("来自客户端的问候："+data);
				}
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if (reader!=null) {
						reader.close();
					}
					server.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
}
