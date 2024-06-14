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

public class Tipoempleado2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ListaAgente listaagentes;
	private GestionEmpleadosOpciones opciones;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Tipoempleado2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTítulo = new JLabel("Seleccionar el tipo de empleado");
		lblTítulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblTítulo.setBounds(185, 69, 390, 57);
		contentPane.add(lblTítulo);
		
		JButton btnGerente = new JButton("Gerente");
		btnGerente.setBounds(67, 216, 183, 42);
		contentPane.add(btnGerente);
		
		JButton btnAgentes = new JButton("Agentes");
		btnAgentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (listaagentes == null) {
					
					
					listaagentes = new ListaAgente();
					
					
				}
				
				
				listaagentes.setVisible(true);
				
				listaagentes.setLocationRelativeTo(null);
				
				dispose();
				
				
				
				
			}
		});
		btnAgentes.setBounds(432, 216, 183, 42);
		contentPane.add(btnAgentes);
		
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
		btnVolver.setBounds(249, 365, 183, 42);
		contentPane.add(btnVolver);
		
		JLabel lblListas = new JLabel("Ver listas");
		lblListas.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblListas.setBounds(296, 11, 354, 59);
		contentPane.add(lblListas);
	}

}
