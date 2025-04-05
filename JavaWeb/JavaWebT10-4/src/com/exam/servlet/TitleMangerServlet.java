package com.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.dao.TitleDao;

/**
 * Servlet implementation class TitleMangerServlet
 */
@WebServlet("/TitleMangerServlet")
public class TitleMangerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String title=request.getParameter("title");
		TitleDao tDao=new TitleDao();
		tDao.addTitle(title);
		request.setAttribute("msg",	"·¢Ìû³É¹¦£¡");
		request.getRequestDispatcher("query.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
