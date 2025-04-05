package com.student.servlet;

import com.student.dao.StudentDao;
import com.student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: 新增学员Servlet
 * @create: 2021-04-23 10:51
 **/
@WebServlet("/addStu")
public class AddStuServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //接收数据
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String level = req.getParameter("level");
        String phone = req.getParameter("phone");
        String tjr = req.getParameter("tjr");
        if (tjr == null || tjr.equals("")){
            tjr="无";
        }
        Date time = new Date();

        //创建Student对象并调用新增学员方法
        Student stu = new Student(0,name,sex,level,phone,tjr,time);
        int result = StudentDao.addStu(stu);
        if (result > 0){
            req.getRequestDispatcher("queryAllStu").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }
}
