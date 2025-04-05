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
	
	//�������ڵ㷽��
	public void createRootElement() {
		//����xml�ļ����ĵ�����
		document=DocumentHelper.createDocument();
		//�������ڵ�
		rootElement=DocumentHelper.createElement("country");
		//�����ڵ��������
		rootElement.addAttribute("name", "�й�");
		//��rootElement��Ϊ���ڵ�
		document.setRootElement(rootElement);
	}
	
	//�����ӽڵ㷽��
	public void createChilElement() {
		//��������ʡ�ӽڵ�
		Element huBeiElement=DocumentHelper.createElement("province");
		//�������ӽڵ��������
		huBeiElement.addAttribute("name", "����");
		//�����人���ӽڵ�
		Element wuHanElement=DocumentHelper.createElement("city");
		//���人���ӽڵ������ı�
		wuHanElement.setText("�人");
		Element shiYanElement =DocumentHelper.createElement("city");
		shiYanElement.setText("ʮ��");
		//���人�к�ʮ������ӵ�����ʡ
		huBeiElement.add(wuHanElement);
		huBeiElement.add(shiYanElement);
		//������ʡ��ӵ����ڵ�
		rootElement.add(huBeiElement);
		//�����㽭ʡ�ӽڵ�
		Element zheJiangElement=DocumentHelper.createElement("province");
		zheJiangElement.addAttribute("name", "�㽭");
		Element hangZhouElement=DocumentHelper.createElement("city");
		hangZhouElement.setText("����");
		Element ningBoElement=DocumentHelper.createElement("city");
		ningBoElement.setText("����");
		zheJiangElement.add(hangZhouElement);
		zheJiangElement.add(ningBoElement);
		rootElement.add(zheJiangElement);
	}
	
	//������д��xml�ĵ�
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
