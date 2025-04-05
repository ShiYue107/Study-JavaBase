package com.zf.Test;

import com.zf.Dao.ClassDao;

public class Test2 {
	public static void main(String[] args) {
		int id=10;
		boolean flag=new ClassDao().deleClass(id);
		System.out.println(flag);
	}
}
