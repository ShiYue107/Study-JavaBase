package com.mhys.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mhys.Dao.Student;
import com.mhys.Dao.StudentDao;

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
	public UpdateFrame(Student std) {
		setTitle("\u4FEE\u6539\u8003\u751F\u4FE1\u606F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   id");
		lblNewLabel.setBounds(77, 23, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u59D3    \u540D");
		label.setBounds(77, 90, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8003    \u53F7");
		label_1.setBounds(77, 157, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u521B\u5EFA\u65E5\u671F");
		label_2.setBounds(77, 219, 72, 18);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(196, 20, 227, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 87, 227, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 154, 227, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 216, 227, 24);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("\u4FEE  \u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//修改
				btn_update(e);
			}
		});
		btnNewButton.setBounds(103, 277, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u8FD4  \u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//返回
				dispose();
				new HomeFrame().main(null);
			}
		});
		button.setBounds(276, 277, 113, 27);
		contentPane.add(button);
		//把获取的数据显示到界面中
		textField.setText(std.getId()+"");
		textField_1.setText(std.getName());
		textField_2.setText(std.getCardID());
		textField_3.setText(std.getDate()+"");
	}
	//创建修改方法
	private void btn_update(ActionEvent e) {
		String no=textField.getText();
		int id=Integer.parseInt(no);
		String name=textField_1.getText();
		String cardID=textField_2.getText();
		String dates=textField_3.getText();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=sdf.parse(dates);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Student std1=new Student(id, name, cardID, date);
		//创建Dao并调用修改方法
		Boolean flag = new StudentDao().update(std1);
		if (flag) {
			JOptionPane.showMessageDialog(null, "修改成功！");
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "修改失败！");
		}
		new HomeFrame().main(null);
	}
}
