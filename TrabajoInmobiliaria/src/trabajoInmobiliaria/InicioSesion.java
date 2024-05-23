package trabajoInmobiliaria;

import java.util.List;
<<<<<<< HEAD
import controlador.AgenteControlador;
=======
>>>>>>> Agus

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.GerenteControlador;

public interface InicioSesion {

    default void IniciarSesion() {

<<<<<<< HEAD
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
	
	
=======
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI"));
        String cont = JOptionPane.showInputDialog("Ingrese Contrasena");

        AgenteControlador agentecontrolador = new AgenteControlador();
        GerenteControlador gerentecontrolador = new GerenteControlador();

        List<Agente> agentes = agentecontrolador.getAllAgente();
        List<Gerente> gerentes = gerentecontrolador.getAllGerente();
        boolean esAgente = false;
        boolean inicio = false;

        for (Agente agente : agentes) {
            if (agente.getDni() == dni && agente.getContraseña().equals(cont)) {
                System.out.print("leyo lista agente");

                inicio = true;
                esAgente = true;
                break;
            }
        }

        if (!esAgente) {
            for (Gerente gerente : gerentes) {
                if (gerente.getDni() == dni && gerente.getContraseña().equals(cont)) {
                    System.out.print("leyo lista gerente");

                    inicio = true;
                    break;
                }
            }
        }

        if (inicio) {
            JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente el dni y/o contrasena");
        }
    }
>>>>>>> Agus
}
