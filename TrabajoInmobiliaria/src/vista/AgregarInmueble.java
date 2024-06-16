package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
        JLabel lblTipoInmueble = new JLabel("Tipo Inmueble:");
        lblTipoInmueble.setForeground(new Color(255, 255, 255));
        lblTipoInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblTipoInmueble.setBounds(30, 77, 120, 25);
        contentPane.add(lblTipoInmueble);

        cbTipoInmueble = new JComboBox<String>();
        cbTipoInmueble.addItem("Departamento");
        cbTipoInmueble.addItem("Casa");
        cbTipoInmueble.setBounds(205, 77, 150, 25);
        contentPane.add(cbTipoInmueble);

        JLabel lblCondicionInmueble = new JLabel("Condición Inmueble:");
        lblCondicionInmueble.setForeground(new Color(255, 255, 255));
        lblCondicionInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCondicionInmueble.setBounds(30, 129, 165, 25);
        contentPane.add(lblCondicionInmueble);

        cbCondicionInmueble = new JComboBox<String>();
        cbCondicionInmueble.addItem("Excelente");
        cbCondicionInmueble.addItem("Muy Bueno");
        cbCondicionInmueble.addItem("Bueno");
        cbCondicionInmueble.addItem("Regular");
        cbCondicionInmueble.addItem("Malo");
        cbCondicionInmueble.setBounds(205, 125, 150, 25);
        contentPane.add(cbCondicionInmueble);

        
        JLabel lblCantidadAmbientes = new JLabel("Cantidad de Ambientes:");
        lblCantidadAmbientes.setForeground(new Color(255, 255, 255));
        lblCantidadAmbientes.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCantidadAmbientes.setBounds(30, 182, 150, 25);
        contentPane.add(lblCantidadAmbientes);

        txtCantidadAmbientes = new JTextField();
        txtCantidadAmbientes.setBounds(205, 178, 150, 25);
        contentPane.add(txtCantidadAmbientes);
        txtCantidadAmbientes.setColumns(10);
        
        JLabel lblBarrio = new JLabel("Barrio:");
        lblBarrio.setForeground(new Color(255, 255, 255));
        lblBarrio.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblBarrio.setBounds(30, 218, 120, 25);
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
        cbBarrio.setBounds(205, 218, 150, 25);
        contentPane.add(cbBarrio);


        
        JLabel lblCalleDireccion = new JLabel("Calle:");
        lblCalleDireccion.setForeground(new Color(255, 255, 255));
        lblCalleDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCalleDireccion.setBounds(30, 260, 120, 25);
        contentPane.add(lblCalleDireccion);

        txtCalleDireccion = new JTextField();
        txtCalleDireccion.setBounds(205, 260, 150, 25);
        contentPane.add(txtCalleDireccion);
        txtCalleDireccion.setColumns(10);
        
        JLabel lblAlturaDireccion = new JLabel("Altura:");
        lblAlturaDireccion.setForeground(new Color(255, 255, 255));
        lblAlturaDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAlturaDireccion.setBounds(30, 310, 120, 25);
        contentPane.add(lblAlturaDireccion);
        
        txtAlturaDireccion = new JTextField();
        txtAlturaDireccion.setColumns(10);
        txtAlturaDireccion.setBounds(205, 310, 150, 25);
        contentPane.add(txtAlturaDireccion);
        
        JLabel lblAntiguedad = new JLabel("Años de Antiguedad:");
        lblAntiguedad.setForeground(new Color(255, 255, 255));
        lblAntiguedad.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAntiguedad.setBounds(30, 359, 120, 25);
        contentPane.add(lblAntiguedad);
        
        txtAntiguedadd = new JTextField();
        txtAntiguedadd.setColumns(10);
        txtAntiguedadd.setBounds(205, 359, 150, 25);
        contentPane.add(txtAntiguedadd);
        
        lblCantBanios = new JLabel("Cantidad de Baños:");
        lblCantBanios.setForeground(new Color(255, 255, 255));
        lblCantBanios.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCantBanios.setBounds(30, 409, 120, 25);
        contentPane.add(lblCantBanios);
        
        txtCantBanio = new JTextField();
        txtCantBanio.setColumns(10);
        txtCantBanio.setBounds(205, 410, 150, 25);
        contentPane.add(txtCantBanio);
        
        txtCantDormi = new JTextField();
        txtCantDormi.setColumns(10);
        txtCantDormi.setBounds(205, 462, 150, 25);
        contentPane.add(txtCantDormi);
        
        lblCantDormitorios = new JLabel("Cantidad de Dormitorios:");
        lblCantDormitorios.setForeground(new Color(255, 255, 255));
        lblCantDormitorios.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCantDormitorios.setBounds(30, 461, 160, 25);
        contentPane.add(lblCantDormitorios);
        
        JComboBox<String> cbAptoMasc = new JComboBox<String>();
        cbAptoMasc.setBounds(205, 518, 150, 25);
        contentPane.add(cbAptoMasc);
        
        JLabel lblAptoMasco = new JLabel("Apto Mascotas:");
        lblAptoMasco.setForeground(new Color(255, 255, 255));
        lblAptoMasco.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAptoMasco.setBounds(30, 517, 120, 25);
        contentPane.add(lblAptoMasco);
        
        cbAptoMasc.addItem("Si");
        cbAptoMasc.addItem("No");

        
        JComboBox<String> cbRefaccionar = new JComboBox<String>();
        cbRefaccionar.setBounds(657, 77, 150, 25);
        contentPane.add(cbRefaccionar);
        
        JLabel lblRefaccion = new JLabel("Debe Refaccionar:");
        lblRefaccion.setForeground(new Color(255, 255, 255));
        lblRefaccion.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblRefaccion.setBounds(488, 77, 120, 25);
        contentPane.add(lblRefaccion);
        
        cbRefaccionar.addItem("Si");
        cbRefaccionar.addItem("No");
        
        JComboBox<String> cbPatio = new JComboBox<String>();
        cbPatio.setBounds(657, 125, 150, 25);
        contentPane.add(cbPatio);
        
        JLabel lblPatio = new JLabel("Tiene Patio:");
        lblPatio.setForeground(new Color(255, 255, 255));
        lblPatio.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPatio.setBounds(488, 125, 120, 25);
        contentPane.add(lblPatio);
        
        cbPatio.addItem("Si");
        cbPatio.addItem("No");
        
        txtM2cubierta = new JTextField();
        txtM2cubierta.setColumns(10);
        txtM2cubierta.setBounds(657, 182, 150, 25);
        contentPane.add(txtM2cubierta);
        
        JLabel lblM2Cubierta = new JLabel("M2 Superficie Cubierta");
        lblM2Cubierta.setForeground(new Color(255, 255, 255));
        lblM2Cubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblM2Cubierta.setBounds(488, 182, 159, 25);
        contentPane.add(lblM2Cubierta);
        
        
        
        txtSuperDescu = new JTextField();
        txtSuperDescu.setColumns(10);
        txtSuperDescu.setBounds(657, 294, 150, 25);
        contentPane.add(txtSuperDescu);
        
        JLabel lblM2Descubierta = new JLabel("M2 Superficie Descubierta");
        lblM2Descubierta.setForeground(new Color(255, 255, 255));
        lblM2Descubierta.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblM2Descubierta.setBounds(488, 294, 169, 25);
        contentPane.add(lblM2Descubierta);
        
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
        txtPrecio.setColumns(10);
        txtPrecio.setBounds(657, 237, 150, 25);
        contentPane.add(txtPrecio);
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setForeground(new Color(255, 255, 255));
        lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrecio.setBounds(488, 237, 120, 25);
        contentPane.add(lblPrecio);
        
        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setForeground(new Color(255, 255, 255));
        lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblDescripcion.setBounds(488, 336, 120, 25);
        contentPane.add(lblDescripcion);
        
        JTextArea txtAreaDescrip = new JTextArea();
        txtAreaDescrip.setBounds(517, 373, 290, 170);
        contentPane.add(txtAreaDescrip);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 570, 150, 34);
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
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        panel_1.setBounds(10, 11, 834, 55);
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
        btnRegistrarInmueble.setForeground(Color.WHITE);
        btnRegistrarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRegistrarInmueble.setBorder(null);
        btnRegistrarInmueble.setBackground(new Color(48, 109, 105));
        btnRegistrarInmueble.setBounds(657, 570, 150, 34);
        contentPane.add(btnRegistrarInmueble);
        

        
	}
}