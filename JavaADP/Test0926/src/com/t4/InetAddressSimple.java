package com.t4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip=InetAddress.getByName("www.baidu.com");
			String ipStr=ip.getHostAddress();
			System.out.println("�ٶȵ�ַ��"+ipStr);
			String hostName=ip.getHostName();
			System.out.println("�ٶ���������"+hostName);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
