package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgenteAgregado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones opciones;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AgenteAgregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (opciones == null) {
					
					opciones = new GestionEmpleadosOpciones();
					
				}
				
				opciones.setVisible(true);
				
				opciones.setLocationRelativeTo(null);
				
				dispose();
				
			}
		});
		btnVolver.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnVolver.setBounds(149, 175, 134, 49);
		contentPane.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Agente Agregado con éxito");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 26));
		lblNewLabel.setBounds(44, 52, 419, 57);
		contentPane.add(lblNewLabel);
	}

}
