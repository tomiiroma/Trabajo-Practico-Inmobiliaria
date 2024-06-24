package vista;

import java.awt.Color;  
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.AgenteControlador;
import controlador.CompradorControlador;
import controlador.ContratoControlador;
import controlador.ControladorEmpleado;
import controlador.GerenteControlador;
import controlador.InmuebleControlador;
import controlador.ReservaControlador;
import controlador.VentaControlador;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.Validacion;
import trabajoInmobiliaria.Venta;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Contrato;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class ConfirmarVenta extends JFrame implements Validacion{

	private JPanel contentPane;
	private JTextField txtIdInmueble;
	private JTextField txtIdEmpleado;
	private JTextField txtMonto;
	private JTextField txtIdComprador;
	private JTextField txtIdReserva;
	private JTextField txtNomCompra;
	private JTextField txtApeCompra;
	private JTextField txtTipoEmpleado;
	private JTextField txtPropVende;
	private Empleado empleado1;
	/**
	 * Launch the application.
	 */



	public ConfirmarVenta(int id,Reserva reserva,int id2, Cliente cliente,int id3,Empleado empleado) {
		
		 this.setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 964, 580);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    contentPane.setBackground(new Color(52, 118, 113));

		setContentPane(contentPane);
		
		
		empleado1 = new Empleado();
		
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 468, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RealizarCompraVenta volver = new RealizarCompraVenta();
                dispose();
            }
        });
        contentPane.setLayout(null);
        contentPane.add(btnVolver);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        panel_1.setBounds(30, 11, 890, 55);
        contentPane.add(panel_1);
        
        JLabel lblGestorPropiedades_1 = new JLabel("Registrar Nueva Venta");
        lblGestorPropiedades_1.setForeground(Color.WHITE);
        lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
        panel_1.add(lblGestorPropiedades_1);
        
        txtIdInmueble = new JTextField();
        txtIdInmueble.setEditable(false);
        txtIdInmueble.setColumns(10);
        txtIdInmueble.setBounds(210, 105, 150, 25);
        contentPane.add(txtIdInmueble);
        
        JLabel lblIdInmueble = new JLabel("Id Inmueble:");
        lblIdInmueble.setForeground(Color.WHITE);
        lblIdInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdInmueble.setBounds(30, 115, 170, 15);
        contentPane.add(lblIdInmueble);
        
        txtIdEmpleado = new JTextField();
        txtIdEmpleado.setEditable(false);
        txtIdEmpleado.setColumns(10);
        txtIdEmpleado.setBounds(730, 229, 150, 25);
        contentPane.add(txtIdEmpleado);
        
        txtMonto = new JTextField();
        txtMonto.setColumns(10);
        txtMonto.setBounds(730, 105, 150, 25);
        contentPane.add(txtMonto);
        
        JLabel lblMontoTotal = new JLabel("Monto Total Venta:");
        lblMontoTotal.setForeground(Color.WHITE);
        lblMontoTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblMontoTotal.setBounds(550, 115, 170, 15);
        contentPane.add(lblMontoTotal);
        
        JLabel lblIdEmpleado = new JLabel("Id Empleado");
        lblIdEmpleado.setForeground(Color.WHITE);
        lblIdEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdEmpleado.setBounds(550, 239, 170, 15);
        contentPane.add(lblIdEmpleado);
        
        JLabel lblMetodoDePago = new JLabel("Metodo de Pago:");
        lblMetodoDePago.setForeground(Color.WHITE);
        lblMetodoDePago.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblMetodoDePago.setBounds(550, 179, 159, 15);
        contentPane.add(lblMetodoDePago);
        
        JLabel lblTipoEmpleado = new JLabel("Tipo de Empleado:");
        lblTipoEmpleado.setForeground(Color.WHITE);
        lblTipoEmpleado.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblTipoEmpleado.setBounds(550, 304, 159, 15);
        contentPane.add(lblTipoEmpleado);
        
        txtIdComprador = new JTextField();
        txtIdComprador.setEditable(false);
        txtIdComprador.setColumns(10);
        txtIdComprador.setBounds(210, 229, 150, 25);
        contentPane.add(txtIdComprador);
        
        JLabel lblIdComprador = new JLabel("Id Comprador:");
        lblIdComprador.setForeground(Color.WHITE);
        lblIdComprador.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdComprador.setBounds(30, 239, 170, 15);
        contentPane.add(lblIdComprador);
        
        txtIdReserva = new JTextField();
        txtIdReserva.setEditable(false);
        txtIdReserva.setColumns(10);
        txtIdReserva.setBounds(730, 358, 150, 25);
        contentPane.add(txtIdReserva);
        
        JLabel lblIdReserva = new JLabel("Id Reserva:");
        lblIdReserva.setForeground(Color.WHITE);
        lblIdReserva.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdReserva.setBounds(550, 362, 170, 15);
        contentPane.add(lblIdReserva);
        

        
        txtNomCompra = new JTextField();
        txtNomCompra.setEditable(false);
        txtNomCompra.setColumns(10);
        txtNomCompra.setBounds(210, 296, 150, 25);
        contentPane.add(txtNomCompra);
        
        JLabel lblNombreComprador = new JLabel("Nombre Comprador:");
        lblNombreComprador.setForeground(Color.WHITE);
        lblNombreComprador.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNombreComprador.setBounds(30, 306, 170, 15);
        contentPane.add(lblNombreComprador);
        
        JLabel lblApellidoComprador = new JLabel("Apellido Comprador:");
        lblApellidoComprador.setForeground(Color.WHITE);
        lblApellidoComprador.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblApellidoComprador.setBounds(30, 368, 170, 15);
        contentPane.add(lblApellidoComprador);
        
        txtApeCompra = new JTextField();
        txtApeCompra.setEditable(false);
        txtApeCompra.setColumns(10);
        txtApeCompra.setBounds(210, 358, 150, 25);
        contentPane.add(txtApeCompra);
        
        JLabel lblIdVendedor = new JLabel("Id Propietario Vendedor:");
        lblIdVendedor.setForeground(Color.WHITE);
        lblIdVendedor.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdVendedor.setBounds(30, 179, 170, 15);
        contentPane.add(lblIdVendedor);
        
        txtTipoEmpleado = new JTextField();
        txtTipoEmpleado.setEditable(false);
        txtTipoEmpleado.setColumns(10);
        txtTipoEmpleado.setBounds(730, 294, 150, 25);
        contentPane.add(txtTipoEmpleado);
        
        JComboBox<String> cbMetodoPago = new JComboBox<String>();
        cbMetodoPago.setBounds(730, 169, 150, 25);
        
        cbMetodoPago.addItem("Efectivo");
        cbMetodoPago.addItem("Transferencia");
        cbMetodoPago.addItem("Cheque");
        contentPane.add(cbMetodoPago);
        
    	txtPropVende = new JTextField();
    	txtPropVende.setEditable(false);
    	txtPropVende.setColumns(10);
    	txtPropVende.setBounds(210, 169, 150, 25);
    	contentPane.add(txtPropVende);
    	
    	
        JButton btnConfirmar = new JButton("Confirmar Venta");
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnConfirmar.setBorder(null);
        btnConfirmar.setBackground(new Color(48, 109, 105));
        btnConfirmar.setBounds(770, 475, 150, 34);
        contentPane.add(btnConfirmar);
        
        JLabel lblPrecioIncorrecto = new JLabel("Monto Ingresado Incorrecto");
        lblPrecioIncorrecto.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrecioIncorrecto.setForeground(new Color(128, 0, 0));
        lblPrecioIncorrecto.setBounds(730, 133, 190, 14);
        lblPrecioIncorrecto.setVisible(false);

        contentPane.add(lblPrecioIncorrecto);
        
        JLabel lblError = new JLabel("No se pudo Registrar La Venta\r\n");
        lblError.setHorizontalAlignment(SwingConstants.CENTER);
        lblError.setForeground(new Color(128, 0, 0));
        lblError.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblError.setBounds(221, 437, 500, 34);
        lblError.setVisible(false);

        contentPane.add(lblError);
        
        JLabel lblError2 = new JLabel("Venta Duplicada");
        lblError2.setHorizontalAlignment(SwingConstants.CENTER);
        lblError2.setForeground(new Color(128, 0, 0));
        lblError2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblError2.setBounds(220, 479, 500, 34);
        lblError2.setVisible(false);

        contentPane.add(lblError2);
        
        
        if(reserva != null){
        	
        	txtIdInmueble.setText(Integer.toString(reserva.getInmueble().getId_inmueble()));
 	
        	txtPropVende.setText(Integer.toString(id2));
        	
            txtIdComprador.setText(Integer.toString(reserva.getCliente().getId_cliente()));
        	
        	txtNomCompra.setText(reserva.getCliente().getNombre());
        	
        	txtApeCompra.setText(reserva.getCliente().getApellido());       	
        	        		
        	txtIdReserva.setText(String.valueOf(reserva.getId_reserva()));
        	
        	txtIdEmpleado.setText(Integer.toString(empleado.getId_empleado()));        	
        	
        	txtTipoEmpleado.setText(empleado.getTipo_empleado());
        }
        
        
        btnConfirmar.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {

 		        int idInmueble = reserva.getInmueble().getId_inmueble();
 		        int idComprador = reserva.getCliente().getId_cliente();
 		        
 		        		        
 		        String monto = txtMonto.getText().trim(); 		        
				boolean montoValido = validarEntero2(monto);
				lblPrecioIncorrecto.setVisible(!montoValido);
				
				if(!montoValido){
					return;
				}
				
				
                double montoDouble = 0.0;	
                
                if (!monto.isEmpty()) {
                	montoDouble = Double.parseDouble(monto);
                }
 		        
 		        String formaPago = (String) cbMetodoPago.getSelectedItem();

 		        String tipoEmpleado = empleado.getTipo_empleado();
 		        int idReserva = reserva.getId_reserva();

 		        int idEmpleado = empleado.getId_empleado();

 			    ControladorEmpleado empleadoCont =  new ControladorEmpleado();
 			    VentaControlador controlador = new VentaControlador();
 			    InmuebleControlador inmuebleCont = new InmuebleControlador();
 			    CompradorControlador compradorCont = new CompradorControlador();
 			    ContratoControlador contratoCont = new ContratoControlador();
 			    ReservaControlador  reservaCont = new ReservaControlador();
 			    
 			    Comprador comprador = compradorCont.getCompradorById(idComprador);	    
 			    Inmueble inmueble = inmuebleCont.getInmuebleById(idInmueble);
 			    Contrato contrato = null;
 			    Reserva reserva1 = reservaCont.getReservaById(idReserva);
 			    Empleado empleado1= empleadoCont.getEmpleadoById(idEmpleado);	
 			   

   			    Venta venta = new Venta(0, inmueble, comprador, montoDouble, formaPago, empleado1, tipoEmpleado,reserva1);
   			    
   			    
   			    
   			    if(validarVenta(idInmueble, idComprador, idEmpleado, idReserva)){
   			    	lblError.setVisible(true);
   			    	lblError2.setVisible(true); 
   			    	
   			    }else {	    	
   	   			    VentaControlador ventaControlador = new VentaControlador();
   	   		    
   	   			    ventaControlador.addVenta(venta);
   	   			    JOptionPane.showMessageDialog(null, "Venta Agregada Correctamente");
   	   			    	    
   	                MenuVenta volver = new MenuVenta();
   	                dispose();	
   			    	}    
   			    
                 
                }
 		});
        
        



        
        
		
	}
}
