package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import controlador.AgenteControlador;
import trabajoInmobiliaria.Agente;



public class ModificarEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private AgenteControlador agentecontrolador = new AgenteControlador();
	private DefaultTableModel mt;
	private GestionEmpleadosOpciones opciones;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public ModificarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 182, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (opciones == null) {
					
					opciones = new GestionEmpleadosOpciones();
					
					
				}
				
				opciones.setVisible(true);
				
				opciones.setLocationRelativeTo(null);
				
				dispose();
			}
		});
		btnVolver.setBounds(43, 599, 89, 23);
		panel.add(btnVolver);
		
	
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(181, 0, 803, 661);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Agentes", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabla de agentes");
		lblNewLabel.setBounds(305, 0, 458, 63);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 61, 751, 2);
		panel_1.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 106, 751, 435);
		panel_1.add(scrollPane);
		
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_agente"};
		mt = new DefaultTableModel(ColumNames, 0);
		table = new JTable(mt);
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 565, 751, 2);
		panel_1.add(separator_1);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBounds(337, 578, 132, 44);
		panel_1.add(btnNewButton);
		VerEmpleados();
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Gerentes", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		JButton btnAgente = new JButton("Agentes");
		btnAgente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		
		btnAgente.setBounds(43, 263, 89, 23);
		panel.add(btnAgente);
	
		
		
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tabbedPane.setSelectedIndex(1);
			
			}
		});
		btnGerentes.setBounds(43, 313, 89, 23);
		panel.add(btnGerentes);
		
	}
	
	public void VerEmpleados() {
		
        mt.setRowCount(0);


	       
	        List<Agente> agentes = agentecontrolador.getAllAgente();

		
	        for (Agente agente : agentes) {
			
	        	 mt.addRow(
		            		new Object[]
		            				{
		            					agente.getId_empleado()
		            						, agente.getNombre()
		            						, agente.getApellido()
		            						, agente.getFecha_nacimiento()
		            						, agente.getDni()
		            						, agente.getTelefono()
		            						, agente.getCorreo()
		            						, agente.getTipo_empleado()
		            						, agente.getContraseña()
		            						, agente.getId_agente()
		            						}
		            		);
			
			
			
			
		}
		
		
		
		
	}
	
	
}
