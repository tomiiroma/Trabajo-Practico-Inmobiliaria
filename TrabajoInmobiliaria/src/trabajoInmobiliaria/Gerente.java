package trabajoInmobiliaria;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import controlador.GerenteControlador;
import controlador.InmuebleControlador;

public class Gerente extends Empleado implements Validacion, InicioSesion{

	private int id_gerente;

	public Gerente(int id_empleado, String nombre, String apellido, LocalDate fecha_nac, int dni, int telefono,
			String correo, int id_gerente, String contraseña) {
		super(id_empleado, nombre, apellido, fecha_nac, dni, telefono, correo,contraseña);
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
	
	
	
	
	
	
	
	InmuebleControlador inmuebleControlador = new InmuebleControlador();
	
	public boolean menuGerente() {
		boolean repetir;
		
		
		do {		
			repetir = true;
			String[] opcionesGerente = { "Gestionar Propiedades", 
											"Registrar Nuevo Cliente", 
											"Realizar Nueva Operacion",
											"Realizar Nuevo Contrato", 
											"Realizar Busqueda"   , 
											"Agendar Reunion o Visita", 
											"Registrar Pago",
											"Cargar Nuevo Documento",
											"Ver Ultimas Operaciones" , 
											"Gestionar Empleados",
											"Cerrar Sesion",
											"Salir" };
	
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGerente,
					opcionesGerente[0]);

			try {
			
			switch (opcionSeleccionada) {
			
			case"Gestionar Propiedades":
				do {			
					String[] opcionesGestion = { "Ver Inmuebles","Agregar Inmueble","Modificar Inmueble","Eliminar Inmueble","Volver" };
					
					String gestionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Operacion:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGestion,
							opcionesGestion[0]);
					
					if(gestionSeleccionada.equals("Ver Inmuebles")){
						
						verInmuebles();										
						
					}else if(gestionSeleccionada.equals("Agregar Inmueble")){
						
						agregarInmueble();
						
						
						
					}else if(gestionSeleccionada.equals("Eliminar Inmueble")){
						
						eliminarInmueble();
						
		
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
	
			default: JOptionPane.showMessageDialog(null, "Opcion no disponible");
				break;
			}
			

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Porfavor Seleccione una Opción");
				}
			

			

		} while (repetir);
		
		return true;
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verInmuebles() {
		JOptionPane.showMessageDialog(null, inmuebleControlador.getAllInmueble());
	}
	
	
	
	
	
	
	public boolean agregarInmueble() {
		
		boolean repetir;
		
		JOptionPane.showMessageDialog(null, "Cargar Datos del Inmueble");
		
		
		do {
			
		repetir = true;
		
		String[] tipoInmueble = { "Casa","Departamento"};
		String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione tipo de Propiedad:",
				"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble,
				tipoInmueble[0]);
				
		
		String[] tipoCondicion = { "Excelente","Muy bueno","Bueno","Regular","Malo"};
		String condicionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de condicion del Inmueble:",
				"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoCondicion,
				tipoCondicion[0]);
		
		String cantAmbientes = JOptionPane.showInputDialog("Ingrese la cantidad de Ambientes del Inmueble");

		String[] barrio = { 
				   "Agronomía", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita", 
				   "Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers", 
				   "Mataderos", "Monte Castro", "Monserrat", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda", 
				   "Parque Chacabuco", "Parque Chas", "Parque Patricios", "Puerto Madero", "Recoleta", "Retiro", 
				   "Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles", 
				   "Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano", 
				   "Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo", 
				   "Villa Santa Rita", "Villa Soldati", "Villa Urquiza"};	
		String barrioSeleccion = (String) JOptionPane.showInputDialog(null, "Seleccione El Barrio donde se encuentra el inmueble",
		"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, barrio,barrio[0]); 
		
		
		
		String direccion = JOptionPane.showInputDialog("Ingrese la direccion del Inmueble");	
		
		String descripcion = JOptionPane.showInputDialog("Ingrese una descripción del inmueble:");
				
		String antiguedad = JOptionPane.showInputDialog("Ingrese la antiguedad que tiene el Edficio");
		
		String banios = JOptionPane.showInputDialog("Ingrese la cantidad de Baños");
		
		String dormitorio= JOptionPane.showInputDialog("Ingrese la cantidad de Dormitorios");
		
		double superficie_cubierta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los m2 de de Superficie Cubierta"));
		
		double superficie_descubierta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los m2 de superficie descubierta"));		
	       
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio del Inmueble"));		
	        
		String[] disponible = { "Si","No"};			
		String disponibleSeleccion = (String) JOptionPane.showInputDialog(null, "¿Actualmente esta disponible el Inmueble?",
				"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, disponible,disponible[0]);
		
		if(disponibleSeleccion.equals("Si")){//EL INMUEBLE ESTA DISPONIBLE = TRUE
			
			String[] refaccion = { "Si","No"};			
			String refaccionSeleccion = (String) JOptionPane.showInputDialog(null, "¿Se debe refaccionar el Inmueble?",
					"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, refaccion,refaccion[0]);
			
			if(refaccionSeleccion.equals("Si")){ // EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE
				
				String[] apto_mascota = { "Si","No"};			
				String apto_mascotaSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, apto_mascota,apto_mascota[0]);
				
				if(apto_mascotaSeleccion.equals("Si")){//EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = TRUE
					
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){//EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = TRUE && EL INMUEBLE tiene patio = TRue
						
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								true,
								true,
								true));
						break;
														
					}else {//EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = TRUE && EL INMUEBLE tiene patio = false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								true,
								true,
								false));
						break;
					}
					
					
					
				}else {//EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = false 
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					if(patioSeleccion.equals(disponibleSeleccion)){ //EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = false  && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								true,
								false,
								true));
						break;
						
					}else {//EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE SE DEBE REFACCIONAR = TRUE & EL INMUEBLE ES APTO MASCOTA = false  && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								true,
								false,
								false));
						break;
					}
					
					
				}
				
				
			}else {// EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE  no SE DEBE REFACCIONAR = false
				String[] apto_mascota = { "Si","No"};			
				String apto_mascotaSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, apto_mascota,apto_mascota[0]);
				
				if(apto_mascotaSeleccion.equals("Si")){// EL INMUEBLE ESTA DISPONIBLE = TRUE &&EL INMUEBLE  no SE DEBE REFACCIONAR = false && mascota true
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){// EL INMUEBLE ESTA DISPONIBLE = TRUE &&REFACCIONAR = false && mascota true && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								false,
								true,
								true));
						break;
	
						
					}else {// EL INMUEBLE ESTA DISPONIBLE = TRUE &&REFACCIONAR = false && mascota true && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								false,
								true,
								false));
						break;
					}
					
					
					
				}else {// EL INMUEBLE ESTA DISPONIBLE = TRUE &&REFACCIONAR = false && mascota false
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){// EL INMUEBLE ESTA DISPONIBLE = TRUE &&REFACCIONAR = false && mascota false && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								false,
								false,
								true));
						break;
						
						
					}else {// EL INMUEBLE ESTA DISPONIBLE = TRUE &&REFACCIONAR = false && mascota false && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								true,
								false,
								false,
								false));
						break;
					}
				}
				
				
			}
			
			
			
			
			
			
		}else {//EL INMUEBLE NO ESTA DISPONIBLE = FALSE
			String[] refaccion = { "Si","No"};			
			String refaccionSeleccion = (String) JOptionPane.showInputDialog(null, "¿Se debe refaccionar el Inmueble?",
					"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, refaccion,refaccion[0]);
			
			if(refaccionSeleccion.equals("Si")){//Disponible = false && refaccion true
				
				String[] apto_mascota = { "Si","No"};			
				String apto_mascotaSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, apto_mascota,apto_mascota[0]);
				
				if(apto_mascotaSeleccion.equals("Si")){//Disponible = false && refaccion true && apto mascota true
					
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){//Disponible = false && refaccion true && apto mascota true && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								true,
								true,
								true));			
						break;
						
					}else {//Disponible = false && refaccion true && apto mascota true && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								true,
								true,
								false));
						break;
						
					}
					
					
					
				}else {//Disponible = false && refaccion true && apto mascota false
					
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){//Disponible = false && refaccion true && apto mascota false && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								true,
								false,
								true));
						break;
						
					}else {//Disponible = false && refaccion true && apto mascota false && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								true,
								false,
								false));
						break;
					}
					
				}
				
	
			}else {//Disponible = false && refaccion false
				String[] apto_mascota = { "Si","No"};			
				String apto_mascotaSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, apto_mascota,apto_mascota[0]);
				
				if(apto_mascotaSeleccion.equals("Si")){//Disponible = false && refaccion false && mascota true
					
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					
					if(patioSeleccion.equals("Si")){//Disponible = false && refaccion false && mascota true && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								false,
								true,
								true));
								
					}else {//Disponible = false && refaccion false && mascota true && patio false						
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								false,
								true,
								false));		
						break;
					}		
					
				}else {//Disponible = false && refaccion false && mascota false
					String[] patio = { "Si","No"};			
					String patioSeleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble posee patio?",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patio,patio[0]);
					if(patioSeleccion.equals("Si")){//Disponible = false && refaccion false && mascota false && patio true
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								false,
								false,
								true));	
						break;
					}else {//Disponible = false && refaccion false && mascota false && patio false
						inmuebleControlador.addInmueble(new Inmueble(0,
								inmuebleSeleccionado,
								condicionSeleccionada,
								cantAmbientes,
								barrioSeleccion,
								direccion,
								descripcion,
								antiguedad,
								banios,
								dormitorio,
								superficie_cubierta,
								superficie_descubierta,
								precio,
								false,
								false,
								false,
								false));	
						break;
					}
					
					
				}
			}
			
		}
		

		} while (repetir);	
		return true;	
	}
	
	
	
	
	
	public void eliminarInmueble() {
		JOptionPane.showMessageDialog(null, "Eliminar Inmueble");
		
		
		
		String[] borrarInmueble = new String[inmuebleControlador.getAllInmueble().size()];

		for (int i = 0; i < borrarInmueble.length ; i++) {
			borrarInmueble[i] = Integer.toString(inmuebleControlador.getAllInmueble().get(i).getId_inmueble());

		}
		
	    String inmuebleSeleccion = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Eliminar Inmueble",
	    		JOptionPane.QUESTION_MESSAGE,
	        null,
	        borrarInmueble,
	        borrarInmueble[0]
	    );
		
		
		inmuebleControlador.deleteInmueble(Integer.parseInt(inmuebleSeleccion));
		
	}
	
	
	
}
