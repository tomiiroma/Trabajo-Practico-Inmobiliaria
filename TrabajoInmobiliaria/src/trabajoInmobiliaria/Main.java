package trabajoInmobiliaria;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión ", "Inmobiliaria Maguez",
				JOptionPane.INFORMATION_MESSAGE);

		int respuestaSeleccionada;

		Agente agente1 = new Agente();
		Gerente gerente1 = new Gerente();

		do {
			String[] opcionesRoles = { "Agente", "Gerente", "Salir" };
			int eleccionElegida1 = JOptionPane.showOptionDialog(null, "Iniciar Sesion Como", "Inmobiliaria Maguez", 0,
					0, null, opcionesRoles, opcionesRoles[0]);

			if (eleccionElegida1 == 0) {
				
			agente1.menuAgente();

				
			} else if (eleccionElegida1 == 1) {
				
				gerente1.menuGerente();
				

				

			} else {
				JOptionPane.showMessageDialog(null, "Hasta luego!");
				System.exit(0);
			}

			String[] preguntaEleccion = { "Si", "No" };
			respuestaSeleccionada = JOptionPane.showOptionDialog(null, "Desea seguir en el programa: ", "Biblioteca", 0,
					0, null, preguntaEleccion, preguntaEleccion[0]);
		} while (respuestaSeleccionada == 0);

	}

}
