package com.itkoma.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itkoma.dao.VipDao;
import com.itkoma.model.Vip;

/**
* @author IT_Koma
* @date 2021��4��13�� ����4:29:25
* @version 1.0
* ��˵��
*/
@WebServlet("/addVip")
public class AddVipServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ñ��뼯
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//��������
		String phone = req.getParameter("phone");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH-dd");
		Date openDate = null;
		try {
			openDate = sdf.parse(req.getParameter("openDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double balancd = Double.parseDouble(req.getParameter("balance"));
		
		//����Vip����
		Vip vip = new Vip(0, phone, name, gender, openDate, balancd);
		
		//������������
		int result = new VipDao().addVip(vip);
		
		//����ת��
		if(result > 0) {
			req.getRequestDispatcher("queryAllVip").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}
}
