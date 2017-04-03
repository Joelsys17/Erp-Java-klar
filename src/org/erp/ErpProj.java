package org.erp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ErpProj extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErpProj frame = new ErpProj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	org.tempuri.WebService1SoapProxy obj = new org.tempuri.WebService1SoapProxy();

	/**
	 * Create the frame.
	 */
	public ErpProj() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnNewButton_5 = new JButton("Uppgift 1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(2).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(2), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Uppgift 2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(3).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(3), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("Uppgift 3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(4).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(4), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Uppgift 4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(5).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(5), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Uppgift 5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(6).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(6), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Uppgift 6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(7).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(7), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_7 = new JButton("Uppgift 7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(8).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(8), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Uppgift 8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int col = obj.javaUppgiftWebservice(9).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaUppgiftWebservice(9), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("Find Pnr");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ups = textField.getText();
					int col = obj.javaFindUpdate(ups).length;
					String[] row = new String[col];
					DefaultTableModel model = new DefaultTableModel(obj.javaFindUpdate(ups), row);
					table.setModel(model);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnNewButton);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
	}

}
