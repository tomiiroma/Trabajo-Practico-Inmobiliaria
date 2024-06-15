package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarEmpleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private GestionEmpleadosOpciones volverOpciones;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EliminarEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 231, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (volverOpciones == null) {
					
					volverOpciones = new GestionEmpleadosOpciones();
					
				}
				
				volverOpciones.setLocationRelativeTo(null);
				
				volverOpciones.setVisible(true);
				
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(61, 581, 107, 32);
		panel.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(230, 55, 754, 606);
		contentPane.add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		tabbedPane.addTab("Agentes", null, toolBar, null);
		
		JPanel panel_1 = new JPanel();
		toolBar.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Agentes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(335, 0, 401, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccionado:");
		lblNewLabel_2.setBounds(10, 40, 726, 23);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Buscar por dni:");
		lblNewLabel_3.setBounds(10, 69, 115, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(105, 66, 177, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscarAgente = new JButton("Buscar");
		btnBuscarAgente.setBounds(292, 65, 89, 23);
		panel_1.add(btnBuscarAgente);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 94, 693, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 527, 693, 2);
		panel_1.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 110, 693, 404);
		panel_1.add(scrollPane);
		
		JButton btnEliminarAgente = new JButton("Eliminar");
		btnEliminarAgente.setBounds(288, 535, 162, 34);
		panel_1.add(btnEliminarAgente);
		
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("Gerentes", null, toolBar_1, null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		toolBar_1.add(panel_1_1);
		
		JLabel lblGerente = new JLabel("Gerentes");
		lblGerente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGerente.setBounds(335, 0, 401, 34);
		panel_1_1.add(lblGerente);
		
		JLabel lblGerentes = new JLabel("Seleccionado:");
		lblGerentes.setBounds(10, 40, 726, 23);
		panel_1_1.add(lblGerentes);
		
		JLabel lblBuscadorGerentes = new JLabel("Buscar por dni:");
		lblBuscadorGerentes.setBounds(10, 69, 115, 14);
		panel_1_1.add(lblBuscadorGerentes);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(105, 66, 177, 20);
		panel_1_1.add(textField_1);
		
		JButton btnBuscarAgente_1 = new JButton("Buscar");
		btnBuscarAgente_1.setBounds(292, 65, 89, 23);
		panel_1_1.add(btnBuscarAgente_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 94, 693, 2);
		panel_1_1.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 527, 693, 2);
		panel_1_1.add(separator_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 110, 693, 404);
		panel_1_1.add(scrollPane_1);
		
		JButton btnEliminarGerente = new JButton("Eliminar");
		btnEliminarGerente.setBounds(288, 535, 162, 34);
		panel_1_1.add(btnEliminarGerente);
		
		JLabel lblNewLabel = new JLabel("Eliminar empleados");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(532, -2, 452, 46);
		contentPane.add(lblNewLabel);
		
		
		JButton btnAgentes = new JButton("Agentes");
		btnAgentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		btnAgentes.setBounds(61, 183, 107, 32);
		panel.add(btnAgentes);
		
		
		
		JButton btnGerentes = new JButton("Gerentes");
		btnGerentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		btnGerentes.setBounds(61, 257, 107, 32);
		panel.add(btnGerentes);
		
		
	}
}
