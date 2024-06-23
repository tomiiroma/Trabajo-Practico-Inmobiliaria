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
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 72, 827, 2);
		contentPane.add(separator);
		
		
		JLabel lblMontoerror = new JLabel("El monto debe ser un valor irracional mayor a 10000");
		lblMontoerror.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMontoerror.setForeground(new Color(128, 0, 0));
		lblMontoerror.setBounds(517, 571, 357, 14);
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
		btnModificarEmpleado.setForeground(Color.WHITE);
		btnModificarEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificarEmpleado.setBorder(null);
		btnModificarEmpleado.setBackground(new Color(48, 109, 105));
		btnModificarEmpleado.setBounds(517, 391, 232, 37);
		contentPane.add(btnModificarEmpleado);
		
		JButton btnInmueble = new JButton("Seleccionar");
		btnInmueble.setForeground(Color.WHITE);
		btnInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInmueble.setBorder(null);
		btnInmueble.setBackground(new Color(48, 109, 105));
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
		lblInmueble.setForeground(new Color(255, 255, 255));
		lblInmueble.setBounds(145, 138, 729, 20);
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
		btnModificarInmueble.setForeground(Color.WHITE);
		btnModificarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificarInmueble.setBorder(null);
		btnModificarInmueble.setBackground(new Color(48, 109, 105));
		btnModificarInmueble.setBounds(517, 159, 232, 37);
		contentPane.add(btnModificarInmueble);
		
		
		JLabel lblNewLabel_2 = new JLabel("Inmueble");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(145, 107, 156, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cliente");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(145, 223, 156, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblCliente = new JLabel("Seleccionado:");
		lblCliente.setForeground(new Color(255, 255, 255));
		lblCliente.setBounds(145, 254, 739, 20);
		contentPane.add(lblCliente);
		
		JButton btnCliente = new JButton("Seleccionar");
		btnCliente.setForeground(Color.WHITE);
		btnCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCliente.setBorder(null);
		btnCliente.setBackground(new Color(48, 109, 105));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					
				SelectorCliente = new ReservaCliente(inmueble,cliente,empleado);
					
				
				
				SelectorCliente.setLocationRelativeTo(null);
				
				SelectorCliente.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnCliente.setBounds(145, 274, 232, 37);
		contentPane.add(btnCliente);
		
		JLabel lblNewLabel_2_2 = new JLabel("Empleado");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(145, 340, 156, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblEmpleado = new JLabel("Seleccionado:");
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmpleado.setForeground(new Color(255, 255, 255));
		lblEmpleado.setBounds(145, 371, 739, 20);
		contentPane.add(lblEmpleado);
		
		JButton btnEmpleado = new JButton("Seleccionar");
		btnEmpleado.setForeground(Color.WHITE);
		btnEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEmpleado.setBorder(null);
		btnEmpleado.setBackground(new Color(48, 109, 105));
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
		btnModificarCliente.setForeground(Color.WHITE);
		btnModificarCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificarCliente.setBorder(null);
		btnModificarCliente.setBackground(new Color(48, 109, 105));
		btnModificarCliente.setBounds(517, 274, 232, 37);
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
		
		
		
						
	
		btnEmpleado.setBounds(140, 391, 232, 37);
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
		btnCliente_1_1.setForeground(Color.WHITE);
		btnCliente_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCliente_1_1.setBorder(null);
		btnCliente_1_1.setBackground(new Color(48, 109, 105));
		btnCliente_1_1.setBounds(49, 696, 232, 37);
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
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(67, 554, 97, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monto:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(432, 557, 87, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Forma de pago:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(67, 632, 87, 20);
		contentPane.add(lblNewLabel_5);
		
	    comboBoxOperacion = new JComboBox<String>();
		comboBoxOperacion.setBackground(new Color(255, 255, 255));
		comboBoxOperacion.setBounds(517, 615, 208, 37);
		contentPane.add(comboBoxOperacion);
		
		
		comboBoxOperacion.addItem("Venta");
		comboBoxOperacion.addItem("Alquiler");
		
		JLabel lblNewLabel_6 = new JLabel("Operacion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(432, 632, 87, 20);
		contentPane.add(lblNewLabel_6);
		
		
		JButton RegistrarReserva = new JButton("Registrar");
		RegistrarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pago = inpMonto.getText(), ValidarMonto = "",tipo_reserva = "",forma="";
				double Montofinal=0;
				
				
				try {
					
				
					
					ValidarMonto = ValidarPrecio(Montofinal = Double.parseDouble(pago));
					
				
				
				LocalDate fecha = LocalDate.now();
				
				forma = (String) comboBoxFormaPago.getSelectedItem();
				
				tipo_reserva = (String) comboBoxOperacion.getSelectedItem();

				if (inmueble != null && cliente != null && empleado != null && (!ValidarMonto.equalsIgnoreCase("No se ingreso ningun precio") && !ValidarMonto.equalsIgnoreCase("error se esta intentado ingresar un caracter especial") && !ValidarMonto.equalsIgnoreCase("El monto debe ser mayor a 10000"))) {
					
					
					
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
					
					if (ValidarMonto.equalsIgnoreCase("El monto debe ser mayor a 10000") || ValidarMonto.equalsIgnoreCase("No se ingreso ningun precio") || ValidarMonto.equalsIgnoreCase("error se esta intentado ingresar un caracter especial")){
						
						
						lblMontoerror.setVisible(true);
						
						
					}
						
					
					
					
					
				}
				
				} catch (Exception e2) {
					
					lblMontoerror.setVisible(true);
					
					
				}
				
				
			}
		});
		RegistrarReserva.setForeground(Color.WHITE);
		RegistrarReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		RegistrarReserva.setBorder(null);
		RegistrarReserva.setBackground(new Color(48, 109, 105));
		RegistrarReserva.setBounds(605, 697, 232, 37);
		contentPane.add(RegistrarReserva);
		

		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(128, 255, 0));
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(49, 123, 35, 361);
		contentPane.add(progressBar);
		
		pruebasbarra(progressBar,progresoI,progresoC,progresoE,cliente,empleado,inmueble);
		
		lblInst = new JLabel("Debes completar los campos Inmueble, cliente y empleado antes");
		lblInst.setForeground(new Color(255, 255, 255));
		lblInst.setHorizontalAlignment(SwingConstants.CENTER);
		lblInst.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInst.setBounds(145, 464, 605, 26);
		contentPane.add(lblInst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(28, 11, 827, 56);
		contentPane.add(panel_1);
		
		JLabel lblMenuReservas = new JLabel("Menu Reservas\r\n");
		lblMenuReservas.setForeground(Color.WHITE);
		lblMenuReservas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblMenuReservas.setBounds(10, 12, 661, 35);
		panel_1.add(lblMenuReservas);
		
		
		
		
		
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