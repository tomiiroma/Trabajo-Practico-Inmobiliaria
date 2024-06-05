package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Agente;
public class MenuGestionEmpleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones empleadosOpciones;
	private TipoEmpleado opciones;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGestionEmpleados frame = new MenuGestionEmpleados();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuGestionEmpleados() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListaempleado = new JButton("Lista empleado");
		btnListaempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				
				if (empleadosOpciones == null) {
					empleadosOpciones = new GestionEmpleadosOpciones();
				}
				empleadosOpciones.setVisible(true);
				empleadosOpciones.setLocationRelativeTo(null);
				dispose();
			}
				
			
		});
		btnListaempleado.setBounds(43, 178, 136, 23);
		contentPane.add(btnListaempleado);
		
		JLabel lblNewLabel = new JLabel("Gestor de empleados");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 26));
		lblNewLabel.setBounds(83, 24, 341, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccionar una opción");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(109, 64, 288, 38);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNuevoEmpleado = new JButton("Nuevo empleado");
		btnNuevoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if (opciones == null) {
					
					opciones = new TipoEmpleado();
					
				} 
					
				
					opciones.setVisible(true);
					
					opciones.setLocationRelativeTo(null);
					
					dispose();
					
					
				
				
				
				
			}
		});
		
		btnNuevoEmpleado.setBounds(264, 178, 136, 23);
		contentPane.add(btnNuevoEmpleado);
		
		
		JLabel lblNewLabel_2 = new JLabel("Ver lista de empleados");
		lblNewLabel_2.setBounds(55, 124, 124, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Agregar nuevo empleado");
		lblNewLabel_3.setBounds(276, 129, 121, 14);
		contentPane.add(lblNewLabel_3);
		
		
		 
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(174, 227, 89, 23);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose(); // Faltaria agregar el menú de agente.
			}
		});
		
		
		
		
	}
}
