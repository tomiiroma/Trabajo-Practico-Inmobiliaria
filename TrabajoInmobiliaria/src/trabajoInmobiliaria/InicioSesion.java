package trabajoInmobiliaria;

import java.util.List;
import controlador.AgenteControlador;

import javax.swing.JOptionPane;

public interface InicioSesion {


	default String IniciarSesion(){
		String retorno = ""; 
		AgenteControlador agentecontrolador = new AgenteControlador();
		
		int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dni"));
		String cont = (String)JOptionPane.showInputDialog("Ingrese la contrasena");
		
		List<Agente> agentes = agentecontrolador.getAllAgente();
		
		boolean dniv = false;
		
		for (Agente agente : agentes) {
			if(dni == agente.getDni() && cont.equals(agente.getContraseña())) {
				JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
				retorno = "Agente";
			}else if(dni!= agente.getDni() || !cont.equals(agente.getContraseña())) {
				JOptionPane.showMessageDialog(null, "DNI o contrasena incorrectos");
			}
		}
		
		return retorno;
	}
	
	
}
