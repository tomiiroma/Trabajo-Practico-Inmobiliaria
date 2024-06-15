package trabajoInmobiliaria;

import java.util.List;

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.AlquilerControlador;
import controlador.CompradorControlador;
import controlador.ContratoControlador;
import controlador.InquilinoControlador;
import controlador.PropietarioControlador;
import controlador.VentaControlador;

class Main{

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión ", "Inmobiliaria Maguez",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		
		int respuestaSeleccionada;

		Agente agente1 = new Agente();
		Gerente gerente1 = new Gerente();

		Empleado empleado = new Empleado();
		
		
		Contrato contrato = new Contrato();
		ContratoControlador controlador = new ContratoControlador();
		
		VentaControlador venta = new VentaControlador();
		AlquilerControlador alquiler = new AlquilerControlador();
		
		

	      do {
	            String dni = JOptionPane.showInputDialog("Ingrese DNI");
	            
	            String cont = JOptionPane.showInputDialog("Ingrese Contrasena");

	            Boolean esAgente = empleado.IniciarSesion(dni, cont);

	            if (esAgente != null) {
	                if (esAgente) {
	                    agente1.menuAgente();
	                } else {
	                    gerente1.menuGerente();
	                }
	            }

	            String[] preguntaEleccion = {"Si", "No"};
	            respuestaSeleccionada = JOptionPane.showOptionDialog(null, "¿Desea seguir en el programa?", "Inmobiliaria", 0, JOptionPane.INFORMATION_MESSAGE, null, preguntaEleccion, preguntaEleccion[0]);
	        } while (respuestaSeleccionada == 0);
	    }
	

}
