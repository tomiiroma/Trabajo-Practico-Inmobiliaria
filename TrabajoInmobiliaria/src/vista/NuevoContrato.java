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
		InmuebleControlador inmueblecont = new InmuebleControlador();
		InquilinoControlador inquilinocont = new InquilinoControlador();
		PropietarioControlador propietariocont = new PropietarioControlador();
		ContratoControlador contratocont = new ContratoControlador();
		Cliente clientecont = new Cliente();
		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 109, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(34, 79, 75));
		btnVolver.setBounds(10, 416, 128, 34);
		contentPane.add(btnVolver);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaContrato pantallacontrato = new PantallaContrato();
				dispose();
			}
		});
		
		
		JLabel lbltipo = new JLabel("Tipo de Contrato");
		lbltipo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltipo.setBounds(34, 80, 128, 24);
		contentPane.add(lbltipo);
		
		JComboBox cbTipoContrato = new JComboBox();
		cbTipoContrato.setBounds(34, 115, 200, 24);
		contentPane.add(cbTipoContrato);
		cbTipoContrato.addItem("Alquiler");
		cbTipoContrato.addItem("Venta");
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDescripcion.setBounds(34, 150, 128, 24);
		contentPane.add(lblDescripcion);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(34, 180, 200, 129);
		contentPane.add(textArea);
		
		JComboBox cbInmueble = new JComboBox();
		cbInmueble.setBounds(517, 116, 200, 24);
		contentPane.add(cbInmueble);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.setBounds(517, 308, 200, 24);
		contentPane.add(cbCliente);
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInmueble.setBounds(517, 86, 128, 24);
		contentPane.add(lblInmueble);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCliente.setBounds(517, 273, 128, 24);
		contentPane.add(lblCliente);
		
		JLabel lblimagen = new JLabel("Imagen");
		lblimagen.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblimagen.setBounds(517, 343, 128, 24);
		contentPane.add(lblimagen);
		
		JButton btnImagen = new JButton("Seleccionar Imagen");
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarImagen();
			}
		});
		btnImagen.setForeground(Color.LIGHT_GRAY);
		btnImagen.setBorder(null);
		btnImagen.setBackground(new Color(34, 79, 75));
		btnImagen.setBounds(517, 378, 212, 34);
		contentPane.add(btnImagen);
		
		textInicio = new JTextField();
		textInicio.setBounds(517, 182, 200, 20);
		contentPane.add(textInicio);
		textInicio.setColumns(10);
		
		JLabel lblInicio = new JLabel("Inicio Contrato (YYYY-MM_DD)");
		lblInicio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInicio.setBounds(517, 151, 236, 24);
		contentPane.add(lblInicio);
		
		JLabel lblFin = new JLabel("Fin de Contrato  (YYYY-MM_DD)");
		lblFin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFin.setBounds(517, 213, 226, 24);
		contentPane.add(lblFin);
		
		textFin = new JTextField();
		textFin.setColumns(10);
		textFin.setBounds(517, 241, 200, 20);
		contentPane.add(textFin);
		
		JButton btnVerLista = new JButton("Ver Lista");
		btnVerLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerInmueblesDisponibles verInmuebles = new VerInmueblesDisponibles();
			}
		});
		btnVerLista.setForeground(Color.LIGHT_GRAY);
		btnVerLista.setBorder(null);
		btnVerLista.setBackground(new Color(34, 79, 75));
		btnVerLista.setBounds(586, 88, 101, 24);
		contentPane.add(btnVerLista);
		
		JButton btnAgregarContrato = new JButton("Agregar Contrato");

		btnAgregarContrato.setForeground(Color.LIGHT_GRAY);
		btnAgregarContrato.setBorder(null);
		btnAgregarContrato.setBackground(new Color(34, 79, 75));
		btnAgregarContrato.setBounds(303, 416, 212, 34);
		contentPane.add(btnAgregarContrato);
		
		JLabel lblApto = new JLabel("Tipo de Contrato");
		lblApto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblApto.setBounds(34, 320, 128, 24);
		contentPane.add(lblApto);
		
		JComboBox cbApto = new JComboBox();
		cbApto.setBounds(34, 345, 200, 24);
		contentPane.add(cbApto);
		cbApto.addItem("Si");
		cbApto.addItem("No");

		List<Inmueble> Inmueble = inmueblecont.getAllInmueble();

	    for (Inmueble inmuebles : Inmueble) {
			cbInmueble.addItem(inmuebles.getId_inmueble());
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
