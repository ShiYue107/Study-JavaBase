package com.mhys.Frame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mhys.Dao.Student;
import com.mhys.Dao.StudentDao;

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
		setTitle("\u8003\u751F\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u65B0\u589E\u8003\u751F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//新增
				dispose();
				new AddFrame().main(null);
			}
		});
		btnNewButton.setBounds(120, 13, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u5220\u9664\u8003\u751F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//删除
				btn_delet(e);
			}
		});
		button.setBounds(333, 13, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u8003\u751F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//修改
				btn_update(e);
			}
		});
		button_1.setBounds(537, 13, 113, 27);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 52, 771, 342);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		//查询
		//创建Dao并调用查询所有考生信息的方法
		StudentDao dao=new StudentDao();
		List<Student> list = dao.queryAll();
		//创建两个数组对象
		Object [][] datas=new Object[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			datas[i][0]=list.get(i).getId();
			datas[i][1]=list.get(i).getName();
			datas[i][2]=list.get(i).getCardID();
			datas[i][3]=list.get(i).getDate();
		}
		//表头
		String [] data=new String[]{"序号","姓名","考号","创建日期"};
		DefaultTableModel modle=new DefaultTableModel(datas, data);
		this.table.setModel(modle);
	}
	//刪除
	private void btn_delet(ActionEvent e) {
		//判断是否选中行
		int row =this.table.getSelectedRow();
		if (row<0) {
			JOptionPane.showMessageDialog(null, "请选择您要删除的数据！");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "您确定要删除该数据吗", 
					"选择一个选项", JOptionPane.YES_NO_CANCEL_OPTION);
			if (choose==JOptionPane.YES_NO_OPTION) {
				//获取选中的数据
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//获取选中的id
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//创建Dao并调用删除方法
				StudentDao dao=new StudentDao();
				boolean flag=dao.delet(id);
				if (flag) {
					JOptionPane.showMessageDialog(null, "删除成功！");
					model.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		}
	}
	//创建修改方法
	private void btn_update(ActionEvent e) {
		//获取选中的行
		int row =table.getSelectedRow();
		//判断是否选中行
		if (row<0) {
			JOptionPane.showInternalMessageDialog(null, "请选择您要修改的数据！");
		}else {
			dispose();
			int choose=JOptionPane.showConfirmDialog(null, "您确定要修改该数据吗", 
					"选择一个选项", JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_NO_OPTION) {
				//获取选中的数据
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//获取选中的id
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//调用查询单条数据
				Student std=new StudentDao().queryOne(id);
				new UpdateFrame(std).setVisible(true);
			}else {
				this.setVisible(true);
			}
		}
	}
}
