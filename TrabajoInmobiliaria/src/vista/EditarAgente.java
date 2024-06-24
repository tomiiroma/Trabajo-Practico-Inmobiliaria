package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.AgenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Validacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.awt.event.ActionEvent;

public class EditarAgente extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpNombre;
	private JTextField inpDni;
	private JTextField inpFecha;
	private JTextField inpApellido;
	private JTextField inpTelefono;
	private JTextField inpCorreo;
	private JTextField inpID_agente;
	private JPasswordField passwordField;
	private ModificarEmpleado menuModificiacion;
	private AgenteControlador controladoragente;
	private Gerente gerente;
	private AgenteModificadoAviso volverAgente;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EditarAgente(Agente agente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Modificar agente");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel.setBounds(432, 9, 657, 70);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 90, 1007, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 635, 1007, 2);
		contentPane.add(separator_1);
		
		JLabel lblSeleccionado = new JLabel("Seleccionado:");
		lblSeleccionado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeleccionado.setBounds(36, 110, 1007, 35);
		contentPane.add(lblSeleccionado);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					
				menuModificiacion = new ModificarEmpleado();
					
				
				
				
				menuModificiacion.setVisible(true);
				menuModificiacion.setLocationRelativeTo(null);
				menuModificiacion.Peticion(1);
				
				
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(339, 662, 130, 41);
		contentPane.add(btnNewButton);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 157, 1007, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(60, 50, 101, 35);
		panel.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		inpNombre = new JTextField();
		inpNombre.setBounds(170, 50, 241, 35);
		panel.add(inpNombre);
		inpNombre.setColumns(10);
		
		inpDni = new JTextField();
		inpDni.setBounds(170, 150, 241, 35);
		panel.add(inpDni);
		inpDni.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(60, 150, 105, 35);
		panel.add(lblDni);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblFecha_nac = new JLabel("Fecha nac:");
		lblFecha_nac.setBounds(60, 250, 105, 35);
		panel.add(lblFecha_nac);
		lblFecha_nac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		inpFecha = new JTextField();
		inpFecha.setBounds(170, 250, 241, 35);
		panel.add(inpFecha);
		inpFecha.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(60, 348, 105, 35);
		panel.add(lblContraseña);
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblID_agente = new JLabel("ID_agente:");
		lblID_agente.setBounds(570, 350, 105, 35);
		panel.add(lblID_agente);
		lblID_agente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		inpID_agente = new JTextField();
		inpID_agente.setBounds(680, 350, 241, 35);
		panel.add(inpID_agente);
		inpID_agente.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(570, 250, 105, 35);
		panel.add(lblCorreo);
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		inpCorreo = new JTextField();
		inpCorreo.setBounds(680, 250, 241, 35);
		panel.add(inpCorreo);
		inpCorreo.setColumns(10);
		
		inpTelefono = new JTextField();
		inpTelefono.setBounds(680, 150, 241, 35);
		panel.add(inpTelefono);
		inpTelefono.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(570, 150, 105, 35);
		panel.add(lblTelefono);
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(570, 50, 105, 35);
		panel.add(lblApellido);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		inpApellido = new JTextField();
		inpApellido.setBounds(680, 50, 241, 35);
		panel.add(inpApellido);
		inpApellido.setColumns(10);
		
		JLabel lblnombreError = new JLabel("Nombre inválido");
		lblnombreError.setForeground(new Color(255, 0, 0));
		lblnombreError.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblnombreError.setBounds(170, 8, 241, 35);
		panel.add(lblnombreError);
		lblnombreError.setVisible(false);
		
		JLabel lblApellidoError = new JLabel("Apellido inválido");
		lblApellidoError.setForeground(new Color(255, 0, 0));
		lblApellidoError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidoError.setBounds(680, 8, 241, 35);
		panel.add(lblApellidoError);
		lblApellidoError.setVisible(false);
		
		JLabel lblDniError = new JLabel("DNI inválido");
		lblDniError.setForeground(new Color(255, 0, 0));
		lblDniError.setBackground(new Color(255, 255, 255));
		lblDniError.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDniError.setBounds(170, 100, 241, 35);
		panel.add(lblDniError);
		lblDniError.setVisible(false);
		
		JLabel lblTelefonoError = new JLabel("Teléfono inválido");
		lblTelefonoError.setForeground(new Color(255, 0, 0));
		lblTelefonoError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefonoError.setBounds(680, 100, 241, 35);
		panel.add(lblTelefonoError);
		lblTelefonoError.setVisible(false);
		
		JLabel lblFechaError = new JLabel("Fecha inválida");
		lblFechaError.setForeground(new Color(255, 0, 0));
		lblFechaError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaError.setBounds(170, 200, 241, 35);
		panel.add(lblFechaError);
		lblFechaError.setVisible(false);
		
		JLabel lblCorreoErrror = new JLabel("Correo inválido");
		lblCorreoErrror.setForeground(new Color(255, 0, 0));
		lblCorreoErrror.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCorreoErrror.setBounds(680, 200, 241, 35);
		panel.add(lblCorreoErrror);
		lblCorreoErrror.setVisible(false);
		
		JLabel lblContraseñaError = new JLabel("Contraseña invalida.");
		lblContraseñaError.setForeground(new Color(255, 0, 0));
		lblContraseñaError.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContraseñaError.setBounds(170, 300, 416, 35);
		panel.add(lblContraseñaError);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 350, 241, 35);
		panel.add(passwordField);
		lblContraseñaError.setVisible(false);
	
		/* Para visualizar el panel sin información */
		 if (agente != null) {
			 boolean flag = false;
			 boolean flagdia = false;
			 lblSeleccionado.setText("Seleccionado "+ " Nombre: "+agente.getNombre() + ", Apellido: "+agente.getApellido()+", Dni: " + agente.getDni() + ", Fecha de nacimiento: "+agente.getFecha_nacimiento() + ", Teléfono: "+agente.getTelefono() + ", Correo: " + agente.getCorreo());
			 
			 inpNombre.setText(agente.getNombre());
			 inpApellido.setText(agente.getApellido());
			 inpDni.setText(Integer.toString(agente.getDni()));
			 
			 /* Para poder tomar el LocalDate sin parsearlo o utilizar cosas raras */
			 
			 int año, mes , dia;   año = agente.getFecha_nacimiento().getYear(); mes = agente.getFecha_nacimiento().getMonthValue(); dia = agente.getFecha_nacimiento().getDayOfMonth();
			 
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
					 inpTelefono.setText(Integer.toString(agente.getTelefono()));
					 inpCorreo.setText(agente.getCorreo());
					 inpID_agente.setText(Integer.toString(agente.getId_agente()));
					
					 
					 
		 }
		 
		 
		 JButton btnNewButton_1 = new JButton("Modificar");
		 btnNewButton_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 /* Validaciones a la hora de intentar modificar el agente */
				 
				 LocalDate fecha = null;
				 /* Bandera para validar el dni. */
				 boolean flagdni = true;
				 
				 /* Bandera para validar si todos los campos estan correctos */
				 
				 boolean flagValidacion = true;
				 
				 /* Dni y telefono */
				 
				 int dni=0 , telefono=0;
				 
				 /* El nombre y el apellido capturan el texto recibido por la GUI*/
				 String 
				 nombre=inpNombre.getText(),
				apellido=inpApellido.getText(),
				correo = inpCorreo.getText(),
				fecha2 = inpFecha.getText(),
				fechaanterior; 
				 LocalDate fechaAnterior = agente.getFecha_nacimiento();
				 
				 /* Validaciones en nombre y apellido  */
				 boolean validarNombre = validarNombre2(nombre);
				 boolean ValidarApellido = validarNombre2(apellido);
				 
				 
				 if (controladoragente == null) {
					 
					 controladoragente = new AgenteControlador();
					 
					 
				 }
				
				 
	/* Validar Nombre */			 
				 if (validarNombre == false) {
					 lblnombreError.setVisible(true);
					 lblnombreError.setForeground(Color.red);
					 lblnombreError.setText("El nombre ingresado no es válido");
					 inpNombre.setText(agente.getNombre());
					 flagValidacion = false;
					 
				 } else {
					 
					 lblnombreError.setVisible(true);
					 lblnombreError.setForeground(Color.green);
					 lblnombreError.setText("El nombre ingresado es válido");
					 inpNombre.setText(nombre);
					 
				 }
	/* Fin validar nombre */			 
				 
	/* Validar apellido */			 
				 if (ValidarApellido == false ) {
					 
					 lblApellidoError.setVisible(true);
					 lblApellidoError.setForeground(Color.red);
					 lblApellidoError.setText("El apellido ingresado no es válido");
					 lblApellidoError.setText(agente.getNombre());
					 inpApellido.setText(agente.getApellido());
					 flagValidacion = false;
					 
				 } else {
					 
					 lblApellidoError.setVisible(true);
					 lblApellidoError.setForeground(Color.green);
					 lblApellidoError.setText("El apellido ingresado es válido");
					 inpApellido.setText(apellido);
					 
				 }
				 
	/* Fin validar apellido */			 
				
	/* Validación del DNI con multiples mensajes de error. */
				 
				 try {
						
						
					 for (int i = 0; i < inpDni.getText().length(); i++) {
						
						 if (!Character.isDigit(inpDni.getText().charAt(i))) {
							 flagdni = false;
		                        break; 
		                    }
						 
						 
					}
					
					
					if (flagdni == true) {
						
				
						
						 dni = Integer.parseInt(inpDni.getText());
						
						 boolean validarDni = validarDni2(dni);
						
						validarDni = validarDni2(dni);	
						
						if (validarDni == true) {
							
							lblDniError.setVisible(true);
							lblDniError.setText("El dni ingresado es válido");
							lblDniError.setForeground(Color.green);
							inpDni.setText(Integer.toString(dni));
							
								
						} else {
							
							lblDniError.setVisible(true);
							lblDniError.setText("El dni debe contener 8 digitos");
							lblDniError.setForeground(Color.red);
							inpDni.setText(Integer.toString(agente.getDni()));
							flagValidacion = false;
						}
					
					
					} else {
						
						lblDniError.setVisible(true);
						lblDniError.setText("Se ingreso un caracter inválido");
						lblDniError.setForeground(Color.red);
						inpDni.setText(Integer.toString(agente.getDni()));
						flagValidacion = false;
					}
					
					
					
				} catch (Exception e2) {
								
					lblDniError.setVisible(true);
					lblDniError.setForeground(Color.red);
					lblDniError.setText("Se ingreso un caracter invalido 2");
					inpDni.setText(Integer.toString(agente.getDni()));
					flagValidacion = false;
					
				}
				 
				

