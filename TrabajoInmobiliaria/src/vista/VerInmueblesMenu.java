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

public class VerInmueblesMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VerInmueblesMenu frame = new VerInmueblesMenu();
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
    public VerInmueblesMenu() {
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 505);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setBackground(new Color(52, 118, 113));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnVerListaCompleta = new JButton("Lista Completa de Inmuebles");
        btnVerListaCompleta.setBounds(97, 216, 278, 35);
        btnVerListaCompleta.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVerListaCompleta.setForeground(new Color(255, 255, 255));
        btnVerListaCompleta.setBackground(new Color(48, 109, 105));
        btnVerListaCompleta.setBorder(null);
        btnVerListaCompleta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerListaInmueblesCompleta verinmueblesCompleto = new VerListaInmueblesCompleta();
                dispose();
            }
        });
        contentPane.add(btnVerListaCompleta);

        JButton btnInmueblesDisp = new JButton("Ver Inmuebles Disponibles");
        btnInmueblesDisp.setBounds(409, 216, 277, 35);
        btnInmueblesDisp.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnInmueblesDisp.setForeground(new Color(255, 255, 255));
        btnInmueblesDisp.setBackground(new Color(48, 109, 105));
        btnInmueblesDisp.setBorder(null);
        btnInmueblesDisp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerInmueblesDisponibles verinmuebles = new VerInmueblesDisponibles();
                dispose();
            }
        });
        contentPane.add(btnInmueblesDisp);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(32, 400, 150, 34);
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBackground(new Color(48, 109, 105));
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuInmueble menuInmueble = new MenuInmueble();
                dispose();
            }
        });
        contentPane.add(btnVolver);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(133, 201, 196));
        panel_1.setBounds(10, 11, 834, 55);
        contentPane.add(panel_1);
        
        JLabel lblGestorPropiedades_1 = new JLabel("Gestor Propiedades | Lista Inmuebles");
        lblGestorPropiedades_1.setForeground(Color.WHITE);
        lblGestorPropiedades_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblGestorPropiedades_1.setBounds(10, 11, 624, 35);
        panel_1.add(lblGestorPropiedades_1);
        
        JButton btnActivarInmueble = new JButton("Activar Inmuebles");
        btnActivarInmueble.setForeground(Color.WHITE);
        btnActivarInmueble.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnActivarInmueble.setBorder(null);
        btnActivarInmueble.setBackground(new Color(48, 109, 105));
        btnActivarInmueble.setBounds(245, 262, 277, 35);
        contentPane.add(btnActivarInmueble);
        
        btnActivarInmueble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActivarInmuebles activarInmueble = new ActivarInmuebles();
                dispose();
            }
        });
        
    }
}
