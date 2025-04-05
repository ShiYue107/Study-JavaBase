package com.java.t4;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket=new Socket("127.0.0.1",9998);
			Sendlmpl spl=new Sendlmpl(socket);
			Recicelmpl rpl=new Recicelmpl(socket);
			new Thread(spl).start();
			new Thread(rpl).start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
