package com.student.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.Dao.StudentDao;
import com.student.Model.Student;
@WebServlet("/showStudent")
public class ShowStudentServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//…Ë÷√±‡¬ÎºØ
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<Student> stuList=new StudentDao().queryAll();
		req.setAttribute("stuList", stuList);
		req.getRequestDispatcher("main.jsp").forward(req, resp);
	}
}
