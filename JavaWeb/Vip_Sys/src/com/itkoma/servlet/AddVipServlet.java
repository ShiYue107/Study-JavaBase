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
* @date 2021年4月13日 下午4:29:25
* @version 1.0
* 类说明
*/
@WebServlet("/addVip")
public class AddVipServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//接收数据
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
		
		//创建Vip对象
		Vip vip = new Vip(0, phone, name, gender, openDate, balancd);
		
		//调用新增方法
		int result = new VipDao().addVip(vip);
		
		//请求转发
		if(result > 0) {
			req.getRequestDispatcher("queryAllVip").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}
}
