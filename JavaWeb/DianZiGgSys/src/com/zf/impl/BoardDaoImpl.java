package com.zf.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zf.dao.BoardDao;
import com.zf.dao.TopicDao;
import com.zf.dao.UserDao;
import com.zf.pojo.Board;
import com.zf.pojo.Topic;
import com.zf.pojo.User;

public class BoardDaoImpl extends BaseDao implements BoardDao {

	private HashMap map = new HashMap();//保存版块信息的Map
	private int parentId = 0;//父版块ID初始值为0，parentNo将作为map的key
	private List sonList = null;//保存属于同一个父版块的一组子，将作为map的value
	
	
	@Override
	public Map findBoard() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board order by parentId,boardId";
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			sonList = new ArrayList();
			TopicDao td = new TopicDaoImpl();
			UserDao ud = new UserDaoImpl();
			/*循坏将版块信息封装成Map*/
			while(rs.next()) {
				if(parentId != rs.getInt("parentId")) {
					map.put("b" + new Integer(parentId), sonList);
					sonList = new ArrayList();
					parentId = rs.getInt("parentId");
				}
				Board board = new Board();
				board.setBoardId(rs.getInt("parentId"));
				board.setBoardName(rs.getString("boardName"));
				board.setCount(td.findCountTopic(board.getBoardId()));
				Topic lastTopic = td.findLastTopic(board.getBoardId());
				if(lastTopic != null) {
					board.setLastTopic(td.findLastTopic(board.getBoardId()));
					User u = ud.findUser(board.getLastTopic().getUid());
					board.setLastPostUser(u.getuName());
				}
				sonList.add(board);
			}
			map.put("b" + new Integer(parentId),sonList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConn(conn, pstmt, rs);
		}
		return map;
	}

	@Override//根据版块ID查找版块
	public Board findBoard(int boardId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board where boardId=" + boardId;
		Board board = null;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				board = new Board();
				board.setBoardId(rs.getInt("boardId"));
				board.setBoardName(rs.getString("boardName"));
				board.setParentId(rs.getInt("parentId"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConn(conn, pstmt, rs);
		}
		return board;
	}
}