/* Fin validar DNI */				
				 
/* Validar teléfono */ 
				 
				 String telefono2 = inpTelefono.getText();
				 
				 try {
						
						telefono = Integer.parseInt(telefono2);
						
						boolean Validartelefono = validarTelefono2(telefono);
						
						if (!Validartelefono) {
							
							
							lblTelefonoError.setVisible(true);
							lblTelefonoError.setForeground(Color.red);
							lblTelefonoError.setText("El teléfono debe tener 8 dígitos.");
							inpTelefono.setText(Integer.toString(agente.getTelefono()));
							flagValidacion = false;
							
						} else {
							
							lblTelefonoError.setForeground(Color.green);
							lblTelefonoError.setText("Teléfono validado.");
							lblTelefonoError.setVisible(true);
							inpTelefono.setText(Integer.toString(telefono));
							
						}
						
						
							
						} catch (Exception e2) {
							
							lblTelefonoError.setVisible(true);
							lblTelefonoError.setForeground(Color.red);
							lblTelefonoError.setText("Se ingreso un cáracter inválido.");
							inpTelefono.setText(Integer.toString(agente.getTelefono()));
							flagValidacion = false;
							
						}


/* Fin validar teléfono */
					
				 
/* Validar Correo */
				 
				 boolean ValidarCorreo = validarEmail2(correo);
				 
				 if (ValidarCorreo) {
				 
					 lblCorreoErrror.setVisible(true);
					 lblCorreoErrror.setForeground(Color.green);
					 lblCorreoErrror.setText("Correo validado");
					 inpCorreo.setText(correo);
					 
				 } else {
				 
					 lblCorreoErrror.setVisible(true);
					 lblCorreoErrror.setForeground(Color.red);
					 lblCorreoErrror.setText("El correo ingresado no es válido");
					 inpCorreo.setText("Correo@algo.com");
					 flagValidacion = false;
					 
					 
				 }
