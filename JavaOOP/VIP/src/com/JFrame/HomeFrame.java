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
		
		JButton btnNewButton = new JButton("�� ѯ");
		btnNewButton.setFont(new Font("����", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_select(e);
			}
		});
		btnNewButton.setBounds(386, 15, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("ɾ ��");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_dele(e);
			}
		});
		button.setFont(new Font("����", Font.PLAIN, 17));
		button.setBounds(618, 15, 113, 27);
		contentPane.add(button);
	}
	//������ѯ����
	private void btn_select(ActionEvent e) {
		//����Dao�����ò�ѯ���з���
		List<Vip> list=new VipDao().querAll();
		//���������������
		Object[][]datas=new Object[list.size()][6];
		for (int i = 0; i < datas.length; i++) {
			datas[i][0]=list.get(i).getMemberid();
			datas[i][1]=list.get(i).getPhone();
			datas[i][2]=list.get(i).getName();
			datas[i][3]=list.get(i).getSex();
			datas[i][4]=list.get(i).getOpenDate();
			datas[i][5]=list.get(i).getBalance();
		}
		//��ͷ
		String []data=new String [] {"���","�ֻ�","����","�Ա�","��������","�������"};
		DefaultTableModel model=new DefaultTableModel(datas, data);
		this.table.setModel(model);
	}
	//����ɾ������
	private void btn_dele(ActionEvent e) {
		//��ȡ��
		int row=this.table.getSelectedRow();
		//�ж��Ƿ�ѡ����
		if(row<0) {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫɾ�������ݣ���");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "��ȷ��Ҫɾ����������",
					"ѡ��һ��ѡ��",JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_NO_OPTION) {
				//��ȡmodel�е�����
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//����Dao���󲢵���ɾ������
				boolean flag=new VipDao().delVipById(id);
				if(flag) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					model.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�");
				}
			}
		}
	}
}
