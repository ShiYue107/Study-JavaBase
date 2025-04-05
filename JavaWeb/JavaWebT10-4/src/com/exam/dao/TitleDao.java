package com.exam.dao;

import java.util.ArrayList;
import java.util.List;

import com.exam.pojo.Title;

public class TitleDao {

	public static List<Title> titleArr=new ArrayList<>();
	
	public void addTitle(String title) {
		Title t=new Title();
		if(titleArr.size()>0) {
			t.setId(titleArr.get(titleArr.size()-1).getId()+1);
		}else {
			t.setId(1);
		}
		t.setTitle(title);
		titleArr.add(t);
	}
}
