package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ContratoControlador;
import controlador.InmuebleControlador;
import trabajoInmobiliaria.Contrato;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerContratos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel model;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerContratos frame = new VerContratos();
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
	public VerContratos() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ContratoControlador contratocont = new ContratoControlador();
		InmuebleControlador inmueblecont = new InmuebleControlador();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 118, 113));
		panel.setBounds(10, 11, 764, 34);
		contentPane.add(panel);
		
		JLabel lblTitulo = new JLabel("Contratos Actuales");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 24));
		panel.add(lblTitulo);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(30, 416, 150, 34);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PantallaContrato volver = new PantallaContrato();
					dispose();
				}
			});
		
		String [] columnNames = {"ID","Tipo","Descripcion","Documento","Inmueble","Cliente","Inicio","Finalizacion"};
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		actualizarTabla();
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(20, 56, 754, 349);
	    contentPane.add(scrollPane);
	    
	    JButton btnVerInmueble = new JButton("Ver Inmueble de Contrato\r\n");
	    btnVerInmueble.setForeground(Color.WHITE);
	    btnVerInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
	    btnVerInmueble.setBorder(null);
	    btnVerInmueble.setBackground(new Color(48, 109, 105));
	    btnVerInmueble.setBounds(571, 416, 189, 34);
	    contentPane.add(btnVerInmueble);
	    

	    btnVerInmueble.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	    int selectedRow = table.getSelectedRow();
	    	    if(selectedRow >= 0) {
	    		    int idInmueble = (int)table.getValueAt(selectedRow, 4);
		    		JOptionPane.showMessageDialog(null, inmueblecont.getInmuebleById(idInmueble));
	    	    }else {
	    	    	JOptionPane.showMessageDialog(null, "Seleccione una Columna");
	    	    }
	    	}
	    });
	    
	}
	
	
	private void actualizarTabla() {
		ContratoControlador contratocont = new ContratoControlador();

		model.setRowCount(0);
		
		List <Contrato> contratos = contratocont.getAllContrato();
		
		for (Contrato contrato : contratos) {
			model.addRow(
					new Object[] {
							contrato.getId_contrato(),
							contrato.getTipo_contrato(),
							contrato.getDescripcion(),
							contrato.getUrl_contrato(),
							contrato.getInmueble().getId_inmueble(),
							contrato.getCliente().getNombre()  + " " + contrato.getCliente().getApellido(),
							contrato.getInicio_contrato(),
							contrato.getFin_contrato()
					}
					);
		}
		
	}
	
}
