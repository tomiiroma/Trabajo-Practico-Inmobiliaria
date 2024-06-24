package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Reserva;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable TablaInmueble;
	private DefaultTableModel Inmobiliariamodelo;
	private ListaReserva listas;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VerReserva(Reserva reserva) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		
	
		
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Detalles de la reserva");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(245, 11, 513, 37);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 66, 720, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 458, 720, 2);
		contentPane.add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(32, 82, 720, 359);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDetalles = new JLabel("Número de reserva: " + reserva.getId_reserva());
		lblDetalles.setForeground(new Color(255, 255, 255));
		lblDetalles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetalles.setBounds(10, 0, 336, 33);
		panel.add(lblDetalles);
		
		JLabel lblDetallesReserva = new JLabel("<html><p>Detalles Reserva: <br></p>"+"<p>Inmueble id: " + reserva.getInmueble().getId_inmueble() +"</p></html>");
		lblDetallesReserva.setForeground(new Color(255, 255, 255));
		lblDetallesReserva.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetallesReserva.setBounds(10, 36, 336, 42);
		panel.add(lblDetallesReserva);
		
		
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 99, 700, 52);
		panel.add(scrollPane);
		
		String [] Titulos = {"Tipo Inmb","Dirección","Altura dirección","Nro Dpt","Cant Ambientes","Piso","Barrio","Antiguedad","Baño","Dormitorio","Patio","Precio"};
		Inmobiliariamodelo = new DefaultTableModel(Titulos,0);
		TablaInmueble = new JTable(Inmobiliariamodelo);
		scrollPane.setViewportView(TablaInmueble);
		
		JLabel lblCliente = new JLabel("Dni del cliente: "+reserva.getCliente().getDni());
		lblCliente.setForeground(new Color(255, 255, 255));
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCliente.setBounds(505, 30, 205, 24);
		panel.add(lblCliente);
		
		JLabel lblCliente_1 = new JLabel("Fecha reserva: "+reserva.getFecha_pago());
		lblCliente_1.setForeground(new Color(255, 255, 255));
		lblCliente_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCliente_1.setBounds(505, 0, 205, 24);
		panel.add(lblCliente_1);
		
		JLabel lblCliente_2 = new JLabel("Dni del Empleado: "+reserva.getEmpleado().getDni());
		lblCliente_2.setForeground(new Color(255, 255, 255));
		lblCliente_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCliente_2.setBounds(505, 60, 205, 24);
		panel.add(lblCliente_2);
		
		JLabel lblFormaPago = new JLabel("Forma de pago: "+reserva.getForma_pago());
		lblFormaPago.setForeground(new Color(255, 255, 255));
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFormaPago.setBounds(10, 182, 188, 24);
		panel.add(lblFormaPago);
		
		JLabel lblCostoReserva = new JLabel("Costo de la reserva: "+reserva.getPago());
		lblCostoReserva.setForeground(new Color(255, 255, 255));
		lblCostoReserva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostoReserva.setBounds(10, 294, 438, 24);
		panel.add(lblCostoReserva);
		
		JLabel lblTipoOperacion = new JLabel("Tipo de operación"+reserva.getTipo_reserva());
		lblTipoOperacion.setForeground(new Color(255, 255, 255));
		lblTipoOperacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoOperacion.setBounds(10, 239, 438, 14);
		panel.add(lblTipoOperacion);
		
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (listas == null ) {
					
					
					listas = new ListaReserva();
					
					
				}
				
			
				listas.setLocationRelativeTo(null);
				
				listas.setVisible(true);
				
				dispose();
				
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(32, 482, 128, 44);
		contentPane.add(btnVolver);
		
		
		MostrarDatosInmueble(reserva);
		
	}
	
	
	public void MostrarDatosInmueble(Reserva reserva) {
		
		Inmobiliariamodelo.setRowCount(0);
		
		Inmobiliariamodelo.addRow( new Object[] {
				reserva.getInmueble().getTipo_inmueble(),
				reserva.getInmueble().getDireccion(),
				reserva.getInmueble().getAlturaDireccion(),
				reserva.getInmueble().getNroDepto(),
				reserva.getInmueble().getCantAmbientes(),
				reserva.getInmueble().getPiso(),
				reserva.getInmueble().getBarrio(),
				reserva.getInmueble().getAntiguedad(),
				reserva.getInmueble().getBanio(),
				reserva.getInmueble().getDormitorio(),
				reserva.getInmueble().isPatio(),
				reserva.getInmueble().getPrecio()
				
				
		} 
				
				
				
				
		
		
				);
		
		
	}
	
	
	
}
