package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Reserva;

import javax.swing.JLabel;

public class ConfirmarVenta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @param reserva 
	 */
	public ConfirmarVenta(int id,Reserva reserva) {
		 this.setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 964, 660);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    contentPane.setBackground(new Color(52, 118, 113));

		setContentPane(contentPane);
		
		
		
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 548, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RealizarCompraVenta volver = new RealizarCompraVenta();
                dispose();
            }
        });
        contentPane.setLayout(null);
        contentPane.add(btnVolver);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        panel_1.setBounds(30, 11, 890, 55);
        contentPane.add(panel_1);
        
        JLabel lblGestorPropiedades_1 = new JLabel("Nueva Venta");
        lblGestorPropiedades_1.setForeground(Color.WHITE);
        lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
        panel_1.add(lblGestorPropiedades_1);
		
	}
}
