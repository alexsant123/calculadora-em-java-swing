package bookstock_view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Loginhome extends JFrame implements ActionListener  {

	private JLabel login;
	
	private JLabel password_label;
	private JLabel user_label;
	private JLabel reset;
    private JLabel title;
    private JTextField user;
    private JPasswordField password;
    private JPanel painel;
    private JPanel green;
    private JPanel green2;
   
    private JButton btn_login;
    private JButton btn_reset;    


	public Loginhome(){
		 //frameatributos
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null) ;      
        setLayout(null);
	 //paineldecomponetes//
       
       title= new JLabel("BOOKSTOCK");
       title.setBounds(300, 0, 50, 40);
       title.setFont(new Font("Cooper Black",Font.BOLD,40));
       title.setForeground(Color.WHITE);   
       
       green= new JPanel();
 	   green.setBounds(0,0, 600, 80);
 	   green.setBackground(new Color(48, 216, 39));
       green.add(title);
 	   
       green2= new JPanel();
       green2.setBounds(0,450, 600, 40);
 	   green2.setBackground(new Color(48, 216, 39));
 

 	   Border  c= BorderFactory.createLineBorder(new Color(3, 128, 2));
 	   //painel
	   painel =new JPanel();
	   painel.setBackground(new Color(255,255,255));
	   painel.setLayout(null);  
	   painel.setBounds(0, 0, 600, 500);

	   //components
	   user_label= new JLabel("Usuario");
	   user_label.setForeground(new Color(48, 216, 39));
	   user_label.setFont(new Font("Cooper Black",Font.BOLD,30));
	   user_label.setBounds(140,100,150,40);
 	   painel.add(user_label);

       password_label= new JLabel("Senha");
       password_label.setFont(new Font("Cooper Black",Font.BOLD,30));
       password_label.setBounds(160,200,150,40);
       password_label.setForeground(new Color(48, 216, 39));
	   painel.add(password_label);
       
       Border  b= BorderFactory.createLineBorder(new Color(48, 216, 39));
      
       user=new JTextField();
       user.setBorder(b);
       user.addActionListener(this);
       user.setPreferredSize(new Dimension(200,40));
       user.setBounds(275,110,150,33);    
	   painel.add(user);
	   
	   password=new JPasswordField();
	   password.addActionListener(this);
	   password.setBorder(b);
	   password.setPreferredSize(new Dimension(200,40));
	   password.setBounds(275, 200, 150, 33);
	   painel.add(password);
	   
	   
	   Border  a= BorderFactory.createLineBorder(new Color(48, 216, 39));
	   
	   btn_login= new JButton("Entrar");
	   btn_login.addActionListener(this);
	   btn_login.setBorder(a);
	   btn_login.setFont(new Font("Cooper Black",Font.BOLD,20));
	   btn_login.setForeground(Color.white);
	   btn_login.setBackground(new Color(48, 216, 39));
	   btn_login.setBounds(150,250,120,50);
	   painel.add(btn_login);
	   
	   btn_reset= new JButton("Resetar");  
	   btn_reset.addActionListener(this);
	   btn_reset.setBorder(a);
	   btn_reset.setFont(new Font("Cooper Black",Font.BOLD,20));
	   btn_reset.setForeground(Color.white);
	   btn_reset.setBackground(new Color(48, 216, 39));
	   btn_reset.setBounds(300,250,120,50);
	   painel.add(btn_reset);
	   
	   
	   
	   
	  
	   
	    add(green);
	    add(green2);
        add(painel);
		
    }
	
  
	
	
	
	

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if(e.getSource()==btn_reset) {
			
	user.setText("");
	password.setText("");
	
	
		}else {
			
		System.out.println("hello");
		
			}
		}
		
	
		

}		
	


	
	

