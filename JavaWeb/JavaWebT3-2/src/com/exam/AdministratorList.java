package com.exam;

import java.util.ArrayList;
import java.util.List;

public class AdministratorList {
	public static List<Adminstrator> adminList=new ArrayList<Adminstrator>();
	
	static {
		Adminstrator admin1=new Adminstrator("admin001", "abc");
		Adminstrator admin2=new Adminstrator("admin002", "123abc");
		
		adminList.add(admin1);
		adminList.add(admin2);
	}
}
