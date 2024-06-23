package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;



import java.time.LocalDate;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controlador.AgenteControlador;
import controlador.GerenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Validacion;

import javax.swing.JTextField;



public class ModificarEmpleado extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableagentes;
	private AgenteControlador agentecontrolador = new AgenteControlador();
	private GerenteControlador gerentecontrolador;
	private DefaultTableModel mt,mt2;
	private GestionEmpleadosOpciones opciones;
	private Agente seleccionado;
	private Gerente gerenteseleccionado;
	private JTable tablegerentes;
	private JTextField inpBuscador;
	private JTabbedPane tabbedPane;
	private JTextField inpDniGerente;
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public ModificarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		seleccionado = new Agente();
			
			
		gerentecontrolador = new GerenteControlador();		
		
		
		gerenteseleccionado = new Gerente();
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 182, 661);
		contentPane.add(panel);
		panel.setLayout(null);
			
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					
			opciones = new GestionEmpleadosOpciones();
			
				
				opciones.setVisible(true);
				
				opciones.setLocationRelativeTo(null);
				
				dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		  btnVolver.setForeground(new Color(255, 255, 255));
	        btnVolver.setBackground(new Color(48, 109, 105));
	        btnVolver.setBorder(null);
		btnVolver.setBounds(43, 599, 89, 23);
		panel.add(btnVolver);
		
	
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(52, 118, 113));
		tabbedPane.setBounds(181, 0, 803, 661);
		contentPane.add(tabbedPane);
		
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_agente"};
		mt = new DefaultTableModel(ColumNames, 0);
		VerAgentes();
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Gerentes", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(52, 118, 113));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 798, 633);
		panel_2.add(panel_1_1);
		
		JLabel lblGerentes = new JLabel("Tabla de gerentes");
		lblGerentes.setForeground(new Color(255, 255, 255));
		lblGerentes.setFont(new Font("Verdana", Font.BOLD, 20));
		lblGerentes.setBounds(305, 0, 458, 63);
		panel_1_1.add(lblGerentes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(21, 61, 751, 2);
		panel_1_1.add(separator_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 141, 751, 400);
		panel_1_1.add(scrollPane_1);
		
		
		String[] ColumNombresGerentes = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_gerente"};
		mt2 = new DefaultTableModel(ColumNombresGerentes, 0);
		VerGerentes();
		
		tablegerentes = new JTable(mt2);
		scrollPane_1.setViewportView(tablegerentes);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(14, 565, 751, 2);
		panel_1_1.add(separator_1_1);
		
		JButton btnModgerentes = new JButton("Modificar");
		btnModgerentes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModgerentes.setForeground(new Color(255, 255, 255));
		btnModgerentes.setBackground(new Color(48, 109, 105));
		btnModgerentes.setBorder(null);
		btnModgerentes.setBounds(337, 578, 132, 44);
		panel_1_1.add(btnModgerentes);
		btnModgerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (gerenteseleccionado.getId_empleado()!=0) {
					
					EditarGerente editargerente = new EditarGerente(gerenteseleccionado);
					
					editargerente.setVisible(true);
					
					editargerente.setLocationRelativeTo(null);
					
        			dispose();
        			
				} else {
					JOptionPane.showMessageDialog(null, "Seleccione un gerente");
				}
				
				
			}
				
				
			
		});

		
		JLabel lblgerenteseleccionado = new JLabel("Seleccion:");
		lblgerenteseleccionado.setForeground(new Color(255, 255, 255));
		lblgerenteseleccionado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblgerenteseleccionado.setBounds(21, 70, 751, 30);
		panel_1_1.add(lblgerenteseleccionado);
		
		JLabel lblbuscadorAgentes_1 = new JLabel("Buscador:");
		lblbuscadorAgentes_1.setForeground(new Color(255, 255, 255));
		lblbuscadorAgentes_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblbuscadorAgentes_1.setBounds(21, 110, 113, 20);
		panel_1_1.add(lblbuscadorAgentes_1);
		
		inpDniGerente = new JTextField();
		inpDniGerente.setColumns(10);
		inpDniGerente.setBounds(101, 111, 222, 20);
		panel_1_1.add(inpDniGerente);
		
		JButton btnBuscarGerente = new JButton("Buscar");
		btnBuscarGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				boolean flag = true;
				boolean validarDni = true;
				if (!inpDniGerente.getText().isEmpty()) {
					
					try {
						
						
						 for (int i = 0; i < inpDniGerente.getText().length(); i++) {
							
							 if (!Character.isDigit(inpDniGerente.getText().charAt(i))) {
			                        flag = false;
			                        break; 
			                    }
							 
							 
						}
						
						
						if (flag == true) {
							
					
							
							int dni = Integer.parseInt(inpDniGerente.getText());
							
							validarDni = validarDni2(dni);	
							
							if (validarDni == true) {
								
								
								BuscarGerenteDni(dni);
								
								
							} else {
								
								inpDniGerente.setForeground(Color.red);
								inpDniGerente.setText("El dni debe contener 8 digitos.");
								
							}
						
						
						} else {
							
						
							inpDniGerente.setForeground(Color.red);
							inpDniGerente.setText("Se ingreso un caracter inválido");
							
						}
						
						
						
					} catch (Exception e2) {
									
					
						inpDniGerente.setForeground(Color.red);
						inpDniGerente.setText("Se ingreso un caracter inválido");
						
						
					}
					
					
					
					
				} else {
					
					inpDniGerente.setForeground(Color.red);
					inpDniGerente.setText("No se puede ingresar un campo vacio.");
					
				}
				
				
				
				
				
			}
		});
		
		btnBuscarGerente.setFont(new Font("Tahoma", Font.BOLD, 12));
		  btnBuscarGerente.setForeground(new Color(255, 255, 255));
	        btnBuscarGerente.setBackground(new Color(48, 109, 105));
	        btnBuscarGerente.setBorder(null);
		btnBuscarGerente.setBounds(337, 111, 89, 20);
		panel_1_1.add(btnBuscarGerente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("Agentes", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabla de agentes");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(305, 0, 458, 63);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 61, 751, 2);
		panel_1.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 141, 751, 400);
		panel_1.add(scrollPane);
		tableagentes = new JTable(mt);
		scrollPane.setColumnHeaderView(tableagentes);
		scrollPane.setViewportView(tableagentes);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 565, 751, 2);
		panel_1.add(separator_1);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (seleccionado.getId_empleado()!=0) {
					
					EditarAgente editar = new EditarAgente(seleccionado);
					
					editar.setVisible(true);
					
					editar.setLocationRelativeTo(null);
					
        			dispose();
        			
        			
        			
				} else {
					JOptionPane.showMessageDialog(null, "Seleccione un agente");
				}
				
				
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setForeground(Color.LIGHT_GRAY);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(48, 109, 105));
		btnModificar.setBounds(337, 578, 132, 44);
		panel_1.add(btnModificar);
		
		JLabel lblElemento = new JLabel("Seleccion:");
		lblElemento.setForeground(new Color(255, 255, 255));
		lblElemento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElemento.setBounds(21, 70, 751, 30);
		panel_1.add(lblElemento);
		
		inpBuscador = new JTextField();
		inpBuscador.setBounds(101, 111, 222, 20);
		panel_1.add(inpBuscador);
		inpBuscador.setColumns(10);
		
		JLabel lblbuscadorAgentes = new JLabel("Buscador:");
		lblbuscadorAgentes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblbuscadorAgentes.setForeground(new Color(255, 255, 255));
		lblbuscadorAgentes.setBounds(21, 111, 113, 20);
		panel_1.add(lblbuscadorAgentes);
		
		JButton btnBuscarAgente = new JButton("Buscar");
		btnBuscarAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		/* Validacion del Dni en el buscador */	
				boolean flag = true;
				boolean validarDni = true;
				if (!inpBuscador.getText().isEmpty()) {
					
					try {
						
						
						 for (int i = 0; i < inpBuscador.getText().length(); i++) {
							
							 if (!Character.isDigit(inpBuscador.getText().charAt(i))) {
			                        flag = false;
			                        break; 
			                    }
							 
							 
						}
						
						
						if (flag == true) {
							
					
							
							int dni = Integer.parseInt(inpBuscador.getText());
							
							validarDni = validarDni2(dni);	
							
							if (validarDni == true) {
								
								
								BuscarGerenteDni(dni);
								
								
							} else {
								
								inpBuscador.setForeground(Color.red);
								inpBuscador.setText("El dni debe contener 8 digitos.");
								
							}
						
						
						} else {
							
						
							inpBuscador.setForeground(Color.red);
							inpBuscador.setText("Se ingreso un caracter inválido");
							
						}
						
						
						
					} catch (Exception e2) {
									
					
						inpBuscador.setForeground(Color.red);
						inpBuscador.setText("Se ingreso un caracter inválido");
						
						
					}
					
					
					
					
				} else {
					
					inpBuscador.setForeground(Color.red);
					inpBuscador.setText("No se puede ingresar un campo vacio.");
					
				}
				
				
				
				
				
				
			}
		});
		btnBuscarAgente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarAgente.setForeground(Color.LIGHT_GRAY);
		btnBuscarAgente.setBorder(null);
		btnBuscarAgente.setBackground(new Color(48, 109, 105));
		btnBuscarAgente.setBounds(337, 111, 89, 20);
		panel_1.add(btnBuscarAgente);
		
		
		  ListSelectionModel selectionModelAgentes = tableagentes.getSelectionModel();
		
		
		JButton btnAgente = new JButton("Agentes");
		btnAgente.setBounds(27, 263, 105, 23);
		btnAgente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgente.setForeground(new Color(255, 255, 255));
		btnAgente.setBackground(new Color(48, 109, 105));
		btnAgente.setBorder(null);
		btnAgente.setBounds(43, 263, 89, 23);
		panel.add(btnAgente);
		btnAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		
	
		
		
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.setBounds(43, 313, 89, 49);
		btnGerentes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerentes.setForeground(new Color(255, 255, 255));
		btnGerentes.setBackground(new Color(48, 109, 105));
		btnGerentes.setBorder(null);
		btnGerentes.setBounds(43, 313, 89, 23);
		panel.add(btnGerentes);
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tabbedPane.setSelectedIndex(0);
			
			}
		});
	       
		selectionModelAgentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Agregar un escuchador de selección
	        
		selectionModelAgentes.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = tableagentes.getSelectedRow();
	                    if (selectedRow != -1) {
	                        int id = (int) tableagentes.getValueAt(selectedRow, 0);
	                        String nombre = (String) tableagentes.getValueAt(selectedRow, 1);
	                        String apellido = (String) tableagentes.getValueAt(selectedRow, 2);	           
	                        LocalDate fecha = (LocalDate) tableagentes.getValueAt(selectedRow, 3);
	                        int dni = (int) tableagentes.getValueAt(selectedRow, 4);
	                        int telefono = (int) tableagentes.getValueAt(selectedRow, 5);
	                        String correo = (String) tableagentes.getValueAt(selectedRow, 6);
	                        String tipoempleado = (String) tableagentes.getValueAt(selectedRow, 7);
	                        String contraseña = (String) tableagentes.getValueAt(selectedRow, 8);
	                        int Id_agente = (int) tableagentes.getValueAt(selectedRow, 9);
	                        lblElemento.setText("Seleccionado: ID_empleado=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni   + ", Tipo empleado" + tipoempleado );
	                        seleccionado.setId_empleado(id);
	                        seleccionado.setNombre(nombre);
	                        seleccionado.setApellido(apellido);
	                        seleccionado.setFecha_nacimiento(fecha);
	                        seleccionado.setDni(dni);
	                        seleccionado.setTelefono(telefono);
	                        seleccionado.setCorreo(correo);
	                        seleccionado.setTipo_empleado(tipoempleado);
	                        seleccionado.setContraseña(contraseña);
	                        seleccionado.setId_agente(Id_agente);
	                      
	                    }
	                }
	            }
	        });
		
	        
	        
		 ListSelectionModel selectionModelGerentes = tablegerentes.getSelectionModel();   
	        
		selectionModelGerentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        
		selectionModelGerentes.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = tablegerentes.getSelectedRow();
	                    if (selectedRow != -1) {
	                        int id = (int) tablegerentes.getValueAt(selectedRow, 0);
	                        String nombre = (String) tablegerentes.getValueAt(selectedRow, 1);
	                        String apellido = (String) tablegerentes.getValueAt(selectedRow, 2);	           
	                        LocalDate fecha = (LocalDate) tablegerentes.getValueAt(selectedRow, 3);
	                        int dni = (int) tablegerentes.getValueAt(selectedRow, 4);
	                        int telefono = (int) tablegerentes.getValueAt(selectedRow, 5);
	                        String correo = (String) tablegerentes.getValueAt(selectedRow, 6);
	                        String tipoempleado = (String) tablegerentes.getValueAt(selectedRow, 7);
	                        String contraseña = (String) tablegerentes.getValueAt(selectedRow, 8);
	                        int Id_gerente = (int) tablegerentes.getValueAt(selectedRow, 9);
	                        lblgerenteseleccionado.setText("Seleccionado: ID_empleado=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni   + ", Tipo empleado" + tipoempleado );
	                        gerenteseleccionado.setId_empleado(id);
	                        gerenteseleccionado.setNombre(nombre);
	                        gerenteseleccionado.setApellido(apellido);
	                        gerenteseleccionado.setFecha_nacimiento(fecha);
	                        gerenteseleccionado.setDni(dni);
	                        gerenteseleccionado.setTelefono(telefono);
	                        gerenteseleccionado.setCorreo(correo);
	                        gerenteseleccionado.setTipo_empleado(tipoempleado);
	                        gerenteseleccionado.setContraseña(contraseña);
	                        gerenteseleccionado.setId_gerente(Id_gerente);
	                      
	                    }
	                }
	            }
	        });
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		
	}
	
	public void VerAgentes() {
		
        mt.setRowCount(0);


	       
	        List<Agente> agentes = agentecontrolador.getAllAgente();

		
	        for (Agente agente : agentes) {
			
	        	 mt.addRow(
		            		new Object[]
		            				{
		            					agente.getId_empleado()
		            						, agente.getNombre()
		            						, agente.getApellido()
		            						, agente.getFecha_nacimiento()
		            						, agente.getDni()
		            						, agente.getTelefono()
		            						, agente.getCorreo()
		            						, agente.getTipo_empleado()
		            						, agente.getContraseña()
		            						, agente.getId_agente()
		            						}
		            		);
			
			
			
			
		}
		
		
		
		
	}
	
	
	public void BuscarAgenteDni(int dni) {
		
		int contador = 0;
		mt.setRowCount(0);
		
		List<Agente> agentes = agentecontrolador.getAllAgente();
		
		for (Agente agente : agentes) {
			
			
			if (dni == agente.getDni()){
				
				mt.addRow(new Object[] {
						
						agente.getId_empleado()
						, agente.getNombre()
						, agente.getApellido()
						, agente.getFecha_nacimiento()
						, agente.getDni()
						, agente.getTelefono()
						, agente.getCorreo()
						, agente.getTipo_empleado()
						, agente.getContraseña()
						, agente.getId_agente()
						
						
				});
				
				contador++;
				break;
				
			}
			
 
			
			
			
			
		}
		
		if (contador == 0) {
			
			inpBuscador.setText("No existe el dni");
			
		}
		
		
	}
	
	
	/* Funcion para volver a la interfaz ModificarEmpleado, pero en este caso devuelve a la tabla de agentes en vez de la de gerentes */
	
	public void Peticion (int numero) {
		
		if (numero == 1) {
		tabbedPane.setSelectedIndex(1);
		} else {
			
			tabbedPane.setSelectedIndex(0);
			
		}
	}
	
	
	
