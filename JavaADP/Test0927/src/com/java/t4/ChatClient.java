package com.java.t4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server=new ServerSocket(9998);
			Socket socket=server.accept();
			Sendlmpl spl=new Sendlmpl(socket);
			Recicelmpl rpl=new Recicelmpl(socket);
			new Thread(spl).start();
			new Thread(rpl).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
