package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MenuInmueble extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuInmueble frame = new MenuInmueble();
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
    public MenuInmueble() {
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 505);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setBackground(new Color(52, 118, 113));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnVerInmuebles = new JButton("Ver Inmuebles");
        btnVerInmuebles.setBounds(96, 180, 278, 35);
        btnVerInmuebles.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVerInmuebles.setForeground(new Color(255, 255, 255));
        btnVerInmuebles.setBackground(new Color(48, 109, 105));
        btnVerInmuebles.setBorder(null);
        btnVerInmuebles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerInmueblesMenu verinmuebles = new VerInmueblesMenu();
                dispose();
            }
        });
        contentPane.add(btnVerInmuebles);

        JButton btnAgregarInmueble = new JButton("Agregar Inmuebles");
        btnAgregarInmueble.setBounds(408, 180, 277, 35);
        btnAgregarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnAgregarInmueble.setForeground(new Color(255, 255, 255));
        btnAgregarInmueble.setBackground(new Color(48, 109, 105));
        btnAgregarInmueble.setBorder(null);
        btnAgregarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarInmueble agregarInmueble = new AgregarInmueble();
                dispose();
            }
        });
        contentPane.add(btnAgregarInmueble);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(32, 400, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PantallaAgente pantallaAgente = new PantallaAgente();
                dispose();
            }
        });
        contentPane.add(btnVolver);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        panel_1.setBounds(10, 11, 834, 55);
        contentPane.add(panel_1);
        
        JLabel lblGestorPropiedades = new JLabel("Gestor Propiedades");
        lblGestorPropiedades.setForeground(Color.WHITE);
        lblGestorPropiedades.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblGestorPropiedades.setBounds(10, 11, 298, 35);
        panel_1.add(lblGestorPropiedades);
        
        JButton btnEliminarInmueble = new JButton("Eliminar Inmuebles");
        btnEliminarInmueble.setForeground(Color.WHITE);
        btnEliminarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEliminarInmueble.setBorder(null);
        btnEliminarInmueble.setBackground(new Color(48, 109, 105));
        btnEliminarInmueble.setBounds(408, 256, 277, 35);
        contentPane.add(btnEliminarInmueble);
        btnEliminarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EliminarInmueble eliminarInmueble = new EliminarInmueble();
                dispose();
            }
        });
        
  
        
        JButton btnModificarInmueble = new JButton("Modificar Inmuebles");
        btnModificarInmueble.setForeground(Color.WHITE);
        btnModificarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnModificarInmueble.setBorder(null);
        btnModificarInmueble.setBackground(new Color(48, 109, 105));
        btnModificarInmueble.setBounds(96, 256, 278, 35);
        contentPane.add(btnModificarInmueble);
        
        btnModificarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificarInmueble modificarInmueble = new ModificarInmueble();
                dispose();
            }
        });
    }
}
