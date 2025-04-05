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
 * @description: 修改的Servlet
 * @create: 2021-04-23 11:19
 **/
@WebServlet("/updateStu")
public class UpdateStuServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //接收数据
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String level = req.getParameter("level");
        String phone = req.getParameter("phone");
        String tjr = req.getParameter("tjr");
        if (tjr == null || tjr.equals("")){
            tjr="无";
        }
        Date time = new Date();
        //创建Student对象并调用修改方法
        Student stu = new Student(id,name,sex,level,phone,tjr,time);
        int result = StudentDao.updateStu(stu);
        //请求转发
        if (result > 0){
            req.getRequestDispatcher("queryAllStu").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }
}
