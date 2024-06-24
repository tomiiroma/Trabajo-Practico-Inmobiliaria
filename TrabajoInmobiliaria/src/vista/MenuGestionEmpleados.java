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
import java.awt.Color;
public class MenuGestionEmpleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones empleadosOpciones;
	
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
		this.setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListaempleado = new JButton("Lista Empleados");
		btnListaempleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListaempleado.setForeground(Color.WHITE);
		btnListaempleado.setBorder(null);
		btnListaempleado.setBackground(new Color(48, 109, 105));
		btnListaempleado.setBounds(404, 223, 278, 35);
		contentPane.add(btnListaempleado);
		btnListaempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				empleadosOpciones = new GestionEmpleadosOpciones();
				
				empleadosOpciones.setVisible(true);
				empleadosOpciones.setLocationRelativeTo(null);
				dispose();
			}
				
			
		});
		
		JButton btnNuevoEmpleado = new JButton("Nuevo empleado");
		
		btnNuevoEmpleado.setBounds(70, 223, 278, 35);
		contentPane.add(btnNuevoEmpleado);
		btnNuevoEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoEmpleado.setForeground(Color.WHITE);
		btnNuevoEmpleado.setBorder(null);
		btnNuevoEmpleado.setBackground(new Color(48, 109, 105));
		
		btnNuevoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		
		
		 
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(28, 401, 151, 34);
		contentPane.add(btnVolver);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(10, 11, 825, 55);
		contentPane.add(panel_1);
		
		JLabel lblGestorEmpleados = new JLabel("Gestor Empleados");
		lblGestorEmpleados.setForeground(Color.WHITE);
		lblGestorEmpleados.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorEmpleados.setBounds(10, 11, 298, 35);
		panel_1.add(lblGestorEmpleados);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaGerente volver = new PantallaGerente();
				dispose(); 
			}
		});
		
		
		
		
	}
}
