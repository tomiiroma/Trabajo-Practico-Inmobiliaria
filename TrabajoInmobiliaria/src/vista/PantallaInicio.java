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
		setBounds(100, 100, 490, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labNombre = new JLabel("Nombre");
		labNombre.setBounds(211, 26, 65, 14);
		contentPane.add(labNombre);
		
		inpNombre = new JTextField();
		inpNombre.setForeground(new Color(0, 0, 0));
		inpNombre.setBackground(new Color(209, 209, 163));
		inpNombre.setBounds(155, 51, 176, 20);
		contentPane.add(inpNombre);
		inpNombre.setColumns(10);
		
		JLabel labContrasena = new JLabel("Contraseña");
		labContrasena.setBounds(193, 102, 100, 14);
		contentPane.add(labContrasena);
		
		inpContrasena = new JPasswordField();
		inpContrasena.setForeground(new Color(0, 0, 0));
		inpContrasena.setBackground(new Color(209, 209, 163));
		inpContrasena.setBounds(155, 127, 176, 20);
		contentPane.add(inpContrasena);
		
		
		JButton btnIngresar = new JButton("Iniciar Sesion");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado empleado = new Empleado();
				
		        Boolean esAgente = empleado.IniciarSesion(inpNombre.getText(), inpContrasena.getText());

		        if (esAgente != null) {
		            if (esAgente) {
		            	PantallaAgente PantallaAgente = new PantallaAgente();
		            	dispose();
		            } else if(!esAgente){
		            	JOptionPane.showMessageDialog(null, "Inicio Sesion como gerente");

		            }else {
		            	JOptionPane.showMessageDialog(null, "Error");
		            }
		        }
			}
		});
		btnIngresar.setBounds(188, 194, 111, 23);
		contentPane.add(btnIngresar);
		
	
	}
}
