package com.zf.dao;

import java.util.Map;

import com.zf.pojo.Board;

public interface BoardDao {

	//查找版块map，key是父版块号，value是子级版块对象集合
	public Map findBoard();
	//根据版块Id查找版块
	public Board findBoard(int boardId);
	
}
