package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Validacion;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarGerente extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpNombre;
	private JTextField inpDni;
	private JTextField inpFecha;
	private JTextField inpApellido;
	private JTextField inpTelefono;
	private JTextField inpCorreo;
	private ModificarEmpleado VolverTablas;
	private JPasswordField inpContra;
	

	/**
	 * Launch the application.
	 */
	
	
	
	

	/**
	 * Create the frame.
	 */
	public EditarGerente(Gerente gerente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar agente");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel.setBounds(426, 11, 623, 70);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 92, 1007, 2);
		contentPane.add(separator);
		
		JLabel lblGerenteSeleccionado = new JLabel("Seleccionado:");
		lblGerenteSeleccionado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGerenteSeleccionado.setBounds(42, 104, 1007, 35);
		contentPane.add(lblGerenteSeleccionado);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 150, 1006, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(60, 50, 101, 35);
		panel.add(lblNombre);
		
		inpNombre = new JTextField();
		inpNombre.setForeground(new Color(0, 0, 0));
		inpNombre.setColumns(10);
		inpNombre.setBounds(170, 50, 241, 35);
		panel.add(inpNombre);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBounds(60, 150, 105, 35);
		panel.add(lblDni);
		
		inpDni = new JTextField();
		inpDni.setColumns(10);
		inpDni.setBounds(170, 150, 241, 35);
		panel.add(inpDni);
		
		JLabel lblFecha_nac = new JLabel("Fecha nac:");
		lblFecha_nac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFecha_nac.setBounds(60, 250, 105, 35);
		panel.add(lblFecha_nac);
		
		inpFecha = new JTextField();
		inpFecha.setColumns(10);
		inpFecha.setBounds(170, 250, 241, 35);
		panel.add(inpFecha);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContraseña.setBounds(60, 350, 105, 35);
		panel.add(lblContraseña);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellido.setBounds(570, 50, 105, 35);
		panel.add(lblApellido);
		
		inpApellido = new JTextField();
		inpApellido.setColumns(10);
		inpApellido.setBounds(680, 50, 241, 35);
		panel.add(inpApellido);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefono.setBounds(570, 150, 105, 35);
		panel.add(lblTelefono);
		
		inpTelefono = new JTextField();
		inpTelefono.setColumns(10);
		inpTelefono.setBounds(680, 150, 241, 35);
		panel.add(inpTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCorreo.setBounds(570, 250, 105, 35);
		panel.add(lblCorreo);
		
		inpCorreo = new JTextField();
		inpCorreo.setColumns(10);
		inpCorreo.setBounds(677, 250, 241, 35);
		panel.add(inpCorreo);
		
		JLabel lblNombreIncorrecto = new JLabel("Nombre inválido");
		lblNombreIncorrecto.setForeground(new Color(255, 0, 0));
		lblNombreIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreIncorrecto.setBounds(170, 8, 241, 35);
		panel.add(lblNombreIncorrecto);
		lblNombreIncorrecto.setVisible(false);
		
		JLabel lblDniIncorrecto = new JLabel("DNI inválido");
		lblDniIncorrecto.setForeground(new Color(255, 0, 0));
		lblDniIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDniIncorrecto.setBounds(170, 100, 241, 35);
		panel.add(lblDniIncorrecto);
		lblDniIncorrecto.setVisible(false);
		
		
		JLabel lblFechaIncorrecto = new JLabel("Fecha inválida");
		lblFechaIncorrecto.setForeground(new Color(255, 0, 0));
		lblFechaIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaIncorrecto.setBounds(170, 200, 241, 35);
		panel.add(lblFechaIncorrecto);
		lblFechaIncorrecto.setVisible(false);
		
		JLabel lblContraseñaIncorrecta = new JLabel("Contraseña inválido");
		lblContraseñaIncorrecta.setForeground(new Color(255, 0, 0));
		lblContraseñaIncorrecta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContraseñaIncorrecta.setBounds(170, 300, 826, 35);
		panel.add(lblContraseñaIncorrecta);
		lblContraseñaIncorrecta.setVisible(false);
		
		JLabel lblApellidoIncorrecto = new JLabel("Apellido inválido");
		lblApellidoIncorrecto.setForeground(new Color(255, 0, 0));
		lblApellidoIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidoIncorrecto.setBounds(680, 8, 241, 35);
		panel.add(lblApellidoIncorrecto);
		lblApellidoIncorrecto.setVisible(false);
		
		JLabel lblTelefonoIncorrecto = new JLabel("Teléfono inválido");
		lblTelefonoIncorrecto.setForeground(new Color(255, 0, 0));
		lblTelefonoIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefonoIncorrecto.setBounds(680, 100, 241, 35);
		panel.add(lblTelefonoIncorrecto);
		lblTelefonoIncorrecto.setVisible(false);
		
		JLabel lblCorreoIncorrecto = new JLabel("Correo inválido");
		lblCorreoIncorrecto.setForeground(new Color(255, 0, 0));
		lblCorreoIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCorreoIncorrecto.setBounds(680, 200, 316, 35);
		panel.add(lblCorreoIncorrecto);
		
		inpContra = new JPasswordField();
		inpContra.setBounds(170, 350, 241, 35);
		panel.add(inpContra);
		lblCorreoIncorrecto.setVisible(false);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (VolverTablas == null) {
					
					VolverTablas = new ModificarEmpleado();
					
				}
			
				VolverTablas.setLocationRelativeTo(null);
				
				VolverTablas.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		
		
		if (gerente != null) {
			 boolean flag = false;
			 boolean flagdia = false;
			 lblGerenteSeleccionado.setText("Seleccionado "+ " Nombre: "+gerente.getNombre() + ", Apellido: "+gerente.getApellido()+", Dni: " + gerente.getDni() + ", Fecha de nacimiento: "+gerente.getFecha_nacimiento() + ", Teléfono: "+gerente.getTelefono() + ", Correo: " + gerente.getCorreo());
			 
			 inpNombre.setText(gerente.getNombre());
			 inpApellido.setText(gerente.getApellido());
			 inpDni.setText(Integer.toString(gerente.getDni()));
			 
			 /* Para poder tomar el LocalDate sin parsearlo o utilizar cosas raras */
			 
			 int año, mes , dia;   año = gerente.getFecha_nacimiento().getYear(); mes = gerente.getFecha_nacimiento().getMonthValue(); dia = gerente.getFecha_nacimiento().getDayOfMonth();
			 
			 if (mes < 10) {
				 
				 flag = true;
				 
			 }
			 
			 if (dia < 10) {
				 
				 flagdia = true;
				 
			 }
			 
/* Parseo del año, mes y dia a String */
			 
			 
			String añof = Integer.toString(año); 
			String mesf = Integer.toString(mes);
			String diaf = Integer.toString(dia);
			
			
/* Condicionales para concatenar el 0, en caso del dia y mes, ya que cuando se utilizan los metodos de localDate estos devuelve el entero sin el 0, el 0 es necesario para poder
 *  subir un dato de tipo date a la base de datos mysql,  */
			
			 if (flag == true) {
				
				 mesf = "0"+mesf;
				 
			 }
			 			
			 			
			 if (flagdia == true) {
				 
				 diaf = "0"+diaf;
				 
			 }
			 
			 
					 inpFecha.setText(añof+"-"+mesf+"-"+diaf);
					 inpTelefono.setText(Integer.toString(gerente.getTelefono()));
					 inpCorreo.setText(gerente.getCorreo());
					
					
					 
					 
		 }
		
		
		
		
		
		btnNewButton.setBounds(339, 674, 130, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = inpNombre.getText(),
						apellido = inpApellido.getText(),
						correo = inpCorreo.getText(),
						telefono2 = inpTelefono.getText();
				
				boolean ValidarNombre = validarNombre2(nombre), 
						ValidarApellido = validarNombre2(apellido),
						ValidarCorreo = validarEmail2(correo),
						validarpass = validarContraseña(inpContra.getText());
				
				int telefono;
				
	/* Validar Nombre */		
				
				
				 if (ValidarNombre == false) {
					 lblNombreIncorrecto.setVisible(true);
					 lblNombreIncorrecto.setForeground(Color.red);
					 lblNombreIncorrecto.setText("El nombre ingresado no es válido");
					
					 inpNombre.setText(gerente.getNombre());
					 
					 
				 } else {
					 
					 lblNombreIncorrecto.setVisible(true);
					 lblNombreIncorrecto.setForeground(Color.green);
					 lblNombreIncorrecto.setText("El nombre ingresado es válido");
					 inpNombre.setText(nombre);
					 
				 }
				 
				 
	/* Fin validar nombre */
				
	/* Validar apellido */
				 
				 
				 if (ValidarApellido == false ) {
					 
					 lblApellidoIncorrecto.setVisible(true);
					 lblApellidoIncorrecto.setForeground(Color.red);
					 lblApellidoIncorrecto.setText("El apellido ingresado no es válido");
					 inpApellido.setText(gerente.getApellido());
					 
					 
				 } else {
					 
					 lblApellidoIncorrecto.setVisible(true);
					 lblApellidoIncorrecto.setForeground(Color.green);
					 lblApellidoIncorrecto.setText("El apellido ingresado es válido");
					 inpApellido.setText(apellido);
					 
				 }
				 
	/* Fin validar apellido */	
				
/* Validar Correo */
				 
				 
				 
				 if (ValidarCorreo) {
				 
					 lblCorreoIncorrecto.setVisible(true);
					 lblCorreoIncorrecto.setForeground(Color.green);
					 lblCorreoIncorrecto.setText("Correo validado");
					 inpCorreo.setText(correo);
					 
				 } else {
				 
					 lblCorreoIncorrecto.setVisible(true);
					 lblCorreoIncorrecto.setForeground(Color.red);
					 lblCorreoIncorrecto.setText("El correo ingresado no es válido");
					 inpCorreo.setText("Correo@algo.com");
					 
					 
					 
				 }
/* Fin validar Correo */			
				
				 /* Validar Nueva password */
				 
				 
					
					
					
					
					if (!validarpass) {
						
						lblContraseñaIncorrecta.setBounds(60,300,416,35); // Modifica la posicion del eje x del label
						lblContraseñaIncorrecta.setVisible(true);
						lblContraseñaIncorrecta.setForeground(Color.red);
						lblContraseñaIncorrecta.setText("Contraseña invalida");
						inpContra.setText("");
						
					}
					
					else {
						
						lblContraseñaIncorrecta.setBounds(60,300,416,35); // Ver despues como modificar el tamaño.
						lblContraseñaIncorrecta.setVisible(true);
						lblContraseñaIncorrecta.setForeground(Color.green);
						lblContraseñaIncorrecta.setText("La contraseña es válida.");
						inpContra.setText(inpContra.getText());
						
					}


/* Fin validar passwor */			
				
/* Validar teléfono */ 
					 
					
					 
					 try {
							
							telefono = Integer.parseInt(telefono2);
							
							boolean Validartelefono = validarTelefono2(telefono);
							
							if (!Validartelefono) {
								
								
								lblTelefonoIncorrecto.setVisible(true);
								lblTelefonoIncorrecto.setForeground(Color.red);
								lblTelefonoIncorrecto.setText("El teléfono debe tener 8 dígitos.");
								inpTelefono.setText(Integer.toString(gerente.getTelefono()));
								
								
							} else {
								
								lblTelefonoIncorrecto.setForeground(Color.green);
								lblTelefonoIncorrecto.setText("Teléfono validado.");
								lblTelefonoIncorrecto.setVisible(true);
								inpTelefono.setText(Integer.toString(telefono));
								
							}
							
							
								
							} catch (Exception e2) {
								
								lblTelefonoIncorrecto.setVisible(true);
								lblTelefonoIncorrecto.setForeground(Color.red);
								lblTelefonoIncorrecto.setText("Se ingreso un cáracter inválido.");
								inpTelefono.setText(Integer.toString(gerente.getTelefono()));
								
								
							}


/* Fin validar teléfono */				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(583, 674, 130, 41);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(29, 645, 1007, 2);
		contentPane.add(separator_1);
	}
}
