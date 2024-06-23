package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ContratoControlador;
import controlador.InmuebleControlador;
import controlador.InquilinoControlador;
import controlador.PropietarioControlador;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Propietario;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NuevoContrato extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblimagen;
    private byte[] imagenData;
    private JTextField textInicio;
    private JTextField textFin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoContrato frame = new NuevoContrato();
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
	public NuevoContrato() {		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		InmuebleControlador inmueblecont = new InmuebleControlador();
		InquilinoControlador inquilinocont = new InquilinoControlador();
		PropietarioControlador propietariocont = new PropietarioControlador();
		ContratoControlador contratocont = new ContratoControlador();
		Cliente clientecont = new Cliente();

		
		JLabel lbltipo = new JLabel("Tipo de Contrato");
		lbltipo.setForeground(new Color(255, 255, 255));
		lbltipo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltipo.setBounds(34, 93, 128, 11);
		contentPane.add(lbltipo);
		
		JComboBox cbTipoContrato = new JComboBox();
		cbTipoContrato.setBounds(34, 115, 200, 24);
		contentPane.add(cbTipoContrato);
		cbTipoContrato.addItem("Alquiler");
		
		JLabel lblDescripcion = new JLabel("Descripción");
		lblDescripcion.setForeground(new Color(255, 255, 255));
		lblDescripcion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDescripcion.setBounds(517, 221, 128, 24);
		contentPane.add(lblDescripcion);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(517, 251, 200, 129);
		contentPane.add(textArea);
		
		JComboBox cbInmueble = new JComboBox();
		cbInmueble.setBounds(34, 187, 200, 24);
		contentPane.add(cbInmueble);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.setBounds(34, 262, 200, 24);
		contentPane.add(cbCliente);
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setForeground(new Color(255, 255, 255));
		lblInmueble.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInmueble.setBounds(34, 165, 128, 11);
		contentPane.add(lblInmueble);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setForeground(new Color(255, 255, 255));
		lblCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCliente.setBounds(34, 240, 200, 11);
		contentPane.add(lblCliente);
		
		JLabel lblimagen = new JLabel("Imagen");
		lblimagen.setForeground(new Color(255, 255, 255));
		lblimagen.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblimagen.setBounds(517, 397, 128, 18);
		contentPane.add(lblimagen);
		
		JButton btnImagen = new JButton("Seleccionar Imagen");
		btnImagen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarImagen();
			}
		});
		btnImagen.setForeground(Color.LIGHT_GRAY);
		btnImagen.setBorder(null);
		btnImagen.setBackground(new Color(48, 109, 105));
		btnImagen.setBounds(517, 426, 212, 34);
		contentPane.add(btnImagen);
		
		textInicio = new JTextField();
		textInicio.setBounds(517, 115, 200, 24);
		contentPane.add(textInicio);
		textInicio.setColumns(10);
		
		JLabel lblInicio = new JLabel("Inicio Contrato (YYYY-MM_DD)");
		lblInicio.setForeground(new Color(255, 255, 255));
		lblInicio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInicio.setBounds(517, 89, 236, 18);
		contentPane.add(lblInicio);
		
		JLabel lblFin = new JLabel("Fin de Contrato  (YYYY-MM_DD)");
		lblFin.setForeground(new Color(255, 255, 255));
		lblFin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFin.setBounds(517, 165, 226, 18);
		contentPane.add(lblFin);
		
		textFin = new JTextField();
		textFin.setColumns(10);
		textFin.setBounds(517, 185, 200, 24);
		contentPane.add(textFin);
		
		JButton btnVerLista = new JButton("Ver Lista");
		btnVerLista.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerInmueblesDisponibles2 verInmuebles = new VerInmueblesDisponibles2();
				dispose();
			}
		});
		
		btnVerLista.setForeground(Color.LIGHT_GRAY);
		btnVerLista.setBorder(null);
		btnVerLista.setBackground(new Color(48, 109, 105));
		btnVerLista.setBounds(244, 187, 95, 23);
		contentPane.add(btnVerLista);
		
		JButton btnAgregarContrato = new JButton("Agregar Contrato");
		btnAgregarContrato.setFont(new Font("Tahoma", Font.BOLD, 12));

		btnAgregarContrato.setForeground(Color.LIGHT_GRAY);
		btnAgregarContrato.setBorder(null);
		btnAgregarContrato.setBackground(new Color(48, 109, 105));
		btnAgregarContrato.setBounds(579, 485, 150, 34);
		contentPane.add(btnAgregarContrato);
		
		JLabel lblApto = new JLabel("Tipo de Contrato");
		lblApto.setForeground(new Color(255, 255, 255));
		lblApto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblApto.setBounds(34, 308, 128, 24);
		contentPane.add(lblApto);
		
		JComboBox cbApto = new JComboBox();
		cbApto.setBounds(34, 333, 200, 24);
		contentPane.add(cbApto);
		cbApto.addItem("Si");
		cbApto.addItem("No");
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(29, 11, 724, 55);
		contentPane.add(panel_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Registrar Nuevo Contrato\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1.add(lblGestorPropiedades_1);
		
		
		
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(48, 109, 105));
		btnVolver.setBounds(30, 485, 150, 34);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PantallaContrato volver = new PantallaContrato();
					dispose();
				}
			});
		
		


		List<Inmueble> Inmueble = inmueblecont.getAllInmueble();

	    for (Inmueble inmuebles : Inmueble) {
        	if(inmuebles.isDisponible()==true){      		
	    		
        		cbInmueble.addItem(inmuebles.getId_inmueble());
	    	}
	    	
		}
	    
		List<Inquilino> Inquilino = inquilinocont.getAllInquilino();
		for (Inquilino inquilino : Inquilino) {
			cbCliente.addItem(inquilino.getId_cliente());
		}
		
		List<Propietario> Propietario = propietariocont.getAllPropietario();
		for (Propietario propietario : Propietario) {
			cbCliente.addItem(propietario.getId_cliente());
		}
		
		
		

		btnAgregarContrato.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int inmuebleselec = (int) cbInmueble.getSelectedItem();
		        int clienteselec = (int) cbCliente.getSelectedItem();
		        Inmueble inmuebleseleccionado = inmueblecont.getInmuebleById(inmuebleselec);
		        Cliente clienteseleccionado = inquilinocont.getInquilinoById(clienteselec);
		        
		        String tipoContrato = cbTipoContrato.getSelectedItem().toString();
		        String descripcion = textArea.getText();
		        boolean aptoMascota;
		        
		        if(cbApto.getSelectedItem().toString().equals("Si")) {
		            aptoMascota = true;
		        } else {
		            aptoMascota = false;
		        }

		        byte[] byteimagen = imagenData;

		        if (!textInicio.getText().isEmpty() && !textFin.getText().isEmpty() && !textArea.getText().isEmpty()) {
		            if (VerificarFecha(textInicio.getText())) {
		                if (VerificarFecha(textFin.getText())) {
		                    LocalDate fechaInicio = LocalDate.parse(textInicio.getText());
		                    LocalDate fechaFin = LocalDate.parse(textFin.getText());

		                    contratocont.addContrato(new Contrato(0, tipoContrato, descripcion, byteimagen, inmuebleseleccionado, clienteseleccionado, fechaInicio, fechaFin, aptoMascota));
		                    JOptionPane.showMessageDialog(null, "Contrato creado exitosamente");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Escribe la fecha de fin en el formato correcto");
		                }
		            } else {
		                JOptionPane.showMessageDialog(null, "Escribe la fecha de inicio en el formato correcto");
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Completa todos los campos");
		        }
		    }
		});
		
		
	}
	  private void seleccionarImagen() {
	        JFileChooser fileChooser = new JFileChooser();
	        int result = fileChooser.showOpenDialog(this);
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File file = fileChooser.getSelectedFile();
	            lblimagen.setText(file.getName());
	            imagenData = leerImagen(file);
	        }
	    }
    
    private byte[] leerImagen(File file) {
        byte[] bFile = new byte[(int) file.length()];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read(bFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bFile;
    }
    
    private boolean VerificarFecha(String fechaString) {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	
    	try {
    		LocalDate fecha = LocalDate.parse(fechaString, formatter);
    		return true;
    	}catch(DateTimeParseException e){
    		return false;
    	}
    }
}
