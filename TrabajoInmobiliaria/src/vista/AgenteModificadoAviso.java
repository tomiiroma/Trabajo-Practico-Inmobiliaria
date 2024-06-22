package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgenteModificadoAviso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones volverMenu;
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public AgenteModificadoAviso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverMenu = new GestionEmpleadosOpciones();
				
				volverMenu.setLocationRelativeTo(null);
				
				volverMenu.setVisible(true);
				
				dispose();
				
			}
		});
		btnVolver.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnVolver.setBounds(146, 174, 134, 49);
		contentPane.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("Los datos del agente han sido modificados.");
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 36, 412, 75);
		contentPane.add(lblNewLabel);
	}
}
