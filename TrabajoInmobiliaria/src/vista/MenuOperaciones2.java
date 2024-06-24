package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MenuOperaciones2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOperaciones2 frame = new MenuOperaciones2();
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
	public MenuOperaciones2() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
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
		
		JLabel lblMenuOperaciones = new JLabel("Menu Operaciones");
		lblMenuOperaciones.setForeground(Color.WHITE);
		lblMenuOperaciones.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblMenuOperaciones.setBounds(10, 12, 661, 35);
		panel_1.add(lblMenuOperaciones);
		
		JButton btnCompraventa = new JButton("Realizar Compra/Venta Inmueble");
		btnCompraventa.setForeground(Color.WHITE);
		btnCompraventa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCompraventa.setBorder(null);
		btnCompraventa.setBackground(new Color(48, 109, 105));
		btnCompraventa.setBounds(93, 220, 278, 35);
		panel.add(btnCompraventa);
		
		btnCompraventa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuVenta menuVenta = new MenuVenta();
                dispose();
            }
        });
		
		
		JButton btnAlquiler = new JButton("Realizar Alquiler Inmueble");
		btnAlquiler.setForeground(Color.WHITE);
		btnAlquiler.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlquiler.setBorder(null);
		btnAlquiler.setBackground(new Color(48, 109, 105));
		btnAlquiler.setBounds(401, 220, 278, 35);
		panel.add(btnAlquiler);
		
		btnAlquiler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuAlquiler menuAlquiler = new MenuAlquiler();
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
                PantallaGerente pantallaAgente = new PantallaGerente();
                dispose();
            }
        });
		
		
	}
}
