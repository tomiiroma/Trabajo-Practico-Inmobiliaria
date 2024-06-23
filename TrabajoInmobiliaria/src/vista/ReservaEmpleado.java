package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorEmpleado;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ReservaEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField InpEmpleado;
	private JTable tablaEmpleado;
	private DefaultTableModel ModeloEmpleado;
	private ControladorEmpleado controladoremp;
	private Empleado empleadoseleccionado;
	private RegistrarReserva volverMenu,registrar;
	private JButton btnBuscarEmpleado;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ReservaEmpleado(Inmueble inmueble,Cliente cliente,Empleado empleado) {
		
		
			
			controladoremp = new ControladorEmpleado();
			
		
		
		
			
			
	
			
		empleadoseleccionado = new Empleado();
			
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 984, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccion de Empleados");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(386, 0, 598, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Filtro:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel_1);
		
		InpEmpleado = new JTextField();
		InpEmpleado.setBounds(66, 75, 187, 20);
		panel.add(InpEmpleado);
		InpEmpleado.setColumns(10);
		
		btnBuscarEmpleado = new JButton("Buscar");
		btnBuscarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				BuscarEmpleado();
				
				
			}
		});
		btnBuscarEmpleado.setBounds(275, 74, 102, 23);
		panel.add(btnBuscarEmpleado);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(400, 74, 102, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		panel_1.setBounds(0, 126, 984, 635);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSeleccionado = new JLabel("Seleccion:");
		lblSeleccionado.setForeground(new Color(255, 255, 255));
		lblSeleccionado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccionado.setBounds(10, 0, 964, 22);
		panel_1.add(lblSeleccionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 964, 534);
		panel_1.add(scrollPane);
		
		String[] CamposEmpleados = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","Contraseña"};
		ModeloEmpleado = new DefaultTableModel(CamposEmpleados,0);
		tablaEmpleado = new JTable(ModeloEmpleado);
		scrollPane.setViewportView(tablaEmpleado);
		VerEmpleados();
		
		
		
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
				empleadoseleccionado = empleado;
					
				volverMenu = new RegistrarReserva(inmueble,cliente,empleadoseleccionado);
					
					
				
				
				volverMenu.setLocationRelativeTo(null);
				
				volverMenu.setVisible(true);
				
				dispose();
				
				
				
				
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(48, 109, 105));
		btnNewButton_2.setBounds(20, 567, 143, 57);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Seleccionar");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if (empleadoseleccionado.getId_empleado() != 0) {
					
				registrar = new RegistrarReserva(inmueble,cliente,empleadoseleccionado);
					
				
				
				registrar.setLocationRelativeTo(null);
				
				registrar.setVisible(true);
				
				dispose();
			} else {
				
				JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado");
				
			}
				
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(new Color(48, 109, 105));
		btnNewButton_2_1.setBounds(820, 567, 143, 57);
		panel_1.add(btnNewButton_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 114, 915, 2);
		contentPane.add(separator);
	
		 ListSelectionModel SeleccionEmpleados = tablaEmpleado.getSelectionModel();
		
		
		 SeleccionEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

       
        
		 SeleccionEmpleados.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tablaEmpleado.getSelectedRow();
                    if (selectedRow != -1) {
                        int id = (int) tablaEmpleado.getValueAt(selectedRow, 0);
                        String nombre = (String) tablaEmpleado.getValueAt(selectedRow, 1);
                        String apellido = (String) tablaEmpleado.getValueAt(selectedRow, 2);	           
                        LocalDate fecha = (LocalDate) tablaEmpleado.getValueAt(selectedRow, 3);
                        int dni = (int) tablaEmpleado.getValueAt(selectedRow, 4);
                        int telefono = (int) tablaEmpleado.getValueAt(selectedRow, 5);
                        String correo = (String) tablaEmpleado.getValueAt(selectedRow, 6);
                        String tipoempleado = (String) tablaEmpleado.getValueAt(selectedRow, 7);
                        String contraseña = (String) tablaEmpleado.getValueAt(selectedRow, 8);                      
                        lblSeleccionado.setText("Seleccionado: ID_empleado=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni   + ", Tipo empleado" + tipoempleado );
                        empleadoseleccionado.setId_empleado(id);
                        empleadoseleccionado.setNombre(nombre);
                        empleadoseleccionado.setApellido(apellido);
                        empleadoseleccionado.setFecha_nacimiento(fecha);
                        empleadoseleccionado.setDni(dni);
                        empleadoseleccionado.setTelefono(telefono);
                        empleadoseleccionado.setCorreo(correo);
                        empleadoseleccionado.setTipo_empleado(tipoempleado);
                        empleadoseleccionado.setContraseña(contraseña);                                    
                    }
                }
            }
        });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
public void VerEmpleados() {
	
	
		
	ModeloEmpleado.setRowCount(0);


	       
	        List<Empleado> empleados = controladoremp.getAllEmpleados();

		
	        for (Empleado empleado : empleados) {
			
	        	ModeloEmpleado.addRow(
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
		            						, empleado.getContraseña()
		            						, 
		            						}
		            		);
			
			
			
			
		}
		
		
		
		
	}
	
	
	public void BuscarEmpleado() {
		
		int contador=0;
		boolean flag=true;
		ModeloEmpleado.setRowCount(0);
		int numero=0;

	       
        List<Empleado> empleados = controladoremp.getAllEmpleados();
        
        
        
        
        

	try {
		
		 numero =Integer.parseInt(InpEmpleado.getText());
		
		
		
	}
	
	catch(Exception e){
		
		InpEmpleado.setText("Error debe contener un número");	
		flag = false;
		
	}
	
	if (flag == true) {
	
        for (Empleado empleado : empleados) {
		
        	if (numero == empleado.getId_empleado()) {
        	
        	ModeloEmpleado.addRow(
        			
        			
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
	            						, empleado.getContraseña()
	            						, 
	            						}
	            		);
		
		
		
	contador++;	
	}
		
        }
		
		
	} 
		
		
		if (flag == true && contador == 0) {
			
			InpEmpleado.setText("No se encontro el empleado");
			
		}
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
