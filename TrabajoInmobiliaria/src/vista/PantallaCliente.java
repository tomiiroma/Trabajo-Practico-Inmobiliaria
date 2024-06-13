package vista;

import java.awt.EventQueue; 
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.InquilinoControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Inquilino;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private DefaultTableModel model;
    private JTable table;
    private JLabel elemento;

    private Inquilino seleccionado;


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
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 109, 105));
		panel.setBounds(0, 0, 213, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(192, 192, 192));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(34, 79, 75));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(10, 184, 193, 43);
		panel.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setForeground(Color.LIGHT_GRAY);
		btnModificar.setBorder(null);
		btnModificar.setBackground(new Color(34, 79, 75));
		btnModificar.setBounds(10, 130, 193, 43);
		panel.add(btnModificar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setForeground(Color.LIGHT_GRAY);
		btnAgregar.setBorder(null);
		btnAgregar.setBackground(new Color(34, 79, 75));
		btnAgregar.setBounds(10, 238, 193, 43);
		panel.add(btnAgregar);
		
		
		String [] columnNames = {"ID Cliente","Nombre","Apellido","DNI","Nacimiento","Telefono","Correo","Direccion"};
		model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        actualizarTabla();
        contentPane.setLayout(null);
		
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(223, 38, 551, 412);
        contentPane.add(scrollPane);
        
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

      	model.setRowCount(0);
      	
      	List<Inquilino> Inquilinos = inquilinocont.getAllInquilino();
      	
      	for (Inquilino inquilino : Inquilinos) {
			model.addRow(
					new Object[] {
							inquilino.getId_cliente(),
							inquilino.getNombre(),
							inquilino.getApellido(),
							inquilino.getDni(),
							inquilino.getFecha_nacimiento(),
							inquilino.getTelefono(),
							inquilino.getCorreo(),
							inquilino.getDireccion()
					}
					);
		}
      }
}
