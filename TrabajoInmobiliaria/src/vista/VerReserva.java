package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Reserva;

public class VerReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VerReserva(Reserva reserva) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		JOptionPane.showMessageDialog(contentPane, reserva.toString());
	
		
		JOptionPane.showMessageDialog(contentPane, reserva.getInmueble().toString());
		JOptionPane.showMessageDialog(contentPane, reserva.getCliente().toString());
		JOptionPane.showMessageDialog(contentPane, reserva.getEmpleado().toString());
		
	}

}
