package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorEmpleado;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Validacion;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;


import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;


public class ListaEmpleado extends JFrame implements Validacion{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel mt;
	private ControladorEmpleado empleadocontrolador;
	private GestionEmpleadosOpciones opciones;
	private JTextField inpNombre;
	private JTextField inpApellido;
	private JTextField inpDni;
	private JComboBox<String> comboBoxEmpleado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEmpleado frame = new ListaEmpleado();
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
	public ListaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		if (empleadocontrolador == null) {
			
			empleadocontrolador = new ControladorEmpleado();
			
		}
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 984, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblListaDeEmpleados = new JLabel("Lista de empleados");
		lblListaDeEmpleados.setFont(new Font("Verdana", Font.PLAIN, 28));
		lblListaDeEmpleados.setBounds(365, 11, 508, 49);
		panel.add(lblListaDeEmpleados);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		panel_1.setBounds(0, 92, 984, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
	
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(52, 118, 113));
		
		tabbedPane.setBorder(null);
		tabbedPane.setBounds(0, 0, 587, 85);
		panel_1.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("Nombre", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busqueda por nombre:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(22, 11, 150, 35);
		panel_3.add(lblNewLabel);
		
		inpNombre = new JTextField();
		inpNombre.setBounds(170, 11, 248, 35);
		panel_3.add(inpNombre);
		inpNombre.setColumns(10);
		
		JButton btnNombre = new JButton("Buscar");
		btnNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				String nombre = inpNombre.getText();
				int opcion = 1;
				
				boolean ValidacionNombre = validarNombre2(nombre);
			
		if (!nombre.isEmpty()) {
			
			
				if (ValidacionNombre == true) {
					
					
					BusquedaNombre(nombre,opcion);
					
					
				} else {
					
					
					inpNombre.setForeground(Color.red);
					inpNombre.setText("Solo se admiten letras.");
					
					
				}
			
		} else {
			
			inpNombre.setForeground(Color.red);
			inpNombre.setText("Completar el campo");
			
		}		
			
			
			
			}
		});
		btnNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNombre.setForeground(Color.LIGHT_GRAY);
		btnNombre.setBorder(null);
		btnNombre.setBackground(new Color(48, 109, 105));
		btnNombre.setBounds(444, 11, 116, 35);
		panel_3.add(btnNombre);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("Apellido", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblBusquedaPorApellido = new JLabel("Busqueda por apellido:");
		lblBusquedaPorApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBusquedaPorApellido.setForeground(new Color(255, 255, 255));
		lblBusquedaPorApellido.setBounds(22, 11, 150, 35);
		panel_4.add(lblBusquedaPorApellido);
		
		inpApellido = new JTextField();
		inpApellido.setColumns(10);
		inpApellido.setBounds(170, 11, 248, 35);
		panel_4.add(inpApellido);
		
		JButton btnApellido = new JButton("Buscar");
		btnApellido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
		String apellido = inpApellido.getText();
		int opcion = 2;
				
				boolean ValidacionApellido = validarNombre2(apellido);
			
		if (!apellido.isEmpty()) {
			
			
				if (ValidacionApellido == true) {
					
					
					BusquedaNombre(apellido,opcion);
					
					
				} else {
					
					
					inpApellido.setForeground(Color.red);
					inpApellido.setText("Solo se admiten letras.");
					
					
				}
			
		} else {
			
			inpApellido.setForeground(Color.red);
			inpApellido.setText("Completar el campo");
			
		}
				
				
				
				
				
				
				
			}
		});
		btnApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApellido.setForeground(Color.LIGHT_GRAY);
		btnApellido.setBorder(null);
		btnApellido.setBackground(new Color(48, 109, 105));
		btnApellido.setBounds(444, 11, 116, 35);
		panel_4.add(btnApellido);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("DNI", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Busqueda por DNI:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(22, 11, 150, 35);
		panel_5.add(lblNewLabel_2);
		
		inpDni = new JTextField();
		inpDni.setColumns(10);
		inpDni.setBounds(170, 11, 248, 35);
		panel_5.add(inpDni);
		
		JButton btnBuscarDni = new JButton("Buscar");
		btnBuscarDni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Validacion del Dni en el buscador */	
				boolean flag = true;
				boolean validarDni = true;
				if (!inpDni.getText().isEmpty()) {
					
					try {
						
						
						 for (int i = 0; i < inpDni.getText().length(); i++) {
							
							 if (!Character.isDigit(inpDni.getText().charAt(i))) {
			                        flag = false;
			                        break; 
			                    }
							 
							 
						}
						
						
						if (flag == true) {
							
					
							
							int dni = Integer.parseInt(inpDni.getText());
							
							validarDni = validarDni2(dni);	
							
							if (validarDni == true) {
								
								
								BusquedaDni(dni);
								
								
							} else {
								
								inpDni.setForeground(Color.red);
								inpDni.setText("El dni debe contener 8 digitos.");
								
							}
						
						
						} else {
							
						
							inpDni.setForeground(Color.red);
							inpDni.setText("Se ingreso un caracter inválido");
							
						}
						
						
						
					} catch (Exception e2) {
									
					
						inpDni.setForeground(Color.red);
						inpDni.setText("Se ingreso un caracter inválido");
						
						
					}
					
					
					
					
				} else {
					
					inpDni.setForeground(Color.red);
					inpDni.setText("No se puede ingresar un campo vacio.");
					
				}
				
				
				
				
				
				
			}
		});
		btnBuscarDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscarDni.setForeground(Color.LIGHT_GRAY);
		btnBuscarDni.setBorder(null);
		btnBuscarDni.setBackground(new Color(48, 109, 105));
		btnBuscarDni.setBounds(444, 11, 116, 35);
		panel_5.add(btnBuscarDni);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(52, 118, 113));
		tabbedPane.addTab("Tipo de empleado", null, panel_6, null); 
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Busqueda por puesto:");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(21, 11, 150, 35);
		panel_6.add(lblNewLabel_2_1);
		
		comboBoxEmpleado = new JComboBox<String>();
		comboBoxEmpleado.setBackground(new Color(255, 255, 255));
		comboBoxEmpleado.setBounds(170, 11, 248, 35);
		panel_6.add(comboBoxEmpleado);
		
		JButton btnPuesto = new JButton("Buscar");
		btnPuesto.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPuesto.setForeground(Color.LIGHT_GRAY);
		btnPuesto.setBorder(null);
		btnPuesto.setBackground(new Color(48, 109, 105));		btnPuesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				BusquedaPorPuesto();
				
				
				
				
				
				
				
				
			}
		});
		btnPuesto.setBounds(444, 11, 116, 35);
		panel_6.add(btnPuesto);
		comboBoxEmpleado.addItem("Agente");
		comboBoxEmpleado.addItem("Gerente");
		
		tabbedPane.setSelectedIndex(0);
		
		JButton btnResetearTabla = new JButton("Resetear Tabla");
		btnResetearTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				MostrarEmpleados();
				
				
			}
		});
		btnResetearTabla.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnResetearTabla.setForeground(Color.LIGHT_GRAY);
		btnResetearTabla.setBorder(null);
		btnResetearTabla.setBackground(new Color(48, 109, 105));
		btnResetearTabla.setBounds(714, 36, 168, 35);
		panel_1.add(btnResetearTabla);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(52, 118, 113));
		panel_2.setBounds(0, 181, 984, 580);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 22, 888, 447);
		panel_2.add(scrollPane);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					
					opciones = new GestionEmpleadosOpciones();
					
					
				
				
				opciones.setLocationRelativeTo(null);
				opciones.setVisible(true);
				dispose();
				
				
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));		btnVolver.setBounds(44, 509, 116, 49);
		panel_2.add(btnVolver);
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado"};
		mt = new DefaultTableModel(ColumNames, 0);
		table = new JTable(mt);
		scrollPane.setViewportView(table);
		
		
		MostrarEmpleados();
		
		
	}
	
	
	private void MostrarEmpleados() {
       
        mt.setRowCount(0);

      
        List<Empleado> empleados = empleadocontrolador.getAllEmpleados();

       
        for (Empleado empleado : empleados) {
            mt.addRow(
            		new Object[]
            				{
            					empleado.getId_empleado()
            						, empleado.getNombre()
            						, empleado.getApellido()
            						, empleado.getFecha_nacimiento()
            						, empleado.getDni()
            						, empleado.getTelefono()
            						, empleado.getCorreo()
            						, empleado.getTipo_empleado()   
         						}
            		);
        }
    }
	
	
