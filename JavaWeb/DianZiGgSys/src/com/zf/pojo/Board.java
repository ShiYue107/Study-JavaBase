package com.zf.pojo;

public class Board {
	
	private int boardId = 1;//����Ψһ��ʶ���
	private String boardName = "Jsp";//�������
	private int parentId = 0;//�����ʶ
	private int count;//�����������
	private String lastPostUser;//���һ�η�����
	private Topic lastTopic;//����
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getLastPostUser() {
		return lastPostUser;
	}
	public void setLastPostUser(String lastPostUser) {
		this.lastPostUser = lastPostUser;
	}
	public Topic getLastTopic() {
		return lastTopic;
	}
	public void setLastTopic(Topic lastTopic) {
		this.lastTopic = lastTopic;
	}
	
	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", boardName=" + boardName + ", parentId=" + parentId + ", count=" + count
				+ ", lastPostUser=" + lastPostUser + ", lastTopic=" + lastTopic + "]";
	}
	
	
}
