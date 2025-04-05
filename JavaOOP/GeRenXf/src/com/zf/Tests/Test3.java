package com.zf.Tests;
/*
 * 这是测试类3
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zf.Dao.PCSume;
import com.zf.Dao.PCSumeDao;

public class Test3 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=sdf.parse("2020-10-24");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PCSume pcs=new PCSume(0, "早饭", 8.33, date, "张锋");
		boolean flag=new PCSumeDao().addPcs(pcs);
		System.out.println(flag);
	}
}