public void VerGerentes() {
	
	
		
        mt2.setRowCount(0);


	       
	        List<Gerente> gerentes = gerentecontrolador.getAllGerente();

		
	        for (Gerente gerente : gerentes) {
			
	        	 mt2.addRow(
		            		new Object[]
		            				{
		            					      gerente.getId_empleado()
		            						, gerente.getNombre()
		            						, gerente.getApellido()
		            						, gerente.getFecha_nacimiento()
		            						, gerente.getDni()
		            						, gerente.getTelefono()
		            						, gerente.getCorreo()
		            						, gerente.getTipo_empleado()
		            						, gerente.getContraseña()
		            						, gerente.getId_gerente()
		            						}
		            		);
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
public void BuscarGerenteDni(int dni) {
	
	int contador = 0;
	mt2.setRowCount(0);
	
	List<Gerente> gerentes = gerentecontrolador.getAllGerente();
	
	for (Gerente gerente : gerentes) {
		
		
		if (dni == gerente.getDni()){
			
			mt2.addRow(new Object[] {
					
					gerente.getId_empleado()
					, gerente.getNombre()
					, gerente.getApellido()
					, gerente.getFecha_nacimiento()
					, gerente.getDni()
					, gerente.getTelefono()
					, gerente.getCorreo()
					, gerente.getTipo_empleado()
					, gerente.getContraseña()
					, gerente.getId_gerente()
					
					
			});
			
			contador++;
			break;
			
		}
		

		
		
		
		
	}
	
	if (contador == 0) {
		
		inpDniGerente.setText("No existe el dni");
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
