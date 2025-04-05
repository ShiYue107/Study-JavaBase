package com.zf.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.sql.Result;

import com.zf.dao.BoardDao;
import com.zf.dao.ReplyDao;
import com.zf.dao.TopicDao;
import com.zf.dao.UserDao;
import com.zf.impl.BoardDaoImpl;
import com.zf.impl.ReplyDaoImpl;
import com.zf.impl.TopicDaoImpl;
import com.zf.impl.UserDaoImpl;
import com.zf.pojo.Board;
import com.zf.pojo.Topic;
import com.zf.pojo.User;

/**
 * Servlet implementation class TopicServlet
 */
@WebServlet("/TopicServlet")
public class TopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	super.service(req, resp);
    	TopicDao td = new TopicDaoImpl();
    	BoardDao bd = new BoardDaoImpl();
    	UserDao ud = new UserDaoImpl();
    	ReplyDao rd = new ReplyDaoImpl();
    	String operate = req.getParameter("operate");
    	String targetUrl = "";
    	switch (operate) {
		case "list":
			int boardId = Integer.parseInt(req.getParameter("boardId"));
			String boardName = bd.findBoard(boardId).getBoardName();
			int page = 0;
			int totalCount = td.findCountTopic(boardId);
			int pageCount = totalCount % 2 == 0 ? totalCount /2 : totalCount /2 +1;
			if(req.getParameter("page") == null) {
				page = 1;
			}else {
				page = Integer.parseInt(req.getParameter("page"));
				if(page > pageCount) {
					page = 1;
				}else if(page < 1){
					page = pageCount;
				}
			}
			Result list = td.findListTopic(page, boardId);
			req.setAttribute("map", list.getRows());
			req.setAttribute("boardName", boardName);
			req.setAttribute("boardId", boardId);
			req.setAttribute("page", page);
			req.setAttribute("pageCount", pageCount);
			targetUrl = "list.jsp";
			break;
		case "detail":
			int topicId = Integer.parseInt(req.getParameter("topicId"));
			page = 0;
			Map topic = td.findTopic(topicId).getRows()[0];
			User user = ud.findUser((int)(topic.get("uId")));
			boardId = Integer.parseInt(req.getParameter("boardId"));
			boardName = bd.findBoard(boardId).getBoardName();
			totalCount = rd.findCountReply(topicId);
			if(totalCount == 0) {
				pageCount = 1;
			}else {
				pageCount = totalCount % 2 == 0 ? totalCount /2 : totalCount /2 +1;
			}
			if(req.getParameter("page") == null) {
				page = 1;
			}else {
				page = Integer.parseInt(req.getParameter("page"));
				if(page > pageCount) {
					page = 1;
				}else if (page < 1) {
					page = pageCount;
				}
			}
			Result result = rd.findListReply(page, topicId);
			req.setAttribute("rows", result.getRows());
			req.setAttribute("boardName", boardName);
			req.setAttribute("boardId", boardId);
			req.setAttribute("page", page);
			req.setAttribute("pageCount", pageCount);
			req.setAttribute("user", user);
			req.setAttribute("topic", topic);
			targetUrl = "detail.jsp";
			break;
		case "preAdd":
			if(req.getSession().getAttribute("user") == null) {
				req.getRequestDispatcher("error.jsp?msg=ÄúÉĞÎ´µÇÂ¼").forward(req, resp);
			}
			BoardDao boardDao = new BoardDaoImpl();
			boardId = Integer.parseInt(req.getParameter("boardId"));
			Board board = boardDao.findBoard(boardId);
			req.setAttribute("boardId", board.getBoardId());
			req.setAttribute("boardName", board.getBoardName());
			targetUrl = "post.jsp";
			break;
		case "add":
			if(req.getSession().getAttribute("user") == null) {
				req.getRequestDispatcher("error.jsp?msg=ÄúÉĞÎ´µÇÂ¼").forward(req, resp);
			}
			boardId = Integer.parseInt(req.getParameter("boardId"));
			String title = req.getParameter("title");
			user = (User)(req.getSession().getAttribute("user"));
			String content = req.getParameter("content");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String publishTime = sdf.format(new Date());
			Topic newTopic = new Topic();
			newTopic.setBoardId(boardId);
			newTopic.setContent(content);
			newTopic.setPublishTime(publishTime);
			newTopic.setModifyTime(publishTime);
			newTopic.setTitle(title);
			newTopic.setUid(user.getuId());
			if(td.addTopic(newTopic) > 0) {
				targetUrl = "TopicServlet?operate=list&page=1&boardId="+boardId;
			}else {
				String msg = "·¢ÌûÊ§°Ü£¡";
				targetUrl = "error.jsp?msg"+msg;
			}
			break;
		default:
			break;
		}
    	req.getRequestDispatcher(targetUrl).forward(req, resp);
    }
}