/* Fin validar Correo */

/* Validar fecha de nacimiento */
				 
				 DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				 
				 
				 fechaanterior = fechaAnterior.format(formato);
				
				 
				 try {

						fecha = LocalDate.parse(fecha2,  DateTimeFormatter.ofPattern("yyyy-MM-dd")); // Parsea La variable recibida en fecha2 en un LocalDate y debe escribirse con el patron yyyy-MM-dd
						Boolean ValidarFecha = validarFecha2(fecha);
						
						
						
						if (!ValidarFecha) {
							
							lblFechaError.setVisible(true);
							lblFechaError.setForeground(Color.red);
							lblFechaError.setText("La fecha ingresada no es válida.");
							inpFecha.setText(fechaanterior);
							flagValidacion = false;
							
							
						} else {
							
							lblFechaError.setVisible(true);
							lblFechaError.setForeground(Color.green);
							lblFechaError.setText("Fecha de nacimiento válida.");
							inpFecha.setText(fecha2);
						}
						
					} catch (Exception e2) {
						
						lblFechaError.setVisible(true);
						lblFechaError.setForeground(Color.red);
						lblFechaError.setText("No se permiten caracteres especiales.");
						inpFecha.setText(fechaanterior);
						flagValidacion = false;
					}
				 
				 
