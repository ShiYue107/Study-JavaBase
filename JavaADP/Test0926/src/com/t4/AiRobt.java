package com.t4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AiRobt {

	public static void main(String[] args) {
		ServerSocket server=null;
		PrintWriter writer=null;
		try {
			server =new ServerSocket(8889);
			Socket socket=server.accept();
			OutputStream os=socket.getOutputStream();
			writer=new PrintWriter(os);
			writer.print("»¶Ó­1234567890");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (writer!=null) {
					writer.close();
					server.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
