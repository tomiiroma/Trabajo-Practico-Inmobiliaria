package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.ControladorCliente;
import controlador.ControladorEmpleado;
import controlador.InmuebleControlador;
import controlador.ReservaControlador;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Reserva;

public class ListaReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpBusqReserva;
	private JTextField inpBusqCliente;
	private JTextField inpBusqInmueble;
	private JTable tablaReserva;
	private DefaultTableModel modeloReserva;
	private ReservaControlador controladorReserva;
	private OpcionesReserva VolverMenu;
	private Reserva reservaseleccionada;
	private ControladorEmpleado empleadoselec;
	private ControladorCliente clienteselec;
	private InmuebleControlador inmuebleselec;
	private VerReserva verDetalles;
	private JComboBox<String> comboBoxOperacion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaReserva frame = new ListaReserva();
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
	public ListaReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 675);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
			
			controladorReserva = new ReservaControlador();
			
		
	
			
			
			reservaseleccionada = new Reserva();
			
		
		
		
			
			empleadoselec = new ControladorEmpleado();
			
		
		
		
			
			clienteselec = new ControladorCliente();
			
		
		
		
			
			inmuebleselec = new InmuebleControlador();
			
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 47, 884, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -23, 884, 87);
		panel.add(tabbedPane);
		
		JButton btnReserva = new JButton("ID reserva");
		btnReserva.setForeground(Color.WHITE);
		btnReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReserva.setBorder(null);
		btnReserva.setBackground(new Color(48, 109, 105));
		
		JButton btnIdCliente = new JButton("ID Cliente");
		btnIdCliente.setForeground(Color.WHITE);
		btnIdCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIdCliente.setBorder(null);
		btnIdCliente.setBackground(new Color(48, 109, 105));
		
		JButton btnIdInmueble = new JButton("ID inmueble");
		btnIdInmueble.setForeground(Color.WHITE);
		btnIdInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIdInmueble.setBorder(null);
		btnIdInmueble.setBackground(new Color(48, 109, 105));
		
		JButton btnOperacion = new JButton("Operacion");
		btnOperacion.setForeground(Color.WHITE);
		btnOperacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOperacion.setBorder(null);
		btnOperacion.setBackground(new Color(48, 109, 105));
		
		if (tabbedPane.getSelectedIndex() == -1) {
			
			btnReserva.setForeground(Color.blue);
			
		}
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("Filtrar por ID reserva", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblBusquedaReserva = new JLabel("Ingresar el id de la reserva:");
		lblBusquedaReserva.setForeground(new Color(255, 255, 255));
		lblBusquedaReserva.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusquedaReserva.setBounds(100, 13, 192, 26);
		panel_1.add(lblBusquedaReserva);
		
		inpBusqReserva = new JTextField();
		inpBusqReserva.setBounds(290, 15, 221, 26);
		panel_1.add(inpBusqReserva);
		inpBusqReserva.setColumns(10);
		
		JButton btnBuscarReserva = new JButton("Buscar");
		btnBuscarReserva.setForeground(Color.WHITE);
		btnBuscarReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarReserva.setBorder(null);
		btnBuscarReserva.setBackground(new Color(48, 109, 105));
		btnBuscarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuscarReservaID();
			
			
			}
		});
		btnBuscarReserva.setBounds(535, 15, 113, 26);
		panel_1.add(btnBuscarReserva);
		
		JButton btnResetReserv = new JButton("Reset");
		btnResetReserv.setForeground(Color.WHITE);
		btnResetReserv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResetReserv.setBorder(null);
		btnResetReserv.setBackground(new Color(48, 109, 105));
		btnResetReserv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MostrarTabla();
			}
		});
		btnResetReserv.setBounds(670, 15, 109, 26);
		panel_1.add(btnResetReserv);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblBusquedaCliente = new JLabel("Ingresar el id del cliente:");
		lblBusquedaCliente.setForeground(new Color(255, 255, 255));
		lblBusquedaCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusquedaCliente.setBounds(100, 13, 192, 26);
		panel_3.add(lblBusquedaCliente);
		
		

		inpBusqCliente = new JTextField();
		inpBusqCliente.setColumns(10);
		inpBusqCliente.setBounds(290, 15, 221, 26);
		panel_3.add(inpBusqCliente);
		
		JButton btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.setForeground(Color.WHITE);
		btnBuscarCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarCliente.setBorder(null);
		btnBuscarCliente.setBackground(new Color(48, 109, 105));
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuscarClienteID();
				
			}
		});
		btnBuscarCliente.setBounds(535, 15, 113, 26);
		panel_3.add(btnBuscarCliente);
		
		JButton btnResetCliente = new JButton("Reset");
		btnResetCliente.setForeground(Color.WHITE);
		btnResetCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResetCliente.setBorder(null);
		btnResetCliente.setBackground(new Color(48, 109, 105));
		btnResetCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MostrarTabla();
				
			}
		});
		btnResetCliente.setBounds(670, 15, 109, 26);
		panel_3.add(btnResetCliente);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblBusquedaInmueble = new JLabel("Ingresar el id del inmueble:");
		lblBusquedaInmueble.setForeground(new Color(255, 255, 255));
		lblBusquedaInmueble.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusquedaInmueble.setBounds(100, 13, 192, 26);
		panel_4.add(lblBusquedaInmueble);
		
		inpBusqInmueble = new JTextField();
		inpBusqInmueble.setColumns(10);
		inpBusqInmueble.setBounds(290, 15, 221, 26);
		panel_4.add(inpBusqInmueble);
		
		JButton btnBuscarInmueble = new JButton("Buscar");
		btnBuscarInmueble.setForeground(Color.WHITE);
		btnBuscarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarInmueble.setBorder(null);
		btnBuscarInmueble.setBackground(new Color(48, 109, 105));
		btnBuscarInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MostrarInmuebleID();
				
			}
		});
		btnBuscarInmueble.setBounds(535, 15, 113, 26);
		panel_4.add(btnBuscarInmueble);
		
		JButton btnResetInmueble = new JButton("Reset");
		btnResetInmueble.setForeground(Color.WHITE);
		btnResetInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResetInmueble.setBorder(null);
		btnResetInmueble.setBackground(new Color(48, 109, 105));
		btnResetInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MostrarTabla();
				
			}
		});
		btnResetInmueble.setBounds(670, 15, 109, 26);
		panel_4.add(btnResetInmueble);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblBusqOperacion = new JLabel("Seleccionar el tipo de operacion:");
		lblBusqOperacion.setForeground(new Color(255, 255, 255));
		lblBusqOperacion.setBackground(new Color(255, 255, 255));
		lblBusqOperacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusqOperacion.setBounds(56, 13, 236, 26);
		panel_5.add(lblBusqOperacion);
		
		JButton btnBuscarOperacion = new JButton("Buscar");
		btnBuscarOperacion.setForeground(Color.WHITE);
		btnBuscarOperacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarOperacion.setBorder(null);
		btnBuscarOperacion.setBackground(new Color(48, 109, 105));
		btnBuscarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuscarOperacion();
				
			}
		});
		btnBuscarOperacion.setBounds(535, 15, 113, 26);
		panel_5.add(btnBuscarOperacion);
		
		JButton btnResetOperacion = new JButton("Reset");
		btnResetOperacion.setForeground(Color.WHITE);
		btnResetOperacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResetOperacion.setBorder(null);
		btnResetOperacion.setBackground(new Color(48, 109, 105));
		
		btnResetOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MostrarTabla();
				
			}
		});
		btnResetOperacion.setBounds(670, 15, 109, 26);
		panel_5.add(btnResetOperacion);
		
		comboBoxOperacion = new JComboBox<String>();
		comboBoxOperacion.setBackground(new Color(255, 255, 255));
		comboBoxOperacion.setBounds(290, 15, 221, 26);
		panel_5.add(comboBoxOperacion);
		
		comboBoxOperacion.addItem("Venta");
		comboBoxOperacion.addItem("Alquiler");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 884, 46);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(0);
				
				if (tabbedPane.getSelectedIndex() == 0) {
					
					
					btnReserva.setForeground(Color.blue);
					btnIdCliente.setForeground(Color.black);
					btnIdInmueble.setForeground(Color.black);
					btnOperacion.setForeground(Color.black);
				} 
				
				
				
			}
		});
		
		
		
		
		btnReserva.setBounds(0, 0, 221, 46);
		panel_2.add(btnReserva);
		
		btnOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				tabbedPane.setSelectedIndex(3);
				
				if (tabbedPane.getSelectedIndex()==3) {
					
					btnIdCliente.setForeground(Color.black);
					btnReserva.setForeground(Color.black);
					btnIdInmueble.setForeground(Color.black);
					btnOperacion.setForeground(Color.blue);
					
				}
				
				
			}
		});
		btnOperacion.setBounds(664, 0, 220, 46);
		panel_2.add(btnOperacion);
		
		btnIdInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				tabbedPane.setSelectedIndex(2);
				
				if (tabbedPane.getSelectedIndex() == 2) {
					
					btnIdCliente.setForeground(Color.black);
					btnReserva.setForeground(Color.black);
					btnIdInmueble.setForeground(Color.blue);
					btnOperacion.setForeground(Color.black);
					
					
				}
				
				
			}
		});
		
		
		btnIdInmueble.setBounds(443, 0, 220, 46);
		panel_2.add(btnIdInmueble);
		
		btnIdCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			tabbedPane.setSelectedIndex(1);
			
			if (tabbedPane.getSelectedIndex() == 1) {
				
				btnIdCliente.setForeground(Color.blue);
				btnReserva.setForeground(Color.black);
				btnIdInmueble.setForeground(Color.black);
				btnOperacion.setForeground(Color.black);
				
			}
			
			
			
			}
		});
		
		btnIdCliente.setBounds(222, 0, 220, 46);
		panel_2.add(btnIdCliente);
		
		JLabel lblNewLabel_2 = new JLabel("Reservas");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel_2.setBounds(384, 110, 500, 53);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 169, 820, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 569, 820, 2);
		contentPane.add(separator_1);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					VolverMenu = new OpcionesReserva();
					
				
				
				VolverMenu.setLocationRelativeTo(null);
				
				VolverMenu.setVisible(true);
				
				dispose();
				
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(31, 582, 107, 46);
		contentPane.add(btnVolver);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 182, 820, 363);
		contentPane.add(scrollPane);
		
		
		String [] ColumnasReserva = {"Id reserva","Id inmueble","Id cliente","Fecha_operacion","Monto","Forma de pago","Empleado","Tipo de reserva"};
		modeloReserva = new DefaultTableModel(ColumnasReserva,0);
		tablaReserva = new JTable(modeloReserva);
		scrollPane.setViewportView(tablaReserva);
		
		JButton btnSeleccionar = new JButton("Detalles");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (reservaseleccionada.getId_reserva()!=0) {
					
					if (verDetalles == null) {
						
						verDetalles = new VerReserva(reservaseleccionada);
						
					}
					
				
				verDetalles.setLocationRelativeTo(null);
				
				verDetalles.setVisible(true);
				
				dispose();
				} else {
					
					JOptionPane.showMessageDialog(null, "Debes seleccionar una reserva");
					
				}
				
				
				
			}
		});
		btnSeleccionar.setForeground(Color.WHITE);
		btnSeleccionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSeleccionar.setBorder(null);
		btnSeleccionar.setBackground(new Color(48, 109, 105));
		btnSeleccionar.setBounds(744, 583, 107, 46);
		contentPane.add(btnSeleccionar);
		MostrarTabla();
		
		
		
		 ListSelectionModel selectionModelReserva= tablaReserva.getSelectionModel();
			
		 selectionModelReserva.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


		
		 selectionModelReserva.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tablaReserva.getSelectedRow();
                    if (selectedRow != -1) {
                    	int id = (int) tablaReserva.getValueAt(selectedRow, 0);
                        int id_inmueble = (int) tablaReserva.getValueAt(selectedRow, 1);
                        int id_cliente = (int) tablaReserva.getValueAt(selectedRow, 2);	           
                        LocalDate Fecha_pago = (LocalDate) tablaReserva.getValueAt(selectedRow, 3);
                        double Pago = (double) tablaReserva.getValueAt(selectedRow, 4);
                        String Forma_pago = (String) tablaReserva.getValueAt(selectedRow, 5);
                        int id_empleado = (int) tablaReserva.getValueAt(selectedRow, 6);
                        String Tipo_reserva = (String) tablaReserva.getValueAt(selectedRow, 7);                                 
                       
                                              
                        reservaseleccionada.setId_reserva(id);
                        reservaseleccionada.setInmueble(inmuebleselec.getInmuebleById(id_inmueble));
                        reservaseleccionada.setCliente(clienteselec.getClienteById(id_cliente));
                        reservaseleccionada.setFecha_pago(Fecha_pago);
                        reservaseleccionada.setPago(Pago);
                        reservaseleccionada.setForma_pago(Forma_pago);
                        reservaseleccionada.setEmpleado(empleadoselec.getEmpleadoById(id_empleado));
                        reservaseleccionada.setTipo_reserva(Tipo_reserva);
                        
                      
                    }
                }
            }
        });
		
		
		
		
		
		
	}
	
	
	public void MostrarTabla() {
		
		modeloReserva.setRowCount(0);
		
		List<Reserva> reservas = controladorReserva.getAllReserva();
		
		for (Reserva reserva : reservas) {
			
			modeloReserva.addRow( 
					
					new Object[] {
							
					
					reserva.getId_reserva(),
					reserva.getInmueble().getId_inmueble(),
					reserva.getCliente().getId_cliente(),
					reserva.getFecha_pago(),
					reserva.getPago(),
					reserva.getForma_pago(),
					reserva.getEmpleado().getId_empleado(),
					reserva.getTipo_reserva()
			
					}
					);
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	private void MostrarInmuebleID() {
		  int contador=0, id_reserva=0;
		  boolean flag=true;
		  
		  modeloReserva.setRowCount(0);

		  List<Reserva> reservas = controladorReserva.getAllReserva();
	        
	        try {
	        	
	        	id_reserva = Integer.parseInt(inpBusqInmueble.getText());
	        	
	        } catch (Exception e) {
	        	
	        	inpBusqInmueble.setText("Error solo acepta numeros");
	        	flag = false;
	        	MostrarTabla();
	        }

	       if (flag == true) {
	    	   
	        
	    	   for (Reserva reserva : reservas) {
	   			if (id_reserva == reserva.getInmueble().getId_inmueble()) {
	   				
	   			modeloReserva.addRow( 
	   					
	   					new Object[] {
	   							
	   					
	   					reserva.getId_reserva(),
	   					reserva.getInmueble().getId_inmueble(),
	   					reserva.getCliente().getId_cliente(),
	   					reserva.getFecha_pago(),
	   					reserva.getPago(),
	   					reserva.getForma_pago(),
	   					reserva.getEmpleado().getId_empleado(),
	   					reserva.getTipo_reserva()
	   			
	   					}
	   					);
	   			
	   				contador++;	
	   		}
	   
	   			
	   }
	    	   
	    	   
	    	   
	       } 
	       
	       
	       if (contador==0 && flag == true) {
	    	   
	    	   
	    	   inpBusqInmueble.setText("No existe la reserva");
	    	   MostrarTabla();
	    	   
	       }
		  
		  
		  
		  
		  
		  
	  }
	
	
	
	private void BuscarClienteID() {
		
		int contador=0, id_cliente=0;
		boolean flag=true;
		modeloReserva.setRowCount(0);
		
		try {
			
			id_cliente = Integer.parseInt(inpBusqCliente.getText());
	
		} catch (Exception e) {
			
			inpBusqCliente.setText("Solo se aceptan campo numericos");
			flag = false;
			 MostrarTabla();
		}
		
		
		List<Reserva> reservas = controladorReserva.getAllReserva();
		
		if(flag==true) {
			
		for (Reserva reserva : reservas) {
			
			if (id_cliente == reserva.getCliente().getId_cliente()) {
				
			
			modeloReserva.addRow( 
					
					new Object[] {
							
					
					reserva.getId_reserva(),
					reserva.getInmueble().getId_inmueble(),
					reserva.getCliente().getId_cliente(),
					reserva.getFecha_pago(),
					reserva.getPago(),
					reserva.getForma_pago(),
					reserva.getEmpleado().getId_empleado(),
					reserva.getTipo_reserva()
			
					}
					);
			
			contador++;
			
			}
		}
		
		}
		
		
		if (contador == 0 && flag==true) {
			
			inpBusqCliente.setText("El cliente no realizo ninguna reserva.");
			 MostrarTabla();
		}
		
		
		
		
	}
	
	private void BuscarReservaID() {
		int id_reserva = 0, contador = 0;
		boolean flag = true;
		
		try {
			
			id_reserva = Integer.parseInt(inpBusqReserva.getText());
			
		} catch (Exception e) {
			
			inpBusqReserva.setText("Solo se aceptan campos numericos.");
			flag = false;
			 MostrarTabla();
		}
		
	modeloReserva.setRowCount(0);
		
		List<Reserva> reservas = controladorReserva.getAllReserva();
		
	if (flag == true) {
		
		for (Reserva reserva : reservas) {
		
			if (id_reserva == reserva.getId_reserva()) {
				
			
			modeloReserva.addRow( 
					
					new Object[] {
							
					
					reserva.getId_reserva(),
					reserva.getInmueble().getId_inmueble(),
					reserva.getCliente().getId_cliente(),
					reserva.getFecha_pago(),
					reserva.getPago(),
					reserva.getForma_pago(),
					reserva.getEmpleado().getId_empleado(),
					reserva.getTipo_reserva()
			
					}
					);
			
				contador++;
			}
		}
		
	}	
		
	if (contador == 0 && flag == true) {
		
		
		inpBusqReserva.setText("No hay reservas con ese id.");
		 MostrarTabla();
	}
	
	
		
	}
	
	
	public void BuscarOperacion() {
	 String operacion="";
		
	
	modeloReserva.setRowCount(0);
	
	List<Reserva> reservas = controladorReserva.getAllReserva();
	
	operacion =(String) comboBoxOperacion.getSelectedItem();
	if (operacion.equalsIgnoreCase("Venta")) {
		
	for (Reserva reserva : reservas) {
		if (reserva.getTipo_reserva().equalsIgnoreCase("Venta")) {
			
		modeloReserva.addRow( 
				
				new Object[] {
						
				
				reserva.getId_reserva(),
				reserva.getInmueble().getId_inmueble(),
				reserva.getCliente().getId_cliente(),
				reserva.getFecha_pago(),
				reserva.getPago(),
				reserva.getForma_pago(),
				reserva.getEmpleado().getId_empleado(),
				reserva.getTipo_reserva()
		
				}
				);
		
		
		}
	}
	
	
	
	} else {
		for (Reserva reserva : reservas) {
			if (reserva.getTipo_reserva().equalsIgnoreCase("Alquiler")) {
				
			modeloReserva.addRow( 
					
					new Object[] {
							
					
					reserva.getId_reserva(),
					reserva.getInmueble().getId_inmueble(),
					reserva.getCliente().getId_cliente(),
					reserva.getFecha_pago(),
					reserva.getPago(),
					reserva.getForma_pago(),
					reserva.getEmpleado().getId_empleado(),
					reserva.getTipo_reserva()
			
					}
					);
			
			
			}
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
