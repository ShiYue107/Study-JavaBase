package com.zf.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH£∫mm:ss");
		Calendar cld=Calendar.getInstance();
		String newString=sdf.format(cld.getTime());
		System.out.println(cld);
		System.out.println(newString);
		int year=cld.get(Calendar.YEAR);
		int month=(cld.get(Calendar.MONTH))+1;
		int day=cld.get(Calendar.DATE);
		int weeksOfYear=cld.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth=cld.get(Calendar.WEEK_OF_MONTH);
		int dayOfYear=cld.get(Calendar.DAY_OF_YEAR);
		int dayOfMonth=cld.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek=(cld.get(Calendar.DAY_OF_WEEK))-1;
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(weeksOfYear);
		System.out.println(weekOfMonth);
		System.out.println(dayOfYear);
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
	}
}
