package com.mhys.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mhys.Dao.Student;
import com.mhys.Dao.StudentDao;

public class StudentTest1 {
	public static void main(String[] args) throws ParseException {
		String dates="2020:07:25";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd");
		Date date=sdf.parse(dates);
		Student std=new Student(0,"’≈¡˘","25280301",date);
		StudentDao dao=new StudentDao();
		dao.addStudent(std);
	}
}
