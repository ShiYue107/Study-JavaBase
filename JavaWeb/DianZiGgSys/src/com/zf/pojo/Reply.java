package com.zf.pojo;

public class Reply extends Tip{


	private int replyId;//唯一标识回复的ID
	private int topicId;//引用主题的ID，用来表示该回复是哪个主题
	
	

	public int getReplyId() {
		return replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	@Override
	public String toString() {
		return "Reply [replyId=" + replyId + ", topicId=" + topicId + "]";
	}
	
	
}
