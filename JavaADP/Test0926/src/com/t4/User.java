package com.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket client=null;
		BufferedReader br=null;
		try {
			client=new Socket("127.0.0.1",8889);
			InputStream is=client.getInputStream();
			InputStreamReader reader=new InputStreamReader(is);
			br=new BufferedReader(reader);
			String str=br.readLine();
			System.out.println("QQÐ¡±ùËµ£º"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br!=null) {
					br.close();
					client.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
