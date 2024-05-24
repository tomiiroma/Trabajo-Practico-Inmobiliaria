package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Agente extends Empleado implements Validacion, InicioSesion{

	private int id_agente;


	
	
	



	public Agente(int id_empleado, String nombre, String apellido, LocalDate fecha_nacimiento, int dni, int telefono,
			String correo, String tipo_empleado, String contraseña, int id_agente) {
		super(id_empleado, nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, contraseña);
		this.id_agente = id_agente;
	}

	public Agente() {

	}

	@Override
	public String toString() {
		return "Agente [id_agente=" + id_agente + "]";
	}

	public int getId_agente() {
		return id_agente;
	}

	public void setId_agente(int id_agente) {
		this.id_agente = id_agente;
	}

	
	public boolean menuAgente() {
		boolean repetir;
		
		do {		
			repetir = true;
			String[] opcionesAgente = { "Registrar Nueva Propiedad", "Registrar Nuevo Cliente", "Realizar Nueva Operacion",
					"Realizar Nuevo Contrato", "Realizar Busqueda", "Agendar Reunion o Visita", "Registrar Pago","Cargar Nuevo Documento",
					"Ver Ultimas Operaciones", "Cerrar Sesion","Salir" };
	
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, opcionesAgente,
					opcionesAgente[0]);
	
			switch (opcionSeleccionada) {
			case "Registrar Nueva Propiedad":
				do {
					String[] tipoPropiedad = { "Propiedad en Venta","Propiedad en Alquiler","Volver" };
					
					String clienteSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, tipoPropiedad,
							tipoPropiedad[0]);
					
					if(clienteSeleccionado.equals("Propiedad en Venta")){
						JOptionPane.showMessageDialog(null, "Completar datos propiedad en venta");
						
					}else if(clienteSeleccionado.equals("Propiedad en Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar datos propiedad en alquiler");  

					}else {
						break;
					}
							
				} while (repetir);
	
				break;
	
			case "Registrar Nuevo Cliente":
				do {
					String[] tipoCliente = { "Nuevo Propietario","Nuevo Inquilino","Volver" };
					
					String clienteSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, tipoCliente,
							tipoCliente[0]);
					
					if(clienteSeleccionado.equals("Nuevo Propietario")){
						JOptionPane.showMessageDialog(null, "Completar Propietario");
						agregarPropietario();
					}else if(clienteSeleccionado.equals("Nuevo Inquilino")){
						agregarInquilino();

					}else {
						break;
					}
							
				} while (repetir);
	
				break;
			
			case "Realizar Nueva Operacion":
				do {
					String[] operaciones = { "Realizar Venta","Realizar Alquiler","Volver" };
					
					String operacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, operaciones,
							operaciones[0]);
					
					if(operacionSeleccionada.equals("Realizar Venta")){
						JOptionPane.showMessageDialog(null, "Completar Venta");
						
					}else if(operacionSeleccionada.equals("Realizar Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar Alquiler");  

					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Realizar Nuevo Contrato":
	
				do {
					String[] operaciones = { "Nuevo Contrato de Venta","Nuevo Contrato de Alquiler","Volver" };
					
					String operacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, operaciones,
							operaciones[0]);
					
					if(operacionSeleccionada.equals("Nuevo Contrato de Venta")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos de la venta");
						
					}else if(operacionSeleccionada.equals("Nuevo Contrato de Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos del alquiler");  

					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Realizar Busqueda":
				do {
					String[] operaciones = { "Buscador","Volver" };
					
					String operacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, operaciones,
							operaciones[0]);
					
					if(operacionSeleccionada.equals("Buscador")){
						JOptionPane.showMessageDialog(null, "Buscador");
						
					}else {
						break;
					}
					
				} while (repetir);
				break;
	
			case "Agendar Reunion o Visita":
				do {
					String[] operaciones = { "Programar Nueva Reunion","Programar Nueva Visita","Volver"};
					
					String operacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
					
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, operaciones,
							operaciones[0]);
					
					if(operacionSeleccionada.equals("Programar Nueva Reunion")){
						JOptionPane.showMessageDialog(null, "Seleccionar Clientes");
						JOptionPane.showMessageDialog(null, "Seleccionar Fecha disponible | Mostrar un calendario");
						
					}else if(operacionSeleccionada.equals("Programar Nueva Visita")){
						JOptionPane.showMessageDialog(null, "Seleccionar Clientes");
						JOptionPane.showMessageDialog(null, "Seleccionar Propiedades disponibles"); //mostramos una linkedList con las propiedades para visitar disponibles	
						JOptionPane.showMessageDialog(null, "Seleccionar Fecha disponible | Mostrar un calendario");

					}else {
						break;
					}
					
				} while (repetir);
				break;
	
			case "Registrar Pago":
				do {
					String[] operaciones = { "Registrar Nuevo Pago de Venta","Registrar Nuevo Pago de Alquiler","Volver" };
					
					String operacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, operaciones,
							operaciones[0]);
					
					if(operacionSeleccionada.equals("Registrar Nuevo Pago de Venta")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos de la venta");
						
					}else if(operacionSeleccionada.equals("Registrar Nuevo Pago de Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos del alquiler");  

					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
			case "Cargar Nuevo Documento":
				do {
					String[] opciones = { "Cargar Contrato","Cargar Escritura","Cargar otro archivo","Volver" };
					
					String opcionSeleccionada3 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, opciones,
							opciones[0]);
					
					if(opcionSeleccionada3.equals("Cargar Contrato")){
						JOptionPane.showMessageDialog(null, "Adjuntar contrato");
						
					}else if(opcionSeleccionada3.equals("Cargar Escritura")){
						JOptionPane.showMessageDialog(null, "Adjuntar escritura");  

					}else if(opcionSeleccionada3.equals("Cargar otro archivo")){
						JOptionPane.showMessageDialog(null, "Adjuntar otro archivo");  

					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Ver Ultimas Operaciones":
				JOptionPane.showMessageDialog(null, "Ultimas Operaciones");
	
				break;
				
			case "Cerrar Sesion":
				JOptionPane.showMessageDialog(null, "Sesion cerrada, Hasta luego!");
				repetir = false;
				break;
	
			case "Salir":
				System.exit(0);
	
			default:
				break;
			}
			
		} while (repetir);
		
		return true;
	}

}
