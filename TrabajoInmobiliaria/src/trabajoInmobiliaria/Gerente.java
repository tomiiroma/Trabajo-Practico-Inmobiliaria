package trabajoInmobiliaria;

import java.time.LocalDate;


import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.GerenteControlador;
import controlador.InmuebleControlador;
import controlador.ReservaControlador;
import controlador.VentaControlador;
import controlador.AlquilerControlador;
import controlador.ControladorEmpleado;
import vista.MenuGestionEmpleados;

public class Gerente extends Empleado implements Validacion, InicioSesion{

	private int id_gerente;

	public Gerente(int id_empleado, String nombre, String apellido, LocalDate fecha_nacimiento, int dni, int telefono,
			String correo, String tipo_empleado, String contraseña, int id_gerente) {
		super(id_empleado, nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, contraseña);
		this.id_gerente = id_gerente;
	}






	public Gerente() {
		
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "Gerente [id_gerente=" + id_gerente + "] \n";
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
			try {
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
											"Gestionar Reserva",
											"Cerrar Sesion",
											"Salir" };
	
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
					"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGerente,
					opcionesGerente[0]);

			
			switch (opcionSeleccionada) {
			
			case"Gestionar Propiedades":
				do {			
					try {					

					
					Inmueble inmueble = new Inmueble();
					String[] opcionesGestion = { "Ver Inmuebles","Agregar Inmueble","Modificar Inmueble","Eliminar Inmueble","Volver" };
					
					String gestionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Operacion:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesGestion,
							opcionesGestion[0]);
					
					if(gestionSeleccionada.equals("Ver Inmuebles")){
				        boolean volverSubmenu = false;

						do {
							try {
							
							
						String[] submenuPropieades = { "Ver todos los Inmuebles","Ver Inmuebles Disponibles","Activar Inmuebles cargados por Agente","Volver" };
						
						String seleccionSubmenu = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:",
								"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, submenuPropieades,
								submenuPropieades[0]);
						
						if(seleccionSubmenu.equals("Ver todos los Inmuebles")){
							verInmuebles();		
									
							
						}else if(seleccionSubmenu.equals("Ver Inmuebles Disponibles")) {
							verInmueblesDisponibles();
	
							
						}else if(seleccionSubmenu.equals("Activar Inmuebles cargados por Agente")){					
							activarInmueble();
							
						}else{
							volverSubmenu = true;						
							}
						
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
							}
							
							
						} while (!volverSubmenu);
						break;
						
					}else if(gestionSeleccionada.equals("Agregar Inmueble")){
						agregarInmueble();					
	
						
					}else if(gestionSeleccionada.equals("Modificar Inmueble")){
						modificarInmueble();
						
		
					}else if(gestionSeleccionada.equals("Eliminar Inmueble")){
						eliminarInmueble();
						
					}else {						
						break;
					}
					
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
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
					String[] operacionesNueva = { "Realizar Venta","Realizar Alquiler","Confirmacion Operaciones","Volver" };
					
					String operacionNuevaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesNueva,
							operacionesNueva[0]);
					
					if(operacionNuevaSeleccionada.equals("Realizar Venta")){
						
						registrarVenta();
						
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
					String[] operacionesContrato = { "Nuevo Contrato","Confirmar Contratos","Volver" };
					
					String operacionContratoSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, operacionesContrato,
							operacionesContrato[0]);
					
