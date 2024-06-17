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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AgregarInmueble extends JFrame {

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


    private JTextField txtCalleDireccion;
    private JTextField txtAlturaDireccion;
    private JTextField txtAntiguedadd;
    private JLabel lblCantBanios;
    private JLabel lblCantDormitorios;
    private JTextField txtM2cubierta;
    private JTextField txtSuperDescu;
    private JTextField txtPrecio;
    private JTextField txtNroDepto;
    private JTextField txtPiso;
    
    

    
    
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
		contentPane.setBackground(new Color(0, 128, 128));
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
        
        txtAntiguedadd = new JTextField();
        txtAntiguedadd.setBounds(205, 373, 150, 25);
        txtAntiguedadd.setColumns(10);
        contentPane.add(txtAntiguedadd);
        
        
        //Baños ----------------------
        lblCantBanios = new JLabel("Cantidad de Baños:");
        lblCantBanios.setBounds(25, 437, 120, 15);
        lblCantBanios.setForeground(new Color(255, 255, 255));
        lblCantBanios.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCantBanios);
        
        cbBanio = new JComboBox<String>();
        cbBanio.setBounds(205, 427, 150, 25);
        for (int i = 1; i <= 10; i++) {
            cbBanio.addItem(String.valueOf(i));
        }
        contentPane.add(cbBanio);
        
        //Dormitorios ----------------------
        lblCantDormitorios = new JLabel("Cantidad de Dormitorios:");
        lblCantDormitorios.setBounds(25, 485, 160, 15);
        lblCantDormitorios.setForeground(new Color(255, 255, 255));
        lblCantDormitorios.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblCantDormitorios);
        
        cbDormi = new JComboBox<String>();
        cbDormi.setBounds(205, 475, 150, 25);
        for (int i = 1; i <= 10; i++) {
        	cbDormi.addItem(String.valueOf(i));
        }
        contentPane.add(cbDormi);
        
        
        JComboBox<String> cbAptoMasc = new JComboBox<String>();
        cbAptoMasc.setBounds(205, 524, 150, 25);
        contentPane.add(cbAptoMasc);
        
        JLabel lblAptoMasco = new JLabel("Apto Mascotas:");
        lblAptoMasco.setBounds(25, 534, 120, 15);
        lblAptoMasco.setForeground(new Color(255, 255, 255));
        lblAptoMasco.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblAptoMasco);
        
        cbAptoMasc.addItem("Si");
        cbAptoMasc.addItem("No");

        
        JComboBox<String> cbRefaccionar = new JComboBox<String>();
        cbRefaccionar.setBounds(205, 571, 150, 25);
        contentPane.add(cbRefaccionar);
        
        JLabel lblRefaccion = new JLabel("Debe Refaccionar:");
        lblRefaccion.setBounds(25, 581, 125, 15);
        lblRefaccion.setForeground(new Color(255, 255, 255));
        lblRefaccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblRefaccion);
        
        cbRefaccionar.addItem("Si");
        cbRefaccionar.addItem("No");
        
        JComboBox<String> cbPatio = new JComboBox<String>();
        cbPatio.setBounds(655, 184, 150, 25);
        contentPane.add(cbPatio);
        
        JLabel lblPatio = new JLabel("Tiene Patio:");
        lblPatio.setBounds(486, 188, 80, 15);
        lblPatio.setForeground(new Color(255, 255, 255));
        lblPatio.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPatio);
        
        cbPatio.addItem("Si");
        cbPatio.addItem("No");
        
        
        JLabel lblM2Cubierta = new JLabel("M2 Superficie Cubierta:");
        lblM2Cubierta.setBounds(486, 238, 150, 15);
        lblM2Cubierta.setForeground(new Color(255, 255, 255));
        lblM2Cubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        contentPane.add(lblM2Cubierta);
        txtM2cubierta = new JTextField();
        txtM2cubierta.setBounds(655, 234, 150, 25);
        txtM2cubierta.setColumns(10);
        contentPane.add(txtM2cubierta);
        
        
        JLabel lblM2Descubierta = new JLabel("M2 Superficie Descubierta:");
        lblM2Descubierta.setBounds(486, 333, 169, 25);
        lblM2Descubierta.setForeground(new Color(255, 255, 255));
        lblM2Descubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblM2Descubierta);
        
        txtSuperDescu = new JTextField();
        txtSuperDescu.setBounds(655, 329, 150, 25);
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
        
        
        
        txtPrecio = new JTextField();
        txtPrecio.setBounds(655, 280, 150, 25);
        txtPrecio.setColumns(10);
        contentPane.add(txtPrecio);
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(486, 284, 47, 15);
        lblPrecio.setForeground(new Color(255, 255, 255));
        lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPrecio);
        
        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setBounds(486, 400, 120, 25);
        lblDescripcion.setForeground(new Color(255, 255, 255));
        lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblDescripcion);
        
        JTextArea txtAreaDescrip = new JTextArea();
        txtAreaDescrip.setBounds(486, 426, 319, 170);
        contentPane.add(txtAreaDescrip);
        
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
        
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInmueble menuInmueble= new MenuInmueble();
				dispose();
			}
		});
        
		
		
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
                String condicion = (String) cbCondicionInmueble.getSelectedItem();
                String barrio = (String) cbBarrio.getSelectedItem();
                String calle = txtCalleDireccion.getText();
                String altura = txtAlturaDireccion.getText();
                String antiguedad = txtAntiguedadd.getText();
                String banio = (String) cbBanio.getSelectedItem();
                String dormi = (String) cbDormi.getSelectedItem();
                String ambientes = (String) cbCantAmbientes.getSelectedItem();
                String piso = txtPiso.getText();
                String nroDepto = txtNroDepto.getText();          
                boolean refaccion =  (boolean) cbRefaccionar.getSelectedItem();
                boolean patio =  (boolean) cbPatio.getSelectedItem();
                boolean mascota =  (boolean) cbAptoMasc.getSelectedItem();
                String superficie_cubierta = txtM2cubierta.getText();
                String superficie_descubierta = lblM2Descubierta.getText();
                String precio = txtPrecio.getText();
                String desc = txtAreaDescrip.getText();
                
                InmuebleControlador inmueble = new InmuebleControlador();
                

                
                


			}
		});
        
        JLabel lblAosDeAntiguedad = new JLabel("Años ingresados Incorrectos");
        lblAosDeAntiguedad.setBounds(205, 403, 160, 13);
        lblAosDeAntiguedad.setForeground(new Color(128, 0, 0));
        lblAosDeAntiguedad.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblAosDeAntiguedad.setVisible(false);
        contentPane.add(lblAosDeAntiguedad);
        
        JLabel lblAlturaIngresadaIncorrecta = new JLabel("Altura Ingresada Incorrecta");
        lblAlturaIngresadaIncorrecta.setBounds(205, 351, 150, 15);
        lblAlturaIngresadaIncorrecta.setForeground(new Color(128, 0, 0));
        lblAlturaIngresadaIncorrecta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblAlturaIngresadaIncorrecta.setVisible(false);
        contentPane.add(lblAlturaIngresadaIncorrecta);
        
        JLabel lblSuperDesCubierta = new JLabel("Superficie Descubierta Incorrecta");
        lblSuperDesCubierta.setBounds(655, 357, 209, 25);
        lblSuperDesCubierta.setForeground(new Color(128, 0, 0));
        lblSuperDesCubierta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblSuperDesCubierta.setVisible(false);
        contentPane.add(lblSuperDesCubierta);
        
        JLabel lblPrecioIncorrecto = new JLabel("Precio Ingresado Incorrecto");
        lblPrecioIncorrecto.setBounds(655, 303, 160, 30);
        lblPrecioIncorrecto.setForeground(new Color(128, 0, 0));
        lblPrecioIncorrecto.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPrecioIncorrecto.setVisible(false);
        contentPane.add(lblPrecioIncorrecto);
        
        JLabel lblSuperCubierta = new JLabel("Superficie cubierta Incorrecta");
        lblSuperCubierta.setBounds(655, 263, 177, 15);
        lblSuperCubierta.setForeground(new Color(128, 0, 0));
        lblSuperCubierta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblSuperCubierta.setVisible(false);
        contentPane.add(lblSuperCubierta);
        
        JLabel lblCalleIngresadaIncorrecta = new JLabel("Calle Ingresada Incorrecta");
        lblCalleIngresadaIncorrecta.setBounds(205, 304, 150, 13);
        lblCalleIngresadaIncorrecta.setForeground(new Color(128, 0, 0));
        lblCalleIngresadaIncorrecta.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCalleIngresadaIncorrecta.setVisible(false);

        contentPane.add(lblCalleIngresadaIncorrecta);
        
        txtNroDepto = new JTextField();
        txtNroDepto.setBounds(655, 133, 150, 25);
        txtNroDepto.setColumns(10);
        contentPane.add(txtNroDepto);
        
        JLabel lblNroDepartamento = new JLabel("Nro Departamento");
        lblNroDepartamento.setBounds(486, 132, 169, 25);
        lblNroDepartamento.setForeground(Color.WHITE);
        lblNroDepartamento.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblNroDepartamento);
        
        txtPiso = new JTextField();
        txtPiso.setBounds(655, 77, 150, 25);
        txtPiso.setColumns(10);
        contentPane.add(txtPiso);
        
        JLabel lblPiso = new JLabel("Piso");
        lblPiso.setBounds(486, 82, 169, 25);
        lblPiso.setForeground(Color.WHITE);
        lblPiso.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(lblPiso);
        

        

        
        
        
        

        
	}
}