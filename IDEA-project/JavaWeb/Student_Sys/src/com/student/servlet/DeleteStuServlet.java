package com.student.servlet;

import com.student.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: 删除的Serlvet
 * @create: 2021-04-23 11:41
 **/
@WebServlet("/deleteStu")
public class DeleteStuServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取要删除的id
        int id = Integer.parseInt(req.getParameter("id"));
        //调用删除方法
        int result = StudentDao.deleteStu(id);
        //请求转发
        if (result > 0){
            req.getRequestDispatcher("queryAllStu").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }
}
