package TA20Ej1_AdrianGallego.TA20Ej1_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class vistaEj1 {

	public JFrame frame;

	public vistaEj1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Ventana");

		JLabel lblNewLabel = new JLabel("Puedes cambiar el tamaño de la ventana");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		

	}

}
