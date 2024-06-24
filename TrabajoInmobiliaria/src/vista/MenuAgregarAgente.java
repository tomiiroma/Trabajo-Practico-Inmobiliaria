package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Validacion;
import java.awt.Color;
import javax.swing.JComboBox;

public class MenuAgregarAgente extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textTelefono;
	private JTextField textFecha;
	private JTextField textCorreo;
	private JPasswordField passwordContra;
	private GestionEmpleadosOpciones volverMenu;
	private Gerente gerente = new Gerente();
	private AgenteAgregado agregado;
	private JComboBox<String> comboBoxEmpleado;
	private GerenteAgregado gerenteagregado;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MenuAgregarAgente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(66, 97, 966, 2);
		contentPane.add(separator);
		
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
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Puesto:");
		lblNewLabel_1_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1_1_1.setBounds(534, 336, 111, 35);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblerrorNombre = new JLabel("Nombre inválido.");
		lblerrorNombre.setForeground(new Color(128, 0, 0));
		lblerrorNombre.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorNombre.setBounds(190, 76, 241, 20);
		panel.add(lblerrorNombre);
		lblerrorNombre.setVisible(false);
		
		JLabel lblerrorDni = new JLabel("Dni incorrecto.");
		lblerrorDni.setForeground(new Color(128, 0, 0));
		lblerrorDni.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorDni.setBounds(190, 175, 385, 20);
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
		lblerrorContraseña.setBounds(190, 372, 241, 20);
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
		lblerrorTelefono.setBounds(636, 175, 218, 20);
		panel.add(lblerrorTelefono);
		lblerrorTelefono.setVisible(false);
		
		JLabel lblerrorCorreo = new JLabel("Correo inválido.");
		lblerrorCorreo.setForeground(new Color(128, 0, 0));
		lblerrorCorreo.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblerrorCorreo.setBounds(636, 271, 328, 20);
		panel.add(lblerrorCorreo);
		
	    comboBoxEmpleado = new JComboBox<String>();
	    comboBoxEmpleado.setBackground(new Color(255, 255, 255));
		comboBoxEmpleado.setBounds(636, 338, 241, 35);
		panel.add(comboBoxEmpleado);
		lblerrorCorreo.setVisible(false);
		
		comboBoxEmpleado.addItem("Agente");
		comboBoxEmpleado.addItem("Gerente");
		
		JButton btnNewButton = new JButton("Registrar ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(48, 109, 105));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LocalDate fecha = null;
				int dni=0, telefono=0;
				String nombre = textNombre.getText(),
				apellido = textApellido.getText(),
				 fecha2 = textFecha.getText(),
				dni2 = textDni.getText(),
				 correo = textCorreo.getText(),
				 telefono2 = textTelefono.getText()
				
				 ;
				
				
				JOptionPane.showMessageDialog(null, nombre);
				
				Boolean ValidarNombre = validarNombre2(nombre);
				Boolean ValidarApellido = validarNombre2(apellido);
				Boolean ValidarCorreo = validarEmail2(correo);
				Boolean Validacion = true;
				/* Validación de la fecha */
				
				try {

					fecha = LocalDate.parse(fecha2,  DateTimeFormatter.ofPattern("yyyy-MM-dd")); // Parsea La variable recibida en fecha2 en un LocalDate y debe escribirse con el patron yyyy-MM-dd
					Boolean ValidarFecha = validarFecha2(fecha);
					
					if (!ValidarFecha) {
						
						lblerrorFecha.setVisible(true);
						textFecha.setText("");
						Validacion = false;
						
					} else {
						
						lblerrorFecha.setVisible(false);
						textFecha.setText(fecha2);
					}
					
				} catch (Exception e2) {
					
					Validacion = false;
					lblerrorFecha.setVisible(true);
					textFecha.setText("");
					
				}
				
				/* Validacion del DNI  */
				
				try {
					
					dni = Integer.parseInt(dni2);
					boolean ValidarDni = validarDni2(dni);
					
					if (!ValidarDni) {
						
						Validacion = false;
						lblerrorDni.setVisible(true);
						textDni.setText("");
						
						
					} else {
						lblerrorDni.setVisible(false);
						textDni.setText(Integer.toString(dni));
						
						
					}
					
					
					
				} catch (Exception e2) {
					lblerrorDni.setVisible(true);
					textFecha.setText("");
					lblerrorDni.setText("Se ingreso un cáracter inválido");
					Validacion = false;
				}
				
				
				/* Validación del nombre */
				
				if (!ValidarNombre) {
					
					lblerrorNombre.setVisible(true);
					textNombre.setText("");
					Validacion = false;
					
				} else {
					
					lblerrorNombre.setVisible(false);
					textNombre.setText(nombre);
					
				}
				
				
				/* Validación del Apellido */
				
			
				if (!ValidarApellido) {
					
					lblerrorApellido.setVisible(true);
					textApellido.setText("");
					Validacion = false;
					
				} else {
					lblerrorApellido.setVisible(false);
					textApellido.setText(apellido);}
				
				/* Validación del correo */
				
				if (correo.isEmpty()) {
					
					lblerrorCorreo.setVisible(true);
					lblerrorCorreo.setText("No se ingreso ningun correo");
					Validacion = false;
				
				} else {
					
					if (!ValidarCorreo) {

						lblerrorCorreo.setVisible(true);
						textCorreo.setText("");
						lblerrorCorreo.setText("<html>El correo debe tener el formato:<br>caracteres@caracteres.com</html>"); /* preguntar al profe por las dudas */
						Validacion = false;
					} else {
						
						lblerrorCorreo.setVisible(false);
						textCorreo.setText(correo);


					}
					
					
					
				}
				
				/* Validar télefono */
				
				try {
					
				telefono = Integer.parseInt(telefono2);
				
				boolean Validartelefono = validarTelefono2(telefono);
				
				if (!Validartelefono) {
					
					lblerrorTelefono.setVisible(true);
					textTelefono.setText("");
					Validacion = false;
					
				} else {
					
					lblerrorTelefono.setVisible(false);
					textTelefono.setText(Integer.toString(telefono));
					
				}
				
				
					
				} catch (Exception e2) {
					
					lblerrorTelefono.setVisible(true);
					textTelefono.setText("");
					Validacion = false;
					
				}
				
				
				/* Contraseña */
				
				boolean validarpass = validarContraseña(passwordContra.getText());
				
				if (!validarpass) {
					
					lblerrorContraseña.setVisible(true);
					passwordContra.setText("");
					Validacion = false;
				}
				
				else {
					
					lblerrorContraseña.setVisible(false);
					passwordContra.setText(passwordContra.getText());
					
				}
				
				
				
				String puesto="";
				
				puesto = (String) comboBoxEmpleado.getSelectedItem();
				
				
				JOptionPane.showMessageDialog(btnNewButton, puesto);
				
				if (Validacion == true) {
					
					
					String Dniduplicado = "Dni", CorreoDuplicado="correo";
					
					Dniduplicado = ValidarDniDuplicado(dni);
					CorreoDuplicado = ValidarMailDuplicado(correo);
					
					if (puesto.equalsIgnoreCase("Agente")) {
						
					
						if (agregado == null) {
							
							
							agregado = new AgenteAgregado();
							
						}
					
					
				    /* Validaciones que verifican que no se encuentren repetido tanto el dni y el correo electronico. */
					
					if (Dniduplicado.equalsIgnoreCase("Se puede registrar") && CorreoDuplicado.equalsIgnoreCase("Mail valido")) {
					
					/* En caso de no encontrarse repetidos devuelve */	
						
					gerente.AgregarAgente(nombre, apellido, fecha, dni, telefono, correo, passwordContra.getText());
						
					
					agregado.setVisible(true);
					
					
					agregado.setLocationRelativeTo(null);
					
					
					dispose();}

					
					else {
						
						/* En caso de que se encuentre repetidos se verifica cual de los dos tiene problemas */
						
						if (Dniduplicado.equalsIgnoreCase("El DNI se encuentra repetido")) {
							
							
							lblerrorDni.setVisible(true);
							lblerrorDni.setText("El DNI se encuentra repetido");
							
						} else if (CorreoDuplicado.equalsIgnoreCase("El correo se encuentra registrado.")) {
							
							lblerrorCorreo.setVisible(true);
							lblerrorCorreo.setText("El correo ya se encuentra registrado");
							
							
							
						}
						
						
						
						
						
					}
					
					} else if (puesto.equalsIgnoreCase("Gerente")) {
						
						if (gerenteagregado == null) {
							
							gerenteagregado = new GerenteAgregado();
							
						}

						
						if (Dniduplicado.equalsIgnoreCase("Se puede registrar") && CorreoDuplicado.equalsIgnoreCase("Mail valido")) {
						
							gerente.AgregarGerente(nombre, apellido, fecha, dni, telefono, correo, passwordContra.getText());
							
							
							gerenteagregado.setLocationRelativeTo(null);
							
							gerenteagregado.setVisible(true);
							
							dispose();
							
							
						} else {
							
							if (Dniduplicado.equalsIgnoreCase("El DNI se encuentra repetido")) {
								
								
								lblerrorDni.setVisible(true);
								lblerrorDni.setText("El DNI se encuentra repetido");
								
							} else if (CorreoDuplicado.equalsIgnoreCase("El correo se encuentra registrado.")) {
								
								lblerrorCorreo.setVisible(true);
								lblerrorCorreo.setText("El correo ya se encuentra registrado");
								
								
								
							}
						}
						
						
						
					} else {
						
						JOptionPane.showMessageDialog(btnNewButton, "Se ha producido un error");
						
						
					}
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(827, 574, 205, 58);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
					
					volverMenu = new GestionEmpleadosOpciones();
					
				
				
				
				volverMenu.setLocationRelativeTo(null);
				
				volverMenu.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(66, 574, 205, 58);
		contentPane.add(btnVolver);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(133, 201, 196));
		panel_1_1.setBounds(66, 21, 966, 55);
		contentPane.add(panel_1_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Agregar Nuevo Agente\r\n\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1_1.add(lblGestorPropiedades_1);
	}
}
