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
import controlador.ContratoControlador;
import controlador.ControladorCliente;
import controlador.ControladorEmpleado;
import controlador.InmuebleControlador;
import controlador.PropietarioControlador;
import controlador.ReservaControlador;
import controlador.VentaControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.Venta;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
public class VerVentas extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel modelComprador;
	private JLabel elemento;
	private JButton btnVerificarReserva;
	private JTable table;
	private DefaultTableModel model;
	private VentaControlador controlador;
	private ControladorCliente controlador2;
	private ControladorEmpleado controlador3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerVentas frame = new VerVentas();
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
	public VerVentas() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1518, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		controlador = new VentaControlador();
		controlador2 = new ControladorCliente();
		controlador3 = new ControladorEmpleado();

		String[] columnNames = { "ID Venta", 
								"ID Inmueble",
								"Tipo Inmueble",
								"Direccion",
								"ID Comprador",
								"Nombre",
								"Apellido",
								"Pago Total", 
								"Forma Pago",
								"ID Empleado",
								"Tipo Empleado",
								"Nombre",
								"Apellido"
								,"ID RESERVA"};
		
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 37, 1471, 521);
	    contentPane.add(scrollPane);
		
	    
        JTextArea elemento_1 = new JTextArea();
        elemento_1.setForeground(new Color(255, 255, 255));
        elemento_1.setBackground(new Color(52, 118, 113));    
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
                        
                        int idInmueble = (int) table.getValueAt(selectedRow, 1);
                        
                        String tipoInmueble = (String) table.getValueAt(selectedRow, 2);
                        String direccion = (String) table.getValueAt(selectedRow, 3);

                        int idCliente = (int) table.getValueAt(selectedRow, 4);
                        String nombreCliente = (String) table.getValueAt(selectedRow, 5);
                        String apellidoCliente = (String) table.getValueAt(selectedRow, 6);
                        

                        double pago = (double)table.getValueAt(selectedRow, 7);
                        String formaPago = (String) table.getValueAt(selectedRow, 8);
                        
                        int idEmpleado = (int) table.getValueAt(selectedRow, 9);
                        String nombreEmpleado = (String) table.getValueAt(selectedRow, 10);
                        String apellidoEmpleado = (String) table.getValueAt(selectedRow, 11);
                        
                        String tipoEmpleado = (String) table.getValueAt(selectedRow, 12);
                        
                      
                        int idReserva  = (int) table.getValueAt(selectedRow, 13);
                        



                    }
                }
            }
        });
		
	    actualizarTabla();

		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(48, 575, 150, 34);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBorder(null);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuVenta menuVenta = new MenuVenta();
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVolver);


			
		

	}
	
	private void actualizarTabla() {
	    model.setRowCount(0);

	    List<Venta> ventas = controlador.getAllVentas();

	    for (Venta venta : ventas) {
	        Inmueble inmueble = venta.getInmueble();
	        Comprador comprador = venta.getComprador();
	        Empleado empleado = venta.getEmpleado();
	        Reserva reserva = venta.getReserva();
	        
	        if (inmueble == null || comprador == null || empleado == null || reserva == null) {
	            continue;
	        }

	        model.addRow(new Object[]{
	            venta.getId_venta(),
	            inmueble.getId_inmueble(),
	            inmueble.getTipo_inmueble(),
	            inmueble.getDireccion(),
	            comprador.getId_cliente(),
	            comprador.getNombre(),
	            comprador.getApellido(),
	            venta.getMonto_total(),
	            venta.getForma_pago(),
	            empleado.getId_empleado(),
	            empleado.getNombre(),
	            empleado.getApellido(),
	            venta.getTipo_empleado(),
	           
	            reserva.getId_reserva()
	        });
	    }
	}
	


}
