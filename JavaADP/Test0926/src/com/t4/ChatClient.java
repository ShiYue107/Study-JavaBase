package com.t4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(9991);
			Socket socket=server.accept();
			Sendlmpl spl=new Sendlmpl(socket);
			Receiverlmpl rpl=new Receiverlmpl(socket);
			new Thread(spl).start();
			new Thread(rpl).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
