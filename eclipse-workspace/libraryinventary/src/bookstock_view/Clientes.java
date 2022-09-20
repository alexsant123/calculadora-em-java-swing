package bookstock_view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.Border;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Clientes extends JFrame{
	
	private JPanel green,green2;
    private JPanel square_one,square_two;
    private JPanel view_painel,view_paineltwo;
    private JLabel customers,title,title_viewpainel,title_viewpaineltwo;
	private JButton search;
    private JTextField search_field;
	
	
     Clientes(){
    	 
     setSize(1200,700);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
     setResizable(false);
     setLocationRelativeTo(null) ;      
     setLayout(null);
     setBackground(Color.WHITE);
    
    
     green=new JPanel();
     green.setLayout(null);
	 green.setBackground(new Color(48, 216, 39));
	 green.setBounds(0, 0, 1200, 100);
    
	 title=new JLabel("Customers"    );
     title.setFont(new Font("Cooper Black",Font.BOLD,40));
	 title.setBounds(450, 4, 800, 80);
	 title.setForeground(Color.WHITE);   
     green.add(title);
    
     green2=new JPanel();
     green2.setLayout(null);
     green2.setBackground(new Color(48, 216, 39));
	 green2.setBounds(0, 650, 1200, 30);
	   

     square_one=new JPanel(); 
     square_one.setBackground(Color.WHITE);
     square_one.setLayout(null);
     square_one.setBounds(0, 80, 600, 570);
     
     customers=new JLabel("Customers");
     customers.setFont(new Font("Cooper Black",Font.BOLD,20));
	 customers.setForeground(new Color(48, 216, 39));

     customers.setBounds(20, 10, 160, 150);    
     square_one.add(customers);
     
	 Border  a= BorderFactory.createLineBorder(new Color(48, 216, 39));

     
     search=new JButton("Search");
     search.setBorder(a);
     search.setFont(new Font("Cooper Black",Font.BOLD,15));
     search.setBounds(350, 62, 100, 30);
	 search.setBackground(new Color(48, 216, 39));
     search.setForeground(	 Color.WHITE);
     square_one.add(search);


     search_field=new JTextField();
     search_field.setBorder(a);
     search_field.setBounds(145, 62, 200, 30);
     square_one.add(search_field);

     
     
      
     
     square_two=new JPanel();
     square_two.setLayout(null);
     square_two.setBackground(Color.WHITE);
     square_two.setBounds(600, 80, 600, 570);
     
     
     Border bor=BorderFactory.createRaisedBevelBorder();
     
     
     //--------------------------------------------------------////
     view_painel=new JPanel();
     view_painel.setBorder(bor);
     view_painel.setLayout(null);
     view_painel.setBounds(20, 300, 300, 100);

     square_one.add(view_painel);
     
     
     
     
     title_viewpainel=new JLabel("Situantion");
     title_viewpainel.setFont(new Font("Cooper Black",Font.BOLD,18));
     title_viewpainel.setForeground(new Color(48, 216, 39));

     title_viewpainel.setBounds(20, 213, 150, 150);
     square_one.add(title_viewpainel);
     
     
     view_paineltwo=new JPanel();
     view_paineltwo.setLayout(null);
     view_paineltwo.setBounds(50,70,440,440);
     view_paineltwo.setBorder(bor);
     square_two.add(view_paineltwo);
     
     title_viewpaineltwo=new JLabel("Informations");
     title_viewpaineltwo.setFont(new Font("Cooper Black",Font.BOLD,18));
     title_viewpaineltwo.setForeground(new Color(48, 216, 39));

     title_viewpaineltwo.setBounds(50, -15, 150, 150);
     square_two.add(title_viewpaineltwo);
     
     
    add(square_two);
    add(square_one);
    add(green2);
    add(green);
}


     public static void main(String[] args) {
    		Clientes reg=new Clientes();
    		reg.setVisible(true);
    	}
    	}


