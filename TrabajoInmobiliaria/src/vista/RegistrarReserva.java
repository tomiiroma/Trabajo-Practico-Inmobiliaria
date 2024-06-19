package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ReservaControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Reserva;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class RegistrarReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private OpcionesReserva MenuPrincipalReserva;
	private ReservaEmpleado SelectorEmpleado;
	private ReservaCliente SelectorCliente;
	private ReservaInmueble SelectorInmueble;
	private Gerente gerente;
	private ReservaControlador controladorR;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public RegistrarReserva(Inmueble inmueble,Cliente cliente,Empleado empleado) {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Reserva");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setBounds(345, 0, 539, 74);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 72, 827, 2);
		contentPane.add(separator);
		
		
		JButton btnModificarEmpleado = new JButton("Modificar");
		btnModificarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnModificarEmpleado.setBounds(517, 437, 232, 37);
		contentPane.add(btnModificarEmpleado);
		
		JButton btnInmueble = new JButton("Seleccionar");
		btnInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
if (SelectorInmueble == null) {
					
					
					SelectorInmueble = new ReservaInmueble(inmueble,cliente,empleado);
					
				}
				
				SelectorInmueble.setLocationRelativeTo(null);
				
				SelectorInmueble.setVisible(true);
				
				dispose();
				
			}
		});
		btnInmueble.setBounds(145, 159, 232, 37);
		contentPane.add(btnInmueble);
		
		JLabel lblInmueble = new JLabel("Seleccionado:");
		lblInmueble.setBounds(145, 116, 729, 32);
		contentPane.add(lblInmueble);
		
		
		JButton btnModificarInmueble = new JButton("Modificar");
		btnModificarInmueble.setBounds(517, 159, 232, 37);
		contentPane.add(btnModificarInmueble);
		
		
		JLabel lblNewLabel_2 = new JLabel("Inmueble");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(400, 85, 156, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cliente");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(400, 235, 156, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblCliente = new JLabel("Seleccionado:");
		lblCliente.setBounds(145, 266, 739, 32);
		contentPane.add(lblCliente);
		
		JButton btnCliente = new JButton("Seleccionar");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SelectorCliente == null) {
					
					
					SelectorCliente = new ReservaCliente(inmueble,cliente,empleado);
					
				}
				
				SelectorCliente.setLocationRelativeTo(null);
				
				SelectorCliente.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnCliente.setBounds(145, 309, 232, 37);
		contentPane.add(btnCliente);
		
		JLabel lblNewLabel_2_2 = new JLabel("Empleado");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(391, 367, 156, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblEmpleado = new JLabel("Seleccionado:");
		lblEmpleado.setBounds(145, 394, 739, 32);
		contentPane.add(lblEmpleado);
		
		JButton btnEmpleado = new JButton("Seleccionar");
		btnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			if (SelectorEmpleado == null) {
				
				
				SelectorEmpleado = new ReservaEmpleado(inmueble,cliente,empleado);
				
				
			}
				
			SelectorEmpleado.setLocationRelativeTo(null);
			
			SelectorEmpleado.setVisible(true);
			
			dispose();
				
				
			}
		});
		
		JButton btnModificarCliente = new JButton("Modificar");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (SelectorCliente == null) {
					
					SelectorCliente = new ReservaCliente(inmueble,cliente,empleado);
					
				}
			

				SelectorCliente.setLocationRelativeTo(null);
				
				SelectorCliente.setVisible(true);
				
				dispose();
				
				
				
				
				
				
				
			}
		});
		btnModificarCliente.setBounds(517, 309, 232, 37);
		contentPane.add(btnModificarCliente);
		
		
		if (inmueble == null) {
			
			lblInmueble.setText("No se ha seleccionado ningun inmueble");
			btnModificarInmueble.setEnabled(false);
			btnInmueble.setEnabled(true);
			
			
			
		} else {
			
			
			lblInmueble.setText("Inmueble seleccionado: Dirección: " + inmueble.getDireccion() + ", Altura: " + inmueble.getAlturaDireccion() + ", Tipo de inmueble" + inmueble.getTipo_inmueble() );
			btnModificarInmueble.setEnabled(true);
			btnInmueble.setEnabled(false);
			
		}
		
		
		
		if (empleado == null) {
			
			
			lblEmpleado.setText("No se ha seleccionado ningun empleado");
			btnModificarEmpleado.setEnabled(false);
			btnEmpleado.setEnabled(true);
		} else {
			
			
			lblEmpleado.setText("Empleado seleccionado: " +empleado.getNombre() + ", Apellido: "+ empleado.getApellido() + ", DNI: "+empleado.getDni() + ", Tipo de empleado: "+empleado.getTipo_empleado());
			btnEmpleado.setEnabled(false);
			btnModificarEmpleado.setEnabled(true);
		
		}
		
		
		if (cliente == null) {
			
			lblCliente.setText("No se ha seleccionado ningun Cliente");
			btnModificarCliente.setEnabled(false);
			btnCliente.setEnabled(true);
			
			
		} else {
			
			lblCliente.setText("Cliente seleccionado: " + cliente.getNombre() + ", Apellido: "+cliente.getApellido() + ", DNI: " +cliente.getDni());
			btnModificarCliente.setEnabled(true);
			btnCliente.setEnabled(false);
			
		}
		
		
						
	
		btnEmpleado.setBounds(140, 437, 232, 37);
		contentPane.add(btnEmpleado);
		
		JButton btnCliente_1_1 = new JButton("Volver");
		btnCliente_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (MenuPrincipalReserva == null) {
					
					MenuPrincipalReserva = new OpcionesReserva();
					
				}
				
			
				MenuPrincipalReserva.setLocationRelativeTo(null);
				
				MenuPrincipalReserva.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnCliente_1_1.setBounds(145, 687, 232, 37);
		contentPane.add(btnCliente_1_1);
		
		textField = new JTextField();
		textField.setBounds(163, 534, 208, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(618, 534, 208, 37);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha pago:");
		lblNewLabel_3.setBounds(60, 534, 97, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monto:");
		lblNewLabel_4.setBounds(521, 534, 87, 37);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 615, 208, 37);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Forma de pago:");
		lblNewLabel_5.setBounds(60, 615, 87, 37);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(618, 615, 208, 37);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Operacion");
		lblNewLabel_6.setBounds(521, 615, 87, 37);
		contentPane.add(lblNewLabel_6);
		
		
		JButton RegistrarReserva = new JButton("Registrar");
		RegistrarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (inmueble != null && cliente != null && empleado != null) {
					
					if (controladorR == null) {
						
						controladorR = new ReservaControlador();
						
					}
					
					
				 LocalDate fecha = LocalDate.now();
				 
				 Double monto = 3000.0;
				 
				 String forma = "Efectivo";
				 
				 String tipo_reserva = "Venta";
					
				 controladorR.addReserva(new Reserva(inmueble,cliente,fecha,monto,forma,empleado,tipo_reserva));
					
//				 inmueble,cliente2,fecha_pago2,montovalidado,forma_pago,empleado2,tipo_reserva
				 
				} else {
					
					
					JOptionPane.showMessageDialog(null, "Error");
					
					
				}
				
				
				
			}
		});
		RegistrarReserva.setBounds(474, 687, 232, 37);
		contentPane.add(RegistrarReserva);
		
		
		
	}
}
