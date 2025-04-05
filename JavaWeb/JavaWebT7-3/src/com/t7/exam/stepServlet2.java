package com.t7.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class stepServlet2
 */
@WebServlet("/stepServlet2")
public class stepServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stepServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.append("<from name='form1' method='post'action='stepServlet3'>");
		out.append("在线用户注册向导--附加基本信息填写<br><br>");
		out.append("社会地位<select name='cmbsocialPosition'style='width:160px'>");
		out.append("<option value='学生'selected>学生</option>");
		out.append("<option value='老师'selected>老师</option>");
		out.append("<option value='医生'selected>医生</option>");
		out.append("住址<input type='text'name='txtAddresss'><br>");
		out.append("联系电话<input type='text'name='txtTel'><br>");
		out.append("<input type='button' name='Submit' value='上一步'onclic='history.go(-1)'>");
		out.append("<input type='submit' name='Submit2'value='下一步'></p>");
		out.append("<input type='hidden'name='txtUserName'value='"+request.getParameter("txtUserName")+"'>");
		out.append("<input type='hidden'name='txtUserPwd'value='"+request.getParameter("txtUserPwd")+"'>");
		out.append("<input type='hidden'name='txte-mail'value='"+request.getParameter("txte-mail")+"'>");
		out.append("</form>");
	}

}
