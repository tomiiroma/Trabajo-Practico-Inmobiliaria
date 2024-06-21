package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.InmuebleControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;


import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservaInmueble extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable tableInmuebles;
	private DefaultTableModel ModeloInmuebles;
	private InmuebleControlador inmueblecontrolador;
	private Inmueble inmuebleseleccionado;
	private RegistrarReserva VolverMenu;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ReservaInmueble(Inmueble inmueble,Cliente cliente,Empleado empleado) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
			
			inmueblecontrolador = new InmuebleControlador();
			
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 114, 915, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 984, 103);
		contentPane.add(panel);
		
		JLabel lblSeleccionDeInmuebles = new JLabel("Seleccion de Inmuebles");
		lblSeleccionDeInmuebles.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblSeleccionDeInmuebles.setBounds(386, 0, 598, 42);
		panel.add(lblSeleccionDeInmuebles);
		
		JLabel lblNewLabel_1 = new JLabel("Filtro:");
		lblNewLabel_1.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 75, 162, 20);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(249, 74, 102, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(375, 74, 102, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 126, 984, 635);
		contentPane.add(panel_1);
		
		JLabel lblInmuebleSeleccionado = new JLabel("Seleccion:");
		lblInmuebleSeleccionado.setBounds(10, 0, 964, 22);
		panel_1.add(lblInmuebleSeleccionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 964, 534);
		panel_1.add(scrollPane);
		
		
		String[] ColumnasInmueble = {"ID", "Tipo Inmueble", "Piso", "Ambientes", "Barrio", "Dirección","Altura Dirección",
			    "Precio", "Disponible", "Condición","M2 Sup. Cubierta","¿Tiene Patio?","¿Refacción?"};
		ModeloInmuebles = new DefaultTableModel(ColumnasInmueble,0);
		tableInmuebles = new JTable(ModeloInmuebles);
		MostrarInmuebles();
		
		
		scrollPane.setViewportView(tableInmuebles);
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					
					VolverMenu = new RegistrarReserva(inmueble,cliente,empleado);
					
				
				
				VolverMenu.setLocationRelativeTo(null);
				
				VolverMenu.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnNewButton_2.setBounds(279, 567, 143, 57);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Seleccionar");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 
					if (inmuebleseleccionado != null) {
					if (VolverMenu==null) {
						
						VolverMenu = new RegistrarReserva(inmuebleseleccionado,cliente,empleado);
						
					}
					
					VolverMenu.setLocationRelativeTo(null);
					
					VolverMenu.setVisible(true);
					
					dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Debes seleccionar un inmueble");
					
					
				}
				
				
				
				
				
			}
		});
		btnNewButton_2_1.setBounds(517, 567, 143, 57);
		panel_1.add(btnNewButton_2_1);
		
		
		
		ListSelectionModel selectionModelInmueble = tableInmuebles.getSelectionModel();
		
		
		selectionModelInmueble.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Agregar un escuchador de selección
        
		selectionModelInmueble.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tableInmuebles.getSelectedRow();
                    if (selectedRow != -1) {
                    	  int id = (int) tableInmuebles.getValueAt(selectedRow, 0);
                       //   String tipoInmueble = (String) tableInmuebles.getValueAt(selectedRow, 1);
                          String piso = (String) tableInmuebles.getValueAt(selectedRow, 2);
                     //     String ambientes = (String) tableInmuebles.getValueAt(selectedRow, 3);
                          String barrio = (String) tableInmuebles.getValueAt(selectedRow, 4);
                          String direccion = (String) tableInmuebles.getValueAt(selectedRow, 5);
                          String altura = (String) tableInmuebles.getValueAt(selectedRow, 6);
                          Double precio = (Double) tableInmuebles.getValueAt(selectedRow, 7);
                      //    boolean disponible = (boolean) tableInmuebles.getValueAt(selectedRow, 8);
                    //      String condicion = (String) tableInmuebles.getValueAt(selectedRow, 9);
                        lblInmuebleSeleccionado.setText("Seleccionado: ID_empleado=" + id + ", Barrio: "+barrio + ", Direccion: " +direccion+ ", Altura: "+altura  );
                        
                        inmuebleseleccionado =inmueblecontrolador.getInmuebleById(id);
                      
                    }
                }
            }
        });
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	  private void MostrarInmuebles() {
	       
		  ModeloInmuebles.setRowCount(0);

	        
	        List<Inmueble> inmuebles = inmueblecontrolador.getAllInmueble();

	       
	        for (Inmueble inmueble : inmuebles) {
	        	
	        	if(inmueble.isDisponible()==true){      		
	        		ModeloInmuebles.addRow(new Object[]{
	                        inmueble.getId_inmueble(),
	                        inmueble.getTipo_inmueble(),
	                        inmueble.getPiso(),
	                        inmueble.getCantAmbientes(),
	                        inmueble.getBarrio(),
	                        inmueble.getDireccion(),
	                        inmueble.getAlturaDireccion(),
	                        inmueble.getPrecio(),
	                        inmueble.isDisponible(),
	                        inmueble.getCondicion(),
	                        inmueble.getSuperficie_cubierta(),
	                        inmueble.isPatio(),
	                        inmueble.isRefaccionar()
	        		});
	        	}
	        }
			
			
		}

}
