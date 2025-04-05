package com.itkoma.vipTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.itkoma.dao.VipDao;
import com.itkoma.model.Vip;

public class Test1 {
	
	public static void main(String[] args) {
//		List<Vip> list = new VipDao().queryAll();
//		for (Vip vip : list) {
//			System.out.println(vip);
//		}
		
//		Vip vip = new Vip(0, "1542549232", "126", "ÄÐ", new Date(), 235.22);
//		int result = new VipDao().addVip(vip);
		
		int id = 7;
//		int result = new VipDao().deleteVip(id);
		
		Vip vip = new VipDao().findOneById(id);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dates = "2021-4-13";
		Date date = null;
		try {
			date = sdf.parse(dates);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vip.setName("Ë§Ë§");
		vip.setOpenDate(date);
		int result = new VipDao().updateVip(vip);
	}
}