					if(operacionContratoSeleccionada.equals("Nuevo Contrato")){
						
					registrarContrato(); 

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
							
							String[] gestionEmpleados2 = {"Ver Datos Empleado","Modificar Empleado","Agregar empleado","Eliminar Empleado","Volver"};
							
							String gestionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
									"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, gestionEmpleados2,
									gestionEmpleados2[0]);
							
/* --------------------- */    if(gestionSeleccionada2.equals("Ver Datos Empleado")){ /* ---------------------------------------------------------------------------------*/
								int seleccionopcion =0;
							do {
								String[] lista = {"Ver Agentes","Ver gerentes","Salir"};
	
								seleccionopcion = JOptionPane.showOptionDialog(null, "Elegir opcion", null, 0, 0, null, lista, lista[0]);
	
								switch(seleccionopcion) {
								
								case 0:
									
								SelectorAgentes();
								
								break;
								
								case 1:
									
								seleccionarGerentes();
								
								break;
								
								
								case 2:
									
									break;
								}}while(seleccionopcion!=2);
								
	
								
								
								
	/* -------------------------------------------------------MODIFICAR EMPLEADO---------------------------------------------------------------------------------------------------------------------------------------------*/							
							}else if(gestionSeleccionada2.equals("Modificar Empleado")){
							
								String[] lista = {"Modificar agente","Modificar gerente","Salir"};
								
								int seleccion = JOptionPane.showOptionDialog(null, "Ingresar opciones", "Gestor de empleados",0 , 0 , null, lista, lista[0]);
								
								switch (seleccion) {
								case 0:
									String correo="";
									int dni=0,telefon0=0,id_agente=0;	
									LocalDate fecha_nac=null;
									String nombre="", apellido="", contraseña="";
									
									Agente agenteseleccionado = null;
										
										
										
										
										
										try {
											
										    agenteseleccionado = SelectorAgente();
											nombre = JOptionPane.showInputDialog(null, "Ingresar el nombre del agente");							
											apellido = JOptionPane.showInputDialog(null,"Ingresar el apellido del agente");
											 dni = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dni"));
											telefon0 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero"));
											int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
											int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
											int año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
											fecha_nac = LocalDate.of(año, mes, dia);
											 correo = JOptionPane.showInputDialog(null, "Ingresar correo"); 
											 contraseña = JOptionPane.showInputDialog("Ingresar la contraseña");								
											id_agente = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el id del empleado"));
											
										} catch (Exception e) {
											
											JOptionPane.showMessageDialog(null, "Error se ingreso algun tipo de dato incorrecto");
											
										}
										
										
									
									
									ModificarAgente(agenteseleccionado,nombre,apellido,fecha_nac,dni,telefon0,correo,contraseña,id_agente);
									
									
									
									break;
									
								case 1:
									
									String correoG="";
									int dniG=0,telefonG=0;	
									LocalDate fecha_nacG=null;
									String nombreG="", apellidoG="", contraseñaG="";
									GerenteControlador gerente = new GerenteControlador();
									
									
									
									
									try {
										
										String[] empleados2 = new String[gerente.getAllGerente().size()];
										for (int i = 0; i < empleados2.length; i++) {
											empleados2[i] = Integer.toString(gerente.getAllGerente().get(i).getId_empleado());
										}
										String empleadoselect2 = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
												empleados2, empleados2[0]);
										Gerente seleccionado = gerente.getGerenteById(Integer.parseInt(empleadoselect2));
										nombreG = JOptionPane.showInputDialog(null, "Ingresar el nombre del agente");							
										apellidoG = JOptionPane.showInputDialog(null,"Ingresar el apellido del agente");
										 dniG = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dni"));
										telefonG = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero"));
										int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
										int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
										int año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
										fecha_nacG = LocalDate.of(año, mes, dia);
										 correoG = JOptionPane.showInputDialog(null, "Ingresar correo"); 
										 contraseñaG = JOptionPane.showInputDialog("Ingresar la contraseña");								
										
										
										ModificarGerente2(seleccionado,nombreG,apellidoG,fecha_nacG,dniG,telefonG,correoG,contraseñaG);
										
									} catch (Exception e) {
										
										JOptionPane.showMessageDialog(null, "Error se ingreso algun tipo de dato incorrecto");
										
									}
									
									
									
									
									
									
									
									
									break;

								case 2: //Salir									
									break;
								default:
									break;
								}
								
								
								
								
	/* ----------------------------------------------------------------------------------- FIN MODIFICAR EMPLEADO --------------------------------------------------------------------------------------------------------*/								
								
	/* --------------------------------------------------------------------ELIMINAR EMPLEADO-------------------------------------------------------------------------------------------------------------------------------*/							
								
							}else if(gestionSeleccionada2.equals("Eliminar Empleado")){
								
								String[] lista = {"Eliminar Agentes","Eliminar gerentes","Salir"};
								
							int	seleccionopcion = JOptionPane.showOptionDialog(null, "Elegir opcion", null, 0, 0, null, lista, lista[0]);
								
							switch (seleccionopcion) {

							case 0:
								EliminarAgente();
							break;
							
							case 1:
						Gerente repetido =	VerificarReferenciasGerente();
						
						if (repetido != null) {
								EliminarGerente(repetido);
						}
								break;
							
							case 2: 
								
								break;
								
								
								
							}
							
										
							}else {
								break;
							}
							
						}while(repetir);
								
