package bookstock_view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Register extends JFrame {

	
	private JLabel register_label;
	private JPanel green,green2;
	private DefaultTableModel dt;
	private JTable table;
	private DefaultTableModel model;
	
	
	
	
	public Register(){
		setSize(1200,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setResizable(false);
	    setLocationRelativeTo(null) ;      
	    setLayout(null);
		
	    
	     green=new JPanel();
	     green.setLayout(null);
		 green.setBackground(new Color(48, 216, 39));
		 green.setBounds(0, 0, 1200, 80);
	    
	    
		 green2=new JPanel();
	     green2.setLayout(null);
	     green2.setBackground(new Color(48, 216, 39));
		 green2.setBounds(0, 650, 1200, 30);
	    
	    
	    
	    register_label=new JLabel("Add customer ");
	    register_label.setFont(new Font("Cooper Black",Font.BOLD,20));
	    register_label.setBounds(20, 100, 170, 120);
	    register_label.setForeground(new Color(48, 216, 39));
	    
	    
	    
	    
	    
	}
	
	
	public void table(){
		table= new JTable();
		Object[] columns= {"id"	,"Name","Phone"}	;
		 model=new DefaultTableModel();
		 model.setColumnIdentifiers(columns);
		 table.setModel(model);
		 
		 table.setBackground(Color.WHITE);
		 table.setForeground(Color.BLACK);
		 table.setFont(new Font("tahoma",Font.PLAIN,15));
		 table.setRowHeight(30);
		 table.setAutoCreateRowSorter(true);
		 
	}

public static void main(String[] args) {
	Register reg=new Register();
	reg.setVisible(true);
}
}