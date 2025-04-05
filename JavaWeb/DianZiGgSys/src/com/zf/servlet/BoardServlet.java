package com.zf.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zf.impl.BoardDaoImpl;
import com.zf.pojo.Board;

/**
 * Servlet implementation class BoaredServlet
 */
@WebServlet("/BoaredServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	
    	String operate = req.getParameter("operate");
    	BoardDaoImpl bdi = new BoardDaoImpl();
    	String targetUrl = "";
    	switch (operate) {
		case "list":
			HashMap<Integer,ArrayList<Board>> map = (HashMap<Integer, ArrayList<Board>>) 
													bdi.findBoard();
			req.setAttribute("map", map);
			targetUrl = "index.jsp";
			break;
		case "update":
			break;
		case "delete":
			break;
		case "select":
			break;
		case "insert":
			break;
		default:
			break;
		}
    	req.getRequestDispatcher(targetUrl).forward(req, resp);
    }
}		
