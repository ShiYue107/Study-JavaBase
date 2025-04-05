package com.itkoma.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itkoma.dao.VipDao;
import com.itkoma.model.Vip;

/**
* @author IT_Koma
* @date 2021年4月13日 下午8:06:07
* @version 1.0
* 类说明
*/
@WebServlet("/findOne")
public class FindOneById extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//接收id
		int id = Integer.parseInt(req.getParameter("id"));
		
		//获取查询到的Vip对象
		Vip vip = new VipDao().findOneById(id);
		
		req.setAttribute("vip", vip);
		if (vip != null) {
			req.getRequestDispatcher("updateVip.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
