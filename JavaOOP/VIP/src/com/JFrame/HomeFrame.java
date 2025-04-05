package com.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.Util.BaseDao;
import com.dao.Vip;
import com.dao.VipDao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
					frame.setLocationRelativeTo(null);
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
	public HomeFrame() {
		setTitle("\u4F1A\u5458\u5361\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 55, 848, 426);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("查 询");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_select(e);
			}
		});
		btnNewButton.setBounds(386, 15, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("删 除");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_dele(e);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 17));
		button.setBounds(618, 15, 113, 27);
		contentPane.add(button);
	}
	//创建查询方法
	private void btn_select(ActionEvent e) {
		//创建Dao并调用查询所有方法
		List<Vip> list=new VipDao().querAll();
		//创建两个数组对象
		Object[][]datas=new Object[list.size()][6];
		for (int i = 0; i < datas.length; i++) {
			datas[i][0]=list.get(i).getMemberid();
			datas[i][1]=list.get(i).getPhone();
			datas[i][2]=list.get(i).getName();
			datas[i][3]=list.get(i).getSex();
			datas[i][4]=list.get(i).getOpenDate();
			datas[i][5]=list.get(i).getBalance();
		}
		//表头
		String []data=new String [] {"序号","手机","姓名","性别","开卡日期","卡内余额"};
		DefaultTableModel model=new DefaultTableModel(datas, data);
		this.table.setModel(model);
	}
	//创建删除方法
	private void btn_dele(ActionEvent e) {
		//获取行
		int row=this.table.getSelectedRow();
		//判断是否选中行
		if(row<0) {
			JOptionPane.showMessageDialog(null, "请选择您要删除的数据！！");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "您确定要删除该数据吗？",
					"选择一个选项",JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_NO_OPTION) {
				//获取model中的数据
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//创建Dao对象并调用删除方法
				boolean flag=new VipDao().delVipById(id);
				if(flag) {
					JOptionPane.showMessageDialog(null, "删除成功！");
					model.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		}
	}
}
