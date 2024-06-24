package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TipoEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones menuempleados; 
	private MenuAgregarAgente menuAgente;
	private MenuAgregarGerente menuGerente;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TipoEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion de empleados");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
		lblNewLabel.setBounds(117, 11, 316, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Gerente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (menuGerente == null) {
					
					menuGerente = new MenuAgregarGerente();
					
					
				}
				
				menuGerente.setLocationRelativeTo(null);
				
				dispose();
			
				
				
				
			}
		});
		btnNewButton.setBounds(75, 130, 125, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Agente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (menuAgente ==  null) {
					
					menuAgente = new MenuAgregarAgente();
					
				}
				
				
				menuAgente.setLocationRelativeTo(null);
				
				menuAgente.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(283, 130, 125, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccionar tipo de empleado");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(127, 64, 316, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("Volver");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (menuempleados == null) {
					
					menuempleados = new GestionEmpleadosOpciones();
					
				}
				
				
				menuempleados.setLocationRelativeTo(null);
				
				menuempleados.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnNewButton_1_1.setBounds(177, 208, 125, 42);
		contentPane.add(btnNewButton_1_1);
	}

}
