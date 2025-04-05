package com.student.servlet;

import com.student.dao.StudentDao;
import com.student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: servlet主页面
 * @create: 2021-04-22 23:56
 **/
@WebServlet("/queryAllStu")
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //接收数据
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");

        List<Student> list = StudentDao.queryAllStu(name,phone);
        //将接收的数据添加到属性中
        req.setAttribute("list",list);
        //请求转发
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
