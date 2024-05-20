package trabajoInmobiliaria;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import controlador.AgenteControlador;
import controlador.GerenteControlador;

public interface InicioSesion {

	default void IniciarSesion() {

		int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI"));
		String cont = JOptionPane.showInputDialog("Ingrese Contrasena");

		AgenteControlador agentecontrolador = new AgenteControlador();
		GerenteControlador gerentecontrolador = new GerenteControlador();
		System.out.print("no leyo lista empleados");

		List<Agente> agentes = agentecontrolador.getAllAgente();
		List<Gerente> gerentes = gerentecontrolador.getAllGerente();
		System.out.print("leyo lista empleados");
		boolean esAgente = false;
		boolean inicio = false;

		for (Agente agente : agentes) {
			if (agente.getDni() == dni && agente.getContraseña().equals(cont)) {
				inicio = true;
				esAgente = true;
				break;
			}
		}

		if (esAgente == false) {
			for (Gerente gerente : gerentes) {
				if (gerente.getDni() == dni && gerente.getContraseña().equals(cont)) {
					inicio = true;
					break;

				}
			}

			if (inicio) {
				JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese correctamente el dni y/o contrasena");
			}

		}

	}
}
