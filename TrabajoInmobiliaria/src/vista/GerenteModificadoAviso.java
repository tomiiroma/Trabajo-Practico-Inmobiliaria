package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenteModificadoAviso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionEmpleadosOpciones volverMenu;

	/**
	 * Launch the application.
	 */
	
	
	
	
	/**
	 * Create the frame.
	 */
	public GerenteModificadoAviso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLosDatosDel = new JLabel("Los datos del gerente han sido modificados.");
		lblLosDatosDel.setForeground(new Color(128, 255, 0));
		lblLosDatosDel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblLosDatosDel.setBounds(22, 36, 412, 75);
		contentPane.add(lblLosDatosDel);
		
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
	}

}
