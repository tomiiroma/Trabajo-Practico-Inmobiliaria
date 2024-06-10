package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
    private JTextField txtCantidadAmbientes;
    private JComboBox<String> cbBarrio;
    private JTextField txtCalleDireccion;
    private JTextField txtAlturaDireccion;
    private JTextField txtAntiguedadd;
    private JLabel lblCantBanios;
    private JTextField txtCantBanio;
    private JTextField txtCantDormi;
    private JLabel lblCantDormitorios;
    private JTextField txtM2cubierta;
    private JTextField txtSuperDescu;
    private JTextField txtPrecio;

    
    
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
        JLabel lblTipoInmueble = new JLabel("Tipo Inmueble:");
        lblTipoInmueble.setBounds(30, 85, 120, 25);
        contentPane.add(lblTipoInmueble);

        cbTipoInmueble = new JComboBox<String>();
        cbTipoInmueble.addItem("Departamento");
        cbTipoInmueble.addItem("Casa");
        cbTipoInmueble.setBounds(181, 85, 150, 25);
        contentPane.add(cbTipoInmueble);

        JLabel lblCondicionInmueble = new JLabel("Condición Inmueble:");
        lblCondicionInmueble.setBounds(30, 125, 120, 25);
        contentPane.add(lblCondicionInmueble);

        cbCondicionInmueble = new JComboBox<String>();
        cbCondicionInmueble.addItem("Excelente");
        cbCondicionInmueble.addItem("Muy Bueno");
        cbCondicionInmueble.addItem("Bueno");
        cbCondicionInmueble.addItem("Regular");
        cbCondicionInmueble.addItem("Malo");
        cbCondicionInmueble.setBounds(181, 121, 150, 25);
        contentPane.add(cbCondicionInmueble);

        
        JLabel lblCantidadAmbientes = new JLabel("Cantidad de Ambientes:");
        lblCantidadAmbientes.setBounds(30, 165, 150, 25);
        contentPane.add(lblCantidadAmbientes);

        txtCantidadAmbientes = new JTextField();
        txtCantidadAmbientes.setBounds(181, 161, 150, 25);
        contentPane.add(txtCantidadAmbientes);
        txtCantidadAmbientes.setColumns(10);
        
        JLabel lblBarrio = new JLabel("Barrio:");
        lblBarrio.setBounds(30, 201, 120, 25);
        contentPane.add(lblBarrio);

        cbBarrio = new JComboBox<String>();
        cbBarrio.addItem("Agronomía");
        cbBarrio.addItem("Almagro");
        cbBarrio.addItem("Balvanera");
        cbBarrio.addItem("Barracas");
        cbBarrio.addItem("Belgrano");
        cbBarrio.addItem("Boedo");
        cbBarrio.addItem("Caballito");
        cbBarrio.addItem("Chacarita");
        cbBarrio.addItem("Coghlan");
        cbBarrio.addItem("Colegiales");
        cbBarrio.addItem("Constitución");
        cbBarrio.addItem("Flores");
        cbBarrio.addItem("Floresta");
        cbBarrio.addItem("La Boca");
        cbBarrio.addItem("La Paternal");
        cbBarrio.addItem("Liniers");
        cbBarrio.addItem("Mataderos");
        cbBarrio.addItem("Monte Castro");
        cbBarrio.addItem("Monserrat");
        cbBarrio.addItem("Nueva Pompeya");
        cbBarrio.addItem("Núñez");
        cbBarrio.addItem("Palermo");
        cbBarrio.addItem("Parque Avellaneda");
        cbBarrio.addItem("Parque Chacabuco");
        cbBarrio.addItem("Parque Chas");
        cbBarrio.addItem("Parque Patricios");
        cbBarrio.addItem("Puerto Madero");
        cbBarrio.addItem("Recoleta");
        cbBarrio.addItem("Retiro");
        cbBarrio.addItem("Saavedra");
        cbBarrio.addItem("San Cristóbal");
        cbBarrio.addItem("San Nicolás");
        cbBarrio.addItem("San Telmo");
        cbBarrio.addItem("Vélez Sársfield");
        cbBarrio.addItem("Versalles");
        cbBarrio.addItem("Villa Crespo");
        cbBarrio.addItem("Villa del Parque");
        cbBarrio.addItem("Villa Devoto");
        cbBarrio.addItem("Villa General Mitre");
        cbBarrio.addItem("Villa Lugano");
        cbBarrio.addItem("Villa Luro");
        cbBarrio.addItem("Villa Ortúzar");
        cbBarrio.addItem("Villa Pueyrredón");
        cbBarrio.addItem("Villa Real");
        cbBarrio.addItem("Villa Riachuelo");
        cbBarrio.addItem("Villa Santa Rita");
        cbBarrio.addItem("Villa Soldati");
        cbBarrio.addItem("Villa Urquiza");
        cbBarrio.setBounds(181, 201, 150, 25);
        contentPane.add(cbBarrio);


        
        JLabel lblCalleDireccion = new JLabel("Calle:");
        lblCalleDireccion.setBounds(30, 237, 120, 25);
        contentPane.add(lblCalleDireccion);

        txtCalleDireccion = new JTextField();
        txtCalleDireccion.setBounds(181, 237, 150, 25);
        contentPane.add(txtCalleDireccion);
        txtCalleDireccion.setColumns(10);
        
        JLabel lblAlturaDireccion = new JLabel("Altura:");
        lblAlturaDireccion.setBounds(30, 273, 120, 25);
        contentPane.add(lblAlturaDireccion);
        
        txtAlturaDireccion = new JTextField();
        txtAlturaDireccion.setColumns(10);
        txtAlturaDireccion.setBounds(181, 273, 150, 25);
        contentPane.add(txtAlturaDireccion);
        
        JLabel lblAntiguedad = new JLabel("Años de Antiguedad:");
        lblAntiguedad.setBounds(30, 309, 120, 25);
        contentPane.add(lblAntiguedad);
        
        txtAntiguedadd = new JTextField();
        txtAntiguedadd.setColumns(10);
        txtAntiguedadd.setBounds(181, 309, 150, 25);
        contentPane.add(txtAntiguedadd);
        
        lblCantBanios = new JLabel("Cantidad de Baños:");
        lblCantBanios.setBounds(30, 345, 120, 25);
        contentPane.add(lblCantBanios);
        
        txtCantBanio = new JTextField();
        txtCantBanio.setColumns(10);
        txtCantBanio.setBounds(181, 345, 150, 25);
        contentPane.add(txtCantBanio);
        
        txtCantDormi = new JTextField();
        txtCantDormi.setColumns(10);
        txtCantDormi.setBounds(181, 381, 150, 25);
        contentPane.add(txtCantDormi);
        
        lblCantDormitorios = new JLabel("Cantidad de Dormitorios:");
        lblCantDormitorios.setBounds(30, 381, 160, 25);
        contentPane.add(lblCantDormitorios);
        
        JComboBox<String> cbAptoMasc = new JComboBox<String>();
        cbAptoMasc.setBounds(181, 417, 150, 25);
        contentPane.add(cbAptoMasc);
        
        JLabel lblAptoMasco = new JLabel("Apto Mascotas:");
        lblAptoMasco.setBounds(30, 417, 120, 25);
        contentPane.add(lblAptoMasco);
        
        cbAptoMasc.addItem("Si");
        cbAptoMasc.addItem("No");

        
        JComboBox<String> cbRefaccionar = new JComboBox<String>();
        cbRefaccionar.setBounds(181, 453, 150, 25);
        contentPane.add(cbRefaccionar);
        
        JLabel lblRefaccion = new JLabel("Debe Refaccionar:");
        lblRefaccion.setBounds(30, 453, 120, 25);
        contentPane.add(lblRefaccion);
        
        cbRefaccionar.addItem("Si");
        cbRefaccionar.addItem("No");
        
        JComboBox<String> cbPatio = new JComboBox<String>();
        cbPatio.setBounds(657, 85, 150, 25);
        contentPane.add(cbPatio);
        
        JLabel lblPatio = new JLabel("Tiene Patio:");
        lblPatio.setBounds(488, 85, 120, 25);
        contentPane.add(lblPatio);
        
        cbPatio.addItem("Si");
        cbPatio.addItem("No");
        
        txtM2cubierta = new JTextField();
        txtM2cubierta.setColumns(10);
        txtM2cubierta.setBounds(657, 125, 150, 25);
        contentPane.add(txtM2cubierta);
        
        JLabel lblM2Cubierta = new JLabel("M2 Superficie Cubierta");
        lblM2Cubierta.setBounds(488, 125, 159, 25);
        contentPane.add(lblM2Cubierta);
        
        
        
        txtSuperDescu = new JTextField();
        txtSuperDescu.setColumns(10);
        txtSuperDescu.setBounds(657, 197, 150, 25);
        contentPane.add(txtSuperDescu);
        
        JLabel lblM2Descubierta = new JLabel("M2 Superficie Descubierta");
        lblM2Descubierta.setBounds(488, 197, 169, 25);
        contentPane.add(lblM2Descubierta);
        
        cbPatio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cbPatio.getSelectedItem().equals("Si")) {
                    txtSuperDescu.setEnabled(true);
                } else {
                    txtSuperDescu.setEnabled(false);
                    txtSuperDescu.setText(""); // Limpiar el campo cuando se deshabilita
                }
            }
        });
        
        
        
        txtPrecio = new JTextField();
        txtPrecio.setColumns(10);
        txtPrecio.setBounds(657, 161, 150, 25);
        contentPane.add(txtPrecio);
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(488, 161, 120, 25);
        contentPane.add(lblPrecio);
        
        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setBounds(488, 237, 120, 25);
        contentPane.add(lblDescripcion);
        
        JTextArea txtAreaDescrip = new JTextArea();
        txtAreaDescrip.setBounds(517, 274, 290, 170);
        contentPane.add(txtAreaDescrip);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 570, 150, 34);
        contentPane.add(btnVolver);
        
        JButton btnRegistrar = new JButton("Registrar Inmueble");
        btnRegistrar.setBounds(657, 570, 150, 34);
        contentPane.add(btnRegistrar);
        
        

        
	}
}
