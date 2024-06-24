package vista;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.InmuebleControlador;
import trabajoInmobiliaria.Inmueble;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class EliminarInmueble extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel model;
    private InmuebleControlador controlador;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarInmueble frame = new EliminarInmueble();
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
	public EliminarInmueble() {
		setForeground(new Color(0, 128, 128));
		this.setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 1325, 690);
	    contentPane = new JPanel();
	    contentPane.setBackground(new Color(52, 118, 113));
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);

	    controlador = new InmuebleControlador();

	    String[] columnNames = {"ID", "Tipo Inmueble", "Piso", "Ambientes", "Barrio", "Dirección","Altura Dirección",
	    "Precio", "Disponible", "Condición","M2 Sup. Cubierta","¿Tiene Patio?","¿Refacción?"};
	    model = new DefaultTableModel(columnNames, 0);
	    table = new JTable(model);

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 37, 1289, 521);
	    contentPane.add(scrollPane);
        
		
        JTextArea elemento_1 = new JTextArea();
        elemento_1.setForeground(new Color(255, 255, 255));
        elemento_1.setBackground(new Color(0, 128, 128));
        elemento_1.setFont(new Font("Arial", Font.BOLD, 13));
        elemento_1.setBounds(10, 11, 1289, 32);
        elemento_1.setFocusable(false);
        contentPane.add(elemento_1);
    
        
        
        
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        int id = (int) table.getValueAt(selectedRow, 0);
                        String tipoInmueble = (String) table.getValueAt(selectedRow, 1);
                        String piso = (String) table.getValueAt(selectedRow, 2);
                        String ambientes = (String) table.getValueAt(selectedRow, 3);
                        String barrio = (String) table.getValueAt(selectedRow, 4);
                        String direccion = (String) table.getValueAt(selectedRow, 5);
                        String altura = (String) table.getValueAt(selectedRow, 6);
                        Double precio = (Double) table.getValueAt(selectedRow, 7);
                        boolean disponible = (boolean) table.getValueAt(selectedRow, 8);
                        String condicion = (String) table.getValueAt(selectedRow, 9);


              
                        elemento_1.setText("Seleccionado: ID: " + id 
                        		+ ", Tipo Inmueble: " + tipoInmueble 
                        		+", Piso: "+ piso
                        		+", Ambientes: "+ambientes
                        		+", Barrio: "+barrio
                        		+", Direccion: "+ direccion
                        		+", Altura: "+altura
                        		+", Precio: $"+precio
                        		+", Disponibilidad: "+disponible
                        		+", Condicion: "+condicion);                                            
                    }
                }
            }
        });
        
	    
	    actualizarTabla();
	    
        
        JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble menuInmueble = new MenuInmueble();
				dispose();
			}
		});
        btnVolver.setBounds(30, 570, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        contentPane.add(btnVolver);
        
        
        JButton btnEliminarInmueble = new JButton("Eliminar Inmueble");
        btnEliminarInmueble.setForeground(Color.WHITE);
        btnEliminarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEliminarInmueble.setBorder(null);
        btnEliminarInmueble.setBackground(new Color(48, 109, 105));
        btnEliminarInmueble.setBounds(1134, 570, 150, 34);
        contentPane.add(btnEliminarInmueble);
        
        JLabel lblInmuebleEliminado = new JLabel("Inmueble Eliminado Con Exito");
        lblInmuebleEliminado.setHorizontalAlignment(SwingConstants.CENTER);
        lblInmuebleEliminado.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblInmuebleEliminado.setBounds(417, 569, 508, 59);
        lblInmuebleEliminado.setVisible(false);
        contentPane.add(lblInmuebleEliminado);
        

        

        
        btnEliminarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                          
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Seleccione un inmueble para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        try {
                            int id = (int) table.getValueAt(selectedRow, 0);
                            controlador.deleteInmueble(id);
                            lblInmuebleEliminado.setVisible(true);
                            actualizarTabla();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                }
            }
        });
    

        
        
        
        
        
	}

	    private void actualizarTabla() {
	        // Limpiar el modelo de la tabla
	        model.setRowCount(0);

	        // Obtener la lista actualizada de inmuebles
	        List<Inmueble> inmuebles = controlador.getAllInmueble();

	        // Agregar los datos al modelo
	        for (Inmueble inmueble : inmuebles) {
	            model.addRow(new Object[]{
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
