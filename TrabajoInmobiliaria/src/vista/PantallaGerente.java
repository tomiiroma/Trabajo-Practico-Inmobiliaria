package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class PantallaGerente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-39,-21
	 */
	private final JTextPane textPane = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaGerente frame = new PantallaGerente();
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
	public PantallaGerente() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		JButton btnInmuebles = new JButton("Gestionar Inmuebles");
		btnInmuebles.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInmuebles.setBorder(null);
		btnInmuebles.setForeground(new Color(255, 255, 255));
		btnInmuebles.setBackground(new Color(48, 109, 105));
		btnInmuebles.setBounds(107, 136, 278, 35);
		panel.add(btnInmuebles);
		
		
		btnInmuebles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble verinmueblesCompleto = new MenuInmueble();
				dispose();
			}
		});
		
		

		
		
		
		
		JButton btnNuevoCliente = new JButton("Clientes");
		btnNuevoCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoCliente.setForeground(Color.WHITE);
		btnNuevoCliente.setBorder(null);
		btnNuevoCliente.setBackground(new Color(48, 109, 105));
		btnNuevoCliente.setBounds(415, 136, 278, 35);
		panel.add(btnNuevoCliente);
		btnNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PantallaCliente PantallaCliente = new PantallaCliente();
					dispose();
				}
			});
		
		
		
		
		JButton btnNuevaOperacion = new JButton("Nueva Operacion");
		btnNuevaOperacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevaOperacion.setForeground(Color.WHITE);
		btnNuevaOperacion.setBorder(null);
		btnNuevaOperacion.setBackground(new Color(48, 109, 105));
		btnNuevaOperacion.setBounds(107, 182, 278, 35);
		panel.add(btnNuevaOperacion);
		btnNuevaOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					MenuOperaciones menuOperaciones = new MenuOperaciones();
					dispose();
				}
			});
		
		
		
		
		
		JButton btnNuevoContrato = new JButton("Nuevo Contrato");
		btnNuevoContrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoContrato.setForeground(Color.WHITE);
		btnNuevoContrato.setBorder(null);
		btnNuevoContrato.setBackground(new Color(48, 109, 105));
		btnNuevoContrato.setBounds(415, 182, 278, 35);
		panel.add(btnNuevoContrato);
		
		btnNuevoContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaContrato contratosMenu = new PantallaContrato();
				dispose();
			}
		});
		
		
		JButton btnGestionarEmpleados = new JButton("Gestionar Empleados");
		btnGestionarEmpleados.setForeground(Color.WHITE);
		btnGestionarEmpleados.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGestionarEmpleados.setBorder(null);
		btnGestionarEmpleados.setBackground(new Color(48, 109, 105));
		btnGestionarEmpleados.setBounds(415, 320, 278, 35);
		panel.add(btnGestionarEmpleados);
		
		btnGestionarEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionEmpleadosOpciones menuEmpleados = new GestionEmpleadosOpciones();
				dispose();
			}
		});
		
		
		JButton btnAgendarReunionvisita = new JButton("Agendar Reunion/Visita");
		btnAgendarReunionvisita.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgendarReunionvisita.setForeground(Color.WHITE);
		btnAgendarReunionvisita.setBorder(null);
		btnAgendarReunionvisita.setBackground(new Color(48, 109, 105));
		btnAgendarReunionvisita.setBounds(107, 228, 278, 35);
		panel.add(btnAgendarReunionvisita);
		
		
		
		JButton btnRegistrarPago = new JButton("Registrar Pago");
		btnRegistrarPago.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrarPago.setForeground(Color.WHITE);
		btnRegistrarPago.setBorder(null);
		btnRegistrarPago.setBackground(new Color(48, 109, 105));
		btnRegistrarPago.setBounds(415, 228, 278, 35);
		panel.add(btnRegistrarPago);
		
		
		
		JButton btnNuevoDocumento = new JButton("Nuevo Documento");
		btnNuevoDocumento.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoDocumento.setForeground(Color.WHITE);
		btnNuevoDocumento.setBorder(null);
		btnNuevoDocumento.setBackground(new Color(48, 109, 105));
		btnNuevoDocumento.setBounds(107, 274, 278, 35);
		panel.add(btnNuevoDocumento);
		
		
		
		JButton btnVerOperaciones = new JButton("Ver Operaciones");
		btnVerOperaciones.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerOperaciones.setForeground(Color.WHITE);
		btnVerOperaciones.setBorder(null);
		btnVerOperaciones.setBackground(new Color(48, 109, 105));
		btnVerOperaciones.setBounds(415, 274, 278, 35);
		panel.add(btnVerOperaciones);
		
		
					
		
		JButton btnGestionReserva = new JButton("Gestionar Reserva");
		btnGestionReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGestionReserva.setForeground(Color.WHITE);
		btnGestionReserva.setBorder(null);
		btnGestionReserva.setBackground(new Color(48, 109, 105));
		btnGestionReserva.setBounds(107, 320, 278, 35);
		panel.add(btnGestionReserva);
		
		
		

		

		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(0, 0, 784, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("Salir");
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 27));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(133, 201, 196));
		btnNewButton_9.setBounds(659, 0, 125, 55);
		panel_1.add(btnNewButton_9);
		

		JLabel lblNewLabel = new JLabel("Inmobiliaria Panel Gerente");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 12, 668, 35);
		panel_1.add(lblNewLabel);
		
		

		
		

	}
}
