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
import trabajoInmobiliaria.Validacion;
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

public class AgregarAlquiler extends JFrame implements Validacion{

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
		contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonto = new JLabel("Monto Total");
		lblMonto.setForeground(new Color(255, 255, 255));
		lblMonto.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMonto.setBounds(32, 120, 116, 14);
		contentPane.add(lblMonto);
		
		textMonto = new JTextField();
		textMonto.setBounds(32, 134, 186, 27);
		contentPane.add(textMonto);
		textMonto.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(32, 198, 186, 27);
		contentPane.add(textFecha);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(new Color(255, 255, 255));
		lblFecha.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFecha.setBounds(32, 185, 116, 14);
		contentPane.add(lblFecha);
		
		JLabel lblMetodo = new JLabel("Metodo de Pago");
		lblMetodo.setForeground(new Color(255, 255, 255));
		lblMetodo.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMetodo.setBounds(32, 244, 116, 14);
		contentPane.add(lblMetodo);
		
		JComboBox cbMetodo = new JComboBox();
		cbMetodo.setBounds(32, 258, 186, 27);
		contentPane.add(cbMetodo);
		cbMetodo.addItem("Efectivo");
		cbMetodo.addItem("Transferencia");

		
		JLabel lblGarante = new JLabel("Garante");
		lblGarante.setForeground(new Color(255, 255, 255));
		lblGarante.setFont(new Font("Calibri", Font.BOLD, 15));
		lblGarante.setBounds(540, 120, 116, 14);
		contentPane.add(lblGarante);
	
		
		JComboBox cbGarante = new JComboBox();
		cbGarante.setBounds(540, 136, 186, 27);
		contentPane.add(cbGarante);
		
		
		HashMap GaranteIdMap = new HashMap<>();

		GaranteControlador garantecont = new GaranteControlador();
		List <Garante> Garante = garantecont.getAllGarante();
		for (Garante garante : Garante) {
			cbGarante.addItem(garante.getId_garante());

		}
		
		JLabel lblContrato = new JLabel("Contrato");
		lblContrato.setForeground(new Color(255, 255, 255));
		lblContrato.setFont(new Font("Calibri", Font.BOLD, 15));
		lblContrato.setBounds(540, 187, 116, 14);
		contentPane.add(lblContrato);
		
		JComboBox cbContrato = new JComboBox();
		cbContrato.setBounds(540, 200, 186, 27);
		contentPane.add(cbContrato);
		
		ContratoControlador contratocont = new ContratoControlador();
		List <Contrato> Contrato = contratocont.getAllContrato();
		for (Contrato contrato : Contrato) {
			cbContrato.addItem(contrato.getId_contrato());
		}
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setForeground(new Color(255, 255, 255));
		lblCliente.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCliente.setBounds(540, 246, 116, 14);
		contentPane.add(lblCliente);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.setBounds(540, 260, 186, 27);
		contentPane.add(cbCliente);

		InquilinoControlador inquilinocont = new InquilinoControlador();
		List <Inquilino> Inquilino = inquilinocont.getAllInquilino();
		for (Inquilino inquilino : Inquilino) {
			cbCliente.addItem(inquilino.getId_cliente());
		}
		
		JLabel lblInmueble = new JLabel("Inmueble");
		lblInmueble.setForeground(new Color(255, 255, 255));
		lblInmueble.setFont(new Font("Calibri", Font.BOLD, 15));
		lblInmueble.setBounds(540, 309, 116, 14);
		contentPane.add(lblInmueble);
		
		
		
		JComboBox cbInmueble = new JComboBox();
		cbInmueble.setBounds(540, 323, 186, 27);
		contentPane.add(cbInmueble);
		InmuebleControlador inmueblecont = new InmuebleControlador();
		List <Inmueble> Inmueble = inmueblecont.getAllInmueble();
		for (Inmueble inmueble : Inmueble) {
			if(inmueble.isDisponible()) {
				cbInmueble.addItem(inmueble.getId_inmueble());
			}
		}
		
		JButton btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
		btnVolver.setBounds(32, 404, 117, 31);
		contentPane.add(btnVolver);
		
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                MenuAlquiler volver = new MenuAlquiler();
                dispose();			}
		});
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAgregar.setForeground(new Color(255, 255, 255));
		btnAgregar.setBackground(new Color(48, 109, 105));
		btnAgregar.setBorder(null);
		btnAgregar.setBounds(609, 404, 117, 31);
		contentPane.add(btnAgregar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(133, 201, 196));
		panel_1.setBounds(10, 11, 764, 55);
		contentPane.add(panel_1);
		
		JLabel lblGestorPropiedades_1 = new JLabel("Registrar Nuevo Alquiler\r\n");
		lblGestorPropiedades_1.setForeground(Color.WHITE);
		lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
		panel_1.add(lblGestorPropiedades_1);
		
		
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
	

	  

}
