package TA20Ej2_AdrianGallego.TA20Ej2_AdrianGallego;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj2 {

	public JFrame frame;
	private JLabel lblBoton;


	public vistaEj2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Boton pulsado");
		frame.getContentPane().setLayout(null);
		
		lblBoton = new JLabel("Has pulsado:");
		lblBoton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBoton.setBounds(49, 45, 173, 20);
		frame.getContentPane().add(lblBoton);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(btn);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(232, 40, 89, 30);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(btn);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(331, 40, 89, 30);
		frame.getContentPane().add(btn2);

	}
	
	/**
	 * 
	 * Captura el evento y lo almacena en una variable tipo boton, de esta manera 
	 * guardamos el boton pulsado en una variable y es un metodo reutilizable, no haria
	 * falta crear un ActionListener por cada boton
	 * 
	 * */
	ActionListener btn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			lblBoton.setText("Has pulsado: "+btn.getText());
		}
	};
}
