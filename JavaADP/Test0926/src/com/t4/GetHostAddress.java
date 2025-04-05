package com.t4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostAddress {
	public static void main(String[] args) {
		String ipAddress="192.168.6.84";
		String[]ipArr=ipAddress.split("\\.");
		byte[] ipByte=new byte[ipArr.length];
		for (int i = 0; i < ipArr.length; i++) {
			int m=Integer.parseInt(ipArr[i]);
			ipByte[i]=(byte) m;
		}
		try {
			InetAddress inetAddress=InetAddress.getByAddress(ipByte);
			System.out.println("本机的IP地址："+inetAddress.getHostAddress());
			System.out.println("本机的域名："+inetAddress.getCanonicalHostName());
			System.out.println("本机的主机名："+inetAddress.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
