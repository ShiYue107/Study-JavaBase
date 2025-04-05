package com.student.servlet;

import com.student.dao.StudentDao;
import com.student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: 查询单条数据
 * @create: 2021-04-23 11:10
 **/
@WebServlet("/findOne")
public class FindOneServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取要修改的数据id
        int id = Integer.parseInt(req.getParameter("id"));
        //查询单条Student
        Student stu = StudentDao.queryOneById(id);
        //将查询到的数据添加到属性中
        req.setAttribute("stu",stu);
        //请求转发
        req.getRequestDispatcher("updateStu.jsp").forward(req,resp);
    }
}
