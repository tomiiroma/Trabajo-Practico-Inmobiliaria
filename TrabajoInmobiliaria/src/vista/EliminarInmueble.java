package vista;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.InmuebleControlador;
import trabajoInmobiliaria.Inmueble;

import javax.swing.JTable;

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
		this.setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 870, 690);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);

	    controlador = new InmuebleControlador();

	    String[] columnNames = {"ID", "Tipo Inmueble", "Piso", "Ambientes", "Barrio", "Dirección",
	    "Precio", "Disponible", "Condición"};
	    model = new DefaultTableModel(columnNames, 0);
	    table = new JTable(model);

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 37, 834, 521);
	    contentPane.add(scrollPane);
        
	    
	    actualizarTabla();
	    
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 570, 150, 34);
        contentPane.add(btnVolver);
        
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble menuInmueble= new MenuInmueble();
				dispose();
			}
		});
        
        JButton btnEliminar = new JButton("Eliminar Inmueble");
        btnEliminar.setBounds(681, 569, 150, 34);
        contentPane.add(btnEliminar);
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
	                    inmueble.getPrecio(),
	                    inmueble.isDisponible(),
	                    inmueble.getCondicion()
	            });
	        }

			
			
	}

}
