package com.zf.pojo;

public class Reply extends Tip{


	private int replyId;//Ψһ��ʶ�ظ���ID
	private int topicId;//���������ID��������ʾ�ûظ����ĸ�����
	
	

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
