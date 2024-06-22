package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PantallaGerente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private OpcionesReserva menuReserva;
	private GestionEmpleadosOpciones menuEmpleado;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public PantallaGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnGestionar_inm = new JButton("Gestionar Inmuebles");
		btnGestionar_inm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionar_inm.setBounds(67, 24, 139, 23);
		contentPane.add(btnGestionar_inm);
		
		JButton btnNuevo_Cliente = new JButton("Nuevo Cliente\r\n");
		btnNuevo_Cliente.setBounds(252, 24, 104, 23);
		contentPane.add(btnNuevo_Cliente);
		
		JButton btnNueva_Op = new JButton("Nueva Operacion");
		btnNueva_Op.setBounds(410, 24, 147, 23);
		contentPane.add(btnNueva_Op);
		
		JButton btnNuevo_Contrato = new JButton("Nuevo Contrato");
		btnNuevo_Contrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevo_Contrato.setBounds(67, 107, 139, 23);
		contentPane.add(btnNuevo_Contrato);
		
		JButton btnBusqueda = new JButton("Realizar Busqueda");
		btnBusqueda.setBounds(252, 107, 109, 23);
		contentPane.add(btnBusqueda);
		
		JButton btnVisitas = new JButton("Reunion o visitas");
		btnVisitas.setBounds(410, 107, 147, 23);
		contentPane.add(btnVisitas);
		
		JButton btnPago = new JButton("Registrar Pagos");
		btnPago.setBounds(67, 185, 139, 23);
		contentPane.add(btnPago);
		
		JButton btnDocumento = new JButton("Nuevo Documento");
		btnDocumento.setBounds(235, 185, 121, 23);
		contentPane.add(btnDocumento);
		
		JButton btnOperaciones = new JButton("Últimas operaciones");
		btnOperaciones.setBounds(410, 185, 147, 23);
		contentPane.add(btnOperaciones);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				
			}
		});
		btnSalir.setBounds(261, 332, 117, 23);
		contentPane.add(btnSalir);
		
		JButton btnGestionReserva = new JButton("Gestionar reserva");
		btnGestionReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menuReserva = new OpcionesReserva();
				
				menuReserva.setLocationRelativeTo(null);
				
				menuReserva.setVisible(true);
				
				dispose();
				
			}
		});
		btnGestionReserva.setBounds(67, 249, 139, 23);
		contentPane.add(btnGestionReserva);
		
		JButton btnGestionReserva_1 = new JButton("Gestionar empleados");
		btnGestionReserva_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				menuEmpleado = new GestionEmpleadosOpciones();
				
				menuEmpleado.setLocationRelativeTo(null);
				
				menuEmpleado.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnGestionReserva_1.setBounds(235, 249, 139, 23);
		contentPane.add(btnGestionReserva_1);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
