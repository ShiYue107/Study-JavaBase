package com.demo3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientRev {
	public static void main(String[] args) {
		Socket client=null;
		PrintWriter writer=null;
		try { 
			client=new Socket("127.0.0.1",8809);
			writer=new PrintWriter(client.getOutputStream());
			writer.write("Hello 123");
			writer.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (writer!=null) {
					writer.close();
				}
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
