package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionEmpleadosOpciones extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ModificarEmpleado Modificar;
	private EliminarEmpleados Eliminar;
	private ListaEmpleado verDatos;
	private MenuAgregarAgente AgregarEmpleado;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GestionEmpleadosOpciones() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 581);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ver datos de Empleados");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(48, 109, 105));
		btnNewButton.setBounds(124, 198, 206, 43);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

					
				verDatos = new ListaEmpleado();
						
				
				
				verDatos.setVisible(true);
				
				verDatos.setLocationRelativeTo(null);
				
				dispose();
				
				
				
			}
		});
		
		JButton btnModificarEmpleado = new JButton("Modificar empleado");
		btnModificarEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificarEmpleado.setForeground(Color.WHITE);
		btnModificarEmpleado.setBorder(null);
		btnModificarEmpleado.setBackground(new Color(48, 109, 105));
		btnModificarEmpleado.setBounds(536, 198, 206, 43);
		contentPane.add(btnModificarEmpleado);
		btnModificarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
				Modificar = new ModificarEmpleado();
					
				
				
				Modificar.setVisible(true);
				
				Modificar.setLocationRelativeTo(null);
				
				dispose();
				
				
				
			}
		});
		
		JButton btnAgregarEmpleado = new JButton("Agregar empleado");
		btnAgregarEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregarEmpleado.setForeground(Color.WHITE);
		btnAgregarEmpleado.setBorder(null);
		btnAgregarEmpleado.setBackground(new Color(48, 109, 105));
		btnAgregarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					AgregarEmpleado = new MenuAgregarAgente();
					
					
				
				
				AgregarEmpleado.setLocationRelativeTo(null);
				
				AgregarEmpleado.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnAgregarEmpleado.setBounds(124, 378, 206, 43);
		contentPane.add(btnAgregarEmpleado);
		
		JButton btnNewButton_1_1 = new JButton("Eliminar empleado");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(48, 109, 105));
		btnNewButton_1_1.setBounds(536, 378, 206, 43);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Eliminar = new EliminarEmpleados();
					
							
			
				Eliminar.setLocationRelativeTo(null);
				
				Eliminar.setVisible(true);
				
				dispose();
				
				
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(29, 482, 206, 43);
		contentPane.add(btnVolver);
		
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				PantallaGerente pantallagerente = new PantallaGerente();

				pantallagerente.setVisible(true);
				
				pantallagerente.setLocationRelativeTo(null);
				
				dispose();
			
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(10, 26, 864, 55);
		contentPane.add(panel_1);
		
		JLabel lblGestorEmpleados = new JLabel("Gestor Empleados");
		lblGestorEmpleados.setForeground(Color.WHITE);
		lblGestorEmpleados.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorEmpleados.setBounds(10, 11, 298, 35);
		panel_1.add(lblGestorEmpleados);
	}

}
