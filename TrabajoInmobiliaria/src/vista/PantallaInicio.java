package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.InicioSesion;

import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class PantallaInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inpNombre;
	private JPasswordField inpContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio frame = new PantallaInicio();
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
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 118, 113));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labNombre = new JLabel("DNI");
		labNombre.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		labNombre.setForeground(new Color(226, 228, 222));
		labNombre.setBounds(200, 138, 65, 14);
		contentPane.add(labNombre);
		
		inpNombre = new JTextField();
		inpNombre.setBorder(new EmptyBorder(0, 0, 0, 0));
		inpNombre.setToolTipText("");
		inpNombre.setForeground(new Color(0, 0, 0));
		inpNombre.setBackground(new Color(255, 255, 255));
		inpNombre.setBounds(200, 163, 360, 30);
		contentPane.add(inpNombre);
		inpNombre.setColumns(10);
		
		JLabel lblerrorIngreso = new JLabel("DNI y/o contraseña incorrectos");
		lblerrorIngreso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblerrorIngreso.setForeground(new Color(255, 4, 4));
		lblerrorIngreso.setBounds(291, 397, 197, 25);
		contentPane.add(lblerrorIngreso);
		lblerrorIngreso.setVisible(false);
		
		
		JLabel labContrasena = new JLabel("Contraseña");
		labContrasena.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		labContrasena.setForeground(new Color(226, 228, 222));
		labContrasena.setBounds(200, 221, 91, 14);
		contentPane.add(labContrasena);
		
		inpContrasena = new JPasswordField();
		inpContrasena.setToolTipText("");
		inpContrasena.setBorder(new EmptyBorder(0, 0, 0, 0));
		inpContrasena.setForeground(new Color(0, 0, 0));
		inpContrasena.setBackground(new Color(255, 255, 255));
		inpContrasena.setBounds(200, 246, 360, 30);
		contentPane.add(inpContrasena);
		
		
		JButton btnIngresar = new JButton("Iniciar Sesion");
		btnIngresar.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnIngresar.setBorder(null);
		btnIngresar.setForeground(new Color(192, 192, 192));
		btnIngresar.setBackground(new Color(0, 47, 47));
		btnIngresar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Empleado empleado = new Empleado();
				
		        Boolean esAgente = empleado.IniciarSesion(inpNombre.getText(), inpContrasena.getText());

		        if(esAgente == null) {
	            	lblerrorIngreso.setVisible(true);

		        }
		        
		        if (esAgente != null) {
		            if (esAgente) {
		            	PantallaAgente PantallaAgente = new PantallaAgente();
		            	dispose();
		            } else if(!esAgente){
		            	PantallaGerente pantallaGerente = new PantallaGerente();
		            	dispose();

		            }else {
		            	JOptionPane.showMessageDialog(null, "Error");
		            }
		        }
			}
		});
		btnIngresar.setBounds(315, 329, 111, 45);
		contentPane.add(btnIngresar);
		
		JLabel lblInicioTitulo = new JLabel("INICIAR SESION");
		lblInicioTitulo.setForeground(new Color(255, 255, 255));
		lblInicioTitulo.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblInicioTitulo.setBounds(268, 55, 220, 53);
		contentPane.add(lblInicioTitulo);
		
		
	
	}
}
