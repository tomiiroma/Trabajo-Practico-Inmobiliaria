package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.PropietarioControlador;
import trabajoInmobiliaria.Propietario;

public class ModificarPropietario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textFechaNacimiento;
	private JTextField textDireccion;
	private JTextField textCorreo;
	private JTextField textTelefono;



	/**
	 * Create the frame.
	 */
	public ModificarPropietario(Propietario cliente) {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PropietarioControlador propietariocont = new PropietarioControlador();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(52, 118, 113));
		panel_1.setBounds(10, 74, 764, 355);
		contentPane.add(panel_1);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(10, 36, 349, 29);
		panel_1.add(textNombre);
		textNombre.setText(cliente.getNombre());
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento (YYYY-MM-DD)");
		lblFechaDeNacimiento.setForeground(new Color(255, 255, 255));
		lblFechaDeNacimiento.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFechaDeNacimiento.setBounds(10, 252, 332, 14);
		panel_1.add(lblFechaDeNacimiento);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setForeground(new Color(255, 255, 255));
		lblDni.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDni.setBounds(10, 178, 166, 14);
		panel_1.add(lblDni);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(new Color(255, 255, 255));
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblApellido.setBounds(10, 94, 166, 14);
		panel_1.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNombre.setBounds(10, 11, 166, 14);
		panel_1.add(lblNombre);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(10, 116, 349, 29);
		panel_1.add(textApellido);
		textApellido.setText(cliente.getApellido());

		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(10, 200, 349, 29);
		panel_1.add(textDni);
		textDni.setText(String.valueOf(cliente.getDni()));
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(10, 277, 349, 29);
		panel_1.add(textFechaNacimiento);
		String fechaString = cliente.getFecha_nacimiento().getYear() + "-" + cliente.getFecha_nacimiento().getMonthValue() + "-" + cliente.getFecha_nacimiento().getDayOfMonth();
		if(cliente.getFecha_nacimiento().getMonthValue() < 10) {
			 fechaString = cliente.getFecha_nacimiento().getYear() + "-0" + cliente.getFecha_nacimiento().getMonthValue() + "-" + cliente.getFecha_nacimiento().getDayOfMonth();
		} if(cliente.getFecha_nacimiento().getDayOfMonth() < 10) {
			 fechaString = cliente.getFecha_nacimiento().getYear() + "-" + cliente.getFecha_nacimiento().getMonthValue() + "-0" + cliente.getFecha_nacimiento().getDayOfMonth();

		}
		if(cliente.getFecha_nacimiento().getDayOfMonth() < 10 &&  cliente.getFecha_nacimiento().getMonthValue() < 10) {
			 fechaString = cliente.getFecha_nacimiento().getYear() + "-0" + cliente.getFecha_nacimiento().getMonthValue() + "-0" + cliente.getFecha_nacimiento().getDayOfMonth();

		}
		textFechaNacimiento.setText(fechaString);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(405, 36, 349, 29);
		panel_1.add(textTelefono);
		textTelefono.setText(String.valueOf(cliente.getTelefono()));

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(new Color(255, 255, 255));
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTelefono.setBounds(405, 12, 166, 14);
		panel_1.add(lblTelefono);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(405, 116, 349, 29);
		panel_1.add(textCorreo);
		textCorreo.setText(cliente.getCorreo());
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(new Color(255, 255, 255));
		lblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCorreo.setBounds(405, 95, 166, 14);
		panel_1.add(lblCorreo);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(405, 200, 349, 29);
		panel_1.add(textDireccion);
		textDireccion.setText(cliente.getDireccion());

		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setForeground(new Color(255, 255, 255));
		lblDireccion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDireccion.setBounds(405, 179, 166, 14);
		panel_1.add(lblDireccion);
		
		JLabel lblTipoDeCliente = new JLabel("Tipo de Cliente");
		lblTipoDeCliente.setForeground(new Color(255, 255, 255));
		lblTipoDeCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTipoDeCliente.setBounds(405, 253, 166, 14);
		panel_1.add(lblTipoDeCliente);
		
		JComboBox cbTipoCliente = new JComboBox();
		cbTipoCliente.setBounds(405, 278, 349, 26);
		panel_1.add(cbTipoCliente);
		cbTipoCliente.addItem("Propietario");

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setForeground(Color.LIGHT_GRAY);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(48, 109, 105));
		btnModificar.setBounds(637, 328, 117, 29);
		panel_1.add(btnModificar);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setNombre(textNombre.getText());
				cliente.setApellido(textApellido.getText());
				cliente.setDni(Integer.parseInt(textDni.getText()));
				cliente.setFecha_nacimiento(LocalDate.parse(textFechaNacimiento.getText()));
				cliente.setTelefono(Integer.parseInt(textTelefono.getText()));
				cliente.setCorreo(textCorreo.getText());
				cliente.setDireccion(textDireccion.getText());
				
				propietariocont.updatePropietario(cliente);
				JOptionPane.showMessageDialog(null, "Modificacion exitosa");
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(10, 328, 117, 26);
		panel_1.add(btnVolver);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(133, 201, 196));
		panel_1_1.setBounds(10, 8, 764, 55);
		contentPane.add(panel_1_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Modificar Cliente Propietario\r\n\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1_1.add(lblGestorPropiedades_1);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCliente pantallacliente =  new PantallaCliente();
				dispose();
			}
		});
	}
}
