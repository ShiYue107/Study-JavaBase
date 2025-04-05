package com.zf.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.zf.Dao.ClassDao;
import com.zf.Dao.Classs;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFrame frame = new AddFrame();
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
	public AddFrame() {
		setTitle("\u65B0\u589E\u6210\u5458\u4FE1\u606F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("  i  d");
		label.setBounds(58, 29, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(" \u59D3  \u540D");
		label_1.setBounds(58, 74, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(" \u804C  \u52A1");
		label_2.setBounds(58, 125, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(" \u6027  \u522B");
		label_3.setBounds(58, 174, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(" \u5B66  \u53F7");
		label_4.setBounds(58, 224, 72, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(" \u4F59  \u989D");
		label_5.setBounds(58, 272, 72, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u521B\u5EFA\u65E5\u671F");
		label_6.setBounds(58, 322, 72, 18);
		contentPane.add(label_6);
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBounds(183, 26, 246, 24);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setColumns(10);
		textField_1.setBounds(183, 71, 246, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setColumns(10);
		textField_2.setBounds(183, 122, 246, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setColumns(10);
		textField_3.setBounds(183, 171, 246, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setColumns(10);
		textField_4.setBounds(183, 221, 246, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(10);
		textField_5.setBounds(183, 269, 246, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		textField_6.setColumns(10);
		textField_6.setBounds(183, 319, 246, 24);
		contentPane.add(textField_6);
		
		JButton button = new JButton("\u4FEE  \u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//新增
				btn_add(e);
			}
		});
		button.setBounds(70, 385, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton(" \u8FD4  \u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//返回
				dispose();
				new HomeFrame().main(null);;
			}
		});
		button_1.setBounds(279, 385, 113, 27);
		contentPane.add(button_1);
	}
	//创建新增方法
	private void btn_add(ActionEvent e) {
		String ids=textField.getText();
		int id=Integer.parseInt(ids);
		String name=textField_1.getText();
		String sex=textField_2.getText();
		String post=textField_3.getText();
		String idcard=textField_4.getText();
		String balances=textField_5.getText();
		double balance =Double.parseDouble(balances);
		String dates=textField_6.getText();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=sdf.parse(dates);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Classs cs=new Classs(id, name, sex, post, idcard, balance, date);
		ClassDao dao=new ClassDao();
		boolean flag=dao.addClass(cs);
		if (flag) {
			JOptionPane.showMessageDialog(null, "添加成功！");
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "添加失败！");
		}
		new HomeFrame().main(null);
	
	}
}