/*-----------------------------------------------------------------------------Agregar empleado --------------------------------------------------------------------------------------------------------------------------- */
					}else if(gestionSeleccionada.equals("Agregar Nuevo Empleado")){ 
						
					String[] OpcionesAgregar = {"Agregar Agente", "Agregar Gerente", "Salir"};	
						
					int Agregarseleccion = JOptionPane.showOptionDialog(null,"Elegir opcion", null, 0, 0, null, OpcionesAgregar, OpcionesAgregar[0]);
					
					switch (Agregarseleccion) {
					case 0:
						
						String correo="";
						int dni=0,telefon0=0;	
						LocalDate fecha_nac=null;
						String nombre="", apellido="" , contraseña="";
						
						
							
							
							
							
							
							try {
								
								nombre = JOptionPane.showInputDialog(null, "Ingresar el nombre del agente");							
								apellido = JOptionPane.showInputDialog(null,"Ingresar el apellido del agente");
								 dni = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dni"));
								telefon0 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero"));
								int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
								int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
								int año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
								fecha_nac = LocalDate.of(año, mes, dia);
								 correo = JOptionPane.showInputDialog(null, "Ingresar correo"); 
								 contraseña = JOptionPane.showInputDialog("Ingresar la contraseña");								
								
								
							} catch (Exception e) {
								
								JOptionPane.showMessageDialog(null, "Error se ingreso algun tipo de dato incorrecto");
								
							}
							
							AgregarAgente(nombre,apellido,fecha_nac,dni,telefon0,correo,contraseña);
							
						
							
							
							
				/*	AgregarAgente(); */
						
						break;

					case 1:
						
						
						String correog="";
						int dnig=0,telefon1=0;	
						LocalDate fecha_nacg=null;
						String nombreg="", apellidog="" , contraseña1="";
						
						
							
							
							
							
							
							try {
								
								nombreg = JOptionPane.showInputDialog(null, "Ingresar el nombre del agente");							
								apellidog = JOptionPane.showInputDialog(null,"Ingresar el apellido del agente");
								dnig = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dni"));
								telefon1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero"));
								int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
								int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
								int año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
								fecha_nacg = LocalDate.of(año, mes, dia);
								correog = JOptionPane.showInputDialog(null, "Ingresar correo"); 
								 contraseña1 = JOptionPane.showInputDialog("Ingresar la contraseña");								
								 
								
							} catch (Exception e) {
								
								JOptionPane.showMessageDialog(null, "Error se ingreso algun tipo de dato incorrecto");
								
							}
						
						
						
						AgregarGerente(nombreg,apellidog,fecha_nacg,dnig,telefon1,correog,contraseña1);
						
						break;
						
					case 2:
						
						break;
						
					default:
						break;
					}
					
										
						// Funciona 0 Porque es AI en la base de  datos y id_agente deberia ser AI tambien actualmente no lo es.

						
/*-----------------------------------------------------------------------------Fin Agregar empleado ---------------------------------------------------------------------------------------------------------------------- */
						
					}
					
					
					
					
					
					
					else {
						break;
					}
					
				} while (repetir);
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
				
				else { JOptionPane.showMessageDialog(null, "Se cancelo la operación");}
				
				 String forma = "efectivo";
				 
				 String operacion = "Venta";
				
				
				
				RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago,forma,operacion);
				
				
				
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
				break;
	
			default:
				break;
				
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		}
			
		} while (repetir);
		
		return true;
	}
	
	

	
	
	
// --------------------------------------------------------TODO INMUEBLES-----------------------------------------------------------
	//-----------------------------------------ELIMINAR INMUEBLE --------------------------------------
	
	
	
	public boolean eliminarInmueble() {
		boolean repetir;
		do {
			repetir = true;
			
		try {
			
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados");		
		    repetir = true;
		    continue;	
			
		}
						
			    String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			    for (int i = 0; i < opcionesInmuebles.length; i++) {
		            Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
		            opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
		        }
			    
				opcionesInmuebles[opcionesInmuebles.length - 1] = "Volver";
	
			       
			    String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble a Eliminar", "Eliminar Inmueble",
			    		JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
			    
			    
	            if (inmuebleSeleccionado.equals("Volver")) {
	                repetir = true; 
	                continue;
	            }
			   
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
			
		
		} catch (Exception e) {
			
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
            repetir=false;
			}		
		
		} while (!repetir);

		return true;
	}
		
	//-----------------------------------------ACTIVAR INMUEBLE --------------------------------------	
	
		public boolean activarInmueble() { // solo activamos la lista de inmuebles cargados por agente 
			boolean repetir;

		do {
			repetir =true;
		
		try {
			
			int count = 0; // cuenta los inmuebles inactivos 
		    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
		        if (!inmueble.isActivo()) {
		            count++;
		        }
		    }

		    if (count == 0) {
		        JOptionPane.showMessageDialog(null, "No hay Inmuebles inactivos cargados");
			    repetir = false;
			    break;	
		    }

		    
		    String[] opcionesInmuebles = new String[count];
		    int index = 0;
		    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
		        if (!inmueble.isActivo()) {
		            opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
		            							 " - Dirección: " + inmueble.getDireccion() +
		                                         " - Ambientes: " + inmueble.getCantAmbientes();
		        }
		    }		    
		    
			opcionesInmuebles[opcionesInmuebles.length - 1] = "Volver";
	    
		    String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,
		            "Seleccione Inmueble para activar","Activar Inmueble", JOptionPane.QUESTION_MESSAGE,null, opcionesInmuebles,
		            opcionesInmuebles[0]);
		    
		    
            if (inmuebleSeleccionado.equals("Volver")) {
                repetir = true; 
                continue;
            }

		     for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
		          String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
		                          " - Dirección: " + inmueble.getDireccion() +
		                          " - Ambientes: " + inmueble.getCantAmbientes();
		          
		          if (opcion.equals(inmuebleSeleccionado)) {	            	
		        	  boolean activo = obtenerActivo();
		            	
		            if(activo){	            		
		            	inmueble.setActivo(true);
		            	inmuebleControlador.updateInmueble(inmueble);
		            	JOptionPane.showMessageDialog(null, "El inmueble ha sido activado Correctamente");	            		
		            }else {
		            	JOptionPane.showMessageDialog(null, "El inmueble no ha sido activado");
		            }
		          }	        
		    }	
		    
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
            repetir=false;
			}
		
		} while (!repetir);
		
		return true;
	}
		
	

			


	
	
