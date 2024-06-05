package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionEmpleadosOpciones extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TipoEmpleado tipoempleado;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GestionEmpleadosOpciones() {
		//this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion de Empleados");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel.setBounds(274, 31, 600, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ver datos de los empleados");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(115, 200, 251, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ver datos");
		btnNewButton.setBounds(125, 259, 206, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Modificar empleado");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(562, 200, 206, 43);
		contentPane.add(lblNewLabel_2);
		
		JButton btnModificarEmpleado = new JButton("Modificar empleado");
		btnModificarEmpleado.setBounds(537, 259, 206, 43);
		contentPane.add(btnModificarEmpleado);
		
		JButton btnAgregarEmpleado = new JButton("Agregar empleado");
		btnAgregarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tipoempleado==null) {
					
					tipoempleado = new TipoEmpleado();
					
					
				}
				
				tipoempleado.setLocationRelativeTo(null);
				
				tipoempleado.setVisible(true);
				
				dispose();
				
				
				
			}
		});
		btnAgregarEmpleado.setBounds(125, 439, 206, 43);
		contentPane.add(btnAgregarEmpleado);
		
		JLabel lblNewLabel_3 = new JLabel("Agregar empleado");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(152, 380, 206, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Eliminar empleado");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(562, 380, 206, 43);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1_1 = new JButton("Eliminar empleado");
		btnNewButton_1_1.setBounds(537, 439, 206, 43);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Volver");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				MenuGestionEmpleados menuprincipalempleado = new MenuGestionEmpleados();

				menuprincipalempleado.setVisible(true);
				
				menuprincipalempleado.setLocationRelativeTo(null);
				
				dispose();
			
			}
		});
		btnNewButton_1_1_1.setBounds(333, 579, 206, 43);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Seleccionar operación");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(314, 124, 400, 35);
		contentPane.add(lblNewLabel_5);
	}

}
