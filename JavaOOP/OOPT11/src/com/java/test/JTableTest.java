package com.java.test;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class JTableTest extends JFrame{
	JTable jtl;
	public void init() {
		String [] date= {"Ó¢ÐÛ±àºÅ","Ó¢ÐÛÃû³Æ","ÑªÁ¿","¹¥»÷Öµ","Ä§·¨Öµ"};
		Object [][] dates= {{"hero001","°µÒ¹Ä§Íõ",210,510,200},{"hero002","Ðé¿Õ¼ÙÃæ",220,310,300},
							{"hero003","¶ñÄ§Î×Ê¦",399,160,250},{"hero004","°µÒ¹ÈüÂí",148,230,530}};
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		jtl=new JTable(dates,date);
		JScrollPane jSp = new JScrollPane(jtl,v,h);
		this.add(jSp);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {

		new JTableTest().init();
	}
}
