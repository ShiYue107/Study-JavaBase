package com.zf.pojo;

public class Topic extends Tip{

	private int topicId;
	private int boardId;
	

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", boardId=" + boardId + "]";
	}
	
}
