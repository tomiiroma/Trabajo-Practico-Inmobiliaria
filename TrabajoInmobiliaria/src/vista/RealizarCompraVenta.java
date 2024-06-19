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
import controlador.InmuebleControlador;
import controlador.PropietarioControlador;
import controlador.ReservaControlador;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.Reserva;

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

public class RealizarCompraVenta extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel modelComprador;
	private JLabel elemento;
	private JButton btnVerificarReserva;
	private JTable table;
	private DefaultTableModel model;
	private ReservaControlador controlador;

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
		setBounds(100, 100, 1325, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		controlador = new ReservaControlador();

		String[] columnNames = { "ID Reserva", "ID Inmueble","Tipo Inmueble","Direccion", "ID Comprador","Nombre","Apellido","Dni","Fecha Pago", "Monto", "Forma Pago", 
				"Tipo Reserva","ID Vendedor","Nombre","Apellido"};
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
                        int idInmueble = (int) table.getValueAt(selectedRow, 1);
                        String tipoInmueble = (String) table.getValueAt(selectedRow, 2);
                        String direccion = (String) table.getValueAt(selectedRow, 3);
                        int idCliente = (int) table.getValueAt(selectedRow, 4);
                        String nombreCliente = (String) table.getValueAt(selectedRow, 5);
                        String apellidoCliente = (String) table.getValueAt(selectedRow, 6);
                        int dniCliente = (int) table.getValueAt(selectedRow, 7);
                        LocalDate fecha= (LocalDate) table.getValueAt(selectedRow, 8);
                        double pago = (double)table.getValueAt(selectedRow, 9);
                        String formaPago = (String) table.getValueAt(selectedRow, 10);
                        String tipoReserva = (String) table.getValueAt(selectedRow, 11);
                        int idEmpleado = (int) table.getValueAt(selectedRow, 12);
                        String nombreEmpleado = (String) table.getValueAt(selectedRow, 13);
                        String apellidoEmpleado = (String) table.getValueAt(selectedRow, 14);


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
				MenuVenta volver = new MenuVenta();
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVolver);

		JButton btnVerificarReserva = new JButton("Confirmar Reserva");
		btnVerificarReserva.setForeground(Color.WHITE);
		btnVerificarReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerificarReserva.setBorder(null);
		btnVerificarReserva.setBackground(new Color(48, 109, 105));
		btnVerificarReserva.setBounds(1112, 575, 150, 34);
		
		btnVerificarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una reserva para continuar.");
                    return;
                }
                
                int id = (int) table.getValueAt(selectedRow, 0);

                Reserva reserva = controlador.getReservaById(id);

                
                ConfirmarVenta confirmarVenta = new ConfirmarVenta(reserva.getId_reserva(),reserva);
                confirmarVenta.setVisible(true);
                confirmarVenta.setLocationRelativeTo(null);
                dispose(); // Cerrar la ventana actual
			}
		});

		contentPane.add(btnVerificarReserva);
			
		

	}
	
    private void actualizarTabla() {
        // Limpiar el modelo de la tabla
        model.setRowCount(0);

        // Obtener la lista actualizada de inmuebles
        List<Reserva> reservas = controlador.getAllReserva();

        // Agregar los datos al modelo
        for (Reserva reserva : reservas) {
        	
        	if(reserva.getTipo_reserva().equals("Venta")){      		
        		model.addRow(new Object[]{
        				reserva.getId_reserva(),
        				reserva.getInmueble().getId_inmueble(),
        				reserva.getInmueble().getTipo_inmueble(),
        				reserva.getInmueble().getDireccion(),    
        				reserva.getCliente().getId_cliente(),
        				reserva.getCliente().getNombre(),
        				reserva.getCliente().getApellido(),
        				reserva.getCliente().getDni(),
        				reserva.getFecha_pago(),
        				reserva.getPago(),
        				reserva.getForma_pago(),
        				reserva.getTipo_reserva(),
        				reserva.getEmpleado().getId_empleado(),
        				reserva.getEmpleado().getNombre(),
        				reserva.getEmpleado().getApellido()

        		});
        	}
        }
		
		
	}
}
