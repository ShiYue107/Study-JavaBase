package com.dbd.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbd.dao.ProjectDao;
import com.dbd.dao.UserDao;
import com.dbd.pojo.Project;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021��5��26�� ����12:39:39
* @version 1.0
* ��˵��
*/
@WebServlet("/project")
public class ProjectServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ñ��뼯
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String projectName = req.getParameter("projectName");
		String projectContent = req.getParameter("projectContent");
		int userId = 1;
		Date date = new Date();
		Project prj = new Project(0, projectName, projectContent, userId, date, 500000);
		req.setAttribute("prj", prj);
		int result = ProjectDao.addPrj(prj);
		List<Project> list = ProjectDao.queryAllPrj();
		req.setAttribute("list", list);
		if (result > 0) {
			req.getRequestDispatcher("userInfo.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("start1.jsp").forward(req, resp);
		}
	}
}
