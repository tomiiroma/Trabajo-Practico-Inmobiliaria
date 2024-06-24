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
		return super.toString() + "Agente [id_agente=" + id_agente + "] + \n";
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
					"Ver Ultimas Operaciones","Gestionar Reserva", "Cerrar Sesion","Salir" };
	
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
						registrarVenta();
						
					}else if(operacionSeleccionada.equals("Realizar Alquiler")){
						AgregarAlquiler();  

					}else {
						break;
					}
					
					
				} while (repetir);
	
				break;
	
			case "Realizar Nuevo Contrato":
	
				do {
					
						
						JOptionPane.showMessageDialog(null, "Completar y verificar datos del alquiler");  
						registrarContrato();
					
					
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
			/*--------*/ case "Gestionar Reserva": /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
				do {	
				
				String[] OpcionesReserva = {"Ver reservas","Realizar reservas","Salir"};
				
				int opcionR = JOptionPane.showOptionDialog(null, "Seleccionar opcion", null, 0, 0, null, OpcionesReserva, OpcionesReserva[0]);
				
				
				switch (opcionR) {
				
				case 0:
					
					VerListaReservas();
					
					break;

				case 1:
					
					
					try {
						
						Empleado empleado = null;
						
						Cliente cliente = null;
						
						Inmueble inmueble = null;
						
						
						
						inmueble = SeleccionarInmueble();
						
						
						int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
						int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
						int año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
						
						LocalDate fecha_pago = LocalDate.of(año, mes, dia);
						double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el monto del pago"));
						
						String[] Clientes = {"Inquilino","Comprador","Cancelar Operación"};
						
						
						int clienteseleccionado = JOptionPane.showOptionDialog(null, "Seleccionar el tipo de cliente","Selección de clientes", 0, 0, null, Clientes, Clientes[0]);
						
						
						switch (clienteseleccionado) {
						case 0:
							
							cliente = SelectorInquilino();
							
							
							break;
							
						case 1:
							
							cliente = SelectorComprador();
							
							break;
							
							
						case 2:
							
							JOptionPane.showMessageDialog(null, "Se ha cancelado la operación");
							
							break;
							
						default:
							break;
						}
						
						
						
						String[] Empleados = {"Agente","Gerente","Cancelar operación"};
						
						
						int seleccionEmpleados = JOptionPane.showOptionDialog(null, "Seleccionar el tipo de empleado que realizara la reserva", "Modulo reserva", 0, 0, null, Empleados, Empleados[0]);
						
						
						if (seleccionEmpleados==0) {	empleado = SeleccionarAgente();}
						
						else if (seleccionEmpleados==1) { empleado = ObtenerGerenteId();}
						
						else { JOptionPane.showMessageDialog(null, "Se cancelo la operacioón");}
						
						String forma_pago = "";
						
						String tipoOperacion = "Venta";
						
						RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago,forma_pago,tipoOperacion);
						
						
						
					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null, "Se produjo un error.");
						
					}	
					
					break;
					
				case 2:
					
					break;
					
				default:
					break;
				}
				
					
					 
				break;
				
				}while(repetir);
				
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
	
	
	//-----------------------------------------AGREGAR NUEVO INMUEBLE agente--------------------------------------
		public void agregarInmueble() {
			String descripcion = null;
			String piso = null; 
			String nroDepto = null;
			String cantAmbientes = null;
			String antiguedad = null;
			String banios = null;
			String dormitorios= null;
			String direccion = null;
			String dormitorio = null;
			String tipoInmueble = obtenerTipoInmueble();
			String condicion = obtenerCondicion();
			String alturaDireccion = null;
			double precio =0;
			double superficieCubierta = 0;
			double superficieDescubierta = 0;
			
			cantAmbientes = validarEntero("Ingrese la cantidad de Ambientes que tiene el Inmueble");
			
		    if (tipoInmueble.equals("Departamento")) {
		    	piso = validarEntero("Ingrese el numero de piso donde se encuentra el Departamento");
		    	nroDepto=validarCadena("Indique el Número o Letra de depatartamento"); //validar despues 
		    	
		    }
			String barrio = obtenerBarrio();
			direccion = validarCadena("Ingrese la calle donde se encuentra el Inmueble");
			alturaDireccion = validarCadena("Ingrese la Altura de la calle del Inmueble");
			
			descripcion = validarCadena("Ingrese una descripción del inmueble");
			antiguedad = validarEntero("Ingrese la antiguedad que tiene el inmueble");
			banios = validarEntero("Ingrese la cantidad baños que tiene el inmueble");
			dormitorio = validarEntero("Ingrese la cantidad dormitorios que tiene el inmueble");
			superficieCubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie cubierta");
			
			boolean tienePatio = obtenerPatio();
			if(tienePatio==true){
				superficieDescubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie descubierta");
			}
			precio = validarDouble("Ingrese el precio del Inmueble");
			boolean refaccionar = obtenerRefaccion().equals("Si");
			boolean aptoMascota = obtenerMascota().equals("Si");
			
			boolean activo = true;
			
			//estes valor solo lo puede modificar el gerente
			boolean disponible = false;
			
			if(tipoInmueble.equals("Departamento") && validarDepto1(direccion, alturaDireccion, piso, nroDepto)){
				JOptionPane.showMessageDialog(null, "Error! No se pudo registrar el Departamento. Departamento duplicado.");
				return;
			}
			
			if(tipoInmueble.equals("Casa") && validarCasa(direccion, alturaDireccion)){
				JOptionPane.showMessageDialog(null, "Error! No se pudo registrar la Casa. Casa duplicada.");
				return;
			}
			
			    // Agregar el inmueble al controlador
			    inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
			            banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
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
		
		
		
		
		


	}