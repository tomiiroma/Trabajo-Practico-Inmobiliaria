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
import trabajoInmobiliaria.Validacion;

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
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class RegistrarReserva extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFecha;
	private JTextField inpMonto;
	private OpcionesReserva MenuPrincipalReserva;
	private ReservaEmpleado SelectorEmpleado;
	private ReservaCliente SelectorCliente;
	private ReservaInmueble SelectorInmueble;
	private ReservaControlador controladorR;
	private Empleado empleadonuevo;
	private ReservaRegistrada registrada;
	private JComboBox<String> comboBoxFormaPago,comboBoxOperacion;
	private JLabel lblInst;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public RegistrarReserva(Inmueble inmueble,Cliente cliente,Empleado empleado) {
		
		boolean progresoI = false, progresoC = false, progresoE = false;
		
		
		
			
			empleadonuevo = new Empleado();
			
			
		
		
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
		
		
		JLabel lblMontoerror = new JLabel("El monto debe ser un valor irracional mayor a 10000");
		lblMontoerror.setForeground(new Color(255, 0, 0));
		lblMontoerror.setBounds(517, 509, 298, 14);
		contentPane.add(lblMontoerror);
		lblMontoerror.setVisible(false);
		
		
		JButton btnModificarEmpleado = new JButton("Modificar");
		btnModificarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			SelectorEmpleado = new ReservaEmpleado(inmueble,cliente,empleado);
				
			
			
				
			SelectorEmpleado.setLocationRelativeTo(null);
			
			SelectorEmpleado.setVisible(true);
			
			dispose();
			
			
				
			}
		});
		btnModificarEmpleado.setBounds(517, 437, 232, 37);
		contentPane.add(btnModificarEmpleado);
		
		JButton btnInmueble = new JButton("Seleccionar");
		btnInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
			
					
					
				SelectorInmueble = new ReservaInmueble(inmueble,cliente,empleado);
					
				
				
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
		btnModificarInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					
					SelectorInmueble = new ReservaInmueble(inmueble,cliente,empleado);
					
													
			

					SelectorInmueble.setLocationRelativeTo(null);
				
					SelectorInmueble.setVisible(true);
				
					dispose();
				
				
			}
		});
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
				
				
					
					
				SelectorCliente = new ReservaCliente(inmueble,cliente,empleado);
					
				
				
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
				
				
		
				
				
			SelectorEmpleado = new ReservaEmpleado(inmueble,cliente,empleado);
				
				
			
				
			SelectorEmpleado.setLocationRelativeTo(null);
			
			SelectorEmpleado.setVisible(true);
			
			dispose();
				
				
			}
		});
		
		JButton btnModificarCliente = new JButton("Modificar");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
					
				SelectorCliente = new ReservaCliente(inmueble,cliente,empleado);
					
				
			

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
			progresoI = false;			
			
		} else {
			
			
			lblInmueble.setText("Inmueble seleccionado: Dirección: " + inmueble.getDireccion() + ", Altura: " + inmueble.getAlturaDireccion() + ", Tipo de inmueble" + inmueble.getTipo_inmueble() );
			btnModificarInmueble.setEnabled(true);
			btnInmueble.setEnabled(false);
			progresoI = true;
			
		}
		
		
		
		if (empleado == null) {
			
			
			lblEmpleado.setText("No se ha seleccionado ningun empleado");
			btnModificarEmpleado.setEnabled(false);
			btnEmpleado.setEnabled(true);
			progresoE = false;
			
		} else {
			
			
			lblEmpleado.setText("Empleado seleccionado: " +empleado.getNombre() + ", Apellido: "+ empleado.getApellido() + ", DNI: "+empleado.getDni() + ", Tipo de empleado: "+empleado.getTipo_empleado());
			btnEmpleado.setEnabled(false);
			btnModificarEmpleado.setEnabled(true);
			progresoE = true;
			
		}
		
		
		if (cliente == null) {
			
			lblCliente.setText("No se ha seleccionado ningun Cliente");
			btnModificarCliente.setEnabled(false);
			btnCliente.setEnabled(true);
			progresoC = false;
			
		} else {
			
			lblCliente.setText("Cliente seleccionado: " + cliente.getNombre() + ", Apellido: "+cliente.getApellido() + ", DNI: " +cliente.getDni());
			btnModificarCliente.setEnabled(true);
			btnCliente.setEnabled(false);
			progresoC = true;
			
		}
		
		
		
						
	
		btnEmpleado.setBounds(140, 437, 232, 37);
		contentPane.add(btnEmpleado);
		
		JButton btnCliente_1_1 = new JButton("Volver");
		btnCliente_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					MenuPrincipalReserva = new OpcionesReserva();
					
				
				
			
				MenuPrincipalReserva.setLocationRelativeTo(null);
				
				MenuPrincipalReserva.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnCliente_1_1.setBounds(145, 687, 232, 37);
		contentPane.add(btnCliente_1_1);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(163, 534, 208, 37);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		txtFecha.setText("La fecha es la del día de hoy.");
		txtFecha.setEnabled(false);
		
		comboBoxFormaPago = new JComboBox<String>();
		comboBoxFormaPago.setBackground(new Color(255, 255, 255));
		comboBoxFormaPago.setBounds(163, 615, 208, 37);
		contentPane.add(comboBoxFormaPago);
		
		comboBoxFormaPago.addItem("Efectivo");
		
		
		inpMonto = new JTextField();
		inpMonto.setColumns(10);
		inpMonto.setBounds(517, 534, 208, 37);
		contentPane.add(inpMonto);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha pago:");
		lblNewLabel_3.setBounds(60, 534, 97, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monto:");
		lblNewLabel_4.setBounds(432, 534, 87, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Forma de pago:");
		lblNewLabel_5.setBounds(60, 615, 87, 37);
		contentPane.add(lblNewLabel_5);
		
	    comboBoxOperacion = new JComboBox<String>();
		comboBoxOperacion.setBackground(new Color(255, 255, 255));
		comboBoxOperacion.setBounds(517, 615, 208, 37);
		contentPane.add(comboBoxOperacion);
		
		
		comboBoxOperacion.addItem("Venta");
		comboBoxOperacion.addItem("Alquiler");
		
		JLabel lblNewLabel_6 = new JLabel("Operacion");
		lblNewLabel_6.setBounds(432, 615, 87, 37);
		contentPane.add(lblNewLabel_6);
		
		
		JButton RegistrarReserva = new JButton("Registrar");
		RegistrarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pago = inpMonto.getText(), ValidarMonto = "",tipo_reserva = "",forma="";
				double Montofinal=0;
				
				
				try {
					
					Montofinal = Double.parseDouble(pago);
					ValidarMonto = ValidarPrecio(Montofinal);
					
				} catch (Exception e2) {
					
					lblMontoerror.setVisible(true);
					
				}
				
				if (ValidarMonto.equalsIgnoreCase("No se ingreso ningun precio") || ValidarMonto.equalsIgnoreCase("error se esta intentado ingresar un caracter especial")) {
					
					lblMontoerror.setVisible(true);
					
				}
				
				LocalDate fecha = LocalDate.now();
				
				forma = (String) comboBoxFormaPago.getSelectedItem();
				
				tipo_reserva = (String) comboBoxOperacion.getSelectedItem();

				if (inmueble != null && cliente != null && empleado != null && (!ValidarMonto.equalsIgnoreCase("No se ingreso ningun precio") || !ValidarMonto.equalsIgnoreCase("error se esta intentado ingresar un caracter especial"))) {
					
					if (controladorR == null) {
						
						controladorR = new ReservaControlador();
						
						empleadonuevo.RealizarReserva(inmueble,empleado,cliente,fecha,Montofinal,forma,tipo_reserva);
						
						registrada = new ReservaRegistrada();
						
						registrada.setLocationRelativeTo(null);
						
						registrada.setVisible(true);
						
						dispose();
						
					}
					
				 
				} else {
					
					if (cliente == null) {
						
						lblCliente.setForeground(Color.red);
						
					}  
					
					if (empleado==null) {
						
						lblEmpleado.setForeground(Color.red);
						
						
					} 
					
					if (inmueble==null) {
						
						lblInmueble.setForeground(Color.red);
						
					} 
						
					
					
					
					
				}
				
				
				
			}
		});
		RegistrarReserva.setBounds(528, 687, 232, 37);
		contentPane.add(RegistrarReserva);
		

		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(128, 255, 0));
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(49, 123, 35, 361);
		contentPane.add(progressBar);
		
		pruebasbarra(progressBar,progresoI,progresoC,progresoE,cliente,empleado,inmueble);
		
		lblInst = new JLabel("Debes completar los campos Inmueble, cliente y empleado antes");
		lblInst.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInst.setBounds(202, 490, 547, 26);
		contentPane.add(lblInst);
		
		
		
		
		
	}
	
	
	
	private void pruebasbarra(JProgressBar progressBar,boolean progreso0,boolean progreso1,boolean progreso2, Cliente cliente,Empleado empleado,Inmueble inmueble) {
		
		   int progreso = 0;

		    if (progreso0) {
		        progreso = progreso + 33;
		    }
		    if (progreso1) {
		        progreso = progreso + 33;
		    }
		    if (progreso2) {
		        progreso = progreso + 34;
		    }

		    
		    if (cliente == null || empleado == null || inmueble == null) {
				
				inpMonto.setEnabled(false);
				comboBoxFormaPago.setEnabled(false);
				comboBoxOperacion.setEnabled(false);
				
				
			}
		    
		    
		    final int progresoFinal = progreso;
		    
		    SwingUtilities.invokeLater(new Runnable() {
		        public void run() {
		            progressBar.setValue(progresoFinal);
		            
		            if (cliente == null || empleado == null || inmueble == null) {
						
						inpMonto.setEnabled(false);
						comboBoxFormaPago.setEnabled(false);
						comboBoxOperacion.setEnabled(false);
						lblInst.setVisible(true);
						
						
					} else {
						
						inpMonto.setEnabled(true);
						comboBoxFormaPago.setEnabled(true);
						comboBoxOperacion.setEnabled(true);
						lblInst.setVisible(false);
					}
		            
		            
		        }
		    											});
																												}
	}