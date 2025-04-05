package com.zf.test3;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	private static int getWeek(Date date) {
		Calendar cld=Calendar.getInstance();
		return cld.get(Calendar.WEEK_OF_YEAR);
	}
	
	public static void main(String[] args) {
		Date date=new Date();
		Calendar cld=Calendar.getInstance();
		int year=cld.get(Calendar.YEAR);
		int month=cld.get(Calendar.MONTH)+1;
		int day=cld.get(Calendar.DATE);
		int weeks=getWeek(date);
		System.out.printf("%d年%d月%d日是%d年的第%d周",year,month,day,year,weeks);
	}
}
