package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ReservaRegistrada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private OpcionesReserva volverAlmenu;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ReservaRegistrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolverMenu = new JButton("Volver");
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverAlmenu = new OpcionesReserva();
				
				volverAlmenu.setLocationRelativeTo(null);
				
				volverAlmenu.setVisible(true);
				
			}
		});
		btnVolverMenu.setBounds(110, 170, 251, 35);
		contentPane.add(btnVolverMenu);
		
		JLabel lblNewLabel = new JLabel("Reserva registrada con exito.");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 26));
		lblNewLabel.setBounds(55, 25, 429, 78);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