//-----------------------------------------MODIFICAR INMUEBLE --------------------------------------u	
	public boolean modificarInmueble() {
		boolean repetir;
		
		do {		
			repetir = false;
					
		try {

			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados");
				repetir = true;
				continue;
			}
			
			String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			for (int i = 0; i < opcionesInmuebles.length; i++) {
				Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);				
				opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();		
			
			}		
			opcionesInmuebles[opcionesInmuebles.length - 1] = "Volver";

			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Modificar Inmueble",
					JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
			
            if (inmuebleSeleccionado.equals("Volver")) {
                repetir = true; 
                continue;
            }
			
            Inmueble inmuebleAmodificar = null;
            
			if(inmuebleSeleccionado !=null){
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();							
					
					if(opcion.equals(inmuebleSeleccionado)){
						inmuebleAmodificar=inmueble;
						break;
						}      
					}			
		
	            if(inmuebleAmodificar !=null){	        
	            	
	            	boolean repetir2;
	            	
	            do {
	            	repetir2 = false;
	            	
	            try {
					String[] opcionesModificar = { "Tipo de Inmueble","Condición","Cantidad de Ambientes","Barrio","Dirección","Descripcion",
							"Años Antiguedad","Cantidad de Baños","Cantidad de Dormitorios","m2 Superficie Cubierta",
							"Precio","Disponibilidad actual","Refacción","Apto para Mascotas","Patio","Activar/Deshabilitar Inmueble","Volver"};
						
					String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione un atributo para Modificar:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesModificar,
							opcionesModificar[0]);		
								
				if(opcionSeleccionada.equals("Tipo de Inmueble")){
					String tipoInmueble = obtenerTipoInmueble();
					inmuebleAmodificar.setTipo_inmueble(tipoInmueble);
					JOptionPane.showMessageDialog(null, "Tipo de Inmueble actualizado");
					
					 if (!tipoInmueble.equals("Departamento")) {
                         inmuebleAmodificar.setPiso(null);
                         
                     }else {
                    	String piso = null;
             	    	piso = validarEntero("Ingrese el numero de piso donde se encuentra el Departamento");
                         inmuebleAmodificar.setPiso(piso);
                     }										
					
				}else if(opcionSeleccionada.equals("Condición")){
					String condicion = obtenerCondicion();
					inmuebleAmodificar.setCondicion(condicion);
					JOptionPane.showMessageDialog(null, "Tipo de Condicion actualizada");
					
					
				}else if(opcionSeleccionada.equals("Cantidad de Ambientes")){					
					String cantAmbientes = null;
					cantAmbientes = validarEntero("Ingrese la cantidad de Ambientes que tiene el Inmueble");
					inmuebleAmodificar.setCantAmbientes(cantAmbientes);		
					JOptionPane.showMessageDialog(null, "Cantidad de Ambientes Actualizada");
					
					
				}else if(opcionSeleccionada.equals("Barrio")){
					String barrio = obtenerBarrio();
					inmuebleAmodificar.setBarrio(barrio);
					JOptionPane.showMessageDialog(null, "Barrio Actualizado!");
					
					
				}else if(opcionSeleccionada.equals("Dirección")){
					String direccion = null;
					direccion = validarCadena("Ingrese la dirección");
					inmuebleAmodificar.setDireccion(direccion);
					JOptionPane.showMessageDialog(null, "Dirección Actualizada");

					
				}else if(opcionSeleccionada.equals("Descripcion")){
					String descripcion = null;
					descripcion = validarCadena("Ingrese una descripción del inmueble");
					inmuebleAmodificar.setDescripcion(descripcion);
					JOptionPane.showMessageDialog(null, "Descripcion Actualizada");

					
				}else if(opcionSeleccionada.equals("Años Antiguedad")){
					String antiguedad = null;
					antiguedad = validarEntero("Ingrese la antiguedad que tiene el inmueble");
					inmuebleAmodificar.setAntiguedad(antiguedad);
					JOptionPane.showMessageDialog(null, "Antiguedad actualizada");

					
				}else if(opcionSeleccionada.equals("Cantidad de Baños")){
					String banios = null;
					banios = validarCadena("Ingrese la cantidad de baños ");
					inmuebleAmodificar.setBanio(banios);
					JOptionPane.showMessageDialog(null, "Cantidad de baños Actualizada");

					
				}else if(opcionSeleccionada.equals("Cantidad de Dormitorios")){
					String dormitorio = null;
					dormitorio = validarCadena("Ingrese la cantidad de dormitorios");
					inmuebleAmodificar.setDormitorio(dormitorio);
					JOptionPane.showMessageDialog(null, "Cantidad de dormitorios Actualizada");

					
				}else if(opcionSeleccionada.equals("m2 Superficie Cubierta")) {
					double superficieCubierta = 0;
					superficieCubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie cubierta");
					inmuebleAmodificar.setSuperficie_cubierta(superficieCubierta);	
					JOptionPane.showMessageDialog(null, "m2 cubierta Actualizada");


				}else if(opcionSeleccionada.equals("Patio")){
					boolean tienePatio = obtenerPatio();	

					if(tienePatio==true){
						double superficieDescubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie descubierta");
						inmuebleAmodificar.setSuperficie_descubierta(superficieDescubierta);					
					}else {
						inmuebleAmodificar.setSuperficie_descubierta(0);
					}			
	
				}else if(opcionSeleccionada.equals("Precio")){
					double precio = 0;
					precio = validarDouble("Ingrese el precio del Inmueble");
					inmuebleAmodificar.setPrecio(precio);					
					JOptionPane.showMessageDialog(null, "Precio actualizado");

					
				}else if(opcionSeleccionada.equals("Disponibilidad actual")){
					boolean disponible = obtenerDisponible();
				    inmuebleAmodificar.setDisponible(disponible);

				    
				}else if(opcionSeleccionada.equals("Refacción")){
					boolean refaccionar = obtenerRefaccion().equals("Si");
					inmuebleAmodificar.setRefaccionar(refaccionar);				

					
				}else if(opcionSeleccionada.equals("Apto para Mascotas")){
					boolean aptoMascota = obtenerMascota().equals("Si");
					inmuebleAmodificar.setApto_mascota(aptoMascota);						
					
					
				}else if(opcionSeleccionada.equals("Activar/Deshabilitar Inmueble")){
					   boolean activo = obtenerActivo();
					    inmuebleAmodificar.setActivo(activo);
					    
				}else {
					break;
				}
				 inmuebleControlador.updateInmueble(inmuebleAmodificar);
                 JOptionPane.showMessageDialog(null, "Inmueble actualizado exitosamente");
        		
	            } catch (Exception e) {
	            	JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
	            }
	            
	            }while(!repetir2);
	            
		            	}
					
				}
			
			} catch (Exception e) {
            	JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
				
				}
		}while(!repetir);
			
		return true;
	}


