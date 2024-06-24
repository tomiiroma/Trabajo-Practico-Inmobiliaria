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

public class MenuAgendarReunionVisita2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAgendarReunionVisita2 frame = new MenuAgendarReunionVisita2();
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
	public MenuAgendarReunionVisita2() {
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
		
		JButton btnNuevaVisita = new JButton("Agendar Nueva Visita\r\n");
		btnNuevaVisita.setForeground(Color.WHITE);
		btnNuevaVisita.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevaVisita.setBorder(null);
		btnNuevaVisita.setBackground(new Color(48, 109, 105));
		btnNuevaVisita.setBounds(93, 220, 278, 35);
		panel.add(btnNuevaVisita);
		
	//	btnNuevaVisita.addActionListener(new ActionListener() {
		//       public void actionPerformed(ActionEvent e) {
		//       	NuevaVisita nuevaVisita = new NuevaVisita();
		//      	dispose();
		//     }
		//   });
		
		
		JButton btnNuevaReunion = new JButton("Agendar Nueva Reunion\r\n\r\n");
		btnNuevaReunion.setForeground(Color.WHITE);
		btnNuevaReunion.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevaReunion.setBorder(null);
		btnNuevaReunion.setBackground(new Color(48, 109, 105));
		btnNuevaReunion.setBounds(401, 220, 278, 35);
		panel.add(btnNuevaReunion);
		

		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(28, 402, 150, 34);
		panel.add(btnVolver);
		
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				PantallaGerente pantallaGerente = new PantallaGerente();
                dispose();
            }
        });
	}

}
