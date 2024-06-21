package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenteAgregado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones volverAlMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenteAgregado frame = new GerenteAgregado();
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
	public GerenteAgregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					
				volverAlMenu = new GestionEmpleadosOpciones();
					
				
				
				volverAlMenu.setLocationRelativeTo(null);
				
				volverAlMenu.setVisible(true);
				
				
				dispose();
			}
		});
		btnNewButton.setBounds(178, 185, 132, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Gerente agregado con exito.");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(103, 11, 381, 96);
		contentPane.add(lblNewLabel);
	}
}
