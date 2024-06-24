package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuAgregarGerente extends JFrame {
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textTelefono;
	private JTextField textFecha;
	private JTextField textCorreo;
	private JPasswordField passwordContra;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textID_gerente;
	private Component btnNewButton;
	private TipoEmpleado opcionesEmpleados;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MenuAgregarGerente() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(66, 114, 966, 414);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(69, 40, 83, 35);
		panel.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(190, 42, 241, 35);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(534, 40, 83, 35);
		panel.add(lblNewLabel_1_1);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(636, 42, 241, 35);
		panel.add(textApellido);
		
		JLabel lblNewLabel_1_2 = new JLabel("DNI:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(69, 139, 83, 35);
		panel.add(lblNewLabel_1_2);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(190, 139, 241, 35);
		panel.add(textDni);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(534, 139, 83, 35);
		panel.add(lblNewLabel_1_1_1);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(636, 139, 241, 35);
		panel.add(textTelefono);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Fecha Nac:");
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(69, 234, 111, 35);
		panel.add(lblNewLabel_1_2_1);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(190, 236, 241, 35);
		panel.add(textFecha);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Correo:");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(534, 234, 83, 35);
		panel.add(lblNewLabel_1_1_1_1);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(636, 236, 241, 35);
		panel.add(textCorreo);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1_1.setBounds(69, 336, 111, 35);
		panel.add(lblNewLabel_1_2_1_1);
		
		passwordContra = new JPasswordField();
		passwordContra.setBounds(190, 338, 241, 35);
		panel.add(passwordContra);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("ID Gerente:");
		lblNewLabel_1_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1_1_1.setBounds(534, 336, 111, 35);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		textID_gerente = new JTextField();
		textID_gerente.setColumns(10);
		textID_gerente.setBounds(636, 338, 241, 35);
		panel.add(textID_gerente);
		
		JLabel lblerrorNombre = new JLabel("Nombre inválido.");
		lblerrorNombre.setForeground(new Color(128, 0, 0));
		lblerrorNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorNombre.setBounds(190, 76, 241, 20);
		panel.add(lblerrorNombre);
		lblerrorNombre.setVisible(false);
		
		JLabel lblerrorDni = new JLabel("Dni incorrecto.");
		lblerrorDni.setForeground(new Color(128, 0, 0));
		lblerrorDni.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorDni.setBounds(190, 174, 385, 20);
		panel.add(lblerrorDni);
		lblerrorDni.setVisible(false);
		
		JLabel lblerrorFecha = new JLabel("Fecha incorrecta.");
		lblerrorFecha.setForeground(new Color(128, 0, 0));
		lblerrorFecha.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorFecha.setBounds(190, 271, 241, 20);
		panel.add(lblerrorFecha);
		lblerrorFecha.setVisible(false);
		
		JLabel lblerrorContraseña = new JLabel("La contraseña no es válida.");
		lblerrorContraseña.setForeground(new Color(128, 0, 0));
		lblerrorContraseña.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorContraseña.setBounds(190, 371, 241, 20);
		panel.add(lblerrorContraseña);
		lblerrorContraseña.setVisible(false);
		
		JLabel lblerrorApellido = new JLabel("Apellido inválido.");
		lblerrorApellido.setForeground(new Color(128, 0, 0));
		lblerrorApellido.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorApellido.setBounds(636, 76, 218, 20);
		panel.add(lblerrorApellido);
		lblerrorApellido.setVisible(false);
		
		JLabel lblerrorTelefono = new JLabel("Teléfono inválido.");
		lblerrorTelefono.setForeground(new Color(128, 0, 0));
		lblerrorTelefono.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorTelefono.setBounds(636, 174, 218, 20);
		panel.add(lblerrorTelefono);
		lblerrorTelefono.setVisible(false);
		
		JLabel lblerrorCorreo = new JLabel("Correo inválido.");
		lblerrorCorreo.setForeground(new Color(128, 0, 0));
		lblerrorCorreo.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorCorreo.setBounds(636, 268, 328, 27);
		panel.add(lblerrorCorreo);
		lblerrorCorreo.setVisible(false);
	
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (opcionesEmpleados == null) {
					
					
					opcionesEmpleados = new TipoEmpleado();
					
					
					
				}
				
				opcionesEmpleados.setLocationRelativeTo(null);
				opcionesEmpleados.setVisible(true);

				dispose();
				
			
			}
		});
		btnVolver.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnVolver.setBounds(66, 574, 205, 58);
		contentPane.add(btnVolver);
		
		
		JButton btnRegistrar= new JButton("Registrar Agente");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/* Validaciones */
				
				
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setForeground(Color.LIGHT_GRAY);
		btnRegistrar.setBorder(null);
		btnRegistrar.setBackground(new Color(48, 109, 105));
		
		btnRegistrar.setBounds(827, 574, 205, 58);
		contentPane.add(btnRegistrar);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(133, 201, 196));
		panel_1_1.setBounds(66, 23, 966, 55);
		contentPane.add(panel_1_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Agregar Nuevo Gerente\r\n\r\n\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1_1.add(lblGestorPropiedades_1);
	}

}
