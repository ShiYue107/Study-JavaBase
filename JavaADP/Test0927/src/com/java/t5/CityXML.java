package com.java.t5;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class CityXML {
	private Document document;
	private Element rootElement;
	
	//创建根节点方法
	public void createRootElement() {
		//创建xml文件的文档对象
		document=DocumentHelper.createDocument();
		//创建根节点
		rootElement=DocumentHelper.createElement("country");
		//给根节点添加属性
		rootElement.addAttribute("name", "中国");
		//将rootElement设为根节点
		document.setRootElement(rootElement);
	}
	
	//创建子节点方法
	public void createChilElement() {
		//创建湖北省子节点
		Element huBeiElement=DocumentHelper.createElement("province");
		//给湖北子节点添加属性
		huBeiElement.addAttribute("name", "湖北");
		//创建武汉市子节点
		Element wuHanElement=DocumentHelper.createElement("city");
		//给武汉市子节点设置文本
		wuHanElement.setText("武汉");
		Element shiYanElement =DocumentHelper.createElement("city");
		shiYanElement.setText("十堰");
		//将武汉市和十堰市添加到湖北省
		huBeiElement.add(wuHanElement);
		huBeiElement.add(shiYanElement);
		//将湖北省添加到根节点
		rootElement.add(huBeiElement);
		//创建浙江省子节点
		Element zheJiangElement=DocumentHelper.createElement("province");
		zheJiangElement.addAttribute("name", "浙江");
		Element hangZhouElement=DocumentHelper.createElement("city");
		hangZhouElement.setText("杭州");
		Element ningBoElement=DocumentHelper.createElement("city");
		ningBoElement.setText("宁波");
		zheJiangElement.add(hangZhouElement);
		zheJiangElement.add(ningBoElement);
		rootElement.add(zheJiangElement);
	}
	
	//将数据写入xml文档
	public void createXML(String path) {
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		try {
			XMLWriter writer=new XMLWriter(new FileWriter(path), format);
			writer.write(document);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CityXML cxml=new CityXML();
		cxml.createRootElement();
		cxml.createChilElement();
		cxml.createXML("F://citt.xml");
	}
}
