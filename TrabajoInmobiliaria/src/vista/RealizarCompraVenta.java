package vista;

import java.awt.EventQueue; 
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import controlador.CompradorControlador;
import trabajoInmobiliaria.Comprador;

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
import java.awt.Font;
import java.awt.Component;



public class RealizarCompraVenta extends JFrame {

	private JPanel contentPane;
    private DefaultTableModel modelComprador;
    private JLabel elemento;
    private JTable tabla_prop;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarCompraVenta frame = new RealizarCompraVenta();
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
	public RealizarCompraVenta() {
		 this.setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 1134, 690);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    contentPane.setBackground(new Color(52, 118, 113));

	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JButton btnVolver = new JButton("Volver");
	        btnVolver.setBounds(30, 570, 150, 34);
	        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
	        btnVolver.setForeground(new Color(255, 255, 255));
	        btnVolver.setBackground(new Color(48, 109, 105));
	        btnVolver.setBorder(null);
	        btnVolver.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                MenuVenta volver = new MenuVenta();
	                dispose();
	            }
	        });
	        contentPane.add(btnVolver);
	        
	        
	        CompradorControlador controladorComprador = new CompradorControlador();
			
			String[] columnNames = {"ID", "Nombre", "Apellido", "Correo", "Direccion", "Telefono", "Nacimiento", "DNI"};
			modelComprador = new DefaultTableModel(columnNames, 0);
			
			tabla_prop = new JTable(modelComprador);
			actualizarComprador();
			JScrollPane scrollPane_1 = new JScrollPane(tabla_prop);
			scrollPane_1.setBounds(30, 84, 1059, 475);
			contentPane.add(scrollPane_1);
			
			elemento = new JLabel();
			elemento.setForeground(new Color(255, 255, 255));
			elemento.setFont(new Font("Arial", Font.BOLD, 13));
			elemento.setBounds(29, 33, 1060, 51);
			contentPane.add(elemento);
			
			JButton btnSeleccionar = new JButton("Seleccionar");
			btnSeleccionar.setForeground(Color.WHITE);
			btnSeleccionar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnSeleccionar.setBorder(null);
			btnSeleccionar.setBackground(new Color(48, 109, 105));
			btnSeleccionar.setBounds(939, 570, 150, 34);
			contentPane.add(btnSeleccionar);
			
			
			
			
			ListSelectionModel selectionModel2 = tabla_prop.getSelectionModel();
			selectionModel2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			selectionModel2.addListSelectionListener(new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent e) {
					if (!e.getValueIsAdjusting()) {
						int selectedRow = tabla_prop.getSelectedRow();
						if (selectedRow != -1) {
							int id = (int) tabla_prop.getValueAt(selectedRow, 0);
							String nombre = (String) tabla_prop.getValueAt(selectedRow, 1);
							String apellido = (String) tabla_prop.getValueAt(selectedRow, 2);
							String correo = (String) tabla_prop.getValueAt(selectedRow, 3);
							String direccion = (String) tabla_prop.getValueAt(selectedRow, 4);
							int telefono = (int) tabla_prop.getValueAt(selectedRow, 5);
							LocalDate fechaNacimiento = (LocalDate) tabla_prop.getValueAt(selectedRow, 6);
							int dni = (int) tabla_prop.getValueAt(selectedRow, 7);

							elemento.setText("ID: " + id + ", Nombre:" + nombre + ", Apellido: " + apellido + ", Correo: " + correo + ", Direccion: " + direccion + ", Telefono: " + telefono + ", DNI=" + dni);
						}
					}
				}
			});
		}
		
	
		private void actualizarComprador() {
			CompradorControlador compradorcont = new CompradorControlador();
			modelComprador.setRowCount(0);
			List<Comprador> compradores = compradorcont.getAllComprador();
			for (Comprador comprador : compradores) {
				modelComprador.addRow(new Object[] {
						comprador.getId_cliente(),
						comprador.getNombre(),
						comprador.getApellido(),
						comprador.getCorreo(),
						comprador.getDireccion(),
						comprador.getTelefono(),
						comprador.getFecha_nacimiento(),
						comprador.getDni(),		
				});
			}
		}
}
