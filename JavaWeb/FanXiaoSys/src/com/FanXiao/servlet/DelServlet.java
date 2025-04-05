package com.FanXiao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FanXiao.dao.CheckInfoDao;
import com.FanXiao.utils.DBUtils;

/**
 * Servlet implementation class DelServlet
 */
@WebServlet("/DelServlet")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//接收id
    	String idf = req.getParameter("id");
    	int id = Integer.parseInt(idf);
    	
    	//调用删除方法
    	int rsult = new CheckInfoDao().delById(id);
    	if (rsult > 0) {
			req.getRequestDispatcher("queryAll").forward(req, resp);
		}else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
    }
}