private void BusquedaDni(int dni) {
	
	int contador = 0;
	mt.setRowCount(0);
	
	List<Empleado> empleados = empleadocontrolador.getAllEmpleados();
	
	for (Empleado empleado : empleados) {
		
		
		if (dni == empleado.getDni()){
			
			mt.addRow(new Object[] {
					
					empleado.getId_empleado()
					, empleado.getNombre()
					, empleado.getApellido()
					, empleado.getFecha_nacimiento()
					, empleado.getDni()
					, empleado.getTelefono()
					, empleado.getCorreo()
					, empleado.getTipo_empleado()	
					
			});
			
			contador++;
			break;
			
		}
		

		
		
		
		
	}
	
	if (contador == 0) {
		
		inpDni.setText("No existe el dni");
		
	}
	
	
	
	
	
	
	
}	



private void BusquedaNombre(String nombre,int opcion) {
	
	
	int contador = 0;
	mt.setRowCount(0);
	
	List<Empleado> empleados = empleadocontrolador.getAllEmpleados();
	
	if (opcion == 1) {
		
	
	for (Empleado empleado : empleados) {
		
		
		if (empleado.getNombre().toLowerCase().startsWith(nombre.toLowerCase())){  // Tranforma ambas cadenas a minúsculas .toLowerCase() y .startsWith Compara las cadenas de texto, si encuentra coincidencias entra por el if.
			
			mt.addRow(new Object[] {
					
					empleado.getId_empleado()
					, empleado.getNombre()
					, empleado.getApellido()
					, empleado.getFecha_nacimiento()
					, empleado.getDni()
					, empleado.getTelefono()
					, empleado.getCorreo()
					, empleado.getTipo_empleado()	
					
			});
			
			contador++;
			
			
			
		}
		
	}  

		
		
		
		
	} else if (opcion == 2) {
		
		for (Empleado empleado : empleados) {
			
			
			if (empleado.getApellido().toLowerCase().startsWith(nombre.toLowerCase())){  
				
				mt.addRow(new Object[] {
						
						empleado.getId_empleado()
						, empleado.getNombre()
						, empleado.getApellido()
						, empleado.getFecha_nacimiento()
						, empleado.getDni()
						, empleado.getTelefono()
						, empleado.getCorreo()
						, empleado.getTipo_empleado()	
						
				});
				
				contador++;
				
				
				
			}
			
		}  
		
	}
	
	
	if (contador == 0) {
		
		inpNombre.setText("No se encontraron empleados.");
		MostrarEmpleados();
	}
	
	
	
	
	
}



