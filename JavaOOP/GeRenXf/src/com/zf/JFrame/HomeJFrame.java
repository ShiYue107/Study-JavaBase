package com.zf.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.zf.Dao.PCSume;
import com.zf.Dao.PCSumeDao;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class HomeJFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeJFrame frame = new HomeJFrame();
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
	public HomeJFrame() {
		setTitle("\u4E2A\u4EBA\u6D88\u8D39\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67E5  \u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ѯ
				btnSele(e);
			}
		});
		btnNewButton.setBounds(58, 26, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u6DFB  \u52A0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���
				dispose();
				new AddJFrame().main(null);
			}
			
		});
		button.setBounds(249, 26, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u5220  \u9664");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ɾ��
				btnDel(e);
			}
		});
		button_1.setBounds(437, 26, 113, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE  \u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�޸�
				btnUpdate(e);
			}
		});
		button_2.setBounds(617, 26, 113, 27);
		contentPane.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 77, 887, 416);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
	}
	//������ѯ����
	private void btnSele(ActionEvent e) {
		//����Dao���󲢵��ò�ѯ�����洢��������
		PCSumeDao dao=new PCSumeDao();
		List<PCSume> lsit=dao.queryAll();
		//������������
		Object [][]datas=new Object[lsit.size()][5];
		for (int i = 0; i < datas.length; i++) {
			datas[i][0]=lsit.get(i).getId();
			datas[i][1]=lsit.get(i).getName();
			datas[i][2]=lsit.get(i).getMoney();
			datas[i][3]=lsit.get(i).getDate();
			datas[i][4]=lsit.get(i).getUserName();
		}
		//��ͷ
		String []data=new String[]{"���","��������","���ѽ��","��������","������"};
		DefaultTableModel model=new DefaultTableModel(datas, data);
		this.table.setModel(model);
	}
	//����ɾ������
	private void btnDel(ActionEvent e) {
		//��ȡ��
		int row=table.getSelectedRow();
		//�ж��Ƿ�ѡ����
		if(row<=0) {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫɾ�������ݣ�");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "��ȷ��Ҫɾ����������?",
					"��ѡ��һ��ѡ��",JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_OPTION) {
				//��ȡģ���е�����
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//��ȡid
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//����Dao���󲢵���ɾ������
				PCSumeDao dao=new PCSumeDao();
				boolean flag=dao.delById(id);
				if(flag) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					model.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�");
				}
			}
		}
	}
	//�����޸ķ���
	private void btnUpdate(ActionEvent e) {
		//��ȡ��
		int row =table.getSelectedRow();
		//�ж��Ƿ�ѡ����
		if (row<=0) {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫ�޸ĵ����ݣ�");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ�޸ĸ�������",
					"��ѡ��һ��ѡ��",JOptionPane.YES_NO_CANCEL_OPTION);	
			if(choose==JOptionPane.YES_OPTION) {
				//��ȡģ���е�����
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//��ȡid	
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//����dao�����ò�ѯ��������
				PCSumeDao dao=new PCSumeDao();
				PCSume pcs=dao.queryOne(id);
				this.dispose();
				new UpdateJFrame(pcs).setVisible(true);
			}else {
				this.setVisible(true);
			}
		}
	}
	
}
