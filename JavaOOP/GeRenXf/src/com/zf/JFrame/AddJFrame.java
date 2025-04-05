package com.zf.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.zf.Dao.PCSume;
import com.zf.Dao.PCSumeDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AddJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddJFrame frame = new AddJFrame();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddJFrame() {
		setTitle("\u6DFB\u52A0\u6D88\u8D39\u9879");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  i  d");
		lblNewLabel.setBounds(87, 54, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u6D88\u8D39\u540D\u79F0");
		label.setBounds(87, 118, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6D88\u8D39\u91D1\u989D");
		label_1.setBounds(87, 196, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u6D88\u8D39\u65E5\u671F");
		label_2.setBounds(87, 269, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(" \u6D88\u8D39\u4EBA");
		label_3.setBounds(87, 343, 72, 18);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(187, 51, 193, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 115, 193, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 193, 193, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 266, 193, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(187, 340, 193, 24);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("\u6DFB  \u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//添加
				btnAdd(e);
			}
		});
		btnNewButton.setBounds(75, 461, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u8FD4  \u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//返回
				new HomeJFrame().main(null);
			}
		});
		button.setBounds(267, 461, 113, 27);
		contentPane.add(button);
	}
	//创建添加方法
	private void btnAdd(ActionEvent e) {
		String ider=textField.getText();
		int id=Integer.parseInt(ider);
		String name=textField_1.getText();
		String price=textField_2.getText();
		double money=Double.parseDouble(price);
		String dates=textField_3.getText();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=sdf.parse(dates);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String userName=textField_4.getText();
		//创建PCSume对象并调用修改方法 
		PCSume pcs=new PCSume(id, name, money, date, userName);
		boolean flag=new PCSumeDao().addPcs(pcs);
		if(flag) {
			JOptionPane.showMessageDialog(null, "添加成功！");
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "添加失败！");
		}
		new HomeJFrame().main(null);
	}
}
