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

public class UpdateFrame extends JFrame {

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
					UpdateFrame frame = new UpdateFrame(null);
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
	public UpdateFrame(Classs cs) {
		setTitle("\u4FEE\u6539\u6210\u5458\u4FE1\u606F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  i  d");
		lblNewLabel.setBounds(68, 27, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel(" \u59D3  \u540D");
		label.setBounds(68, 72, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(" \u804C  \u52A1");
		label_1.setBounds(68, 123, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(" \u6027  \u522B");
		label_2.setBounds(68, 172, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(" \u5B66  \u53F7");
		label_3.setBounds(68, 222, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(" \u4F59  \u989D");
		label_4.setBounds(68, 270, 72, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u521B\u5EFA\u65E5\u671F");
		label_5.setBounds(68, 320, 72, 18);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(193, 24, 246, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 69, 246, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 120, 246, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(193, 169, 246, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(193, 219, 246, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(193, 267, 246, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(193, 317, 246, 24);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("\u4FEE  \u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//修改
				btn_update(e);
			}
		});
		btnNewButton.setBounds(80, 383, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(" \u8FD4  \u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//返回
				dispose();
				new HomeFrame().main(null);
			}
		});
		button.setBounds(289, 383, 113, 27);
		contentPane.add(button);
		//显示修改信息
		textField.setText(cs.getId()+"");
		textField_1.setText(cs.getName());
		textField_2.setText(cs.getSex());
		textField_3.setText(cs.getPost());
		textField_4.setText(cs.getIdcard());
		textField_5.setText(cs.getBalance()+"");
		textField_6.setText(cs.getCreateDate()+"");
	}
	//创建修改方法
	private void btn_update(ActionEvent e) {
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
		boolean flag=dao.updateClass(cs);
		if (flag) {
			JOptionPane.showMessageDialog(null, "修改成功！");
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "修改失败！");
		}
		new HomeFrame().main(null);
	}
}
