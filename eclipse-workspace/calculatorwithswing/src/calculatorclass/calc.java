package calculatorclass;


import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calc extends JFrame implements ActionListener {
	JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
	JButton btdel, btminus, btplus, btx, btdivide, btequals;
	JTextField visor;
	String primeiro="", segundo="";
	int cont=1;;
	String sinal = "";

	public calc() {
		this.setSize(253, 350);
		this.setTitle("Calculadora");
		this.setResizable(false);
		
		this.getContentPane().setBackground(Color.BLACK);
		this.setVisible(true);
		

		visor = new JTextField();
		visor.setBounds(3, 10, 230, 45);
		visor.setBackground(Color.yellow);

		visor.setEnabled(false);
		this.add(visor);

		bt1 = new JButton("1");
		bt1.setBounds(5, 60, 50, 50);
		bt1.setBackground(Color.blue);

		bt1.addActionListener(this);
		this.add(bt1);

		bt2 = new JButton("2");
		bt2.setBounds(65, 60, 50, 50);
		bt2.setBackground(Color.blue);
		bt2.addActionListener(this);
		this.add(bt2);

		bt3 = new JButton("3");
		bt3.setBounds(125, 60, 50, 50);
		bt3.setBackground(Color.blue);
		bt3.addActionListener(this);
		this.add(bt3);

		btdivide = new JButton("/");
		btdivide.setBounds(185, 60, 50, 50);
		btdivide.setBackground(Color.yellow);
		btdivide.addActionListener(this);
		this.add(btdivide);

		bt4 = new JButton("4");
		bt4.setBounds(5, 120, 50, 50);
		bt4.setBackground(Color.blue);
		bt4.addActionListener(this);
		this.add(bt4);

		bt5 = new JButton("5");
		bt5.setBounds(65, 120, 50, 50);
		bt5.setBackground(Color.blue);

		bt5.addActionListener(this);
		this.add(bt5);

		bt6 = new JButton("6");
		bt6.setBounds(125, 120, 50, 50);
		bt6.setBackground(Color.blue);
		bt6.addActionListener(this);
		this.add(bt6);

		btx = new JButton("x");
		btx.setBounds(185, 120, 50, 50);
		btx.setBackground(Color.yellow);
		btx.addActionListener(this);
		this.add(btx);

		bt7 = new JButton("7");
		bt7.setBounds(5, 180, 50, 50);
		bt7.setBackground(Color.blue);
		bt7.addActionListener(this);
		this.add(bt7);

		bt8 = new JButton("8");
		bt8.setBounds(65, 180, 50, 50);
		bt8.setBackground(Color.blue);
		bt8.addActionListener(this);
		this.add(bt8);

		bt9 = new JButton("9");
		bt9.setBounds(125, 180, 50, 50);
		bt9.setBackground(Color.blue);
		bt9.addActionListener(this);
		this.add(bt9);

		btplus = new JButton("+");
		btplus.setBounds(185, 180, 50, 50);
		btplus.setBackground(Color.yellow);
		btplus.addActionListener(this);
		this.add(btplus);

		bt0 = new JButton("0");
		bt0.setBounds(5, 245, 50, 50);
		bt0.setBackground(Color.blue);
		bt0.addActionListener(this);
		this.add(bt0);

		btdel = new JButton("C");
		btdel.setBounds(65, 245, 50, 50);
		btdel.setBackground(Color.RED);

		btdel.addActionListener(this);
		this.add(btdel);

		btequals = new JButton("=");
		btequals.setBounds(125, 245, 50, 50);
		btequals.setBackground(Color.RED);
		btequals.addActionListener(this);
		this.add(btequals);

		btminus = new JButton("-");
		btminus.setBounds(185, 245, 50, 50);
		btminus.setBackground(Color.yellow);
		btminus.addActionListener(this);
		this.add(btminus);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) {
			String n = "1";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}

		} else if (e.getSource() == bt2) {
			String n = "2";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt3) {
			String n = "3";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt4) {
			String n = "4";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt5) {
			String n = "5";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt6) {
			String n = "6";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt7) {
			String n = "7";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt8) {
			String n = "8";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt9) {
			String n = "9";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == bt0) {
			String n = "0";
			if (cont == 1) {
				primeiro = primeiro + n;
				visor.setText(primeiro);
			} else if (cont == 2) {
				segundo = segundo + n;
				visor.setText(segundo);
			}
		} else if (e.getSource() == btminus) {
			sinal = "minus";
			cont = 2;

		} else if (e.getSource() == btplus) {
			sinal = "plus";
			cont = 2;

		} else if (e.getSource() == btx) {
			sinal = "x";
			cont = 2;

		} else if (e.getSource() == btdivide) {
			sinal = "divide";
			cont = 2;

		} else if (e.getSource() == btdel) {
			  visor.setText("");
			  cont=1;
			  primeiro="";
				segundo="";
		} else if (e.getSource() == btequals) {

			if (sinal == "plus") {

				int num = Integer.parseInt(primeiro);
				int num2 = Integer.parseInt(segundo);
				int result = num + num2;
				visor.setText("" + result);
				primeiro="";
				segundo="";

			} else if (sinal == "divide") {
				int num = Integer.parseInt(primeiro);
				int num2 = Integer.parseInt(segundo);
				int result = num / num2;
				visor.setText("" + result);
				primeiro="";
				segundo="";
			} else if (sinal == "minus") {
				int num = Integer.parseInt(primeiro);
				int num2 = Integer.parseInt(segundo);
				int result = num - num2;
				visor.setText("" + result);
				primeiro="";
				segundo="";
			}else if (sinal=="x") {
				int num=Integer.parseInt(primeiro);
				int num2=Integer.parseInt(segundo);
				int result= num*num2;
				visor.setText(""+result);
				
				primeiro="";
				segundo="";
				}

		}

	}
}