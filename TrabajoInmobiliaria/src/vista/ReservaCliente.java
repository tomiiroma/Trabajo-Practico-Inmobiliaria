package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import controlador.InquilinoControlador;

import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import controlador.CompradorControlador;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ReservaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BuscadorCliente;
	private JTable tableCliente;
	private DefaultTableModel ModeloCliente;
	private Cliente Clienteseleccionado;
	private RegistrarReserva VolverMenu;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ReservaCliente(Inmueble inmueble,Cliente cliente,Empleado empleado) {
		
		
		
		if (cliente == null) {
			
			Clienteseleccionado = new Cliente();
			
		} else {
			
			
			Clienteseleccionado = cliente;}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 114, 915, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setLayout(null);
		panel.setBounds(0, 0, 984, 103);
		contentPane.add(panel);
		
		JLabel lblSeleccionCliente = new JLabel("Seleccion de Clientes");
		lblSeleccionCliente.setForeground(new Color(255, 255, 255));
		lblSeleccionCliente.setFont(new Font("Verdana", Font.BOLD, 18));
		lblSeleccionCliente.setBounds(386, 0, 598, 42);
		panel.add(lblSeleccionCliente);
		
		JLabel lblNewLabel_1 = new JLabel("Filtro:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel_1);
		
		BuscadorCliente = new JTextField();
		BuscadorCliente.setColumns(10);
		BuscadorCliente.setBounds(66, 75, 187, 20);
		panel.add(BuscadorCliente);
		
		JButton InpCliente = new JButton("Buscar");
		InpCliente.setForeground(Color.WHITE);
		InpCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		InpCliente.setBorder(null);
		InpCliente.setBackground(new Color(48, 109, 105));
		InpCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				MostrarCliente();
				
			}
		});
		InpCliente.setBounds(275, 74, 102, 23);
		panel.add(InpCliente);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 MostrarInquilino();
				 MostrarPropietarios();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(48, 109, 105));
		btnNewButton_1.setBounds(400, 74, 102, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 118, 113));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 126, 984, 635);
		contentPane.add(panel_1);
		
		JLabel lblClienteseleccionado = new JLabel("Seleccion:");
		lblClienteseleccionado.setForeground(new Color(255, 255, 255));
		lblClienteseleccionado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClienteseleccionado.setBounds(10, 0, 964, 22);
		panel_1.add(lblClienteseleccionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 964, 534);
		panel_1.add(scrollPane);
		
		
		String [] ColumnasClientes = {"Nombre","Id_cliente","Apellido","Correo","Direccion","Telefono","Fecha_nacimiento","DNI"};
		ModeloCliente = new DefaultTableModel(ColumnasClientes,0);
		tableCliente = new JTable(ModeloCliente);
		scrollPane.setViewportView(tableCliente);
		MostrarInquilino();
		MostrarPropietarios();
		
		
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
					
					
					
					VolverMenu = new RegistrarReserva(inmueble,cliente,empleado);
					
				
			
				

			
				VolverMenu.setLocationRelativeTo(null);
			
				VolverMenu.setVisible(true);
			
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
	
				if (Clienteseleccionado.getId_cliente()!=0) {
				
					
					 
						 
						 
						 
					 
					
					
					VolverMenu = new RegistrarReserva(inmueble,Clienteseleccionado,empleado);
					
				
				
				VolverMenu.setLocationRelativeTo(null);
				
				VolverMenu.setVisible(true);
				
				dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente");
				
				
			}}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(new Color(48, 109, 105));
		btnNewButton_2_1.setBounds(818, 567, 143, 57);
		panel_1.add(btnNewButton_2_1);
		
		 ListSelectionModel selectionModelCliente = tableCliente.getSelectionModel();
		
		 selectionModelCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


		
		 selectionModelCliente.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tableCliente.getSelectedRow();
                    if (selectedRow != -1) {
                        String nombre = (String) tableCliente.getValueAt(selectedRow, 0);
                        int id = (int) tableCliente.getValueAt(selectedRow, 1);
                        String apellido = (String) tableCliente.getValueAt(selectedRow, 2);	           
                        String correo = (String) tableCliente.getValueAt(selectedRow, 3);
                        String Direccion = (String) tableCliente.getValueAt(selectedRow, 4);
                        int telefono = (int) tableCliente.getValueAt(selectedRow, 5);
                        LocalDate fecha = (LocalDate) tableCliente.getValueAt(selectedRow, 6);
                        int dni = (int) tableCliente.getValueAt(selectedRow, 7);                                 
                        lblClienteseleccionado.setText("Seleccionado: ID_Cliente=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Dni: " + dni);
                        Clienteseleccionado.setNombre(nombre);
                        Clienteseleccionado.setId_cliente(id);
                        Clienteseleccionado.setApellido(apellido);
                        Clienteseleccionado.setCorreo(correo);
                        Clienteseleccionado.setDireccion(Direccion);
                        Clienteseleccionado.setTelefono(telefono);
                        Clienteseleccionado.setFecha_nacimiento(fecha);
                        Clienteseleccionado.setDni(dni);
                        
                      
                    }
                }
            }
        });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	 private void MostrarInquilino() {
			InquilinoControlador inquilinocont = new InquilinoControlador();

			ModeloCliente.setRowCount(0);
			
			List<Inquilino> Inquilinos = inquilinocont.getAllInquilino();
			
			for (Inquilino inquilino : Inquilinos) {
				ModeloCliente.addRow(new Object[] {
						inquilino.getNombre(),
						inquilino.getId_cliente(),
						inquilino.getApellido(),
						inquilino.getCorreo(),
						inquilino.getDireccion(),
						inquilino.getTelefono(),
						inquilino.getFecha_nacimiento(),
						inquilino.getDni(),
								
				});
			}
		}
	
	 private void MostrarPropietarios() {
			CompradorControlador compradorcontrol = new CompradorControlador();

			
			
			List<Comprador> compradores = compradorcontrol.getAllComprador();
			
			for (Comprador comprador : compradores) {
				ModeloCliente.addRow(new Object[] {
						comprador.getNombre(),
						comprador.getId_cliente(),
						comprador.getApellido(),
						comprador.getCorreo(),
						comprador.getDireccion(),
						comprador.getTelefono(),
						comprador.getFecha_nacimiento(),
						comprador.getDni(),		
				});
			}
		}
	
	
	 
	 private void MostrarCliente() {
		 
		 int contador = 0, id_cliente = 0;
		 
		 boolean flag=true;
		 
		 try {
			
			 id_cliente = Integer.parseInt(BuscadorCliente.getText());
			 
			 
		} catch (Exception e) {
			
			flag=false;
			
			BuscadorCliente.setText("Error solo numeros");
			
		}
		 
			InquilinoControlador inquilinocont = new InquilinoControlador();

			ModeloCliente.setRowCount(0);

			CompradorControlador compradorcontrol = new CompradorControlador();

			List<Comprador> compradores = compradorcontrol.getAllComprador();
			
			
			List<Inquilino> Inquilinos = inquilinocont.getAllInquilino();
			
			if (flag==true) {
			
				
			for (Inquilino inquilino : Inquilinos) {
				
			if (id_cliente == inquilino.getId_cliente()) {	
				ModeloCliente.addRow(new Object[] {
						inquilino.getNombre(),
						inquilino.getId_cliente(),
						inquilino.getApellido(),
						inquilino.getCorreo(),
						inquilino.getDireccion(),
						inquilino.getTelefono(),
						inquilino.getFecha_nacimiento(),
						inquilino.getDni(),
								
				});
			contador++;	
			}
			
			} 
			
			if (contador == 0) {
				
				for (Comprador comprador : compradores) {
					if (id_cliente == comprador.getId_cliente()) {
						
					ModeloCliente.addRow(new Object[] {
							comprador.getNombre(),
							comprador.getId_cliente(),
							comprador.getApellido(),
							comprador.getCorreo(),
							comprador.getDireccion(),
							comprador.getTelefono(),
							comprador.getFecha_nacimiento(),
							comprador.getDni(),		
					});
						contador++;
					}
				}
				
				
			if (contador == 0 && flag == true) {
				
				BuscadorCliente.setText("No existe un cliente con esa id.");
				
				
			}	
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		 
	 } 
		 
		 
		 
		 
		 
		 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
