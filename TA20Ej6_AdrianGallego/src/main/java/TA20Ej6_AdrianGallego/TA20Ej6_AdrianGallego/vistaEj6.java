package TA20Ej6_AdrianGallego.TA20Ej6_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj6 {

	public JFrame frame;
	private JTextField tfAltura;
	private JTextField tfPeso;
	private JTextField tfResultado;
	
	public vistaEj6() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Indice masa corporal");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(35, 61, 120, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPeso = new JLabel("Peso (kg)");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPeso.setBounds(245, 61, 120, 20);
		frame.getContentPane().add(lblPeso);
		
		tfAltura = new JTextField();
		tfAltura.setBounds(165, 58, 80, 30);
		frame.getContentPane().add(tfAltura);
		tfAltura.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		tfPeso.setBounds(350, 58, 80, 30);
		frame.getContentPane().add(tfPeso);
		
		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.addActionListener(al);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(101, 119, 140, 30);
		frame.getContentPane().add(btnCalcular);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfResultado.setColumns(10);
		tfResultado.setBounds(265, 121, 80, 30);
		frame.getContentPane().add(tfResultado);
		
	}
	
	/**
	 * 
	 * Metodo que comprueba que los campos introducidos sean correctos e introduce
	 * el IMC en el TextField
	 * 
	 * */
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (!tfAltura.getText().isEmpty() && !tfPeso.getText().isEmpty()) {
				tfResultado.setText(calcularIMC(Double.valueOf(tfAltura.getText()), Double.valueOf(tfPeso.getText())));
			} else {
				JOptionPane.showMessageDialog(null, "Rellena todos los campos!");
			}
		}

	};
	
	/**
	 * 
	 * Metodo que calcula el IMC
	 * 
	 * @param altura Altura del usuario
	 * @param peso Peso del usuario
	 * 
	 * */
	
	private String calcularIMC(Double altura, Double peso) {
		Double resultado = peso / (Math.pow(altura, 2));
		resultado = Math.round(resultado * 100.0) / 100.0;
		return resultado.toString();
	}
}
