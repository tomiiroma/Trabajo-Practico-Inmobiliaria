package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import controlador.AgenteControlador;
import trabajoInmobiliaria.Agente;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaAgente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel mt;
	private JTable table;
	private AgenteControlador agentecontrolador = new AgenteControlador();
	private GestionEmpleadosOpciones panel = new GestionEmpleadosOpciones();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAgente frame = new ListaAgente();
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
	public ListaAgente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTítulo = new JLabel("Lista de agentes");
		lblTítulo.setFont(new Font("Verdana", Font.PLAIN, 28));
		lblTítulo.setBounds(374, 11, 508, 49);
		contentPane.add(lblTítulo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 90, 901, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 566, 901, 2);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 107, 888, 437);
		contentPane.add(scrollPane);
		
		String[] ColumNames = {"Id_empleado","Nombre","Apellido","Fecha_nac","dni","telefono","correo","tipo_empleado","contraseña","id_agente"};
		mt = new DefaultTableModel(ColumNames, 0);
		table = new JTable(mt);
		scrollPane.setColumnHeaderView(table);
		
		
		 scrollPane.setViewportView(table);
		 
		 JButton btnVolver = new JButton("Volver");
		 btnVolver.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 	panel.setVisible(true);
		 	
		 	panel.setLocationRelativeTo(null);
		 	
		 	dispose();
		 		
		 		
		 		
		 	}
		 });
		 btnVolver.setFont(new Font("Verdana", Font.PLAIN, 16));
		 btnVolver.setBounds(445, 589, 116, 49);
		 contentPane.add(btnVolver);
		 MostrarAgentes();
		   

		
		 
		
	}
	
	  private void MostrarAgentes() {
	        // Limpiar el modelo de la tabla
	        mt.setRowCount(0);

	        // Obtener la lista actualizada de usuarios
	        List<Agente> agentes = agentecontrolador.getAllAgente();

	        // Agregar los datos al modelo
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