//-----------------------------------------AGREGAR NUEVO INMUEBLE --------------------------------------
	public void agregarInmueble() {
		String descripcion = null;
		String piso = null; 
		String cantAmbientes = null;
		String antiguedad = null;
		String banios = null;
		String direccion = null;
		String dormitorio = null;
		String alturaDireccion = null;
		String nroDepto = null;
		String tipoInmueble = obtenerTipoInmueble();
		String condicion = obtenerCondicion();
		double precio =0;
		double superficieCubierta = 0;
		double superficieDescubierta = 0;
		
		 cantAmbientes = validarEntero("Ingrese la cantidad de Ambientes que tiene el Inmueble");
	    if (tipoInmueble.equals("Departamento")) {
	    	piso = validarEntero("Ingrese el numero de piso donde se encuentra el Departamento");
	    	nroDepto=validarCadena("Indique el Número o Letra de depatartamento"); //validar despues 
	    }
	    
		String barrio = obtenerBarrio();
		direccion = validarCadena("Ingrese la dirección");
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
		boolean disponible = obtenerDisponible();
		boolean refaccionar = obtenerRefaccion().equals("Si");
		boolean aptoMascota = obtenerMascota().equals("Si");
		boolean activo = false; //esto cambia segun las operaciones que se hagan con el inmueble
		
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
	
	
	
	


	
	//-------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	

	
	

	
	
/*-----------------------------------------------------------------------------SELECCIONAR GERENTES------------------------------------------------------------------------------------------------------------------------- */	
	
	public void seleccionarGerentes() {
		
		GerenteControlador gerentecontrolador = new GerenteControlador();
		
		
		String[] listaGerente = {"Ver gerentes","Seleccionar gerentes","Salir"};
		
		int seleccionGerente = JOptionPane.showOptionDialog(null,"Elegir opcion", null, 0, 0, null, listaGerente, listaGerente[0]);
		
		
		 switch(seleccionGerente) {
		 
		 
		 case 0: // Ver todos los gerentes.
			 
			if (gerentecontrolador.getAllGerente().size()>0) { 
			 JOptionPane.showMessageDialog(null, "La lista de empleados"+"\n"+gerentecontrolador.getAllGerente());} else {
			
				 JOptionPane.showMessageDialog(null, "No hay gerentes en la base de datos");}

		break;
		
		 case 1: // Ver gerente por id.
			
		Gerente seleccionado =	ObtenerGerenteId();
		
		JOptionPane.showMessageDialog(null, seleccionado.toString());
		 
			 break;
			 
		 case 2: // Salir
			 
			 break;
		 
		 }
		 
	}
	
/* ---------------------------------------------------------------------------------------- AGREGAR GERENTES ----------------------------------------------------------------------------------------------------- */	
	
	/*
	public void AgregarGerente() {
		int dni = 0,telefono;	
		LocalDate fecha = null;
		String nombre="", apellido="" ,telefonoentrada="", contraseña;
		GerenteControlador gerentecontrolador = new GerenteControlador();
			
		//	JOptionPane.showMessageDialog(null, "Cargar datos");
			nombre =validarNombre("Escribir el nombre");
			apellido = validarNombre("Escribir el apellido");
			fecha = validarFecha(fecha);
			dni = validarDni("Validacion de dni");
			telefonoentrada = JOptionPane.showInputDialog("Ingresar telefono"); 
			telefono = validarTelefono(telefonoentrada);
			String correo = JOptionPane.showInputDialog(null, "Ingresar correo"); 
			String correoverificado = validarEmail(correo);
			String tipo_empleado = "Gerente"; 		
			do {
			contraseña = JOptionPane.showInputDialog("Ingresar Contrasena");
			} while(!validarContraseña(contraseña));
			int id_gerente = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el id del gerente"));
		//	acumuladorgerentes++;
			gerentecontrolador.addGerente(new Gerente(0,nombre,apellido,fecha,dni,telefono,correoverificado,tipo_empleado,contraseña,id_gerente));
			
			
			
		}
	*/
	
/* ----------------------------------------------------------------------------------- ELIMINAR GERENTE ------------------------------------------------------------------------------------------------------------------ */	
	
	
	
	public void EliminarGerente(Gerente seleccionado) {
		
	try {
		
		GerenteControlador gerentecontrolador = new GerenteControlador();
		
		if (gerentecontrolador.getAllGerente().size()==0) {
			
			JOptionPane.showMessageDialog(null, "No se han encontrado agentes.");
			
		} else {
			
		 int id_empleadog = seleccionado.getId_empleado();
		 
		 gerentecontrolador.deleteGerente(id_empleadog);
		
	/*	String[] borrarempleado = new String[gerentecontrolador.getAllGerente().size()];
		for (int i = 0; i < borrarempleado.length; i++) {
			
		
			  Gerente gerente = gerentecontrolador.getAllGerente().get(i);
			    borrarempleado[i] = gerente.getId_empleado() + "  " + gerente.getNombre() + " " + gerente.getApellido() + "  " + gerente.getCorreo();
		   
		}
		
		try {
			String empleadoborrarselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
					borrarempleado, borrarempleado[0]);
			
			int indiceSeleccionado = -1;

			for (int i = 0; i < borrarempleado.length; i++) {
		        if (borrarempleado[i].equals(empleadoborrarselect)) {
		            indiceSeleccionado = i; 
		        }
		    }
			

			 if (indiceSeleccionado != -1) {
			        
			 String idEmpleadoSeleccionado = Integer.toString(gerentecontrolador.getAllGerente().get(indiceSeleccionado).getId_empleado());

			 gerentecontrolador.deleteGerente((Integer.parseInt(idEmpleadoSeleccionado)));
			        
			        
			    } else {
			        JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
			    }
			
		*/	
		
			
		}	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		
	//	 }
		
	}
	
	
/* ----------------------------------------------------------------------------------- MODIFICAR GERENTE ----------------------------------------------------------------------------------------------------------------- */	
	
	
	
	
	public String ModificarGerente2 (Gerente gerente,String nombre, String apellido, LocalDate fecha, int dni, int telefono, String correo, String contraseña){
		
		GerenteControlador gerentecontrolador = new GerenteControlador();
		ControladorEmpleado empleadocontrolador = new ControladorEmpleado();
		
		if (gerentecontrolador.getAllGerente().size()==0) {
			
			JOptionPane.showMessageDialog(null, "No se han encontrado gerentes.");
		
			return "No se han encontrado gerentes.";
			
		}
		
		else {
		
	try {
		
		if (validarNombre2(nombre) && validarNombre2(apellido) && validarFecha2(fecha) && validarDni2(dni) && validarTelefono2(telefono) && validarEmail2(correo) && validarContraseña(contraseña)) {
			
			
			
			gerente.setNombre(nombre);
			gerente.setApellido(apellido);
			gerente.setFecha_nacimiento(fecha); 
			
			gerente.setDni(dni);
			
			gerente.setTelefono(telefono);
			gerente.setCorreo(correo);
			gerente.setContraseña(contraseña);
			
			gerente.setId_gerente(gerente.getId_gerente());
			
			
			gerente.setContraseña((contraseña));
			
				
				
		for (Empleado empleados : empleadocontrolador.getAllEmpleados()) {
			
			if ( dni == empleados.getDni() && gerente.getId_empleado() != empleados.getId_empleado() ) {
				
				//JOptionPane.showMessageDialog(null, "Se esta intentandos modificar el dni al de una persona existente en la base de datos.");
				
				  return "Se esta intentandos modificar el dni al de una persona existente en la base de datos.";
				
			} 
				
			
			
			
		}
					
					
	for (Empleado empleados : empleadocontrolador.getAllEmpleados()) {
			
			if (empleados.getCorreo().equalsIgnoreCase(correo) && gerente.getId_empleado() != empleados.getId_empleado() ) {
				
		//		JOptionPane.showMessageDialog(null, "El correo no se encuentra disponible.");
				
				  return "El mail ya se encuentra utilizado";
				
			} 
				
			
			
			
		}
					
				
				
				
			
			
			
			gerentecontrolador.updateGerente(gerente);
			
			return "El gerente se ha modificado";
			
			
			} else {  
			
			  return "Se produjo un error de validacion";
			
			}	
		
		
		

		
		

		
		
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null, "Ocurrio un error"+e);
		return "Se produjo un error.";
	}}}
	
	
	/* ---------------------------------------------------------------------------------------- MODIFICAR AGENTE ----------------------------------------------------------------------------------------------------------*/

public boolean ModificarAgente(Agente agente,String nombre, String apellido, LocalDate fecha, int dni, int telefono, String correo, String contraseña, int id_agente) {
	
	AgenteControlador agentecontrolador = new AgenteControlador();
	
	if (agentecontrolador.getAllAgente().size()==0 || agente==null) {
		
		JOptionPane.showMessageDialog(null, "No se han encontrado gerentes.");
		
		 return false;
	} else {
	
		
		
		
try {
	
	if (validarNombre2(nombre) && validarNombre2(apellido) && validarFecha2(fecha) && validarDni2(dni) && validarTelefono2(telefono) && validarEmail2(correo) && validarContraseña(contraseña)) {
	
	
	
	agente.setNombre(nombre);
	agente.setApellido(apellido);
	agente.setFecha_nacimiento(fecha); 
	
	agente.setDni(dni);
	
	agente.setTelefono(telefono);
	agente.setCorreo(correo);
	agente.setContraseña(contraseña);
	
	agente.setId_agente(agente.getId_agente());
	
	
	agente.setContraseña((contraseña));
	
	
     
   
    
	
	for (Agente agentes : agentecontrolador.getAllAgente()) {
		
		if ( dni == agentes.getDni() && agente.getId_empleado() != agentes.getId_empleado() ) {
			
			JOptionPane.showMessageDialog(null, "Se esta intentandos modificar el dni al de una persona existente en la base de datos.");
			
			  return false;
			
		} 
			
		
		
		
	}
	
	
	agentecontrolador.updateAgente(agente);
	
	return true;
	
	
	} else {  
	
	  return false;
	
	}	


} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Ocurrio un error"+e);}}
	
	
	return false;
}


/* -------------------------------------------------------------------------------------- AGREGAR AGENTE --------------------------------------------------------------------------------------------------------------- */
	

	

/* --------------------------------------------------------------------------------- ELIMINAR AGENTE ------------------------------------------------------------------------------------------------------------------ */
	

public void EliminarAgente() {

AgenteControlador gerentecontrolador = new AgenteControlador();

if (gerentecontrolador.getAllAgente().size()==0) {
	
	JOptionPane.showMessageDialog(null, "No se han encontrado agentes.");
	
} else {

String[] borrarempleado = new String[gerentecontrolador.getAllAgente().size()];
for (int i = 0; i < borrarempleado.length; i++) {
	

	  Agente agente = gerentecontrolador.getAllAgente().get(i);
	    borrarempleado[i] = agente.getId_empleado() + "  " + agente.getNombre() + " " + agente.getApellido() + "  " + agente.getCorreo();
   
}

try {
	String empleadoborrarselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
			borrarempleado, borrarempleado[0]);
	
	int indiceSeleccionado = -1;

	for (int i = 0; i < borrarempleado.length; i++) {
        if (borrarempleado[i].equals(empleadoborrarselect)) {
            indiceSeleccionado = i; 
        }
    }
	

	 if (indiceSeleccionado != -1) {
	        
	 String idEmpleadoSeleccionado = Integer.toString(gerentecontrolador.getAllAgente().get(indiceSeleccionado).getId_empleado());

	 gerentecontrolador.deleteAgente((Integer.parseInt(idEmpleadoSeleccionado)));
	        
	        
	    } else {
	        JOptionPane.showMessageDialog(null, "Agente no encontrado.");
	    }
	
	

	
	
} catch (Exception e) {
	JOptionPane.showMessageDialog(null, e);
}



}

}

public Gerente VerificarReferenciasGerente() {
	
	Boolean gerente_repetido = false;
	
	VentaControlador ventas = new VentaControlador();
	
	ReservaControlador reservas = new ReservaControlador();
	
	// AlquilereControlador alquileres = new AlquilereControlador();
	
	Gerente seleccionado = ObtenerGerenteId();
	

	try {
	
	/*for (Venta venta : ventas.getAllVentas() ) {
		
			
		
		if (seleccionado.getId_empleado() == venta.getFk_empleado_id()) {
			
			gerente_repetido = true;
			
		}
		
		
	} */
	
	for (Reserva reserva : reservas.getAllReserva()) {
		
		if (seleccionado.getId_empleado() == reserva.getEmpleado().getId_empleado()) {
			
			
			gerente_repetido = true;
			
			
		}
		
		
		
	}
	
/*	for (Alquiler alquiler : alquileres.getAllAlquileres()) {
		
		if (seleccionado.getId_empleado() == alquiler.getEmpleado().getId_empleado()) {
	
		encontrado = true;
	
		}
		
	} */
	

/* for (Contrato contrato : contratos.getAllContratos()) {
  
  	if (seleccionado.getId_empelado() == contrato.getEmpleado().getId_empleado()) {
  	
  	 encontrado = true;
  	
  	}
 
  }
  
   */	
	
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null, e);
		
	} 
	
	
	if (gerente_repetido == true) {
		
		JOptionPane.showMessageDialog(null, "El gerente tiene claves foraneas, no es posible eliminarlo de la base de datos.");
		seleccionado = null;
	} 
	
	
	return seleccionado;
}

