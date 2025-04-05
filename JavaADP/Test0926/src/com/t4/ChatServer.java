package com.t4;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatServer {

	public static void main(String[] args) {
		try {
			Socket socket=new Socket("127.0.0.1",9991);
			Sendlmpl spl=new Sendlmpl(socket);
			Receiverlmpl rpl=new Receiverlmpl(socket);
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
