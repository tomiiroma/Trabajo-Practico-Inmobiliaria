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

public class PantallaContrato2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaContrato2 frame = new PantallaContrato2();
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
	public PantallaContrato2() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVerContrato = new JButton("Ver Contratos");
		btnVerContrato.setForeground(Color.WHITE);
		btnVerContrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerContrato.setBorder(null);
		btnVerContrato.setBackground(new Color(48, 109, 105));
		btnVerContrato.setBounds(403, 195, 278, 35);
		contentPane.add(btnVerContrato);
		
		btnVerContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					VerContratos verContratos = new VerContratos();
					dispose();
				}
			});
		
		
		
		JButton btnNuevoContrato = new JButton("Nuevo Contrato\r\n");
		btnNuevoContrato.setForeground(Color.WHITE);
		btnNuevoContrato.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevoContrato.setBorder(null);
		btnNuevoContrato.setBackground(new Color(48, 109, 105));
		btnNuevoContrato.setBounds(92, 195, 278, 35);
		contentPane.add(btnNuevoContrato);
		
		btnNuevoContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					NuevoContrato nuevoContrato = new NuevoContrato();
					dispose();
				}
			});
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(29, 407, 150, 34);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                PantallaGerente pantallaAgente = new PantallaGerente();
					dispose();
				}
			});
		
		
	}
}
