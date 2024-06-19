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
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.Reserva;

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
    private JComboBox<String> cbReserva;
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
	        

	        JLabel lblSeleccionarReservaCompra = new JLabel("Seleccionar Reserva:");
	        lblSeleccionarReservaCompra.setForeground(Color.WHITE);
	        lblSeleccionarReservaCompra.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblSeleccionarReservaCompra.setBounds(30, 114, 181, 15);
	        contentPane.add(lblSeleccionarReservaCompra);
	        
	        cbReserva = new JComboBox<String>();
	        cbReserva.setBounds(30, 129, 956, 124);
	        contentPane.add(cbReserva);
	        
	        
	        
	        
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
	     ReservaControlador reservaControlador = new ReservaControlador();
		     List<Reserva> reservas = reservaControlador.getAllReserva();
		     	for (Reserva reserva : reservas) {

		     		
		        cbReserva.addItem(reserva.toString());  
		          }
		           
		     	
	    

	        
	        
	        
	}
}
