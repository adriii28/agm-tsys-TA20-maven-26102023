package TA20Ej4_AdrianGallego.TA20Ej4_AdrianGallego;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class vistaEj4 {

	public JFrame frame;

	public vistaEj4() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBounds(106, 49, 431, 255);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 157, 70, 20);
		frame.getContentPane().add(lblNewLabel);

	}

}
