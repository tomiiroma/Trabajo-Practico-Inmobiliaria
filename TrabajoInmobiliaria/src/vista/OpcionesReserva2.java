package vista;

import java.awt.EventQueue;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Cliente;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OpcionesReserva2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private RegistrarReserva nuevaReserva;
    private ListaReserva listaR;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesReserva2 frame = new OpcionesReserva2();
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
	public OpcionesReserva2() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ver Reservas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					listaR = new ListaReserva();
					
				
				
				listaR.setLocationRelativeTo(null);
				
				listaR.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(48, 109, 105));
		btnNewButton.setBounds(406, 207, 278, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNuevaReserva = new JButton("Nueva Reserva");
		btnNuevaReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Empleado empleado = null;
				Inmueble inmueble = null;
				Cliente cliente = null;
				
					
					nuevaReserva = new RegistrarReserva(inmueble,cliente,empleado);
					
					
				
				
				nuevaReserva.setLocationRelativeTo(null);
				
				nuevaReserva.setVisible(true);
				
				dispose();
				
				
				
				
			}
		});
		btnNuevaReserva.setForeground(Color.WHITE);
		btnNuevaReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevaReserva.setBorder(null);
		btnNuevaReserva.setBackground(new Color(48, 109, 105));
		btnNuevaReserva.setBounds(94, 207, 278, 35);
		contentPane.add(btnNuevaReserva);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				PantallaGerente pantallaGerente = new PantallaGerente();

				pantallaGerente.setVisible(true);
				
				pantallaGerente.setLocationRelativeTo(null);
				
				dispose();
				
				
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(37, 397, 150, 34);
		contentPane.add(btnVolver);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(0, 0, 794, 56);
		contentPane.add(panel_1);
		
		JLabel lblMenuReservas = new JLabel("Menu Reservas\r\n");
		lblMenuReservas.setForeground(Color.WHITE);
		lblMenuReservas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblMenuReservas.setBounds(10, 12, 661, 35);
		panel_1.add(lblMenuReservas);
	}
}
