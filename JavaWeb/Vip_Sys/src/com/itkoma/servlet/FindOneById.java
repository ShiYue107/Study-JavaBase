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
* @date 2021��4��13�� ����8:06:07
* @version 1.0
* ��˵��
*/
@WebServlet("/findOne")
public class FindOneById extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ñ��뼯
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//����id
		int id = Integer.parseInt(req.getParameter("id"));
		
		//��ȡ��ѯ����Vip����
		Vip vip = new VipDao().findOneById(id);
		
		req.setAttribute("vip", vip);
		if (vip != null) {
			req.getRequestDispatcher("updateVip.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

}
