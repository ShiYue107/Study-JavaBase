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
				//����
				dispose();
				new AddFrame().main(null);
			}
		});
		btnNewButton.setBounds(120, 13, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u5220\u9664\u8003\u751F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ɾ��
				btn_delet(e);
			}
		});
		button.setBounds(333, 13, 113, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u8003\u751F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�޸�
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
		//��ѯ
		//����Dao�����ò�ѯ���п�����Ϣ�ķ���
		StudentDao dao=new StudentDao();
		List<Student> list = dao.queryAll();
		//���������������
		Object [][] datas=new Object[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			datas[i][0]=list.get(i).getId();
			datas[i][1]=list.get(i).getName();
			datas[i][2]=list.get(i).getCardID();
			datas[i][3]=list.get(i).getDate();
		}
		//��ͷ
		String [] data=new String[]{"���","����","����","��������"};
		DefaultTableModel modle=new DefaultTableModel(datas, data);
		this.table.setModel(modle);
	}
	//�h��
	private void btn_delet(ActionEvent e) {
		//�ж��Ƿ�ѡ����
		int row =this.table.getSelectedRow();
		if (row<0) {
			JOptionPane.showMessageDialog(null, "��ѡ����Ҫɾ�������ݣ�");
		}else {
			int choose=JOptionPane.showConfirmDialog(null, "��ȷ��Ҫɾ����������", 
					"ѡ��һ��ѡ��", JOptionPane.YES_NO_CANCEL_OPTION);
			if (choose==JOptionPane.YES_NO_OPTION) {
				//��ȡѡ�е�����
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//��ȡѡ�е�id
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//����Dao������ɾ������
				StudentDao dao=new StudentDao();
				boolean flag=dao.delet(id);
				if (flag) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					model.removeRow(row);
				}else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�");
				}
			}
		}
	}
	//�����޸ķ���
	private void btn_update(ActionEvent e) {
		//��ȡѡ�е���
		int row =table.getSelectedRow();
		//�ж��Ƿ�ѡ����
		if (row<0) {
			JOptionPane.showInternalMessageDialog(null, "��ѡ����Ҫ�޸ĵ����ݣ�");
		}else {
			dispose();
			int choose=JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ�޸ĸ�������", 
					"ѡ��һ��ѡ��", JOptionPane.YES_NO_CANCEL_OPTION);
			if(choose==JOptionPane.YES_NO_OPTION) {
				//��ȡѡ�е�����
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				//��ȡѡ�е�id
				int id=Integer.parseInt(model.getValueAt(row, 0).toString());
				//���ò�ѯ��������
				Student std=new StudentDao().queryOne(id);
				new UpdateFrame(std).setVisible(true);
			}else {
				this.setVisible(true);
			}
		}
	}
}
