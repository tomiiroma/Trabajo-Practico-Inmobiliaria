package vista;

import java.awt.Color;  
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.InmuebleControlador;
import controlador.InquilinoControlador;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Validacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AgregarInmueble extends JFrame implements Validacion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cbTipoInmueble;
    private JComboBox<String> cbCondicionInmueble;
    private JComboBox<String> cbBarrio;
    private JComboBox<String> cbBanio;
    private JComboBox<String> cbDormi;
    private JComboBox<String> cbAptoMasc;
    private JComboBox<String> cbRefaccionar;
    private JComboBox<String> cbPatio;

    private JTextField txtCalleDireccion;
    private JTextField txtAlturaDireccion;
    private JTextField txtAntiguedad;
    private JTextField txtPrecio;
    private JTextField txtNroDepto;
    private JTextField txtPiso;
    private JTextField txtM2cubierta;
    private JTextField txtSuperDescu;
    
    private JLabel lblCantBaniosIncorrecta;
    private JLabel lblCantDormitoriosIncorrecta;
    private JLabel lblNroPisoIncorrecto;
    private JLabel lblNroDeptoIngresadoIncorrecto;
    private JLabel lblPrecioIncorrecto;
    private JLabel lblSuperCubiertaIncorrecta;
    private JLabel lblSuperDesCubiertaIncorrecta;
    private JLabel lblAniosDeAntiguedadIncorrecto;
    private JLabel lblCalleIngresadaIncorrecta;
    private JLabel lblAlturaIngresadaIncorrecta;
    private JLabel lblDescripcionIncorrecta;
    private JLabel lblInmuebleRepetido;
    private JLabel lblInmuebleRepetido2;
    
    
    

    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarInmueble frame = new AgregarInmueble();
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
	public AgregarInmueble() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 749);
		contentPane = new JPanel();
	    contentPane.setBackground(new Color(52, 118, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
        contentPane.setLayout(null);
		
        
        //Tipo de Inmueble ----------------------
        JLabel lblTipoInmueble = new JLabel("Tipo Inmueble:");
        lblTipoInmueble.setBounds(25, 87, 91, 15);
        lblTipoInmueble.setForeground(new Color(255, 255, 255));
        lblTipoInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblTipoInmueble);

        cbTipoInmueble = new JComboBox<String>();
        cbTipoInmueble.setBounds(205, 77, 150, 25);
        cbTipoInmueble.addItem("Departamento");
        cbTipoInmueble.addItem("Casa");
        contentPane.add(cbTipoInmueble);

        
        //Condicion ----------------------
        JLabel lblCondicionInmueble = new JLabel("Condición Inmueble:");
        lblCondicionInmueble.setBounds(25, 137, 125, 15);
        lblCondicionInmueble.setForeground(new Color(255, 255, 255));
        lblCondicionInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCondicionInmueble);

        cbCondicionInmueble = new JComboBox<String>();
        cbCondicionInmueble.setBounds(205, 133, 150, 25);
        cbCondicionInmueble.addItem("Excelente");
        cbCondicionInmueble.addItem("Muy Bueno");
        cbCondicionInmueble.addItem("Bueno");
        cbCondicionInmueble.addItem("Regular");
        cbCondicionInmueble.addItem("Malo");
        contentPane.add(cbCondicionInmueble);

        
        //Ambientes ----------------------
        JLabel lblCantidadAmbientes = new JLabel("Cantidad de Ambientes:");
        lblCantidadAmbientes.setBounds(25, 238, 150, 15);
        lblCantidadAmbientes.setForeground(new Color(255, 255, 255));
        lblCantidadAmbientes.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCantidadAmbientes);
        
        JComboBox<String> cbCantAmbientes = new JComboBox<String>();
        cbCantAmbientes.setBounds(205, 228, 150, 25);
        for (int i = 1; i <= 10; i++) {
        	cbCantAmbientes.addItem(String.valueOf(i));
        }
        contentPane.add(cbCantAmbientes);
        
        
        //Barrio ----------------------
        JLabel lblBarrio = new JLabel("Barrio:");
        lblBarrio.setBounds(25, 188, 47, 15);
        lblBarrio.setForeground(new Color(255, 255, 255));
        lblBarrio.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblBarrio);

        cbBarrio = new JComboBox<String>();
        cbBarrio.setBounds(205, 178, 150, 25);
        String[] barrios = { "Agronomía", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito",
                "Chacarita", "Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal",
                "Liniers", "Mataderos", "Monte Castro", "Monserrat", "Nueva Pompeya", "Núñez", "Palermo",
                "Parque Avellaneda", "Parque Chacabuco", "Parque Chas", "Parque Patricios", "Puerto Madero",
                "Recoleta", "Retiro", "Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield",
                "Versalles", "Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano",
                "Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo", "Villa Santa Rita",
                "Villa Soldati", "Villa Urquiza" };
        for (String barrio : barrios) {
            cbBarrio.addItem(barrio);
        }
        contentPane.add(cbBarrio);


        //Calle ----------------------
        JLabel lblCalleDireccion = new JLabel("Calle:");
        lblCalleDireccion.setBounds(25, 284, 32, 15);
        lblCalleDireccion.setForeground(new Color(255, 255, 255));
        lblCalleDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCalleDireccion);

        txtCalleDireccion = new JTextField();
        txtCalleDireccion.setBounds(205, 274, 150, 25);
        contentPane.add(txtCalleDireccion);
        txtCalleDireccion.setColumns(10);
        
        
        //Altura calle ----------------------
        JLabel lblAlturaDireccion = new JLabel("Altura:");
        lblAlturaDireccion.setBounds(25, 333, 47, 15);
        lblAlturaDireccion.setForeground(new Color(255, 255, 255));
        lblAlturaDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblAlturaDireccion);
        
        txtAlturaDireccion = new JTextField();
        txtAlturaDireccion.setBounds(205, 323, 150, 25);
        txtAlturaDireccion.setColumns(10);
        contentPane.add(txtAlturaDireccion);      
        
        //Antiguedad ----------------------
        JLabel lblAntiguedad = new JLabel("Años de Antiguedad:");
        lblAntiguedad.setBounds(25, 383, 130, 15);
        lblAntiguedad.setForeground(new Color(255, 255, 255));
        lblAntiguedad.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblAntiguedad);
        
        txtAntiguedad = new JTextField();
        txtAntiguedad.setBounds(205, 373, 150, 25);
        txtAntiguedad.setColumns(10);
        contentPane.add(txtAntiguedad);
        
        
        //Baños ----------------------
        lblCantBaniosIncorrecta = new JLabel("Cantidad de Baños:");
        lblCantBaniosIncorrecta.setBounds(25, 437, 120, 15);
        lblCantBaniosIncorrecta.setForeground(new Color(255, 255, 255));
        lblCantBaniosIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCantBaniosIncorrecta);
        
        cbBanio = new JComboBox<String>();
        cbBanio.setBounds(205, 427, 150, 25);
        for (int i = 1; i <= 10; i++) {
            cbBanio.addItem(String.valueOf(i));
        }
        contentPane.add(cbBanio);
        
        //Dormitorios ----------------------
        lblCantDormitoriosIncorrecta = new JLabel("Cantidad de Dormitorios:");
        lblCantDormitoriosIncorrecta.setBounds(25, 485, 160, 15);
        lblCantDormitoriosIncorrecta.setForeground(new Color(255, 255, 255));
        lblCantDormitoriosIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCantDormitoriosIncorrecta);
        
        cbDormi = new JComboBox<String>();
        cbDormi.setBounds(205, 475, 150, 25);
        for (int i = 1; i <= 10; i++) {
        	cbDormi.addItem(String.valueOf(i));
        }
        contentPane.add(cbDormi);
        
        //Mascota ----------------------
        cbAptoMasc = new JComboBox<String>();
        cbAptoMasc.setBounds(205, 524, 150, 25);
        contentPane.add(cbAptoMasc);
        
        JLabel lblAptoMasco = new JLabel("Apto Mascotas:");
        lblAptoMasco.setBounds(25, 534, 120, 15);
        lblAptoMasco.setForeground(new Color(255, 255, 255));
        lblAptoMasco.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblAptoMasco);       
        cbAptoMasc.addItem("Si");
        cbAptoMasc.addItem("No");

        //Refaccion ----------------------       
        cbRefaccionar = new JComboBox<String>();
        cbRefaccionar.setBounds(205, 571, 150, 25);
        contentPane.add(cbRefaccionar);
        
        JLabel lblRefaccion = new JLabel("Debe Refaccionar:");
        lblRefaccion.setBounds(25, 581, 125, 15);
        lblRefaccion.setForeground(new Color(255, 255, 255));
        lblRefaccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblRefaccion);
        cbRefaccionar.addItem("Si");
        cbRefaccionar.addItem("No");
        
        
        //Patio ----------------------       
        cbPatio = new JComboBox<String>();
        cbPatio.setBounds(655, 188, 150, 25);
        contentPane.add(cbPatio);
        
        JLabel lblPatio = new JLabel("Tiene Patio o Balcón:");
        lblPatio.setBounds(486, 198, 159, 15);
        lblPatio.setForeground(new Color(255, 255, 255));
        lblPatio.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPatio);       
        cbPatio.addItem("Si");
        cbPatio.addItem("No");
        
        
        
        //Superficie Cubierta ----------------------       
        JLabel lblM2Cubierta = new JLabel("M2 Superficie Cubierta:");
        lblM2Cubierta.setBounds(486, 244, 150, 15);
        lblM2Cubierta.setForeground(new Color(255, 255, 255));
        lblM2Cubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        contentPane.add(lblM2Cubierta);
        txtM2cubierta = new JTextField();
        txtM2cubierta.setBounds(655, 234, 150, 25);
        txtM2cubierta.setColumns(10);
        contentPane.add(txtM2cubierta);
        
        //Superficie Descubierta ----------------------       
        JLabel lblM2Descubierta = new JLabel("M2 Superficie Descubierta:");
        lblM2Descubierta.setBounds(486, 337, 169, 25);
        lblM2Descubierta.setForeground(new Color(255, 255, 255));
        lblM2Descubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblM2Descubierta);
        
        txtSuperDescu = new JTextField();
        txtSuperDescu.setBounds(655, 333, 150, 25);
        txtSuperDescu.setColumns(10);
        contentPane.add(txtSuperDescu);
        
        cbPatio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cbPatio.getSelectedItem().equals("Si")) {
                    txtSuperDescu.setEnabled(true);
                } else {
                    txtSuperDescu.setEnabled(false);
                    txtSuperDescu.setText(""); 
                }
            }
        });
        
        
        //Precio----------------------       
        txtPrecio = new JTextField();
        txtPrecio.setBounds(655, 284, 150, 25);
        txtPrecio.setColumns(10);
        contentPane.add(txtPrecio);
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(486, 288, 47, 15);
        lblPrecio.setForeground(new Color(255, 255, 255));
        lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPrecio);
        
        //Descripcion----------------------       
        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setBounds(486, 400, 120, 25);
        lblDescripcion.setForeground(new Color(255, 255, 255));
        lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblDescripcion);
        
        JTextArea txtAreaDescrip = new JTextArea();
        txtAreaDescrip.setBounds(486, 426, 319, 170);
        contentPane.add(txtAreaDescrip);


        
        
        cbTipoInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cbTipoInmueble.getSelectedItem().equals("Departamento")) {
                	txtPiso.setEnabled(true);
                	txtNroDepto.setEnabled(true);
                } else {
                	txtPiso.setEnabled(false);
                	txtPiso.setText(""); 
                	txtNroDepto.setEnabled(false);
                	txtNroDepto.setText(""); 
                }
            }
        });
        
        
        //Nro Piso----------------------       
        JLabel lblPiso = new JLabel("Piso");
        lblPiso.setBounds(486, 82, 169, 25);
        lblPiso.setForeground(Color.WHITE);
        lblPiso.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPiso);
        
        txtPiso = new JTextField();
        txtPiso.setBounds(655, 77, 150, 25);
        txtPiso.setColumns(10);
        contentPane.add(txtPiso);
        
        
        //Nro Depto----------------------      
        JLabel lblNroDepartamento = new JLabel("Nro Departamento");
        lblNroDepartamento.setBounds(486, 133, 169, 25);
        lblNroDepartamento.setForeground(Color.WHITE);
        lblNroDepartamento.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblNroDepartamento);
        
        txtNroDepto = new JTextField();
        txtNroDepto.setBounds(655, 133, 150, 25);
        txtNroDepto.setColumns(10);
        contentPane.add(txtNroDepto);
        

        
        //INCORRECTOOO

        //ANTIGUEDAD INCORRECTA
        lblAniosDeAntiguedadIncorrecto = new JLabel("Años ingresados Incorrectos");
        lblAniosDeAntiguedadIncorrecto.setBounds(203, 400, 178, 13);
        lblAniosDeAntiguedadIncorrecto.setForeground(new Color(128, 0, 0));
        lblAniosDeAntiguedadIncorrecto.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAniosDeAntiguedadIncorrecto.setVisible(false);
        contentPane.add(lblAniosDeAntiguedadIncorrecto);
        

        //PRECIO INCORRECTO
        JLabel lblPrecioIncorrecto = new JLabel("Precio Ingresado Incorrecto");
        lblPrecioIncorrecto.setBounds(627, 309, 178, 15);
        lblPrecioIncorrecto.setForeground(new Color(128, 0, 0));
        lblPrecioIncorrecto.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrecioIncorrecto.setVisible(false);
        contentPane.add(lblPrecioIncorrecto);
        
        
        //SUPERFICIE CUBIERTA INCORRECTA
        lblSuperCubiertaIncorrecta = new JLabel("Superficie cubierta Ingresada Incorrecta");
        lblSuperCubiertaIncorrecta.setBounds(553, 258, 252, 15);
        lblSuperCubiertaIncorrecta.setForeground(new Color(128, 0, 0));
        lblSuperCubiertaIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblSuperCubiertaIncorrecta.setVisible(false);
        contentPane.add(lblSuperCubiertaIncorrecta);  
        
        //SUPERFICIE DESCUBIERTA INCORRECTA
        lblSuperDesCubiertaIncorrecta = new JLabel("Superficie Descubierta Ingresada  Incorrecta");
        lblSuperDesCubiertaIncorrecta.setBounds(533, 357, 272, 15);
        lblSuperDesCubiertaIncorrecta.setForeground(new Color(128, 0, 0));
        lblSuperDesCubiertaIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblSuperDesCubiertaIncorrecta.setVisible(false);
        contentPane.add(lblSuperDesCubiertaIncorrecta);
             
	
        //CALLE INCORRECTA
        lblCalleIngresadaIncorrecta = new JLabel("Calle Ingresada Incorrecta");    
        lblCalleIngresadaIncorrecta.setBounds(205, 299, 178, 13);
        lblCalleIngresadaIncorrecta.setForeground(new Color(128, 0, 0));
        lblCalleIngresadaIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCalleIngresadaIncorrecta.setVisible(false);
        contentPane.add(lblCalleIngresadaIncorrecta);
        
        
        //ALTURA CALLE INCORRECTA
        lblAlturaIngresadaIncorrecta = new JLabel("Altura Ingresada Incorrecta");
        lblAlturaIngresadaIncorrecta.setBounds(203, 347, 178, 15);
        lblAlturaIngresadaIncorrecta.setForeground(new Color(128, 0, 0));
        lblAlturaIngresadaIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAlturaIngresadaIncorrecta.setVisible(false);
        contentPane.add(lblAlturaIngresadaIncorrecta);
        
        
        //PISO INCORRECTO
        lblNroPisoIncorrecto = new JLabel("Nro de Piso Ingresado Incorrecto");
        lblNroPisoIncorrecto.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNroPisoIncorrecto.setForeground(new Color(128, 0, 0));
        lblNroPisoIncorrecto.setBounds(597, 102, 209, 15);
        lblNroPisoIncorrecto.setVisible(false);
        contentPane.add(lblNroPisoIncorrecto);
            
        
        //NRO DEPTO INCORRECTO
        lblNroDeptoIngresadoIncorrecto = new JLabel("Nro Depto Ingresado Incorrecto");
        lblNroDeptoIngresadoIncorrecto.setForeground(new Color(128, 0, 0));
        lblNroDeptoIngresadoIncorrecto.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNroDeptoIngresadoIncorrecto.setBounds(609, 157, 197, 14);
        lblNroDeptoIngresadoIncorrecto.setVisible(false);
        contentPane.add(lblNroDeptoIngresadoIncorrecto);
        
        //DESCRIPCION INCORRECTO
        lblDescripcionIncorrecta = new JLabel("Descripcion Ingresada Incorrecta");
        lblDescripcionIncorrecta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblDescripcionIncorrecta.setForeground(new Color(128, 0, 0));
        lblDescripcionIncorrecta.setBounds(487, 604, 318, 14);
        lblDescripcionIncorrecta.setVisible(false);
        contentPane.add(lblDescripcionIncorrecta);
        
        
       //Inmueble REPETIDO
        lblInmuebleRepetido = new JLabel("No se pudo Registrar El inmueble");
        lblInmuebleRepetido.setHorizontalAlignment(SwingConstants.CENTER);
        lblInmuebleRepetido.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblInmuebleRepetido.setForeground(new Color(128, 0, 0));
        lblInmuebleRepetido.setBounds(190, 629, 506, 34);
        lblInmuebleRepetido.setVisible(false);
        contentPane.add(lblInmuebleRepetido);
        
        //Inmueble REPETIDO
        lblInmuebleRepetido2 = new JLabel("Inmueble Repetido");
        lblInmuebleRepetido2.setHorizontalAlignment(SwingConstants.CENTER);
        lblInmuebleRepetido2.setForeground(new Color(128, 0, 0));
        lblInmuebleRepetido2.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblInmuebleRepetido2.setBounds(190, 665, 506, 34);
        lblInmuebleRepetido2.setVisible(false);
        contentPane.add(lblInmuebleRepetido2);
        
        
        
		//BOTON REGISTRAR
        JButton btnRegistrarInmueble = new JButton("Registrar Inmueble");
        btnRegistrarInmueble.setBounds(657, 634, 150, 34);
        btnRegistrarInmueble.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        btnRegistrarInmueble.setForeground(Color.WHITE);
        btnRegistrarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRegistrarInmueble.setBorder(null);
        btnRegistrarInmueble.setBackground(new Color(48, 109, 105));
        contentPane.add(btnRegistrarInmueble);
        
        
        btnRegistrarInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                String tipoInmueble = (String) cbTipoInmueble.getSelectedItem();
              

				String calle = txtCalleDireccion.getText().trim();
				boolean calleValida = validarCadena2(calle);
				lblCalleIngresadaIncorrecta.setVisible(!calleValida);
	
				String altura = txtAlturaDireccion.getText().trim();
				boolean alturaValida = validarEntero2(altura);
				lblAlturaIngresadaIncorrecta.setVisible(!alturaValida);
			
				String antiguedad = txtAntiguedad.getText().trim();
				boolean AntiguedadValida = validarEntero2(antiguedad);
				lblAniosDeAntiguedadIncorrecto.setVisible(!AntiguedadValida);
				
				String m2cubiertos = txtM2cubierta.getText().trim();
				boolean m2cubiertosValido = validarEntero2(m2cubiertos);
				lblSuperCubiertaIncorrecta.setVisible(!m2cubiertosValido);
				
				boolean patio = cbPatio.getSelectedItem().equals("Si");
				
				
				String precio = txtPrecio.getText().trim();
				boolean precioValido = validarEntero2(precio);
				lblPrecioIncorrecto.setVisible(!precioValido);

				String descripcion = txtAreaDescrip.getText().trim();
				boolean descripcionValida = validarCadena2(descripcion);
				lblDescripcionIncorrecta.setVisible(!descripcionValida);
				
				
							if(tipoInmueble.equals("Departamento")){			
								String piso = txtPiso.getText().trim();
								boolean pisoValido = validarEntero2(piso);
								lblNroPisoIncorrecto.setVisible(!pisoValido);
								
								String nroDepto = txtNroDepto.getText().trim();
								boolean nroDeptoValida = validarCadena2(nroDepto);
								lblNroDeptoIngresadoIncorrecto.setVisible(!nroDeptoValida);
								
						       if (!calleValida || !pisoValido || !alturaValida || 
						 		   !AntiguedadValida || !m2cubiertosValido      || 
						 		   !precioValido   || !nroDeptoValida || !descripcionValida) {
						 		     return;
						 		}
							}
				
				
				if(cbPatio.getSelectedItem().equals("Si")){
					String m2descubiertos = txtSuperDescu.getText().trim();
					boolean m2descubiertosValido = validarEntero2(m2descubiertos);
					lblSuperDesCubiertaIncorrecta.setVisible(!m2descubiertosValido);
					
			        if (!calleValida  || !alturaValida || 
					   !AntiguedadValida || !m2cubiertosValido || !m2descubiertosValido || 
					   !precioValido || !descripcionValida) {
					   return;
					}
				}
				

				
				
                String condicion = (String) cbCondicionInmueble.getSelectedItem();
                String barrio = (String) cbBarrio.getSelectedItem();
                String cantAmbientes = (String) cbCantAmbientes.getSelectedItem();
                String cantBanios = (String) cbBanio.getSelectedItem();
                String cantDormitorios = (String) cbDormi.getSelectedItem();
                
                
				String piso = txtPiso.getText();
				String nroDepto = txtNroDepto.getText();
				String m2descubiertos = txtSuperDescu.getText();

                
                boolean refaccionar = cbRefaccionar.getSelectedItem().equals("Si");
                boolean apto_mascota = cbAptoMasc.getSelectedItem().equals("Si");

     
                //esto por q estamos en agente
                boolean activo = false;
                boolean disponible = true;
                          
                
                
                if(tipoInmueble.equals("Casa")){
                	piso = null;
                	nroDepto = null;
                	
                	if(cbPatio.getSelectedItem().equals("No")){
                		patio = false;
                		m2descubiertos = "";
                	}
                	
                }

                
                if (cbRefaccionar.equals("No")) {
                	refaccionar = false;
                }
                
                if(cbAptoMasc.equals("No")){
                	apto_mascota = false;
                }

                
                double m2cubiertosDouble = 0.0;
                double m2descubiertosDouble = 0.0;
                double precioDouble = 0.0;
                
                if (!m2cubiertos.isEmpty()) {
                	m2cubiertosDouble = Double.parseDouble(m2cubiertos);
                }
                if (!m2descubiertos.isEmpty()) {
                	m2descubiertosDouble = Double.parseDouble(m2descubiertos);
                }
                if (!precio.isEmpty()) {
                	precioDouble = Double.parseDouble(precio);
                }

                
        		if(tipoInmueble.equals("Departamento") && validarDepto1(calle, altura, piso, nroDepto)){
        			lblInmuebleRepetido.setVisible(true);
                    lblInmuebleRepetido2.setVisible(true); 
        			return;
        		}
        		
        		if(tipoInmueble.equals("Casa") && validarCasa(calle, altura)){
        			lblInmuebleRepetido.setVisible(true);
                    lblInmuebleRepetido2.setVisible(true); 
        			return;
        		}
                            
                InmuebleControlador inmueble = new InmuebleControlador();
                
                inmueble.addInmueble(new Inmueble(0,tipoInmueble, condicion,
                		cantAmbientes,piso,barrio,calle,descripcion,antiguedad,
                		cantBanios,cantDormitorios,
                		m2cubiertosDouble,m2descubiertosDouble,
                		precioDouble,disponible,refaccionar,
                		apto_mascota,patio,activo,altura,nroDepto));
                
                
                JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
                MenuInmueble menuInmueble = new MenuInmueble();
                dispose();			
                
                }
		});

        
        
        
        
        
        
        
        
        //BOTON VOLVER
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 634, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
        contentPane.add(btnVolver);
        
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble menuInmueble= new MenuInmueble();
				dispose();
			}
		});
		

        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 11, 834, 55);
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        contentPane.add(panel_1);
        
        
        
        JLabel lblGestorPropiedades_1 = new JLabel("Gestor Propiedades | Agregar Inmueble");
        lblGestorPropiedades_1.setForeground(Color.WHITE);
        lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
        panel_1.add(lblGestorPropiedades_1);
        

        


      
	}
}