public void BusquedaPorPuesto() {
	
	
	mt.setRowCount(0);
	
	String seleccionado;
	
	seleccionado = (String) comboBoxEmpleado.getSelectedItem();
	
	
	
	List<Empleado> empleados = empleadocontrolador.getAllEmpleados();
	
	if (seleccionado.equalsIgnoreCase("Agente")) {
	
	// TODO: handle exception
		
		
for (Empleado empleado : empleados) {
			
	try {
			
			if (empleado.getTipo_empleado().equalsIgnoreCase("Agente") && empleado.getTipo_empleado() != null){  
				
				mt.addRow(new Object[] {
						
						empleado.getId_empleado()
						, empleado.getNombre()
						, empleado.getApellido()
						, empleado.getFecha_nacimiento()
						, empleado.getDni()
						, empleado.getTelefono()
						, empleado.getCorreo()
						, empleado.getTipo_empleado()	
						
				});
				
				
				
				
				
			}
	} catch (Exception e) {

			System.out.println("Dato erroneo dentro de la base de datos.");
	
	}		
			
		} 
		
		
		
		
		
		
	} else if (seleccionado.equalsIgnoreCase("Gerente")) {
		
	
		
		for (Empleado empleado : empleados) {	
			
		try {
			
		
		if (empleado.getTipo_empleado().equalsIgnoreCase("Gerente")){  
			
			mt.addRow(new Object[] {
					
					empleado.getId_empleado()
					, empleado.getNombre()
					, empleado.getApellido()
					, empleado.getFecha_nacimiento()
					, empleado.getDni()
					, empleado.getTelefono()
					, empleado.getCorreo()
					, empleado.getTipo_empleado()	
					
			});
			
			
			
		}
			
		} catch (Exception e) {
			
			System.out.println("Dato erroneo dentro de la base de datos.");
			
		}	
		}
		
		
		
	} else {
		
		
		JOptionPane.showMessageDialog(null, "Ocurrio un error.");
		
		
	}
	
	
}

	
}
