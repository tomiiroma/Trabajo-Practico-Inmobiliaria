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
					
					Inmueble inmueble = new Inmueble();
					String[] opcionesGestion = { "Ver Inmuebles","Agregar Inmueble","Modificar Inmueble","Eliminar Inmueble","Volver" };
					
					String gestionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Operacion:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGestion,
							opcionesGestion[0]);
					
					if(gestionSeleccionada.equals("Ver Inmuebles")){
						
						verInmuebles();										
						
					}else if(gestionSeleccionada.equals("Agregar Inmueble")){
						agregarInmueble();					
	
						
					}else if(gestionSeleccionada.equals("Modificar Inmueble")){
						modificarInmueble();
						
		
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
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados" );
		}else {
			String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			for (int i = 0; i < opcionesInmuebles.length; i++) {
			Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
			opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();		
			}
					
			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Visualizar Inmueble",
			JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
					
			if(inmuebleSeleccionado !=null){
				Inmueble inmuebleAmostrar = null;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
							
			if(opcion.equals(inmuebleSeleccionado)){
				inmuebleAmostrar=inmueble;
				}      
			}
						
			if(inmuebleAmostrar !=null){
				JOptionPane.showMessageDialog(null, "Datos del Inmueble:\n" + inmuebleAmostrar.toString(), "Datos del Inmueble", JOptionPane.INFORMATION_MESSAGE);		
				}
			} 
		}
	} 
		
	
	
	
	public void modificarInmueble() {
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados" );
		}else {
			
			String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			for (int i = 0; i < opcionesInmuebles.length; i++) {
			Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
			opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();		
			}
			
			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Modificar Inmueble",
			JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
			
			if(inmuebleSeleccionado !=null){
				Inmueble inmuebleAmodificar = null;
				
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
									
					if(opcion.equals(inmuebleSeleccionado)){
						inmuebleAmodificar=inmueble;
						break;
						}      
					}	
			
			if(inmuebleAmodificar!=null){
	            Inmueble inmuebleAModificar = null;
	            for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
	                if (opcion.equals(inmuebleSeleccionado)) {
	                    inmuebleAModificar = inmueble;
	                    break;
	                	}
	            	}
				
	            if(inmuebleAmodificar !=null){
	            	
	            	}
	            JOptionPane.showMessageDialog(null, "Datos del Inmueble modificados exitosamente");

				}			
			}
		}
	}
	
	
	
	
	public void agregarInmueble() {
		String tipoInmueble = obtenerTipoInmueble();
		String condicion = obtenerCondicion();
		String cantAmbientes = obtenerAmbientes();
		String barrio = obtenerBarrio();
		String direccion = obtenerDireccion();
		String descripcion = obtenerDescripcion();
		String antiguedad = obtenerAntiguedad();
		String banios = obtenerBanios();
		String dormitorio = obtenerDormitorio();
		double superficieCubierta = obtenerM2Cubierta();
		double superficieDescubierta = obtenerM2Descubierta();
		double precio = obtenerPrecio();
		boolean disponible = obtenerDisponible().equals("Si");
		boolean refaccionar = obtenerRefaccion().equals("Si");
		boolean aptoMascota = obtenerMascota().equals("Si");
		boolean tienePatio = obtenerLavadero().equals("Si");

		    // Agregar el inmueble al controlador
		    inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, barrio, direccion, descripcion, antiguedad,
		            banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio));
		}
	
	
	
	public String obtenerTipoInmueble() {
		String[] tipoInmueble = { "Casa","Departamento"};
	    return (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Inmueble:",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
	}
	
	public String obtenerCondicion() {
		String[] tipoInmueble = { "Excelente","Muy bueno","Bueno","Regular","Malo"};
	    return (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de condición del Inmueble:",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
	}
	
	public String obtenerBarrio() {
		String[] barrio = {"Agronomía", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita",
	            "Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers",
	            "Mataderos", "Monte Castro", "Monserrat", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda",
	            "Parque Chacabuco", "Parque Chas", "Parque Patricios", "Puerto Madero", "Recoleta", "Retiro",
	            "Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles",
	            "Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano",
	            "Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo",
	            "Villa Santa Rita", "Villa Soldati", "Villa Urquiza"};
		
	    return (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de condición del Inmueble:",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, barrio, barrio[0]);
	}
	
	
	public String obtenerDisponible() {
		String[] disponibleSeleccion = { "Si","No"};
	    return (String) JOptionPane.showInputDialog(null, "Seleccione la disponibilidad del Inmueble:",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, disponibleSeleccion, disponibleSeleccion[0]);
	}
	
	
	public String obtenerRefaccion() {
		String[] refaccionSeleccion = { "Si","No"};
	    return (String) JOptionPane.showInputDialog(null, "Seleccione si hay que Refaccionar:",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, refaccionSeleccion, refaccionSeleccion[0]);
	}
	
	public String obtenerLavadero() {
		String[] lavaderoSeleccion = { "Si","No"};
	    return (String) JOptionPane.showInputDialog(null, "¿Tiene lavadero?",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, lavaderoSeleccion, lavaderoSeleccion[0]);
	}
	
	public String obtenerMascota() {
		String[] mascotaSeleccion = { "Si","No"};
	    return (String) JOptionPane.showInputDialog(null, "¿Es apto para mascotas?",
	            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, mascotaSeleccion, mascotaSeleccion[0]);
	}
	

	public String obtenerAmbientes() {
	    return JOptionPane.showInputDialog("Ingrese la cantidad de Ambientes del Inmueble");
	}
	
	
	public Double obtenerM2Cubierta() {
	    return Double.parseDouble(JOptionPane.showInputDialog("Ingrese los m2 de de Superficie Cubierta"));
	}
	
	
	public Double obtenerM2Descubierta() {
	    return Double.parseDouble(JOptionPane.showInputDialog("Ingrese los m2 de de Superficie Descubierta"));
	}
	
	
	public String obtenerDireccion() {
	    return JOptionPane.showInputDialog("Ingrese la direccion del Inmueble");
	}
	
	
	public String obtenerDescripcion() {
	    return JOptionPane.showInputDialog("Ingrese una descripción del inmueble");
	}
	

	public String obtenerAntiguedad() {
	    return JOptionPane.showInputDialog("Ingrese la antiguedad que tiene el Edficio");
	}
	
	
	public String obtenerBanios() {
	    return JOptionPane.showInputDialog("Ingrese la cantidad de Baños");
	}
	
			
	public String obtenerDormitorio() {
	    return JOptionPane.showInputDialog("Ingrese la cantidad de Dormitorios");
	}
	
	
	public Double obtenerPrecio() {
	    return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio del Inmueble"));		
	}
	

	
	
	
	
	
	
	public void eliminarInmueble() {
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados" );
		}else {
				
			JOptionPane.showMessageDialog(null, "Eliminar Inmueble");
			
		    String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
		    for (int i = 0; i < opcionesInmuebles.length; i++) {
	            Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
	            opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
	        }
		       
		    String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble a Eliminar", "Eliminar Inmueble",
		    		JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
		   
		    if(inmuebleSeleccionado != null){
	            Inmueble inmuebleAEliminar = null;
	            // Buscar el inmueble seleccionado en la lista de inmuebles
	            for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
	                String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
	                if (opcion.equals(inmuebleSeleccionado)) {
	                    inmuebleAEliminar = inmueble;
	                    break;
	                }
	            }
	            
	            if (inmuebleAEliminar != null) {
	                // Realizar la eliminación del inmueble
	                inmuebleControlador.deleteInmueble(inmuebleAEliminar.getId_inmueble());
	                JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
	            }
		    }       
		}
	}
	

	
}
