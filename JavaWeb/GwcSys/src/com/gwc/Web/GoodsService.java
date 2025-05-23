package com.gwc.Web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gwc.Dao.GoodsDao;
import com.gwc.Modle.Goods;
@WebServlet("/goods")
public class GoodsService extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码集
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html,charset=utf-8");
		//创建Dao并调用查询所有方法
		List<Goods> list=new GoodsDao().queryAll();
		//将查询到的数据添加到属性
		req.setAttribute("goodsList", list);
		//请求转发
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
