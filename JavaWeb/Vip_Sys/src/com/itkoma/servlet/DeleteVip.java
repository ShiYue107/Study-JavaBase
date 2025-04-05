package com.itkoma.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itkoma.dao.VipDao;

/**
* @author IT_Koma
* @date 2021年4月13日 下午7:42:39
* @version 1.0
* 类说明
*/
@WebServlet("/deleteVip")
public class DeleteVip extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//获取id
		int id = Integer.parseInt(req.getParameter("id"));
		
		//调用删除方法
		int result = new VipDao().deleteVip(id);
		
		//请求转发
		if(result > 0) {
			req.getRequestDispatcher("queryAllVip").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}
}
