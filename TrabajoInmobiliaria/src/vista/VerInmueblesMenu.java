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
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JButton btnVerListaCompleta = new JButton("Lista Completa de Inmuebles");
<<<<<<< HEAD
		btnVerListaCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerListaCompleta.setBounds(81, 130, 220, 55);
=======
		btnVerListaCompleta.setBounds(299, 130, 220, 55);
>>>>>>> dfc8f0e8d47d152c909565a21c38ea5f77334c97
		contentPane.add(btnVerListaCompleta);
		
		btnVerListaCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerListaInmueblesCompleta verinmueblesCompleto = new VerListaInmueblesCompleta();
				dispose();
			}
		});
				
		
		
		JButton btnInmueblesDisp = new JButton("Ver Inmuebles Disponibles");
		btnInmueblesDisp.setBounds(509, 130, 220, 55);
		contentPane.add(btnInmueblesDisp);
		
		btnInmueblesDisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerInmueblesDisponibles verinmueblesCompleto = new VerInmueblesDisponibles();
				dispose();
			}
		});
		
		
		JButton btnActivarInmueble = new JButton("Activar Inmuebles");
		btnActivarInmueble.setBounds(509, 262, 220, 55);
		contentPane.add(btnActivarInmueble);
		
		btnActivarInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActivarInmuebles activarInmueble = new ActivarInmuebles();
				dispose();
			}
		});
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(81, 262, 220, 55);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble menuInmueble = new MenuInmueble();
				dispose();
			}
		});
		
		
	}
}
