package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.Font;

public class PantallaAgente extends JFrame {

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
					PantallaAgente frame = new PantallaAgente();
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
	public PantallaAgente() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
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
		btnInmuebles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble verinmueblesCompleto = new MenuInmueble();
				dispose();
			}
		});
		
		
		btnInmuebles.setBorder(null);
		btnInmuebles.setForeground(new Color(255, 255, 255));
		btnInmuebles.setBackground(new Color(48, 109, 105));
		btnInmuebles.setBounds(107, 136, 278, 35);
		panel.add(btnInmuebles);
		
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
		
		JButton btnNuevoContrato = new JButton("Contratos");
		btnNuevoContrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoContrato.setForeground(Color.WHITE);
		btnNuevoContrato.setBorder(null);
		btnNuevoContrato.setBackground(new Color(48, 109, 105));
		btnNuevoContrato.setBounds(415, 182, 278, 35);
		panel.add(btnNuevoContrato);
		
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
		
		JButton btnNewButton_6 = new JButton("Nuevo Documento");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(48, 109, 105));
		btnNewButton_6.setBounds(107, 274, 278, 35);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Ver Operaciones");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(new Color(48, 109, 105));
		btnNewButton_7.setBounds(415, 274, 278, 35);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Gestionar Reserva");
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7_1.setForeground(Color.WHITE);
		btnNewButton_7_1.setBorder(null);
		btnNewButton_7_1.setBackground(new Color(48, 109, 105));
		btnNewButton_7_1.setBounds(244, 320, 278, 35);
		panel.add(btnNewButton_7_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(0, 0, 784, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("Salir");
		btnNewButton_9.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 27));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(133, 201, 196));
		btnNewButton_9.setBounds(659, 0, 125, 55);
		panel_1.add(btnNewButton_9);
		
		JLabel lblNewLabel = new JLabel("Inmobiliaria");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 12, 240, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(302, 85, 199, 22);
		panel.add(lblNewLabel_1);
	}
}
