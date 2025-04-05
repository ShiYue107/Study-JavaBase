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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class UpdateJFrame extends JFrame {

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
					UpdateJFrame frame = new UpdateJFrame(null);
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateJFrame(PCSume pcs) {
		setTitle("\u4FEE\u6539\u6D88\u8D39\u9879");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  i  d");
		lblNewLabel.setBounds(72, 35, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u6D88\u8D39\u540D\u79F0");
		label.setBounds(72, 105, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6D88\u8D39\u91D1\u989D");
		label_1.setBounds(72, 174, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u6D88\u8D39\u65E5\u671F");
		label_2.setBounds(72, 245, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(" \u6D88\u8D39\u4EBA");
		label_3.setBounds(72, 317, 72, 18);
		contentPane.add(label_3);
		
		JButton btnNewButton = new JButton("\u4FEE  \u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//修改
				btnUpdate(e);
			}
		});
		btnNewButton.setBounds(89, 388, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u8FD4  \u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//返回
				dispose();
				new HomeJFrame().main(null);
			}
		});
		button.setBounds(279, 388, 113, 27);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(189, 32, 203, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 102, 203, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 171, 203, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 242, 203, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 314, 203, 24);
		contentPane.add(textField_4);
		//将数据显示到JFrame中
		textField.setText(pcs.getId()+"");
		textField_1.setText(pcs.getName());
		textField_2.setText(pcs.getMoney()+"");
		textField_3.setText(pcs.getDate()+"");
		textField_4.setText(pcs.getUserName());
		
	}
	//创建修改方法
	private void btnUpdate(ActionEvent e) {
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
		boolean flag=new PCSumeDao().update(pcs);
		if(flag) {
			JOptionPane.showMessageDialog(null, "修改成功！");
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "修改失败！");
		}
		new HomeJFrame().main(null);
	}
}
