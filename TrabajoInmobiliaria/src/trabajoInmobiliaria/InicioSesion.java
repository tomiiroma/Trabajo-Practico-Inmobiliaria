package trabajoInmobiliaria;

import java.util.List;

import javax.swing.JOptionPane;

<<<<<<< HEAD
import controlador.AgenteControlador;
import controlador.GerenteControlador;
=======
>>>>>>> Agus

public interface InicioSesion {
	
	  default Boolean IniciarSesion(String dniString, String contrasena) {
		   if (dniString == null || dniString.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "El DNI no puede estar vacío");
	            return null;
	        }

<<<<<<< HEAD
	        for (int i = 0; i < dniString.length(); i++) {
	            if (!Character.isDigit(dniString.charAt(i))) {
	                JOptionPane.showMessageDialog(null, "El DNI debe contener solo números");
	                return null;
	            }
	        }

	        int dni = Integer.parseInt(dniString);

	        AgenteControlador agentecontrolador = new AgenteControlador();
	        GerenteControlador gerentecontrolador = new GerenteControlador();

	        List<Agente> agentes = agentecontrolador.getAllAgente();
	        List<Gerente> gerentes = gerentecontrolador.getAllGerente();

	        for (Agente agente : agentes) {
	            if (agente.getDni() == dni && agente.getContraseña().equals(contrasena)) {
	                JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
	                return true;
	            }
	        }

	        for (Gerente gerente : gerentes) {
	            if (gerente.getDni() == dni && gerente.getContraseña().equals(contrasena)) {
	                JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
	                return false;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Ingrese correctamente el dni y/o contrasena");
	        return null;
	    }
	    
}
=======
	default void IniciarSesion() {
		
	}
	
}
>>>>>>> Agus
