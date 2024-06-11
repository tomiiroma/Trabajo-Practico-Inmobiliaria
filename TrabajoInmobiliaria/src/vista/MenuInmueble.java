package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuInmueble extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInmueble frame = new MenuInmueble();
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
	public MenuInmueble() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVerInmuebles = new JButton("Ver Inmuebles");
		btnVerInmuebles.setBounds(301, 117, 220, 55);
		btnVerInmuebles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVerInmuebles);
		
		JButton btnAgregarInmueble = new JButton("Agregar Inmuebles");
		btnAgregarInmueble.setBounds(301, 200, 220, 55);
		contentPane.add(btnAgregarInmueble);
		
		JButton btnModificarInmueble = new JButton("Modificar Inmuebles");
		btnModificarInmueble.setBounds(301, 298, 220, 55);
		contentPane.add(btnModificarInmueble);
		
		JButton btnEliminarInmueble = new JButton("Eliminar Inmuebles");
		btnEliminarInmueble.setBounds(301, 391, 220, 55);
		contentPane.add(btnEliminarInmueble);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(301, 486, 220, 55);
		contentPane.add(btnVolver);
	}
}
