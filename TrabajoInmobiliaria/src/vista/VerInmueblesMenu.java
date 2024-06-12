package vista;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerInmueblesMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerInmueblesMenu frame = new VerInmueblesMenu();
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
	public VerInmueblesMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JButton btnVerListaCompleta = new JButton("Lista Completa de Inmuebles");
		btnVerListaCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerListaCompleta.setBounds(81, 130, 220, 55);
		contentPane.add(btnVerListaCompleta);
		
		JButton btnInmueblesDisp = new JButton("Ver Inmuebles Disponibles");
		btnInmueblesDisp.setBounds(509, 130, 220, 55);
		contentPane.add(btnInmueblesDisp);
		
		JButton btnActivarInmueble = new JButton("Activar Inmuebles");
		btnActivarInmueble.setBounds(509, 262, 220, 55);
		contentPane.add(btnActivarInmueble);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(81, 262, 220, 55);
		contentPane.add(btnVolver);
	}
}
