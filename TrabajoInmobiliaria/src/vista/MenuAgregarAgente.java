package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAgregarAgente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JTextField textField_6;
	private TipoEmpleado tipoempleado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAgregarAgente frame = new MenuAgregarAgente();
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
	public MenuAgregarAgente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar nuevo agente");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel.setBounds(379, 0, 424, 89);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(66, 97, 966, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(66, 114, 966, 414);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(69, 40, 83, 35);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(190, 42, 241, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(534, 40, 83, 35);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(636, 42, 241, 35);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DNI:");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(69, 139, 83, 35);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 139, 241, 35);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(534, 139, 83, 35);
		panel.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(636, 139, 241, 35);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Fecha Nac:");
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(69, 234, 111, 35);
		panel.add(lblNewLabel_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(190, 236, 241, 35);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Correo:");
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(534, 234, 83, 35);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(636, 236, 241, 35);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1.setBounds(69, 336, 111, 35);
		panel.add(lblNewLabel_1_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 338, 241, 35);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("ID Agente:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1_1.setBounds(534, 336, 111, 35);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(636, 338, 241, 35);
		panel.add(textField_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(66, 548, 966, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Registrar Agente");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(617, 574, 205, 58);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (tipoempleado==null) {
					
					tipoempleado = new TipoEmpleado();
					
				}
				
				
				tipoempleado.setLocationRelativeTo(null);
				
				tipoempleado.setVisible(true);
				
				dispose();
				
				
			}
		});
		btnVolver.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnVolver.setBounds(273, 574, 205, 58);
		contentPane.add(btnVolver);
	}
}