/* Fin validar fecha */				 
				 
/* Validar Nueva password */
				 
				 
				
					
					boolean validarpass = validarContraseña(passwordField.getText());
					
					if (!validarpass) {
						
						lblContraseñaError.setVisible(true);
						lblContraseñaError.setForeground(Color.red);
					 	lblContraseñaError.setBounds(60,300,416,35); // Modifica la posicion del eje x del label
						lblContraseñaError.setText("La contraseña debe contener 2 números y tener 6 caracteres.");
						passwordField.setText("");
						flagValidacion = false;
					}
					
					else {
						
						lblContraseñaError.setVisible(true);
						lblContraseñaError.setForeground(Color.green);
						lblContraseñaError.setText("La contraseña es válida.");
						lblContraseñaError.setBounds(170,300,416,35);
						passwordField.setText(passwordField.getText());
						
					}


/* Fin validar passwor */
				 
/* Modificación del Agente */
					
					JOptionPane.showMessageDialog(null, flagValidacion);
					
					if (flagValidacion == true) {
						
						
						
						
						if (gerente == null) {
							
							gerente = new Gerente();
							
						}
					
					if (controladoragente == null) {
						
						controladoragente = new AgenteControlador();
						
					}
					
					if (!agente.getNombre().equalsIgnoreCase(nombre)  || !agente.getApellido().equalsIgnoreCase(apellido)  || !agente.getFecha_nacimiento().equals(fecha)  || agente.getDni() != dni || agente.getTelefono() != telefono || !agente.getCorreo().equalsIgnoreCase(correo)  || !agente.getContraseña().equalsIgnoreCase(passwordField.getText())) {
						
						
					
					gerente.ModificarAgente(agente, nombre, apellido, fecha, dni, telefono, correo, passwordField.getText(),Integer.parseInt(inpID_agente.getText()));
					
					
					volverAgente = new AgenteModificadoAviso();
					
					
					volverAgente.setLocationRelativeTo(null);
					
					
					volverAgente.setVisible(true);
					
					dispose();
					
					
					} else {/* Despues modificarlo. */  JOptionPane.showMessageDialog(null, "No se ha modificado ningun dato, error.");}
						
					
					}
					
					
					
					
/* Fin del modificar Agente */
				 
				 
				 
			 }
		 });
		 btnNewButton_1.setBounds(583, 662, 130, 41);
		 contentPane.add(btnNewButton_1);
		 
		
		 
			 
		 
	
	
	}
}
