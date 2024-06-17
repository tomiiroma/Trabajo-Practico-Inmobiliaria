package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaContrato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaContrato frame = new PantallaContrato();
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
	public PantallaContrato() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 109, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevoContrato = new JButton("Nuevo Contrato");
		btnNuevoContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoContrato nuevocontrato = new NuevoContrato();
				dispose();
			}
		});
		btnNuevoContrato.setForeground(Color.LIGHT_GRAY);
		btnNuevoContrato.setBorder(null);
		btnNuevoContrato.setBackground(new Color(34, 79, 75));
		btnNuevoContrato.setBounds(280, 196, 193, 43);
		contentPane.add(btnNuevoContrato);
		
		JButton btnEliminarContrato = new JButton("Eliminar Contrato");
		btnEliminarContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarContrato.setForeground(Color.LIGHT_GRAY);
		btnEliminarContrato.setBorder(null);
		btnEliminarContrato.setBackground(new Color(34, 79, 75));
		btnEliminarContrato.setBounds(280, 250, 193, 43);
		contentPane.add(btnEliminarContrato);
		
		JButton btnverContrato = new JButton("Ver Contratos");
		btnverContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerContratos vercontratos = new VerContratos();
				dispose();
			}
		});
		btnverContrato.setForeground(Color.LIGHT_GRAY);
		btnverContrato.setBorder(null);
		btnverContrato.setBackground(new Color(34, 79, 75));
		btnverContrato.setBounds(280, 142, 193, 43);
		contentPane.add(btnverContrato);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAgente pantallaagente = new PantallaAgente();
				dispose();
			}
		});
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(34, 79, 75));
		btnVolver.setBounds(280, 407, 193, 43);
		contentPane.add(btnVolver);
	}
}
