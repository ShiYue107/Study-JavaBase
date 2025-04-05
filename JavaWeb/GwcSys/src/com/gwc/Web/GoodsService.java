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
		//���ñ��뼯
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html,charset=utf-8");
		//����Dao�����ò�ѯ���з���
		List<Goods> list=new GoodsDao().queryAll();
		//����ѯ����������ӵ�����
		req.setAttribute("goodsList", list);
		//����ת��
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
