package TA20Ej7_AdrianGallego.TA20Ej7_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaEj7 {

	public JFrame frame;
	private JTextField tfIntroducir;
	private JTextField tfResultado;
	private JButton btnCambiar, btnConvertir;
	private JButton btnBorrar;
	private int cambio = 1;

	public vistaEj7() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculadora cambio de monedas");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(28, 42, 150, 20);
		frame.getContentPane().add(lblNewLabel);
		
		tfIntroducir = new JTextField();
		tfIntroducir.setBounds(180, 39, 86, 30);
		frame.getContentPane().add(tfIntroducir);
		tfIntroducir.setColumns(10);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setColumns(10);
		tfResultado.setBounds(352, 39, 86, 30);
		frame.getContentPane().add(tfResultado);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultado.setBounds(276, 42, 80, 20);
		frame.getContentPane().add(lblResultado);
		
		btnConvertir = new JButton("Euros a ptas");
		btnConvertir.addActionListener(alConvertir);
		btnConvertir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConvertir.setBounds(56, 97, 120, 30);
		frame.getContentPane().add(btnConvertir);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(btnChange);
		btnCambiar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCambiar.setBounds(186, 97, 120, 30);
		frame.getContentPane().add(btnCambiar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(delete);
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBounds(316, 97, 120, 30);
		frame.getContentPane().add(btnBorrar);
	}
	
	/**
	 * 
	 * Este metodo funciona segun la variable cambio.
	 * 
	 * La variable cambio funciona de la siguiente manera; si es 1 se ejecutara el codigo
	 * para pasar de euros a pesetas, y si la variable cambio es 2 se ejecutara el codigo que pasara de pesetas a euros
	 * 
	 * */
	
	ActionListener alConvertir = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!tfIntroducir.getText().isEmpty()) {
				try {
					switch (cambio) {
					//Euros a pesetas
					case 1:
						tfResultado.setText(calcularPtas(Double.valueOf(tfIntroducir.getText())));
						break;
					//Pesetas a euros
					case 2:
						tfResultado.setText(calcularEuros(Double.valueOf(tfIntroducir.getText())));
							break;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Introduce una cantidad valida!");
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Rellena los campos!");
			}
		}
	};

	/**
	 * 
	 * En presionar el boton Borrar, llama al metodo clean()
	 * 
	 * */
	
	ActionListener delete = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			clean();
		}
	};
	
	/**
	 * 
	 * En presionar el boton de Cambiar, se ejecutara este ActionListener, que cambia el texto de un boton
	 * y la variable cambio.
	 * 
	 * 
	 * */
	
	ActionListener btnChange = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			switch (cambio) {
			case 1:
				btnConvertir.setText("Ptas a euros");
				cambio = 2;
				break;
			case 2:
				btnConvertir.setText("Euros a ptas");
				cambio = 1;
				break;
			}
		}
	};
	
	/**
	 * 
	 * Metodo que hace el calculo de euros a pesetas
	 * 
	 * @param euros La cantidad de euros a convertir
	 * 
	 * */
	
	private String calcularPtas(Double euros) {
		Double resultado = euros*166.368;
		resultado = Math.round(resultado * 100.0) / 100.0;
		return String.valueOf(resultado);
	}
	
	/**
	 * 
	 * Metodo que hace el calculo de pesetas a euros
	 * 
	 * @param pesetas La cantidad de pesetas a convertir
	 * 
	 * */

	private String calcularEuros(Double pesetas) {
		Double resultado = pesetas/166.368;
		resultado = Math.round(resultado * 100.0) / 100.0;
		return String.valueOf(resultado);
	}
	
	/**
	 * 
	 * Metodo que limpia los TextField
	 * 
	 * */
	
	private void clean() {
		tfIntroducir.setText("");
		tfResultado.setText("");
	}

}
