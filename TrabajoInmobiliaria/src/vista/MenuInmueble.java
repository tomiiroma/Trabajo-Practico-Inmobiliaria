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
        setBounds(100, 100, 870, 690);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(0, 128, 128));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnVerInmuebles = new JButton("Ver Inmuebles");
        btnVerInmuebles.setBounds(58, 117, 220, 55);
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
        btnAgregarInmueble.setBounds(560, 117, 220, 55);
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

        JButton btnModificarInmueble = new JButton("Modificar Inmuebles");
        btnModificarInmueble.setBounds(58, 343, 220, 55);
        btnModificarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnModificarInmueble.setForeground(new Color(255, 255, 255));
        btnModificarInmueble.setBackground(new Color(48, 109, 105));
        btnModificarInmueble.setBorder(null);
        btnModificarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ModificarInmueble modificarInmueble = new ModificarInmueble();
                dispose();
            }
        });
        contentPane.add(btnModificarInmueble);

        JButton btnEliminarInmueble = new JButton("Eliminar Inmuebles");
        btnEliminarInmueble.setBounds(560, 343, 220, 55);
        btnEliminarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnEliminarInmueble.setForeground(new Color(255, 255, 255));
        btnEliminarInmueble.setBackground(new Color(48, 109, 105));
        btnEliminarInmueble.setBorder(null);
        btnEliminarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EliminarInmueble eliminarInmueble = new EliminarInmueble();
                dispose();
            }
        });
        contentPane.add(btnEliminarInmueble);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(30, 570, 150, 34);
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
    }
}
