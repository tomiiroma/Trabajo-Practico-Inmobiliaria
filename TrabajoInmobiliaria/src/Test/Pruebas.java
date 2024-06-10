package test;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

import controlador.AgenteControlador;
import controlador.GerenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Gerente;

public class Pruebas {

	@Test
	public void pruebaIniciarSesionV() {
		Empleado empleado = new Empleado();
		AgenteControlador agentecont = new AgenteControlador();
		GerenteControlador gerentecont = new GerenteControlador();

		boolean flag = false;
		for (Agente agente : agentecont.getAllAgente()) {

			if (agente.IniciarSesion("12345", "Cont123") == true) {
				flag = true;
				break;
			} else {

			}
		}
		for (Gerente gerente : gerentecont.getAllGerente()) {
			if (gerente.IniciarSesion("12345678", "securepassword") == true) {
				flag = true;
				break;
			} else {

			}
		}

		assertEquals(true, flag);

	}

	@Test
	public void pruebaIniciarSesionF() {
		Empleado empleado = new Empleado();
		AgenteControlador agentecont = new AgenteControlador();
		GerenteControlador gerentecont = new GerenteControlador();

		boolean flag = false;
		for (Agente agente : agentecont.getAllAgente()) {

			if (agente.IniciarSesion("111", "contrasena") == null || agente.IniciarSesion("111", "contrasena")== true) {
				flag = true;
				break;
			} else {

			}

		}
		for (Gerente gerente : gerentecont.getAllGerente()) {
			if (gerente.IniciarSesion("111", "contrasena") == null || gerente.IniciarSesion("111", "contrasena")== true) {
				flag = true;
				break;
			} else {

			}
			assertEquals(false, flag);

		}

	}
}
