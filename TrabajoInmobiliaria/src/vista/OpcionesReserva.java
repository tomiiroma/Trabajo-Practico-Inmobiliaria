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

public class OpcionesReserva extends JFrame {

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
					OpcionesReserva frame = new OpcionesReserva();
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
	public OpcionesReserva() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOpcionesReserva = new JLabel("Reservas");
		lblOpcionesReserva.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblOpcionesReserva.setBounds(275, 11, 409, 60);
		contentPane.add(lblOpcionesReserva);
		
		JButton btnNewButton = new JButton("Ver Reservas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					listaR = new ListaReserva();
					
				
				
				listaR.setLocationRelativeTo(null);
				
				listaR.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnNewButton.setBounds(60, 173, 193, 47);
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
		btnNuevaReserva.setBounds(444, 173, 193, 47);
		contentPane.add(btnNuevaReserva);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				PantallaGerente pantallagerente = new PantallaGerente();

				pantallagerente.setVisible(true);
				
				pantallagerente.setLocationRelativeTo(null);
				
				dispose();
				
				
			}
		});
		btnVolver.setBounds(185, 304, 307, 47);
		contentPane.add(btnVolver);
	}
}
