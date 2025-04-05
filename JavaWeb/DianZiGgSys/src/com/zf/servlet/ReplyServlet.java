package com.zf.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zf.dao.BoardDao;
import com.zf.dao.ReplyDao;
import com.zf.impl.BoardDaoImpl;
import com.zf.impl.ReplyDaoImpl;
import com.zf.pojo.Board;
import com.zf.pojo.Reply;
import com.zf.pojo.User;

/**
 * Servlet implementation class ReplyServlet
 */
@WebServlet("/ReplyServlet")
public class ReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String operate = req.getParameter("operate");
		ReplyDao rd = new ReplyDaoImpl();
		BoardDao bd = new BoardDaoImpl();
		String targetUrl = "";
		switch (operate) {
		case "perModify":
			int replyId = Integer.parseInt(req.getParameter("replyId"));
			int topicId = Integer.parseInt(req.getParameter("topicId"));
			int boardId = Integer.parseInt(req.getParameter("boardId"));
			Reply reply = rd.findReply(replyId);
			Board board = bd.findBoard(boardId);
			req.setAttribute("topicId", topicId);
			req.setAttribute("board", board);
			req.setAttribute("reply", reply);
			targetUrl = "modifyReply.jsp";
			break;
		case "modify":
			if(req.getSession().getAttribute("user") == null) {
				req.getRequestDispatcher("error.jsp?msg=ÄúÉÐÎ´µÇÂ¼").forward(req, resp);
			}
			replyId = Integer.parseInt(req.getParameter("replyId"));
			topicId = Integer.parseInt(req.getParameter("topicId"));
			boardId = Integer.parseInt(req.getParameter("boardId"));
			User user = (User)(req.getSession().getAttribute("user"));
			Reply modifyReply = new Reply();
			modifyReply.setReplyId(replyId);
			modifyReply.setTopicId(topicId);
			modifyReply.setUid(user.getuId());
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			modifyReply.setContent(content);
			modifyReply.setTitle(title);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String modifyTime = sdf.format(new Date());
			modifyReply.setModifyTime(modifyTime);
			if(rd.updateReply(modifyReply) > 0) {
				targetUrl = "TopicServlet?operate=detail&page=1&boardId="+boardId+"&topicId="
							+topicId;
			}else {
				String msg = "»Ø¸´Ê§°Ü£¡";
				targetUrl = "error.jsp?msg"+msg;
			}
			break;
		case "delete":
			if(req.getSession().getAttribute("user") == null) {
				req.getRequestDispatcher("error.jsp?msg=ÄúÉÐÎ´µÇÂ¼").forward(req, resp);
			}
			replyId = Integer.parseInt(req.getParameter("replyId"));
			topicId = Integer.parseInt(req.getParameter("topicId"));
			boardId = Integer.parseInt(req.getParameter("boardId"));
			if(rd.deleteReply(replyId) > 0) {
				resp.getWriter().print("<script>alert('É¾³ý»Ø¸´³É¹¦£¡');</script>");
				targetUrl = "TopicServlet?operate=detail&page=1&boardId="+boardId+"&topicId="
						+topicId;
			}else {
				String msg = "É¾³ý»Ø¸´Ê§°Ü£¡";
				targetUrl = "error.jsp?msg"+msg;
			}
			break;
		case "reply":
			if(req.getSession().getAttribute("user") == null) {
				req.getRequestDispatcher("error.jsp?msg=ÄúÉÐÎ´µÇÂ¼").forward(req, resp);
			}
			topicId = Integer.parseInt(req.getParameter("topicId"));
			boardId = Integer.parseInt(req.getParameter("boardId"));
			title = req.getParameter("title");
			user = (User)(req.getSession().getAttribute("user"));
			content = req.getParameter("content");
			sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String publishTime = sdf.format(new Date());
			Reply newReply = new Reply();
			newReply.setContent(content);
			newReply.setTopicId(topicId);
			newReply.setContent(content);
			newReply.setPublishTime(publishTime);
			newReply.setModifyTime(publishTime);
			newReply.setTitle(title);
			newReply.setUid(user.getuId());
			if(rd.addReply(newReply) > 0) {
				targetUrl = "TopicServlet?operate=detail&page=1&boardId="+boardId+"&topicId="
						+topicId;
				
			}else {
				String msg = "»Ø¸´Ê§°Ü£¡";
				targetUrl = "error.jsp?msg"+msg;
			}
			break;
		default:
			break;
		}
		req.getRequestDispatcher(targetUrl).forward(req, resp);
	}
}
