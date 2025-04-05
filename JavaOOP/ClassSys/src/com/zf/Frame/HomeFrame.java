package com.zf.Frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.zf.Dao.ClassDao;
import com.zf.Dao.Classs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		setTitle("\u73ED\u7EA7\u6210\u5458\u4FE1\u606F\u7BA1\u7406");
		setFont(new Font("Dialog", Font.PLAIN, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u65B0  \u589E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//新增
				dispose();
				new AddFrame().main(null);
			}
		});
		btnNewButton.setBounds(84, 13, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u5220  \u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//删除
				btn_del(e);
			}
		});
		button.setBounds(268, 13, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4FEE  \u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//修改
				btn_updata(e);
			}
		});
		button_1.setBounds(452, 13, 113, 27);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 48, 645, 264);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		//查询方法
		//创建Dao对象并调用查询全部方法
		ClassDao dao=new ClassDao();
		List<Classs> list =dao.queryAll();
		//创建两个数组对象
		Object [][] datas=new Object [list.size()][7];
		for (int i = 0; i < datas.length; i++) {
			datas[i][0]=list.get(i).getId();
			datas[i][1]=list.get(i).getName();
			datas[i][2]=list.get(i).getSex();
			datas[i][3]=list.get(i).getPost();
			datas[i][4]=list.get(i).getIdcard();
			datas[i][5]=list.get(i).getBalance();
			datas[i][6]=list.get(i).getCreateDate();
		}
		String [] data= {"序号","姓名","性别","职务","学号","余额","创建日期"};
		DefaultTableModel model=new DefaultTableModel(datas, data);
		this.table.setModel(model);
 	}
	//创建删除方法
	private void btn_del(ActionEvent e) {
		//选中行
		int row=table.getSelectedRow();
		//判断是否选中
		if(row<0) {
			JOptionPane.showMessageDialog(null, "请选择您要删除的数据！");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "您确定要删除该数据吗？",
					"选中一个选项", JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_OPTION) {
				//获取选中的数据
				DefaultTableModel modle=(DefaultTableModel) table.getModel();
				int id=Integer.parseInt(modle.getValueAt(row, 0).toString());
				//创建Dao对象并调用删除方法
				ClassDao dao=new ClassDao();
				boolean flag=dao.deleClass(id);
				if (flag) {
					JOptionPane.showMessageDialog(null, "删除成功！");
					modle.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		}
	}
	
	//创建修改方法
	private void btn_updata(ActionEvent e) {
		int row =table.getSelectedRow();
		
		if (row<0) {
			JOptionPane.showMessageDialog(null, "请选择您要修改的数据！");
		}else {
			dispose();
			int choose=JOptionPane.showConfirmDialog(null, "您确定要删除该数据吗？",
					"请选择一下选项", JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_OPTION) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				ClassDao dao=new ClassDao();
				Classs cs=dao.queryOne(id);
				new UpdateFrame(cs).setVisible(true);
			}else {
				this.setVisible(true);
			}
		}
	}
}
