package bookstock_view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bookstockmain extends JFrame   {
   private JLabel chart;
   private JLabel chart_label;
   
   private JLabel customer;
   private JLabel customer_;
   
   private JLabel register;
   private JLabel register_;

   private JLabel boooks;
   private JLabel books_;
   
   private JPanel green;
   private JLabel  bookmain;


 public bookstockmain(){
	setSize(1200,700);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null) ;      
    setLayout(null);
	

	
	green=new JPanel();
	green.setLayout(null);
	green.setBackground(new Color(48, 216, 39));
	green.setBounds(0, 0, 1200, 80);
	
	bookmain = new JLabel("BOOKSTOCKMAIN");
    bookmain.setFont(new Font("Cooper Black",Font.BOLD,40));
	bookmain.setBounds(380, 4, 1200, 80);
    bookmain.setForeground(Color.WHITE);   
    green.add(bookmain);
   
   //-----------------------------------------------------------------------------//
    customer_=new JLabel();
    
    customer_.setIcon(new ImageIcon("C:\\Users\\asant\\OneDrive\\Área de Trabalho\\Nova pasta\\xxte.png"));
    customer_.setBounds(660, 136, 140, 200);
   
    
    customer=new JLabel("Clientes");
    customer.setFont(new Font("Cooper Black",Font.BOLD,20));
    customer.setBounds(680, 200, 120, 180);
    
    //---------------------------------------------------------------------------//
    register_=new JLabel ();
    register_.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        	Register c=new Register();
        	c.setVisible(true);
        }
    }); 
    register_.setIcon(new ImageIcon("C:\\Users\\asant\\OneDrive\\Área de Trabalho\\Nova pasta\\cadastro.png"));
    register_.setBounds(370, 130, 150, 180);

  
    register=new JLabel("Register");
    register.setFont(new Font("Cooper Black",Font.BOLD,20));
    register.setBackground(Color.BLACK);
	register.setBounds(375, 190, 120, 200);
	
    //--------------------------------------------------------------------------//

    boooks=new JLabel("Livros");
    boooks.setBackground(Color.BLACK);
    boooks.setFont(new Font("Cooper Black",Font.BOLD,20));
    boooks.setBounds(400, 410, 120, 180);
   
    books_=new JLabel();
    books_.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          	Books bok=new Books();
          	bok.setVisible(true);
          }
      }); 
    books_.setIcon(new ImageIcon("C:\\Users\\asant\\OneDrive\\Área de Trabalho\\Nova pasta\\bookkk.png"));
    books_.setBounds(375, 350, 120, 160);
    //-------------------------------------------------------------------------//
    
    chart=new JLabel();
    chart.setIcon(new ImageIcon("C:\\Users\\asant\\OneDrive\\Área de Trabalho\\Nova pasta\\grraf.png"));
    chart.setBounds(670, 350, 120, 160);
    chart.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          	Graphics g=new Graphics();
          	g.setVisible(true);
          }
      }); 
    
  
    chart_label=new JLabel("Analises");
    chart_label.setBounds(690, 411, 120, 180);

    chart_label.setFont(new Font("Cooper Black",Font.BOLD,20));
    
    //------------------------------------------------------------------------//
   
    
    
    
add(chart_label);   
add(chart);   
add(books_);     
add(boooks);    
add(customer);
add(customer_);   
add(register_);    
add(register);   
add(green);

}
 


public static void main(String[] args) {
	bookstockmain bok=new bookstockmain();
	bok.setVisible(true);
}
}



