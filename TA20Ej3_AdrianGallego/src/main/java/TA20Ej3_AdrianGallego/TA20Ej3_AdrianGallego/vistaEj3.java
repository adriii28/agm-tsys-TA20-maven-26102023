package TA20Ej3_AdrianGallego.TA20Ej3_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj3 {

	public JFrame frame;
	private JButton btn1, btn2;
	private int contBtn1= 0, contBtn2 = 0;
	private JLabel lblBtn1, lblBtn2;

	public vistaEj3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblBtn1 = new JLabel("Boton 1: 0 veces");
		lblBtn1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBtn1.setBounds(134, 50, 140, 20);
		frame.getContentPane().add(lblBtn1);
		
		lblBtn2 = new JLabel("Boton 2: 0 veces");
		lblBtn2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBtn2.setBounds(134, 81, 140, 20);
		frame.getContentPane().add(lblBtn2);
		
		btn1 = new JButton("Boton 1");
		btn1.addActionListener(btn);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(98, 129, 100, 35);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("Boton 2");
		btn2.addActionListener(btn);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(208, 129, 100, 35);
		frame.getContentPane().add(btn2);
		

	}
	
	ActionListener btn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn.equals(btn1)) {
				contBtn1++;
				lblBtn1.setText(btn.getText()+ ": "+contBtn1+" veces");
			} else {
				contBtn2++;
				lblBtn2.setText(btn.getText()+ ": "+contBtn2+" veces");
			}
		}
	};
}
