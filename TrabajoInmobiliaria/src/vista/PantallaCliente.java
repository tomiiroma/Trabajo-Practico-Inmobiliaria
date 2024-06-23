package vista;

import java.awt.EventQueue; 
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import controlador.InquilinoControlador;
import controlador.PropietarioControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Propietario;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;

public class PantallaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private DefaultTableModel modelInquilino;
    private DefaultTableModel modelPropietario;
    private JLabel elemento;

    private Inquilino seleccionadoInquilino;
    private JTable table;
    private JTable table_1;
    private JTable table_2;
    private Inquilino seleccionado;
    private JTextField textBusqueda;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaCliente frame = new PantallaCliente();
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
	public PantallaCliente() {
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Inquilino seleccionado = new Inquilino();
		InquilinoControlador controladorInquilino = new InquilinoControlador();
		PropietarioControlador controladorPropietario = new PropietarioControlador();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 213, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		
		

		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setForeground(Color.LIGHT_GRAY);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(48, 109, 105));
		btnModificar.setBounds(10, 130, 193, 43);
		panel.add(btnModificar);

		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
	  	btnAgregar.setForeground(Color.LIGHT_GRAY);
	  	btnAgregar.setBorder(null);
	  	btnAgregar.setBackground(new Color(48, 109, 105));
		btnAgregar.setBounds(10, 238, 193, 43);
		panel.add(btnAgregar);
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarCliente agregarCliente = new AgregarCliente();
				dispose();
			}
		});
		

		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(223, 89, 788, 361);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
        panel_1.setLayout(new BorderLayout());

		tabbedPane.addTab("Inquilinos", null, panel_1, null);
		JPanel panel_2 = new JPanel(new BorderLayout());
		tabbedPane.addTab("Propietarios", null, panel_2, null);
		
		

		

		String [] columnNames = {"ID","Nombre","Apellido","Correo","Direccion", "Telefono","Nacimiento","DNI"};
		modelInquilino = new DefaultTableModel(columnNames, 0);
		
		table = new JTable(modelInquilino);
		actualizarTabla();
		panel_1.add(table);
        JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		
		modelPropietario = new DefaultTableModel(columnNames, 0);
		actualizarPropietario();
		table_2 = new JTable(modelPropietario);
		panel_2.add(table_2);
		JScrollPane scrollPane_1 = new JScrollPane(table_2);
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		JTextArea elemento = new JTextArea();
		elemento.setFont(new Font("Arial", Font.BOLD, 13));
		elemento.setBounds(223, 0, 551, 51);
		contentPane.add(elemento);	
		
		  ListSelectionModel selectionModel = table.getSelectionModel();
	      selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	      selectionModel.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    int selectedRow = table.getSelectedRow();
	                    if (selectedRow != -1) {
	                        int id = (int) table.getValueAt(selectedRow, 0);
	                        String nombre = (String) table.getValueAt(selectedRow, 1);
	                        String apellido = (String) table.getValueAt(selectedRow, 2);
	                        String correo = (String) table.getValueAt(selectedRow, 3);
	                        String direccion = (String) table.getValueAt(selectedRow, 4);
	                        int telefono = (int) table.getValueAt(selectedRow, 5);
	                        LocalDate fechaNacimiento = (LocalDate) table.getValueAt(selectedRow, 6);
	                        int dni = (int) table.getValueAt(selectedRow, 7);

	                        elemento.setText("ID=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + " Correo=" + correo + "\nDireccion="+ direccion + " Telefono=" + telefono + " Fecha de Nacimiento=" + fechaNacimiento + "\nDNI=" + dni);
	                        
	                    }
	                }
	            }
	        });
	      
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(panel_1.isVisible()) {
						 int selectedRow = table.getSelectedRow();
			                int idInquilino = (int) table.getValueAt(selectedRow, 0);

							ModificarInquilino modificar = new ModificarInquilino(controladorInquilino.getInquilinoById(idInquilino));
							dispose();
					}else {
						 int selectedRow2 = table_2.getSelectedRow();
						 int idPropietario = (int) table_2.getValueAt(selectedRow2, 0);
							ModificarPropietario modificarprop = new ModificarPropietario(controladorPropietario.getPropietarioById(idPropietario));
							dispose();
					}
			       
					
				}
			});
	      

		
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(42, 414, 117, 36);
		panel.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAgente PantallaAgente =  new PantallaAgente();
				dispose();
			}
		});
		
		
		textBusqueda = new JTextField();
		textBusqueda.setBounds(233, 62, 116, 21);
		contentPane.add(textBusqueda);
		textBusqueda.setColumns(10);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(359, 62, 116, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel_1.isVisible()) {
					actualizarPorBusquedaInquilino(textBusqueda.getText());
				}else {
					actualizarPorBusquedaPropietario(textBusqueda.getText());
				}
			}
		});
		

		
	  	JButton btnEliminar = new JButton("Eliminar");
	  	btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
	  	btnEliminar.setForeground(Color.LIGHT_GRAY);
	  	btnEliminar.setBorder(null);
	  	btnEliminar.setBackground(new Color(48, 109, 105));
		btnEliminar.setBounds(10, 184, 193, 43);
		panel.add(btnEliminar);
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (panel_1.isVisible()) {
			        int selectedRow = table.getSelectedRow();

			        if (selectedRow == -1) {
			            System.out.println("Seleccione un valor");
			        } else {
			            try {
			                int id = (int) table.getValueAt(selectedRow, 0);
			                controladorInquilino.deleteInquilino(id);
			                actualizarTabla();
			            } catch (Exception e2) {
			                e2.printStackTrace();
			            }
			        }
			    } else {
			        PropietarioControlador propietariocont = new PropietarioControlador();
			        int selectedRow = table_2.getSelectedRow();
			        if (selectedRow == -1) {
			            System.out.println("Seleccione un valor");
			        } else {
			            try {
			                int id = (int) table_2.getValueAt(selectedRow, 0);
			                propietariocont.deletePropietario(id);
			                actualizarPropietario();
			            
			            } catch (Exception e2) {
			                e2.printStackTrace();
			            }
			        }
			    }
			}
			
			
		
			
		});
		
		  ListSelectionModel selectionModel2 = table_2.getSelectionModel();
		     selectionModel2.addListSelectionListener(new ListSelectionListener() {
		            @Override
		            public void valueChanged(ListSelectionEvent e) {
		                if (!e.getValueIsAdjusting()) {
		                    int selectedRow = table_2.getSelectedRow();
		                    if (selectedRow != -1) {
		                        int id = (int) table_2.getValueAt(selectedRow, 0);
		                        String nombre = (String) table_2.getValueAt(selectedRow, 1);
		                        String apellido = (String) table_2.getValueAt(selectedRow, 2);
		                        String correo = (String) table_2.getValueAt(selectedRow, 3);
		                        String direccion = (String) table_2.getValueAt(selectedRow, 4);
		                        int telefono = (int) table_2.getValueAt(selectedRow, 5);
		                        LocalDate fechaNacimiento = (LocalDate) table_2.getValueAt(selectedRow, 6);
		                        int dni = (int) table_2.getValueAt(selectedRow, 7);

		                        elemento.setText("ID=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + " Correo=" + correo + "\nDireccion="+ direccion + " Telefono=" + telefono + " Fecha de Nacimiento=" + fechaNacimiento + "\nDNI=" + dni);
		                        
		                    }
		                }
		            }
		        });
		  
	}
	private void actualizarInquilino() {
		
      
        
        elemento = new JLabel("Seleccionado");
        elemento.setBounds(223, 0, 488, 14);
        contentPane.add(elemento);
        
        
      
        
	
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        int id = (int) table.getValueAt(selectedRow, 0);
                        String nombre = (String) table.getValueAt(selectedRow, 1);
                        elemento.setText("Seleccionado: ID=" + id + ", Nombre=" + nombre);
         
                    }
                }
            }
        });
    }
 
	
     
	  private void actualizarTabla() {
		InquilinoControlador inquilinocont = new InquilinoControlador();

		modelInquilino.setRowCount(0);
		
		List<Inquilino> Inquilinos = inquilinocont.getAllInquilino();
		
		for (Inquilino inquilino : Inquilinos) {
			modelInquilino.addRow(new Object[] {
					inquilino.getId_cliente(),
					inquilino.getNombre(),
					inquilino.getApellido(),
					inquilino.getCorreo(),
					inquilino.getDireccion(),
					inquilino.getTelefono(),
					inquilino.getFecha_nacimiento(),
					inquilino.getDni(),		
			});
		}
	}
	
	private void actualizarPropietario() {
		PropietarioControlador propietariocont = new PropietarioControlador();
		modelPropietario.setRowCount(0);
		List<Propietario> propietarios = propietariocont.getAllPropietario();
		for (Propietario propietario : propietarios) {
			modelPropietario.addRow(new Object[] {
					propietario.getId_cliente(),
					propietario.getNombre(),
					propietario.getApellido(),
					propietario.getCorreo(),
					propietario.getDireccion(),
					propietario.getTelefono(),
					propietario.getFecha_nacimiento(),
					propietario.getDni(),		
			});
		}
	}
		
		  private void actualizarPorBusquedaInquilino( String criterio) {
				InquilinoControlador inquilinocont = new InquilinoControlador();

		        modelInquilino.setRowCount(0);

				List<Inquilino> Inquilinos = inquilinocont.getAllInquilino();

				for (Inquilino inquilino : Inquilinos) {
					if(inquilino.getNombre().contains(criterio)) {
						modelInquilino.addRow(new Object[] {
								inquilino.getId_cliente(),
								inquilino.getNombre(),
								inquilino.getApellido(),
								inquilino.getCorreo(),
								inquilino.getDireccion(),
								inquilino.getTelefono(),
								inquilino.getFecha_nacimiento(),
								inquilino.getDni(),		
						});
					}		
					} ;
				
				
							} 
		  private void actualizarPorBusquedaPropietario(String criterio) {
				PropietarioControlador propietariocont = new PropietarioControlador();

		        modelPropietario.setRowCount(0);

				List<Propietario> propietarios = propietariocont.getAllPropietario();

				for (Propietario propietario : propietarios) {
					if(propietario.getNombre().contains(criterio)) {
						modelPropietario.addRow(new Object[] {
								propietario.getId_cliente(),
								propietario.getNombre(),
								propietario.getApellido(),
								propietario.getCorreo(),
								propietario.getDireccion(),
								propietario.getTelefono(),
								propietario.getFecha_nacimiento(),
								propietario.getDni(),		
						});						
					}
					
					}		
		        }
		
}