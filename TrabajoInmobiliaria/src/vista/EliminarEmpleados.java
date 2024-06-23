package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.AgenteControlador;
import controlador.GerenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Validacion;

import javax.swing.ListSelectionModel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class EliminarEmpleados extends JFrame implements Validacion{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpBuscarAgente;
	private JTextField textField_1;
	private GestionEmpleadosOpciones volverOpciones;
	private DefaultTableModel mt,mt2;
	private JTable tablaAgentes;
	private AgenteControlador agentecontrolador;
	private GerenteControlador gerentecontrolador;
	private JTable tablaGerentes;
	private Agente seleccionado;
	private Gerente gerenteseleccionado;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EliminarEmpleados() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
			
			agentecontrolador = new AgenteControlador();
			
		
		
		
		
			
			gerentecontrolador = new GerenteControlador();
			
		
		
		
			
			seleccionado = new Agente();
			
		
		
		
			
			gerenteseleccionado = new Gerente(); ;
			
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 231, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
				volverOpciones = new GestionEmpleadosOpciones();
					
				
				
				volverOpciones.setLocationRelativeTo(null);
				
				volverOpciones.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(61, 581, 107, 32);
		panel.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(230, 55, 754, 606);
		contentPane.add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		tabbedPane.addTab("Agentes", null, toolBar, null);
		
		
		
		
		JPanel panel_1 = new JPanel();
		toolBar.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Agentes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(335, 0, 401, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblAgenteSelecc = new JLabel("Seleccionado:");
		lblAgenteSelecc.setBounds(10, 33, 726, 23);
		panel_1.add(lblAgenteSelecc);
		
		JLabel lblNewLabel_3 = new JLabel("Buscar por dni:");
		lblNewLabel_3.setBounds(10, 69, 115, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblAccionesAgente = new JLabel("Acciones agente");
		lblAccionesAgente.setBounds(10, 12, 304, 14);
		panel_1.add(lblAccionesAgente);
		lblAccionesAgente.setVisible(false);
		
		
		inpBuscarAgente = new JTextField();
		inpBuscarAgente.setBounds(105, 66, 177, 20);
		panel_1.add(inpBuscarAgente);
		inpBuscarAgente.setColumns(10);
		
		JButton btnBuscarAgente = new JButton("Buscar");
		btnBuscarAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numero;
				
				int dni;
				numero = inpBuscarAgente.getText();
			
				try {
					
					dni = Integer.parseInt(numero);

					JOptionPane.showMessageDialog(null,"El valor es: "+dni);
					
					boolean ValidarDni = validarDni2(dni);
					
					
					if (ValidarDni == true) {
						
					BuscarAgenteDni(dni);
					
					} else {
						
						inpBuscarAgente.setForeground(Color.red);
						inpBuscarAgente.setText("El dni debe contener 8 digitos.");
					
					}
					
				} catch (Exception e2) {
					
					inpBuscarAgente.setForeground(Color.red);
					inpBuscarAgente.setText("El DNI solo debe contener números.");
					
				}
			
				
				
			}
		});
		btnBuscarAgente.setBounds(292, 65, 89, 23);
		panel_1.add(btnBuscarAgente);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 94, 693, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 527, 693, 2);
		panel_1.add(separator_1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 110, 693, 404);
		panel_1.add(scrollPane);
		
		
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_agente"};
		mt = new DefaultTableModel(ColumNames, 0);
		
		tablaAgentes = new JTable(mt);
		scrollPane.setViewportView(tablaAgentes);

		VerAgentes();
		
		
		JButton btnEliminarAgente = new JButton("Eliminar");
		btnEliminarAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Respuesta = "";
				
				if (seleccionado.getId_empleado()!=0) {
					
				
					
					Respuesta = agentecontrolador.deleteAgente(seleccionado.getId_empleado());
					
					if (Respuesta.equalsIgnoreCase("El empleado no puede ser eliminado, tiene referencias en otras tablas.")) {
						
						lblAccionesAgente.setVisible(true);
						lblAccionesAgente.setForeground(Color.red);
						lblAccionesAgente.setText("El agente tiene referencias en otras tablas.");
						
					} else if (Respuesta.equalsIgnoreCase("Empleado eliminado")) {
						lblAccionesAgente.setVisible(true);
						lblAccionesAgente.setForeground(Color.green);
						lblAccionesAgente.setText("El agente seleccionado se ha borrado.");
						
						
					} else if (Respuesta.equalsIgnoreCase("No se encontro ningun empleado")) {
						
						lblAccionesAgente.setVisible(true);
						lblAccionesAgente.setForeground(Color.red);
						lblAccionesAgente.setText("No se encontro ningun empleado");
						
					} else {
						
						
						lblAccionesAgente.setVisible(true);
						lblAccionesAgente.setForeground(Color.red);
						lblAccionesAgente.setText("Se produjo un error");
					}
					
					
					VerAgentes();
					
				} else {
					
					lblAccionesAgente.setVisible(true);
					lblAccionesAgente.setForeground(Color.red);
					lblAccionesAgente.setText("Debes seleccionar un Agente.");
					
					
				}
				
				
				
				
				
			}
		});
		btnEliminarAgente.setBounds(288, 535, 162, 34);
		panel_1.add(btnEliminarAgente);
		
		JButton btnResetearAgentes = new JButton("Resetear");
		btnResetearAgentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VerAgentes();
				lblAccionesAgente.setVisible(false);
				inpBuscarAgente.setForeground(Color.black);
				inpBuscarAgente.setText("");
				
				
			}
		});
		btnResetearAgentes.setBounds(391, 65, 89, 23);
		panel_1.add(btnResetearAgentes);
		
		
		
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("Gerentes", null, toolBar_1, null);
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		toolBar_1.add(panel_1_1);
		
		JLabel lblGerente = new JLabel("Gerentes");
		lblGerente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGerente.setBounds(335, 0, 401, 34);
		panel_1_1.add(lblGerente);
		
		JLabel lblGerentes = new JLabel("Seleccionado:");
		lblGerentes.setBounds(10, 33, 726, 23);
		panel_1_1.add(lblGerentes);
		
		JLabel lblBuscadorGerentes = new JLabel("Buscar por dni:");
		lblBuscadorGerentes.setBounds(10, 69, 115, 14);
		panel_1_1.add(lblBuscadorGerentes);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 66, 177, 20);
		panel_1_1.add(textField_1);
		
		JButton btnBuscarAgente_1 = new JButton("Buscar");
		btnBuscarAgente_1.setBounds(292, 65, 89, 23);
		panel_1_1.add(btnBuscarAgente_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 94, 693, 2);
		panel_1_1.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 527, 693, 2);
		panel_1_1.add(separator_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 110, 693, 404);
		panel_1_1.add(scrollPane_1);
		
		
		String[] ColumNombresGerentes = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_gerente"};
		mt2 = new DefaultTableModel(ColumNombresGerentes, 0);
		
		tablaGerentes = new JTable(mt2);
		scrollPane_1.setViewportView(tablaGerentes);
		
		VerGerentes();
		
		
		
		JButton btnEliminarGerente = new JButton("Eliminar");
		btnEliminarGerente.setBounds(288, 535, 162, 34);
		panel_1_1.add(btnEliminarGerente);
		
		JButton btnResetearGerentes = new JButton("Resetear");
		btnResetearGerentes.setBounds(391, 65, 89, 23);
		panel_1_1.add(btnResetearGerentes);
		
		JLabel lblNewLabel = new JLabel("Eliminar empleados");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(532, -2, 452, 46);
		contentPane.add(lblNewLabel);
		
		
		JButton btnAgentes = new JButton("Agentes");
		btnAgentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		btnAgentes.setBounds(61, 183, 107, 32);
		panel.add(btnAgentes);
		
		
		
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		btnGerentes.setBounds(61, 257, 107, 32);
		panel.add(btnGerentes);
		
		
		ListSelectionModel selectionModel = tablaAgentes.getSelectionModel();
		
		  selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	   
	        
	        selectionModel.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = tablaAgentes.getSelectedRow();
	                    if (selectedRow != -1) {
	                        int id = (int) tablaAgentes.getValueAt(selectedRow, 0);
	                        String nombre = (String) tablaAgentes.getValueAt(selectedRow, 1);
	                        String apellido = (String) tablaAgentes.getValueAt(selectedRow, 2);	           
	                        LocalDate fecha = (LocalDate) tablaAgentes.getValueAt(selectedRow, 3);
	                        int dni = (int) tablaAgentes.getValueAt(selectedRow, 4);
	                        int telefono = (int) tablaAgentes.getValueAt(selectedRow, 5);
	                        String correo = (String) tablaAgentes.getValueAt(selectedRow, 6);
	                        String tipoempleado = (String) tablaAgentes.getValueAt(selectedRow, 7);
	                        String contraseña = (String) tablaAgentes.getValueAt(selectedRow, 8);
	                        int Id_agente = (int) tablaAgentes.getValueAt(selectedRow, 9);
	                        lblAgenteSelecc.setText("Seleccionado: ID_empleado=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni   + ", Tipo empleado: " + tipoempleado );
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
		
	        
	        
	        
	        ListSelectionModel selectionModelGerentes = tablaGerentes.getSelectionModel();
			
	        selectionModelGerentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        
	        selectionModelGerentes.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = tablaGerentes.getSelectedRow();
	                    if (selectedRow != -1) {
	                        int id = (int) tablaGerentes.getValueAt(selectedRow, 0);
	                        String nombre = (String) tablaGerentes.getValueAt(selectedRow, 1);
	                        String apellido = (String) tablaGerentes.getValueAt(selectedRow, 2);	           
	                        LocalDate fecha = (LocalDate) tablaGerentes.getValueAt(selectedRow, 3);
	                        int dni = (int) tablaGerentes.getValueAt(selectedRow, 4);
	                        int telefono = (int) tablaGerentes.getValueAt(selectedRow, 5);
	                        String correo = (String) tablaGerentes.getValueAt(selectedRow, 6);
	                        String tipoempleado = (String) tablaGerentes.getValueAt(selectedRow, 7);
	                        String contraseña = (String) tablaGerentes.getValueAt(selectedRow, 8);
	                        int Id_gerente = (int) tablaGerentes.getValueAt(selectedRow, 9);
	                        lblGerentes.setText("Seleccionado: ID_empleado=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni   + ", Tipo empleado: " + tipoempleado );
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

public void BuscarAgenteDni(int dni) {
	boolean flagEncontrado = false;
	
		JOptionPane.showMessageDialog(null, dni);
	
	  mt.setRowCount(0);
	
	List <Agente> agente = agentecontrolador.getAllAgente();
	
	for (Agente agenteb : agente) {
		
		if (dni == agenteb.getDni()) {
			
			
			mt.addRow(new Object[] {
					
					agenteb.getId_empleado()
					, agenteb.getNombre()
					, agenteb.getApellido()
					, agenteb.getFecha_nacimiento()
					, agenteb.getDni()
					, agenteb.getTelefono()
					, agenteb.getCorreo()
					, agenteb.getTipo_empleado()
					, agenteb.getContraseña()
					, agenteb.getId_agente()
					
					
			});
			
			
			
			flagEncontrado = true;
			
			break;
			
		}
		
	}
		
		
		
	
	
	
	if (flagEncontrado == false) {
		
		
		inpBuscarAgente.setForeground(Color.red);
		inpBuscarAgente.setText("No se encuentro ningun Agente");
		
		
	}
	
	
	
}
}
