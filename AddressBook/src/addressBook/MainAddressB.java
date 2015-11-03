package addressBook;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MainAddressB extends javax.swing.JPanel{

	public static void main(String args[]) {
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame jFrame = new javax.swing.JFrame("Address Book");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.getContentPane().add(new MainAddressB());
		jFrame.pack();
		jFrame.setVisible(true);
	}
	
	private static JTable jTable;
	private JScrollPane jScrollPane;
	private JPanel jPanel1;  
	private JPanel jPanel2; 
	private JButton jButton1; 
	private JButton jButton2; 
	private JButton jButton3; 
	private JButton jButton4; 
	private JButton jButton5; 
	private static int rowCnt = 0 ; 
	private static int selectedRow ; 
	
	public MainAddressB(){
		
		jTable = new JTable(new AbstractTable());
		
		javax.swing.table.TableColumn column = null; 
		for(int i =0 ; i < 4; i++){
			column = jTable.getColumnModel().getColumn(i);
			if(i==0){
				column.setPreferredWidth(100);
			} else if (i==1){
				column.setPreferredWidth(150);
			} else if(i==3){
				column.setPreferredWidth(100);
			} else {
				column.setPreferredWidth(10);
			}
	}
		jScrollPane = new JScrollPane(jTable);
		jPanel1 = new JPanel(new BorderLayout());
		jPanel1.add(jScrollPane, BorderLayout.CENTER);
		
		jButton1 = new JButton("Add Entry");
		jButton2 = new JButton("Update");
		jButton3 = new JButton("Delete");
		jButton4 = new JButton("Close");
		jButton5 = new JButton("Delete all records");
		
		jPanel2 = new JPanel(new FlowLayout());
		jPanel2.add(jButton1);
		jPanel2.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton4);
		jPanel2.add(jButton5);
		//Add Entry
		jButton1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				new AddContact().setVisible(true);
			}
		});
		//Update
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UpdateContact(jTable.getValueAt(getSelectedRow(), 0).toString(),
								jTable.getValueAt(getSelectedRow(), 1).toString(),
								jTable.getValueAt(getSelectedRow(), 2).toString(),
								jTable.getValueAt(getSelectedRow(), 3).toString()).setVisible(true);
			}
		});
		//Delete
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeEntry();
			}
		});
		//Close
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				System.exit(0);
			}
		});
		//Delete all records
		jButton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					removeAllRecords();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
						
			private void removeAllRecords() throws FileNotFoundException {
				// TODO Auto-generated method stub
				PrintWriter pw = new PrintWriter("addressBook.txt");
				pw.close();
			}
		});
		
		jPanel1.add(jPanel2, BorderLayout.SOUTH);
		jPanel1.setPreferredSize(new Dimension(750, 300));
		add(jPanel1);
		
		String[] response = checkIfEmpty();
		//System.out.println("response" + (response.length>1));
		if (response != null){
		addAlreadyFields(response);
		} 
		
	}	
	
	private void addAlreadyFields(String[] response) {
		// TODO Auto-generated method stub

			String name = response[1];
			String address = response[4];
			String telNo = response[8];
			String email = response[11];
			addEntry(new AddressBook(
					name,
					address,
					telNo,
					email));
	}

	private static String[] checkIfEmpty() {
		// TODO Auto-generated method stub
		// This will reference one line at a time
		
		String fileName ="addressBook.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            for(String line; (line = bufferedReader.readLine()) != null; ) {
                // process the line.
            	//System.out.println("this many times " );
               	//String[] ary = line.split("[\r\n]+");
            	String[] ary = line.split(" "); 
            	System.out.println(ary);
               	//System.out.println(ary);
                return ary ; 
            }
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		return null ;
	}

	public static void addEntry(AddressBook addressBook) {
	
		
		jTable.setValueAt(addressBook.getName(), rowCnt, 0);
		jTable.setValueAt(addressBook.getAddress(), rowCnt, 1);
		jTable.setValueAt(addressBook.getTelNo(), rowCnt, 2);
		jTable.setValueAt(addressBook.getEmail(), rowCnt, 3);

		rowCnt++;
		
		String name = addressBook.getName();
		String address = addressBook.getAddress();
		String telNo = addressBook.getTelNo();
		String email = addressBook.getEmail();
		try {
			saveToComputer(name, address, telNo, email);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("in error");
			e.printStackTrace();
		}
	}
	
	
	
	private static void saveToComputer(String name, String address, String telNo, String email) throws FileNotFoundException {

		System.out.println("in save to computer");
		File log = new File("addressBook.txt");
		try{
			if (log.exists()==false){
				System.out.println("create a new file");
				log.createNewFile();
			}
			PrintWriter out = new PrintWriter(new FileWriter(log,true));
			out.println("Name: " + name + "  Address: " + address + "  Tel No: " + telNo + "  Email: " + email);
			out.close();
			}catch(IOException e){
				System.out.println("couldn't add ");
		}
	}
	
	public static void editEntry(AddressBook addressBook){
		jTable.setValueAt(addressBook.getName(), getSelectedRow(), 0 );
		jTable.setValueAt(addressBook.getAddress(), getSelectedRow(), 1);
		jTable.setValueAt(addressBook.getTelNo(), getSelectedRow(), 2);
		jTable.setValueAt(addressBook.getEmail(), getSelectedRow(), 3);
	}
	public void removeEntry() {
		for(int i = getSelectedRow(); i < rowCnt; i++) {
			jTable.setValueAt(jTable.getValueAt(i + 1, 0), i, 0);
			jTable.setValueAt(jTable.getValueAt(i + 1, 1), i, 1);
			jTable.setValueAt(jTable.getValueAt(i + 1, 2), i, 2);
			jTable.setValueAt(jTable.getValueAt(i + 1, 3), i, 3);
		}
		rowCnt--;
	}

	public static int getSelectedRow() {
		jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListSelectionModel rowSel = jTable.getSelectionModel();
		rowSel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) return;
				ListSelectionModel sel = (ListSelectionModel)e.getSource();
				if (!sel.isSelectionEmpty()) {
					selectedRow = sel.getMinSelectionIndex();
				}
			}
		});
		return selectedRow;
	}
	
	class AbstractTable extends AbstractTableModel {

		private String[] columnNames = { "Name", "Address", "Tel No.", "Email" };
		private Object[][] data = new Object[100][5];
		//String fileName = "addressBook.txt";
		//String line = null ; 
				
		public int getColumnCount() {
			return columnNames.length;
		}
		public int getRowCount() {
			return data.length;
		}
		public String getColumnName(int col) {
			return columnNames[col];
		}
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}
		public void setValueAt(Object value, int row, int col) {
			data[row][col] = value;
			fireTableCellUpdated(row, col);
		}
	}

}
