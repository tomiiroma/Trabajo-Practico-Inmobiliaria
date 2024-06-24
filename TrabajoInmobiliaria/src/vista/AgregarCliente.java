package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.InquilinoControlador;
import trabajoInmobiliaria.Inquilino;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class AgregarCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textFechadeNacimiento;
	private JTextField textTelefono;
	private JTextField textCorreo;
	private JTextField textDireccion;
	private JTextField txtTipoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCliente frame = new AgregarCliente();
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
	public AgregarCliente() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		panel_1.setBounds(10, 73, 764, 388);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 61, 349, 29);
		panel_1.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento (YYYY-MM-DD)");
		lblFechaDeNacimiento.setForeground(new Color(255, 255, 255));
		lblFechaDeNacimiento.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFechaDeNacimiento.setBounds(10, 277, 349, 14);
		panel_1.add(lblFechaDeNacimiento);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setForeground(new Color(255, 255, 255));
		lblDni.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDni.setBounds(10, 203, 166, 14);
		panel_1.add(lblDni);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(new Color(255, 255, 255));
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblApellido.setBounds(10, 119, 166, 14);
		panel_1.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNombre.setBounds(10, 36, 166, 14);
		panel_1.add(lblNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(10, 141, 349, 29);
		panel_1.add(textApellido);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(10, 225, 349, 29);
		panel_1.add(textDni);
		
		textFechadeNacimiento = new JTextField();
		textFechadeNacimiento.setColumns(10);
		textFechadeNacimiento.setBounds(10, 302, 349, 29);
		panel_1.add(textFechadeNacimiento);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(405, 61, 349, 29);
		panel_1.add(textTelefono);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(new Color(255, 255, 255));
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTelefono.setBounds(405, 37, 166, 14);
		panel_1.add(lblTelefono);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(405, 141, 349, 29);
		panel_1.add(textCorreo);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(new Color(255, 255, 255));
		lblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCorreo.setBounds(405, 120, 166, 14);
		panel_1.add(lblCorreo);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(405, 225, 349, 29);
		panel_1.add(textDireccion);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(new Color(255, 255, 255));
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDireccion.setBounds(405, 204, 166, 14);
		panel_1.add(lblDireccion);
		
		txtTipoCliente = new JTextField();
		txtTipoCliente.setColumns(10);
		txtTipoCliente.setBounds(405, 302, 349, 29);
		panel_1.add(txtTipoCliente);
		
		JLabel lblTipoDeCliente = new JLabel("Tipo de Cliente");
		lblTipoDeCliente.setForeground(new Color(255, 255, 255));
		lblTipoDeCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTipoDeCliente.setBounds(405, 278, 166, 14);
		panel_1.add(lblTipoDeCliente);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setForeground(Color.LIGHT_GRAY);
		btnAgregar.setBorder(null);
		btnAgregar.setBackground(new Color(48, 109, 105));
		btnAgregar.setBounds(637, 350, 117, 29);
		panel_1.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(VerificarFecha(textFechadeNacimiento.getText())) {
					String nombre = textNombre.getText();
					String apellido = textApellido.getText();
					int dni = Integer.parseInt(textDni.getText());
					LocalDate fechanacimiento = LocalDate.parse(textFechadeNacimiento.getText());
					int telefono = Integer.parseInt(textTelefono.getText());
					String correo = textCorreo.getText();
					String direccion = textDireccion.getText();
					String tipoCliente = txtTipoCliente.getText();
					
					InquilinoControlador inquilino = new InquilinoControlador();
					
					inquilino.addInquilino(new Inquilino(nombre,apellido,correo,direccion,telefono,fechanacimiento,dni,10));
					JOptionPane.showMessageDialog(null, "Cliente Agregado");
				}else {
					JOptionPane.showMessageDialog(null, "Ingrese las fechas en formato YYYY-mm-DD");
				}
			
			}});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(10, 350, 117, 29);
		panel_1.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCliente PantallaCliente =  new PantallaCliente();
				dispose();
			}
		});
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(133, 201, 196));
		panel_1_1.setBounds(10, 11, 764, 55);
		contentPane.add(panel_1_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Agregar Nuevo Cliente\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1_1.add(lblGestorPropiedades_1);
		
	

	}
	   private boolean VerificarFecha(String fechaString) {
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    	
	    	try {
	    		LocalDate fecha = LocalDate.parse(fechaString, formatter);
	    		return true;
	    	}catch(DateTimeParseException e){
	    		return false;
	    	}
	    }
}
