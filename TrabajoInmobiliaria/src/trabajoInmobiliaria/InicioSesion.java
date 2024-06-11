package trabajoInmobiliaria;

import java.util.List;

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.GerenteControlador;

public interface InicioSesion {
	
	  default Boolean IniciarSesion(String dniString, String contrasena) {
		   if (dniString == null || dniString.isEmpty()) {
			   System.out.println("El DNI no puede estar vacío");
	            return null;
	        }

	        for (int i = 0; i < dniString.length(); i++) {
	            if (!Character.isDigit(dniString.charAt(i))) {
	                System.out.println("El DNI debe contener solo números");
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
	                System.out.println("Inicio de Sesion Exitoso");
	                return true;
	            }
	        }

	        for (Gerente gerente : gerentes) {
	            if (gerente.getDni() == dni && gerente.getContraseña().equals(contrasena)) {
	            	 System.out.println("Inicio de Sesion Exitoso");
	                return false;
	            }
	        }

	        System.out.println("Ingrese correctamente el dni y/o contrasena");
	        return null;
	    }
	    
}