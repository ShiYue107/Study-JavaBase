package com.zf.Test;
//≤‚ ‘¿‡
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zf.Dao.ClassDao;
import com.zf.Dao.Classs;

public class Test {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String datas="2020-8-10";
		Date data=sdf.parse(datas);
		Classs cs=new Classs(10, "’≈»˝", "nv", "jinli", "202000094", 132.31, data);
		boolean flag=new ClassDao().updateClass(cs);
		System.out.println(flag);
	}
}
