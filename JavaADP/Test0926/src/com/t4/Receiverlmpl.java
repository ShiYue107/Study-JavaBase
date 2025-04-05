package com.t4;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Receiverlmpl implements Runnable{

	private Socket socket;
	
	public Receiverlmpl(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			try {
				InputStream is=socket.getInputStream();
				byte[]b=new byte[1024];
				int lenght=is.read(b);
				System.out.println("接受到消息："+new String(b,0,lenght));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
