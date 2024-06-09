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

public class AgregarInmueble extends JFrame {

	private JPanel contentPane;
    private JComboBox<String> cbTipoInmueble;
    private JComboBox<String> cbCondicionInmueble;
    private JTextField txtCantidadAmbientes;
    private JComboBox<String> cbBarrio;


    
    
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
        lblTipoInmueble.setBounds(30, 30, 120, 25);
        contentPane.add(lblTipoInmueble);

        cbTipoInmueble = new JComboBox<String>();
        cbTipoInmueble.addItem("Departamento");
        cbTipoInmueble.addItem("Casa");
        cbTipoInmueble.setBounds(170, 30, 150, 25);
        contentPane.add(cbTipoInmueble);

        JLabel lblCondicionInmueble = new JLabel("Condición Inmueble:");
        lblCondicionInmueble.setBounds(30, 70, 120, 25);
        contentPane.add(lblCondicionInmueble);

        cbCondicionInmueble = new JComboBox<String>();
        cbCondicionInmueble.addItem("Excelente");
        cbCondicionInmueble.addItem("Muy Bueno");
        cbCondicionInmueble.addItem("Bueno");
        cbCondicionInmueble.addItem("Regular");
        cbCondicionInmueble.addItem("Malo");
        cbCondicionInmueble.setBounds(170, 66, 150, 25);
        contentPane.add(cbCondicionInmueble);

        
        JLabel lblCantidadAmbientes = new JLabel("Cantidad de Ambientes:");
        lblCantidadAmbientes.setBounds(30, 110, 150, 25);
        contentPane.add(lblCantidadAmbientes);

        txtCantidadAmbientes = new JTextField();
        txtCantidadAmbientes.setBounds(170, 106, 150, 25);
        contentPane.add(txtCantidadAmbientes);
        txtCantidadAmbientes.setColumns(10);
        
        JLabel lblBarrio = new JLabel("Barrio:");
        lblBarrio.setBounds(30, 150, 120, 25);
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
        cbBarrio.setBounds(170, 146, 150, 25);
        contentPane.add(cbBarrio);


        
	}
}
