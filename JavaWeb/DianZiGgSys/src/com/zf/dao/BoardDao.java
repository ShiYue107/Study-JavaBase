package com.zf.dao;

import java.util.Map;

import com.zf.pojo.Board;

public interface BoardDao {

	//���Ұ��map��key�Ǹ����ţ�value���Ӽ������󼯺�
	public Map findBoard();
	//���ݰ��Id���Ұ��
	public Board findBoard(int boardId);
	
}
