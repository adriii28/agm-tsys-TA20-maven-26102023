package TA20Ej4_AdrianGallego.TA20Ej5_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextArea;

public class vistaEj5 {

	public JFrame frame;
	private JButton limpiarBtn;
	private JTextArea textArea;
	private String lbl = "";


	public vistaEj5() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Mouse Listener");
		frame.getContentPane().setLayout(null);
		
		limpiarBtn = new JButton("Limpiar");
		limpiarBtn.addActionListener(al);
		limpiarBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		limpiarBtn.setBounds(221, 11, 90, 30);
		frame.getContentPane().add(limpiarBtn);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(15, 52, 500, 200);
		textArea.addMouseListener(ml);
		frame.getContentPane().add(textArea);

	}
	
	/**
	 * 
	 * Metodo que limpia el textArea
	 * 
	 * */
	
	ActionListener al = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			lbl = "";
			textArea.setText(lbl);
		}
	};
	
	MouseListener ml = new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent e) {
			lbl+= " | Mouse released  ";
			textArea.setText(lbl);	
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			lbl+= " | Mouse pressed  ";
			textArea.setText(lbl);
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			lbl+= " | Mouse exited  ";
			textArea.setText(lbl);
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			lbl+= " | Mouse entered  ";
			textArea.setText(lbl);
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			lbl+= " | Mouse clicked  ";
			textArea.setText(lbl);			
		}
	};
}
