package com.FanXiao.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FanXiao.dao.CheckInfoDao;
import com.FanXiao.pojo.CheckInfo;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//设置编码集
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//接收数据
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String from = req.getParameter("from");
		String returnTime = req.getParameter("returnDate");
		String checkTime = req.getParameter("checkDate");
		String state = req.getParameter("state");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date returnDate = sdf.parse(returnTime);
			Date checkDate = sdf.parse(checkTime);
			//调用新增方法并将接收到的数据添加到对象中
			int result = new CheckInfoDao().addCheckInfo(new CheckInfo(0, name, gender, from, returnDate, checkDate, state));
			if(result > 0) {
				req.getRequestDispatcher("queryAll").forward(req, resp);
			}else {
				req.getRequestDispatcher("error.jsp").forward(req, resp);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
