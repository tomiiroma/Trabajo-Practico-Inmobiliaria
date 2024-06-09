package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaAgente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PantallaAgente() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionar_inm = new JButton("Gestionar Inmuebles");
		btnGestionar_inm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionar_inm.setBounds(67, 58, 139, 23);
		contentPane.add(btnGestionar_inm);
		
		JButton btnNuevo_Cliente = new JButton("Nuevo Cliente\r\n");
		btnNuevo_Cliente.setBounds(215, 58, 89, 23);
		contentPane.add(btnNuevo_Cliente);
		
		JButton btnNueva_Op = new JButton("Nueva Operacion");
		btnNueva_Op.setBounds(348, 58, 89, 23);
		contentPane.add(btnNueva_Op);
		
		JButton btnNuevo_Contrato = new JButton("Nuevo Contrato");
		btnNuevo_Contrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevo_Contrato.setBounds(67, 123, 139, 23);
		contentPane.add(btnNuevo_Contrato);
		
		JButton btnBusqueda = new JButton("Realizar Busqueda");
		btnBusqueda.setBounds(215, 123, 89, 23);
		contentPane.add(btnBusqueda);
		
		JButton btnVisitas = new JButton("Reunion o visitas");
		btnVisitas.setBounds(348, 123, 89, 23);
		contentPane.add(btnVisitas);
		
		JButton btnPago = new JButton("Registrar Pagos");
		btnPago.setBounds(93, 185, 89, 23);
		contentPane.add(btnPago);
		
		JButton btnDocumento = new JButton("Nuevo Documento");
		btnDocumento.setBounds(215, 185, 89, 23);
		contentPane.add(btnDocumento);
		
		JButton btnOperaciones = new JButton("Últimas operaciones");
		btnOperaciones.setBounds(348, 185, 89, 23);
		contentPane.add(btnOperaciones);
	}

}
