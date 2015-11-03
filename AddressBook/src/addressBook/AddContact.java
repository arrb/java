package addressBook;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class AddContact extends JFrame {

	private JLabel jLabel1; 
	private JLabel jLabel2; 
	private JLabel jLabel3; 
	private JLabel jLabel4; 
	private JTextField jTextField1; 
	private JTextField jTextField2 ; 
	private JTextField jTextField3;
	private JTextField jTextField4; 
	private JButton jButton1;
	private JButton jButton2; 
	private JPanel jPanel1; 
	private JPanel jPanel2; 
	private JPanel jPanel3 ; 
	private JPanel jPanel4; 
	private JPanel jPanel5; 

	public static void main(String args[]) {
		javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
		new AddContact().setVisible(true);
	}

	public AddContact(){
		super("Add Contact");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(true);
		jLabel1 = new JLabel("Name: ");
		jLabel2 = new JLabel("Address: ");
		jLabel3 = new JLabel("Tel. No: ");
		jLabel4 = new JLabel("Email: ");
		
		jTextField1 = new JTextField(15);
		jTextField2 = new JTextField(30);
		jTextField3 = new JTextField(10);
		jTextField4 = new JTextField(15);
	
		jButton1 = new JButton("Add");
		jButton2 = new JButton("Cancel");
		
		jPanel1 = new JPanel(new GridLayout(4,1,1,5));
		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jLabel4);
		
		jPanel2 = new JPanel(new GridLayout(4,1));
		jPanel2.add(jTextField1);
		jPanel2.add(jTextField2);
		jPanel2.add(jTextField3);
		jPanel2.add(jTextField4);
		
		jPanel3 = new JPanel(new FlowLayout());
		jPanel3.add(jPanel1);
		jPanel3.add(jPanel2);
		
		jPanel4 = new JPanel(new FlowLayout());
		jPanel4.add(jButton1);
		jPanel4.add(jButton2);
		
		jButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				MainAddressB.addEntry(new AddressBook(
						jTextField1.getText(), 
						jTextField2.getText(),
						jTextField3.getText(),
						jTextField4.getText()));
						dispose();
			}
		
		});
		jButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(true);
				dispose();
			}
		});
		jPanel5 = new JPanel(new BorderLayout());
		jPanel5.add(jPanel3, BorderLayout.CENTER);
		jPanel5.add(jPanel4, BorderLayout.SOUTH);
		getContentPane().add(jPanel5);
		System.out.println("IN ADD CONTACT");
		pack();
		setVisible(true);
		
	}	

}
