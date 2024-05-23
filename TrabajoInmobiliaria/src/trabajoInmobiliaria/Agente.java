package trabajoInmobiliaria;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import controlador.InmuebleControlador;

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

	InmuebleControlador inmuebleControlador = new InmuebleControlador();

	
	public boolean menuAgente() {
		boolean repetir;
		
		do {		
			repetir = true;
			String[] opcionesAgente = { "Gestionar Inmuebles", "Registrar Nuevo Cliente", "Realizar Nueva Operacion",
					"Realizar Nuevo Contrato", "Realizar Busqueda", "Agendar Reunion o Visita", "Registrar Pago","Cargar Nuevo Documento",
					"Ver Ultimas Operaciones", "Cerrar Sesion","Salir" };
	
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, opcionesAgente,
					opcionesAgente[0]);
	
			switch (opcionSeleccionada) {
			case "Gestionar Inmuebles":
				do {
					String[] tipoPropiedad = { "Ver Inmuebles","Agregar Inmueble","Volver" };
					
					String clienteSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:",
							"Inmobiliaria Maguez | Menu Agente", JOptionPane.DEFAULT_OPTION, null, tipoPropiedad,
							tipoPropiedad[0]);
					
					if(clienteSeleccionado.equals("Ver Inmuebles")){
						verInmuebles();	
						
						
					}else if(clienteSeleccionado.equals("Agregar Inmueble")){
						agregarInmueble();
											
						
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
						
					}else if(clienteSeleccionado.equals("Nuevo Inquilino")){
						JOptionPane.showMessageDialog(null, "Completar Inquilino");  

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
	
	
	public void agregarInmueble() {
		String tipoInmueble = obtenerTipoInmueble();
		String condicion = obtenerCondicion();
		String cantAmbientes = obtenerAmbientes();
	    String piso = null; 
	    if (tipoInmueble.equals("Departamento")) {
	        piso = obtenerPiso();
	    }
		String barrio = obtenerBarrio();
		String direccion = obtenerDireccion();
		String descripcion = obtenerDescripcion();
		String antiguedad = obtenerAntiguedad();
		String banios = obtenerBanios();
		String dormitorio = obtenerDormitorio();
		double superficieCubierta = obtenerM2Cubierta();
		double superficieDescubierta = obtenerM2Descubierta();
		double precio = obtenerPrecio();
		boolean refaccionar = obtenerRefaccion().equals("Si");
		boolean aptoMascota = obtenerMascota().equals("Si");
		boolean tienePatio = obtenerLavadero().equals("Si");

		
		boolean disponible = false;
		boolean activo = false;
		
		// Agregar el inmueble al controlador
		inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
		banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo));
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
	

	
	public String obtenerPiso() {
	    return JOptionPane.showInputDialog("Ingrese en que piso se encuentra el Departamento");
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

}
