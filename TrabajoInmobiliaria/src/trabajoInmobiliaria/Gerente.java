package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Gerente extends Empleado implements Validacion, InicioSesion{

	private int id_gerente;

	public Gerente(int id_empleado, String nombre, String apellido, LocalDate fecha_nac, int dni, int telefono,
			String correo, int id_gerente) {
		super(id_empleado, nombre, apellido, fecha_nac, dni, telefono, correo);
		this.id_gerente = id_gerente;
	}
	
	public Gerente() {
		
	}

	public int getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}
	
	
	public boolean menuGerente() {
		boolean repetir;
		
		do {		
			repetir = true;
			String[] opcionesGerente = { "Registrar Nueva Propiedad","Eliminar Propiedad","Registrar Nuevo Cliente", "Realizar Nueva Operacion",
					"Realizar Nuevo Contrato", "Realizar Busqueda", "Agendar Reunion o Visita", "Registrar Pago","Cargar Nuevo Documento",
					"Ver Ultimas Operaciones","Gestionar Empleados","Cerrar Sesion","Salir" };
	
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGerente,
					opcionesGerente[0]);
	
			
			try {

			
			switch (opcionSeleccionada) {
			
			case "Registrar Nueva Propiedad":
				do {
					String[] tipoPropiedad = { "Casa","Departamento","Volver" };
					
					String clienteSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Inmueble:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoPropiedad,
							tipoPropiedad[0]);
					
					if(clienteSeleccionado.equals("Casa")){
						
						
						
						
					}else if(clienteSeleccionado.equals("Departamento")){
						JOptionPane.showMessageDialog(null, "Completar datos propiedad en alquiler");  

					}else {
						break;
					}
							
				} while (repetir);
	
				break;
	
			case "Eliminar Propiedad":
				do {
					String[] propiedadesAEliminar = { "Propiedad1","Propiedad2","Volver" };
					
					String propiedadAeliminarSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una propiedad:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, propiedadesAEliminar,
							propiedadesAEliminar[0]);
					
					if(propiedadAeliminarSeleccionada.equals("Propiedad1")){
						JOptionPane.showMessageDialog(null, "Propiedad eliminada con exito");
						
					}else if(propiedadAeliminarSeleccionada.equals("Propiedad2")){
						JOptionPane.showMessageDialog(null, "Propiedad eliminada con exito");
						
					}else {
						break;
					}
				} while (repetir);
				
				
				break;	
				
			case "Registrar Nuevo Cliente":
				do {
					String[] tipoCliente = { "Nuevo Propietario","Nuevo Inquilino","Volver" };
					
					String clienteSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoCliente,
							tipoCliente[0]);
					
					if(clienteSeleccionado.equals("Nuevo Propietario")){
						JOptionPane.showMessageDialog(null, "Completar Propietario");
						
					}else if(clienteSeleccionado.equals("Nuevo Inquilino")){
						JOptionPane.showMessageDialog(null, "Completar Inquilino");  

					}else {
						break;
					}
							
				} while (repetir);
	
				break;
			
			case "Realizar Nueva Operacion":
				do {
					String[] operacionesNueva = { "Realizar Venta","Realizar Alquiler","Confirmacion Operaciones","Volver" };
					
					String operacionNuevaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesNueva,
							operacionesNueva[0]);
					
					if(operacionNuevaSeleccionada.equals("Realizar Venta")){
						JOptionPane.showMessageDialog(null, "Completar Venta");
						
					}else if(operacionNuevaSeleccionada.equals("Realizar Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar Alquiler");  

					}else if(operacionNuevaSeleccionada.equals("Confirmacion Operaciones")){
						JOptionPane.showMessageDialog(null, "Mostrar operaciones hechas por el agente.. solo confirmar");
					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Realizar Nuevo Contrato":
	
				do {
					String[] operacionesContrato = { "Nuevo Contrato de Venta","Nuevo Contrato de Alquiler","Confirmar Contratos","Volver" };
					
					String operacionContratoSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesContrato,
							operacionesContrato[0]);
					
					if(operacionContratoSeleccionada.equals("Nuevo Contrato de Venta")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos de la venta");
						
					}else if(operacionContratoSeleccionada.equals("Nuevo Contrato de Alquiler")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos del alquiler");  

					}else if(operacionContratoSeleccionada.equals("Confirmar Contratos")){
						JOptionPane.showMessageDialog(null, "Mostrar contratos hechos por el agente.. solo confirmar");
					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Realizar Busqueda":
				do {
					String[] operacionesBuscador = { "Buscador","Volver" };
					
					String operacionBuscadorSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesBuscador,
							operacionesBuscador[0]);
					
					if(operacionBuscadorSeleccionada.equals("Buscador")){
						JOptionPane.showMessageDialog(null, "Buscador");
						
					}else {
						break;
					}
					
				} while (repetir);
				break;
	
			case "Agendar Reunion o Visita":
				do {
					String[] operacionesReunion = { "Programar Nueva Reunion","Programar Nueva Visita","Volver"};
					
					String operacionReunionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesReunion,
							operacionesReunion[0]);
					
					if(operacionReunionSeleccionada.equals("Programar Nueva Reunion")){
						JOptionPane.showMessageDialog(null, "Seleccionar Clientes");
						JOptionPane.showMessageDialog(null, "Seleccionar Fecha disponible | Mostrar un calendario");
						
					}else if(operacionReunionSeleccionada.equals("Programar Nueva Visita")){
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
					String[] operacionesPagos = { "Registrar Nuevo Pago de Venta","Registrar Nuevo Pago de Alquiler","Volver" };
					
					String operacionPagoSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesPagos,
							operacionesPagos[0]);
					
					if(operacionPagoSeleccionado.equals("Registrar Nuevo Pago de Venta")){
						JOptionPane.showMessageDialog(null, "Completar y verificar datos de la venta");
						
					}else if(operacionPagoSeleccionado.equals("Registrar Nuevo Pago de Alquiler")){
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
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opciones,
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
				do {
					String[] ultimasOperaciones = { "Operacion1","Operacion2","Operacion3","Volver" };
					
					String UltimasOperacionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, ultimasOperaciones,
							ultimasOperaciones[0]);
					
					if(UltimasOperacionSeleccionada.equals("Operacion1")){
						do {
							String[] operaciones2 = {"Modificar Operacion","Ver Operacion","Eliminar Operacion","Volver" };
							
							String operacionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
									"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operaciones2,
									operaciones2[0]);
						
							if(operacionSeleccionada2.equals("Modificar Operacion")){
								JOptionPane.showMessageDialog(null, "Modificar");
								
							}else if(operacionSeleccionada2.equals("Ver Operacion")){
								JOptionPane.showMessageDialog(null, "Ver");
								
							}else if(operacionSeleccionada2.equals("Eliminar Operacion")){
								JOptionPane.showMessageDialog(null, "Eliminar");
								
							}else {
								break;
							}
							
						} while (repetir);
						
					}else if(UltimasOperacionSeleccionada.equals("Operacion2")){
						do {
							String[] operaciones2 = {"Modificar Operacion","Ver Operacion","Eliminar Operacion","Volver" };
							
							String operacionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
									"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operaciones2,
									operaciones2[0]);
						
							if(operacionSeleccionada2.equals("Modificar Operacion")){
								JOptionPane.showMessageDialog(null, "Modificar");
								
							}else if(operacionSeleccionada2.equals("Ver Operacion")){
								JOptionPane.showMessageDialog(null, "Ver");
								
							}else if(operacionSeleccionada2.equals("Eliminar Operacion")){
								JOptionPane.showMessageDialog(null, "Eliminar");
								
							}else {
								break;
							}
							
						} while (repetir);

						
					}else if(UltimasOperacionSeleccionada.equals("Operacion3")){
						do {
							String[] operaciones2 = {"Modificar Operacion","Ver Operacion","Eliminar Operacion","Volver" };
							
							String operacionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
									"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operaciones2,
									operaciones2[0]);
						
							if(operacionSeleccionada2.equals("Modificar Operacion")){
								JOptionPane.showMessageDialog(null, "Modificar");
								
							}else if(operacionSeleccionada2.equals("Ver Operacion")){
								JOptionPane.showMessageDialog(null, "Ver");
								
							}else if(operacionSeleccionada2.equals("Eliminar Operacion")){
								JOptionPane.showMessageDialog(null, "Eliminar");
								
							}else {
								break;
							}
							
						} while (repetir);
						
						
					}else {
						break;
					}
					
					
				} 
				
				while (repetir);
	
				break;
			
			case "Gestionar Empleados":
				do {
					String[] gestionEmpleados = {"Ver Lista Empleados","Agregar Nuevo Empleado","Volver"};
					
					String gestionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, gestionEmpleados,
							gestionEmpleados[0]);
				
					if(gestionSeleccionada.equals("Ver Lista Empleados")){
						
						do {
							
							String[] gestionEmpleados2 = {"Ver Datos Empleado","Modificar Empleado","Eliminar Empleado","Volver"};
							
							String gestionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
									"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, gestionEmpleados2,
									gestionEmpleados2[0]);
							
							if(gestionSeleccionada2.equals("Ver Datos Empleado")){
								JOptionPane.showMessageDialog(null, "Empleado");
								
							}else if(gestionSeleccionada2.equals("Modificar Empleado")){
								JOptionPane.showMessageDialog(null, "modificar");
								
								
							}else if(gestionSeleccionada2.equals("Eliminar Empleado")){
								JOptionPane.showMessageDialog(null, "eliminar");
								
							}else {
								break;
							}
							
						}while(repetir);
								
						
					}else if(gestionSeleccionada.equals("Agregar Nuevo Empleado")){
						JOptionPane.showMessageDialog(null, "Cargar datos");
						
					}else {
						break;
					}
					
				} while (repetir);
				break;
			
			case "Cerrar Sesion":
				JOptionPane.showMessageDialog(null, "Sesion cerrada, Hasta luego!");
				repetir = false;
				break;

			case "Salir":
				System.exit(0);
				break;
	
			default:
				break;
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Porfavor Seleccione una Opción");
		}
			
		} while (repetir);
		
		return true;
	}

		
	
	
}
