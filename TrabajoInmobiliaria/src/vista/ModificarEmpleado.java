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
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Validacion;

import javax.swing.JTextField;



public class ModificarEmpleado extends JFrame implements Validacion {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableagentes;
	private AgenteControlador agentecontrolador = new AgenteControlador();
	private DefaultTableModel mt;
	private GestionEmpleadosOpciones opciones;
	private Agente seleccionado;
	private JButton EditarEmpleado;
	private JTable tablegerentes;
	private JTextField inpBuscador;
	private JTabbedPane tabbedPane;
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 182, 661);
		contentPane.add(panel);
		panel.setLayout(null);
			
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (opciones == null) {
					
					opciones = new GestionEmpleadosOpciones();
					
					
				}
				
				opciones.setVisible(true);
				
				opciones.setLocationRelativeTo(null);
				
				dispose();
			}
		});
		btnVolver.setBounds(43, 599, 89, 23);
		panel.add(btnVolver);
		
	
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(181, 0, 803, 661);
		contentPane.add(tabbedPane);
		
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_agente"};
		mt = new DefaultTableModel(ColumNames, 0);
		VerAgentes();
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Gerentes", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 798, 633);
		panel_2.add(panel_1_1);
		
		JLabel lblGerentes = new JLabel("Tabla de gerentes");
		lblGerentes.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblGerentes.setBounds(305, 0, 458, 63);
		panel_1_1.add(lblGerentes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(21, 61, 751, 2);
		panel_1_1.add(separator_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 106, 751, 435);
		panel_1_1.add(scrollPane_1);
		
		tablegerentes = new JTable();
		scrollPane_1.setViewportView(tablegerentes);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(14, 565, 751, 2);
		panel_1_1.add(separator_1_1);
		
		JButton btnModgerentes = new JButton("Modificar");
		btnModgerentes.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnModgerentes.setBounds(337, 578, 132, 44);
		panel_1_1.add(btnModgerentes);
		
		JLabel lblgerenteseleccionado = new JLabel("Seleccion:");
		lblgerenteseleccionado.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblgerenteseleccionado.setBounds(21, 70, 751, 30);
		panel_1_1.add(lblgerenteseleccionado);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Agentes", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabla de agentes");
		lblNewLabel.setBounds(305, 0, 458, 63);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
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
		btnModificar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnModificar.setBounds(337, 578, 132, 44);
		panel_1.add(btnModificar);
		
		JLabel lblElemento = new JLabel("Seleccion:");
		lblElemento.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblElemento.setBounds(21, 70, 751, 30);
		panel_1.add(lblElemento);
		
		inpBuscador = new JTextField();
		inpBuscador.setBounds(101, 111, 222, 20);
		panel_1.add(inpBuscador);
		inpBuscador.setColumns(10);
		
		JLabel lblbuscadorAgentes = new JLabel("Buscador:");
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
								
								
								BuscarAgenteDni(dni);
								
								
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
		btnBuscarAgente.setBounds(337, 111, 89, 20);
		panel_1.add(btnBuscarAgente);
		
		
		  ListSelectionModel selectionModel = tableagentes.getSelectionModel();
		
		
		JButton btnAgente = new JButton("Agentes");
		btnAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		
		btnAgente.setBounds(43, 263, 89, 23);
		panel.add(btnAgente);
	
		
		
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tabbedPane.setSelectedIndex(0);
			
			}
		});
		btnGerentes.setBounds(43, 313, 89, 23);
		panel.add(btnGerentes);
	        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Agregar un escuchador de selección
	        
	        selectionModel.addListSelectionListener(new ListSelectionListener() {
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
		JOptionPane.showMessageDialog(null, dni);
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
	
	
	
}
