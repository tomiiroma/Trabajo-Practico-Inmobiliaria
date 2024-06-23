package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.AgenteControlador;
import controlador.AlquilerControlador;
import controlador.ContratoControlador;
import controlador.GaranteControlador;
import controlador.InmuebleControlador;
import controlador.InquilinoControlador;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Garante;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Alquiler;
import trabajoInmobiliaria.Cliente;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ActionEvent;

public class AgregarAlquiler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMonto;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarAlquiler frame = new AgregarAlquiler();
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
	public AgregarAlquiler() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 109, 106));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 109, 106));
		panel.setBounds(0, 11, 784, 33);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Nuevo Alquiler");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 19));
		panel.add(lblNewLabel);
		
		JLabel lblMonto = new JLabel("Monto Total");
		lblMonto.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMonto.setBounds(35, 97, 116, 14);
		contentPane.add(lblMonto);
		
		textMonto = new JTextField();
		textMonto.setBounds(35, 122, 186, 27);
		contentPane.add(textMonto);
		textMonto.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(35, 208, 186, 27);
		contentPane.add(textFecha);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFecha.setBounds(35, 183, 116, 14);
		contentPane.add(lblFecha);
		
		JLabel lblMetodo = new JLabel("Metodo de Pago");
		lblMetodo.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMetodo.setBounds(35, 273, 116, 14);
		contentPane.add(lblMetodo);
		
		JComboBox cbMetodo = new JComboBox();
		cbMetodo.setBounds(35, 298, 186, 27);
		contentPane.add(cbMetodo);
		cbMetodo.addItem("Efectivo");
		cbMetodo.addItem("Transferencia");

		
		JLabel lblGarante = new JLabel("Garante");
		lblGarante.setFont(new Font("Calibri", Font.BOLD, 15));
		lblGarante.setBounds(474, 95, 116, 14);
		contentPane.add(lblGarante);
	
		
		JComboBox cbGarante = new JComboBox();
		cbGarante.setBounds(474, 124, 186, 27);
		contentPane.add(cbGarante);
		
		
		HashMap GaranteIdMap = new HashMap<>();

		GaranteControlador garantecont = new GaranteControlador();
		List <Garante> Garante = garantecont.getAllGarante();
		for (Garante garante : Garante) {
			cbGarante.addItem(garante.getId_garante());

		}
		
		JLabel lblContrato = new JLabel("Contrato");
		lblContrato.setFont(new Font("Calibri", Font.BOLD, 15));
		lblContrato.setBounds(474, 181, 116, 14);
		contentPane.add(lblContrato);
		
		JComboBox cbContrato = new JComboBox();
		cbContrato.setBounds(474, 210, 186, 27);
		contentPane.add(cbContrato);
		
		ContratoControlador contratocont = new ContratoControlador();
		List <Contrato> Contrato = contratocont.getAllContrato();
		for (Contrato contrato : Contrato) {
			cbContrato.addItem(contrato.getId_contrato());
		}
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCliente.setBounds(474, 271, 116, 14);
		contentPane.add(lblCliente);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.setBounds(474, 300, 186, 27);
		contentPane.add(cbCliente);

		InquilinoControlador inquilinocont = new InquilinoControlador();
		List <Inquilino> Inquilino = inquilinocont.getAllInquilino();
		for (Inquilino inquilino : Inquilino) {
			cbCliente.addItem(inquilino.getId_cliente());
		}
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setFont(new Font("Calibri", Font.BOLD, 15));
		lblInmueble.setBounds(474, 338, 116, 14);
		contentPane.add(lblInmueble);
		
		
		
		JComboBox cbInmueble = new JComboBox();
		cbInmueble.setBounds(474, 363, 186, 27);
		contentPane.add(cbInmueble);
		InmuebleControlador inmueblecont = new InmuebleControlador();
		List <Inmueble> Inmueble = inmueblecont.getAllInmueble();
		for (Inmueble inmueble : Inmueble) {
			if(inmueble.isDisponible()) {
				cbInmueble.addItem(inmueble.getId_inmueble());
			}
		}
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVolver.setForeground(Color.LIGHT_GRAY);
		btnVolver.setBorder(null);
		btnVolver.setBackground(new Color(34, 79, 75));
		btnVolver.setBounds(230, 424, 117, 31);
		contentPane.add(btnVolver);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(Color.LIGHT_GRAY);
		btnAgregar.setBorder(null);
		btnAgregar.setBackground(new Color(34, 79, 75));
		btnAgregar.setBounds(357, 424, 117, 31);
		contentPane.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formapago = cbMetodo.getSelectedItem().toString();
				int montototal =0;
				LocalDate fecha= null;
			
				
				
				
				int clienteselec = (Integer)cbCliente.getSelectedItem();
				Cliente cliente = inquilinocont.getInquilinoById(clienteselec);
				
				int garanteselec = (Integer)cbGarante.getSelectedItem();
				Garante garante = garantecont.getGaranteById(garanteselec);
				
				int inmuebleselec = (Integer)cbInmueble.getSelectedItem();
				Inmueble inmueble = inmueblecont.getInmuebleById(inmuebleselec);
				
				int contatoselec = (Integer)cbContrato.getSelectedItem();
				Contrato contrato = contratocont.getContratoById(contatoselec);
				
				AgenteControlador agentecont = new AgenteControlador();
				Empleado empleado = agentecont.getAgenteById(1);
				
				if(!textFecha.getText().isEmpty() || !textMonto.getText().isEmpty()) {
					if(esNumero(textMonto.getText())) {
						 montototal = Integer.parseInt(textMonto.getText());
					}else {
						JOptionPane.showMessageDialog(null, "El monto tiene que ser escrito en numeros");
					}
					if(VerificarFecha(textFecha.getText())) {
						fecha = LocalDate.parse(textFecha.getText());
					}else {
						JOptionPane.showMessageDialog(null, "Ingrese fecha en formato YYYY-mm-DD");
					}
					
					AlquilerControlador alquilercont = new AlquilerControlador();
					alquilercont.addAlquiler(new Alquiler(0, montototal, fecha, formapago, garante, contrato, cliente, empleado, inmueble));
					JOptionPane.showMessageDialog(null, "Alquiler agregado exitosamente");
				}else {
					JOptionPane.showMessageDialog(null, "No puede haber campos vacios");
				}
				
			}
		});
		
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
	  
	    public static boolean esNumero(String numero) {
	       
	        try {
	            Integer.parseInt(numero);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
}
