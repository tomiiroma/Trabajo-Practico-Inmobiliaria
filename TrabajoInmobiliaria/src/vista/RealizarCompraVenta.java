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
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.Inmueble;
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
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;



public class RealizarCompraVenta extends JFrame {

    private JPanel contentPane;
    private DefaultTableModel modelComprador;
    private JLabel elemento;
    private JTable tabla_prop;
    private JComboBox<String> cbComprador;
    private JComboBox<String> cbInmueble;
    private JComboBox<String> cbPropietario;

    private JButton btnVerificarReserva;
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
	        setBounds(100, 100, 1031, 506);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    contentPane.setBackground(new Color(52, 118, 113));

	        setContentPane(contentPane);

	        JPanel panel_1 = new JPanel();
	        panel_1.setLayout(null);
	        panel_1.setBackground(new Color(133, 201, 196));
	        panel_1.setBounds(30, 11, 956, 55);
	        contentPane.add(panel_1);
	        
	        
	        
	        JLabel lblGestorPropiedades_1 = new JLabel("Nueva Venta");
	        lblGestorPropiedades_1.setForeground(Color.WHITE);
	        lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
	        lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
	        panel_1.add(lblGestorPropiedades_1);
	        

	        JLabel lblSeleccionarComprador = new JLabel("Seleccionar Comprador:");
	        lblSeleccionarComprador.setForeground(Color.WHITE);
	        lblSeleccionarComprador.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblSeleccionarComprador.setBounds(30, 90, 181, 15);
	        contentPane.add(lblSeleccionarComprador);
	        
	        cbComprador = new JComboBox<String>();
	        cbComprador.setBounds(30, 105, 956, 25);
	        contentPane.add(cbComprador);
	        
	        
	        JLabel lblSeleccionarInmueble = new JLabel("Seleccionar Inmueble:");
	        lblSeleccionarInmueble.setForeground(Color.WHITE);
	        lblSeleccionarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblSeleccionarInmueble.setBounds(30, 231, 181, 15);
	        contentPane.add(lblSeleccionarInmueble);
	        
	        cbInmueble = new JComboBox<String>();
	        cbInmueble.setBounds(30, 247, 956, 25);
	        contentPane.add(cbInmueble);
	        
	        
	        
	        JLabel lblSeleccionarPropietario = new JLabel("Seleccionar Propietario / Vendedor\r\n:");
	        lblSeleccionarPropietario.setForeground(Color.WHITE);
	        lblSeleccionarPropietario.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblSeleccionarPropietario.setBounds(30, 158, 225, 15);
	        contentPane.add(lblSeleccionarPropietario);
	        
	        cbPropietario = new JComboBox<String>();
	        cbPropietario.setBounds(30, 173, 956, 25);
	        contentPane.add(cbPropietario);
	        
	        
	        
	        
	        JButton btnVolver = new JButton("Volver");
	        btnVolver.setBounds(30, 415, 150, 34);
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
	        
	        
	        JButton btnVerificarReserva = new JButton("Verificar Reserva");
	        btnVerificarReserva.setForeground(Color.WHITE);
	        btnVerificarReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
	        btnVerificarReserva.setBorder(null);
	        btnVerificarReserva.setBackground(new Color(48, 109, 105));
	        btnVerificarReserva.setBounds(836, 415, 150, 34);
	        contentPane.add(btnVerificarReserva);
	        

	        
	        cargarDatos();
  
		}
	        

	        
	     private void cargarDatos() {
	     CompradorControlador compradorControlador = new CompradorControlador();
		     List<Comprador> compradores = compradorControlador.getAllComprador();
		     	for (Comprador comprador : compradores) {
		        cbComprador.addItem(comprador.toString());  
		          }
		           
		     	
		 PropietarioControlador propietarioControlador = new PropietarioControlador();
		 	List<Propietario> propietarios = propietarioControlador.getAllPropietario();
				 for (Propietario propietario : propietarios) {
				 cbPropietario.addItem(propietario.toString());  
				 }        
		           
				 //Disponible false, pq en teoria ya se habria reservado y activo true ya q esta activo en una operacion
		  InmuebleControlador inmuebleControlador = new InmuebleControlador();
			List<Inmueble> inmuebles = inmuebleControlador.getAllInmueble();
	        for (Inmueble inmueble : inmuebles) {
	            if (!inmueble.isDisponible() && inmueble.isActivo()) {
	                cbInmueble.addItem(inmueble.toString()); 
	            }            
	        }
	    

	        
	        
	        
	}
}
