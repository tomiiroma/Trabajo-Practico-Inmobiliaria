package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuVenta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuVenta frame = new MenuVenta();
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
	public MenuVenta() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(0, 0, 784, 55);
		panel.add(panel_1);
		
		JButton btnNewButton_9 = new JButton("Salir");
		btnNewButton_9.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 27));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(133, 201, 196));
		btnNewButton_9.setBounds(659, 0, 125, 55);
		panel_1.add(btnNewButton_9);
		
		JLabel lblMenuVentas = new JLabel("Menu Ventas");
		lblMenuVentas.setForeground(Color.WHITE);
		lblMenuVentas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblMenuVentas.setBounds(10, 12, 661, 35);
		panel_1.add(lblMenuVentas);
		
		JButton btnRealizarVenta = new JButton("Realizar Compra/Venta Inmueble");
		btnRealizarVenta.setForeground(Color.WHITE);
		btnRealizarVenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRealizarVenta.setBorder(null);
		btnRealizarVenta.setBackground(new Color(48, 109, 105));
		btnRealizarVenta.setBounds(93, 220, 278, 35);
		panel.add(btnRealizarVenta);
		btnRealizarVenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RealizarCompraVenta realizarCompraVenta = new RealizarCompraVenta();
                dispose();
            }
        });
		
		
		JButton btnVerVentas = new JButton("Ver Ventas");
		btnVerVentas.setForeground(Color.WHITE);
		btnVerVentas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerVentas.setBorder(null);
		btnVerVentas.setBackground(new Color(48, 109, 105));
		btnVerVentas.setBounds(401, 220, 278, 35);
		panel.add(btnVerVentas);
		
		btnVerVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerVentas verVentas = new VerVentas();
                dispose();
            }
        });
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(28, 402, 150, 34);
		panel.add(btnVolver);
		
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuOperaciones volver = new MenuOperaciones();
                dispose();
            }
        });
		
		
	}
}
