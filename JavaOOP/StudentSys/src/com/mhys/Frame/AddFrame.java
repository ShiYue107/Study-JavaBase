package com.mhys.Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mhys.Dao.Student;
import com.mhys.Dao.StudentDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFrame frame = new AddFrame();
					frame.setLocationRelativeTo(null);
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
	public AddFrame() {
		setTitle("\u65B0\u589E\u8003\u751F\u4FE1\u606F");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u59D3    \u540D");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(86, 51, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u8003    \u53F7");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(86, 110, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u521B\u5EFA\u65E5\u671F");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(86, 171, 72, 18);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(195, 49, 223, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 108, 223, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 169, 223, 24);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("\u65B0  \u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//新增
				btn_add(e);
			}
		});
		btnNewButton.setBounds(103, 228, 113, 27);
		contentPane.add(btnNewButton);
		
		button = new JButton("\u8FD4  \u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//返回
				dispose();
				new HomeFrame().main(null);
			}
		});
		button.setBounds(279, 228, 113, 27);
		contentPane.add(button);
	}
	//创建新增方法
	private void btn_add(ActionEvent e) {
		String name=textField.getText();
		String cardID=textField_1.getText();
		String dates=textField_2.getText();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=sdf.parse(dates);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Student std=new Student(0, name, cardID, date);
		//创建Dao并调用新增方法
		StudentDao dao=new StudentDao();
		boolean flag=dao.addStudent(std);
		if (flag) {
			JOptionPane.showMessageDialog(null, "添加成功！");
			dispose();
			new HomeFrame().main(null);
		}else {
			JOptionPane.showMessageDialog(null, "添加失败！");
		}
	}
}