/* ------------------------------------------------------------------------ Agregar Agente (Test) ------------------------------------------------------------------------------------------------------------ */








public boolean AgregarAgente(String nombre, String apellido, LocalDate fecha, int dni, int telefono, String correo, String contraseña) {
   
	AgenteControlador agentecontrolador = new AgenteControlador();	
	boolean agente_repetido=false, correoRepetido=false;
	String ValidacionDniDuplicado = "", ValidacionCorreoDuplicado = "";
	int max=-1;

	
	if (validarNombre2(nombre) && validarNombre2(apellido) && validarFecha2(fecha) && validarDni2(dni) && validarTelefono2(telefono) && validarEmail2(correo) && validarContraseña(contraseña)) {
	
		
		
			ValidacionDniDuplicado = ValidarDniDuplicado(dni);
		
		
			ValidacionCorreoDuplicado = ValidarMailDuplicado(correo);
			
			
			if  (ValidacionDniDuplicado.equalsIgnoreCase("El DNI se encuentra repetido")) {
				
				agente_repetido = true;
				
				JOptionPane.showMessageDialog(null, "El dni ingresado, ya se encuentra en la base de datos.");
				
				System.out.println("El dni se encuentra repetido en algun empleado");
				
				return false;
			 
			}
			
			
			if (ValidacionCorreoDuplicado.equalsIgnoreCase("El correo se encuentra registrado.")) {
				
				correoRepetido = true;
				
				JOptionPane.showMessageDialog(null, "El correo ingresado se encuentra repetido en la base de datos.");
				
				System.out.println("El correo ingresado se encuentra repetido");
				
				return false;
			}
			
			
			
			
		
		
		
		
		
			
    	if (agente_repetido == false && correoRepetido == false) {
    		
    		for (Agente agente : agentecontrolador.getAllAgente()) {
    			
    			if (max < agente.getId_agente()) {
    				
    				
    				max = agente.getId_agente();
    				
    				
    			}
    			
    		}
    		
    		
    		max = max + 1;
    		
        Agente agente = new Agente(0, nombre, apellido, fecha, dni, telefono, correo, "Agente", contraseña, max);
      
       /* JOptionPane.showMessageDialog(null, "El agente se ha agregado con exito."); */
        
        agentecontrolador.addAgente(agente);
        return true;
        
    	}
    } else {
    	 	
    	//
    	
        return false;
    }
	
	return false;
	
}







/* ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

/*-------------------------------------------------------------------------------------------Agregar gerente---------------------------------------------------------------------------------------------------- */


public boolean AgregarGerente(String nombre, String apellido, LocalDate fecha, int dni, int telefono, String correo, String contraseña) {
	boolean gerente_repetido=false, correoRepetido=false;
	int max = -1;
	String ValidacionDniDuplicado = "", ValidacionCorreoDuplicado = "";
		GerenteControlador gerentecontrolador = new GerenteControlador();
		
	
		
if (validarNombre2(nombre) && validarNombre2(apellido) && validarFecha2(fecha) && validarDni2(dni) && validarTelefono2(telefono) && validarEmail2(correo) && validarContraseña(contraseña)) {
	
		
			
			
			ValidacionDniDuplicado = ValidarDniDuplicado(dni);
			
			
			ValidacionCorreoDuplicado = ValidarMailDuplicado(correo);
			
			
				if (ValidacionDniDuplicado.equalsIgnoreCase("El DNI se encuentra repetido")) {
					
					gerente_repetido = true;
					
					System.out.println("El dni se encuentra repetido en algun empleado");
					
					return false;

					
					
				}
				
				
				if (ValidacionCorreoDuplicado.equalsIgnoreCase("El correo se encuentra registrado.")) {
					
					correoRepetido = true;
					
					System.out.println("El correo ingresado se encuentra repetido");
					
					return false;
				
				}
				
			
		
		
		
		
		if (gerente_repetido==false && correoRepetido==false) {
		
			for (Gerente gerente : gerentecontrolador.getAllGerente()) {
    			
    			if (max < gerente.getId_gerente()) {
    				
    				
    				max = gerente.getId_gerente();
    				
    				
    			}
    			
    			
    			
    		}
			
			max = max + 1;
			
		gerentecontrolador.addGerente(new Gerente(0,nombre,apellido,fecha,dni,telefono,correo,"Gerente",contraseña,max));
		return true;
		} else {
			
			return false;
			
		}
}
		
return false;		
		
		
	}





/* --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */




	





}