package com.zf.Tests;
/*
 * ’‚ «≤‚ ‘¿‡2
 */

import java.util.List;

import com.zf.Dao.PCSume;
import com.zf.Dao.PCSumeDao;
import com.zf.Utils.BaseDao;

public class Test2 {
	public static void main(String[] args) {
//		List<PCSume> list=new PCSumeDao().queryAll();
//		for (PCSume pcSume : list) {
//			System.out.println(pcSume);
//		}
		
//		int id=3;
//		boolean flag=new PCSumeDao().delById(id);
//		System.out.println(flag);
		
		int id=4;
		PCSume pcs=new PCSumeDao().queryOne(id);
		System.out.println(pcs);
	}
}
