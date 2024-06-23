package trabajoInmobiliaria;

import java.time.LocalDate;
import java.util.Iterator;

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.AlquilerControlador;
import controlador.CompradorControlador;
import controlador.ContratoControlador;
import controlador.GaranteControlador;
import controlador.GerenteControlador;
import controlador.InmuebleControlador;
import controlador.InquilinoControlador;
import controlador.PropietarioControlador;
import controlador.VentaControlador;

import controlador.AgenteControlador;
import controlador.ReservaControlador;
import controlador.InmuebleControlador;
import controlador.GerenteControlador;
import controlador.InquilinoControlador;
import controlador.CompradorControlador;
import controlador.VentaControlador;



public class Empleado implements InicioSesion,Validacion{

	private int id_empleado;
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private int dni;
	private int telefono;
	private String correo;
	private String tipo_empleado;
	private String contraseña;
	

	
	public Empleado(int id_empleado, String nombre, String apellido, LocalDate fecha_nacimiento, int dni, int telefono,
			String correo, String tipo_empleado, String contraseña) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.tipo_empleado = tipo_empleado;
		this.contraseña = contraseña;
	}
	
	


	public Empleado() {
		
	}
	



	public int getId_empleado() {
		return id_empleado;
	}


	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTipo_empleado() {
		return tipo_empleado;
	}


	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	
	InmuebleControlador inmuebleControlador = new InmuebleControlador(); 
	/* -------------------------------------------------------------------------------------  OBTENER INMUEBLE ------------------------------------------------------------------------------------ */

	/* VER Validaciones */

	public Inmueble SeleccionarInmueble() {
	    Inmueble inmuebleAmostrar = null;
	 
	    if (inmuebleControlador.getAllInmueble().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados");
	    } else {
	        String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
	        for (int i = 0; i < opcionesInmuebles.length; i++) {
	            Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
	            opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion() + " - Ambientes: " + inmueble.getCantAmbientes();
	        }

	        String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Visualizar Inmueble",
	                JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);

	        if (inmuebleSeleccionado != null) {
	            for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
	                String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion() + " - Ambientes: " + inmueble.getCantAmbientes();

	                if (opcion.equals(inmuebleSeleccionado)) {
	                    inmuebleAmostrar = inmueble;
	                    break; // Salir del bucle una vez que se encuentre el inmueble seleccionado
	                }
	            }
	        }
	    }

	    // Verificar si se seleccionó un inmueble antes de retornarlo
	    if (inmuebleAmostrar == null) {
	        JOptionPane.showMessageDialog(null, "No se seleccionó ningún inmueble");
	    }

	    return inmuebleAmostrar;
	}
			
		
		



	/* ------------------------------------------------------------------------------------ OBTENER EMPLEADO POR ID ---------------------------------------------------------------------------------------------------------- */


	public Agente SeleccionarAgente() {
		
		AgenteControlador agentecontrolador = new AgenteControlador();
		
		String[] empleados = new String[agentecontrolador.getAllAgente().size()];
		for (int i = 0; i < empleados.length; i++) {
		empleados[i] = Integer.toString(agentecontrolador.getAllAgente().get(i).getId_empleado());}
									
		
		String empleadoselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
		empleados, empleados[0]);

			// JOptionPane.showMessageDialog(null, agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect)));
				Agente seleccionado = agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect));
				JOptionPane.showMessageDialog(null, "El agente seleccionado es:"+seleccionado.toString()); /* Recordar cambiar los nombres en el archivo princ */
		
		
		
		return seleccionado;
	}



	/* ------------------------------------------------------------------------------------- OBTENER GERENTE POR ID ------------------------------------------------------------------------------------------------------------------- */
	
	
	public Gerente ObtenerGerenteId() {
	
	GerenteControlador gerentecontrolador = new GerenteControlador();
	
	Gerente gseleccionado = null;
	
	if(gerentecontrolador.getAllGerente().size()==0) {   JOptionPane.showMessageDialog(null, "No hay gerentes en la base de datos");}
	 else {
	 
	 String[] gerentes = new String[gerentecontrolador.getAllGerente().size()];
	 
	 for (int i = 0; i < gerentes.length; i++) {
		
		 gerentes[i] = Integer.toString(gerentecontrolador.getAllGerente().get(i).getId_empleado());
		 
	}
	 
	 String gerentesselect = (String) JOptionPane.showInputDialog(null,"seleccionar gerentes",null,0,null,gerentes,gerentes[0]);
	
		 gseleccionado = gerentecontrolador.getGerenteById(Integer.parseInt(gerentesselect));
	 
	 
	 }
	return gseleccionado;
	}
	
	/* ------------------------------------------------------------------------------------ REALIZAR RESERVA --------------------------------------------------------------------------------------------------------------------------- */

	
	
	
	/* ------------------------------------------------------------------------------------------------------- VER TODAS LAS RESERVAS ------------------------------------------------------------------------------------------------- */

	
	
	public void VerListaReservas() {
		ReservaControlador reservacontrolador = new ReservaControlador();
		try {
			
			JOptionPane.showMessageDialog(null, "Lista de reservas: " + reservacontrolador.getAllReserva());
			
			
		} catch (Exception e) {
			
		}
		
		
		
	}
	
	/* ----------------------------------------------------------------------------------------------------- OBTENER INQUILINO POR ID ---------------------------------------------------------------------------------- */
	
	public Inquilino SelectorInquilino() {
		
	InquilinoControlador controladorinquilino = new InquilinoControlador();	
		
	Inquilino inquilino = null;	
		
	if (controladorinquilino.getAllInquilino().size()==0) {
		
		JOptionPane.showMessageDialog(null, "No hay inquilinos en la base de datos.");
		
	} else {	
		
		String[] inquilinos = new String[controladorinquilino.getAllInquilino().size()];
		 
		 for (int i = 0; i < inquilinos.length; i++) {
			
			 inquilinos[i] = Integer.toString(controladorinquilino.getAllInquilino().get(i).getId_cliente());
			 
		}
		
		 
		 String inquilinoselec = (String) JOptionPane.showInputDialog(null,"seleccionar inquilinos",null,0,null,inquilinos,inquilinos[0]);
			
		 inquilino = controladorinquilino.getInquilinoById(Integer.parseInt(inquilinoselec));
		
	}
		
		
		
	
	return inquilino;
		
	}
	
	
	/* ---------------------------------------------------------------------------------------OBTENER COMPRADOR POR ID   -------------------------------------------------------------------------------------------- */
	
	public Comprador SelectorComprador() {
		
		CompradorControlador controladorcomprador = new CompradorControlador();
		
		Comprador comprador = null;
		
		if (controladorcomprador.getAllComprador().size()==0) {
			
			JOptionPane.showMessageDialog(null, "No hay comprador en la base de datos.");
			
		} else {
			
			String[] compradores = new String[controladorcomprador.getAllComprador().size()];
		
			for (int i = 0; i < compradores.length; i++) {
				
				compradores[i] = Integer.toString(controladorcomprador.getAllComprador().get(i).getId_cliente());
				 
			}
			
			String compradorselec = (String) JOptionPane.showInputDialog(null,"Seleccionar compradores",null,0,null,compradores,compradores[0]);
			
			comprador = controladorcomprador.getCompradorById(Integer.parseInt(compradorselec));
			
		}
		
		return comprador;
	}
	
	
	
	/* ----------------------------------------------------------------------------- REALIZAR VENTA ------------------------------------------------------------------------------------------------------------ */
	


	
	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", dni=" + dni + ", telefono=" + telefono + ", correo="
				+ correo + ", tipo_empleado=" + tipo_empleado + ", contraseña=" + contraseña + "]";
	}




	public void agregarInquilino() {
		
		LocalDate fecha = null;
		int telefonocliente;
		InquilinoControlador controlador = new InquilinoControlador();
	
		
		String nombre = validarNombre("Ingrese el nombre del Cliente");
		String apellido = validarNombre("Ingrese el apellido del Cliente");
		String correo = JOptionPane.showInputDialog(null, "Ingresar correo"); 
		String correoverificado = validarEmail(correo);
		String direccion = JOptionPane.showInputDialog("Ingrese direccion del Cliente");
		String telefonoentrada = JOptionPane.showInputDialog("Ingresar telefono"); 
		telefonocliente = validarTelefono(telefonoentrada);
		fecha = validarFecha(fecha);
		int dni = validarDni("Ingrese Dni");
		
		
		int id_Inquilino = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el id del Inquilino"));
		
		controlador.addInquilino(new Inquilino(nombre,apellido, correoverificado , direccion, telefonocliente, fecha, dni ,id_Inquilino));
	}
	
	
	public void agregarPropietario() {
		
		LocalDate fecha = null;
		int telefonocliente;
		PropietarioControlador controlador = new PropietarioControlador();
	
		
		String nombre = validarNombre("Ingrese el nombre del Cliente");
		String apellido = validarNombre("Ingrese el apellido del Cliente");
		String correo = JOptionPane.showInputDialog(null, "Ingresar correo"); 
		String correoverificado = validarEmail(correo);
		String direccion = JOptionPane.showInputDialog("Ingrese direccion del Cliente");
		String telefonoentrada = JOptionPane.showInputDialog("Ingresar telefono"); 
		telefonocliente = validarTelefono(telefonoentrada);
		fecha = validarFecha(fecha);
		int dni = validarDni("Ingrese Dni");
		
		
		int id_Propietario = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el id del Propietario"));
		
		controlador.addPropietario(new Propietario(nombre, apellido, correoverificado , direccion, telefonocliente, fecha, dni ,id_Propietario));
	}
	
	
	public void registrarContrato() {
		ContratoControlador controlador = new ContratoControlador();
		LocalDate inicio = null;
		LocalDate fin = null;

		InmuebleControlador inmueblecont = new InmuebleControlador();
		InquilinoControlador inquilino = new InquilinoControlador();
		PropietarioControlador propietario = new PropietarioControlador();


		String [] opcionescontrato  = {"Alquiler", "Venta"};
		String tipocontrato = (String)JOptionPane.showInputDialog(null,"Ingrese el tipo de Contrato", "Contratos", JOptionPane.DEFAULT_OPTION, null, opcionescontrato,opcionescontrato[0]);
		
		String descripcion = JOptionPane.showInputDialog("Ingrese el descripcion del contrato");
		String url = JOptionPane.showInputDialog("Ingrese la url del contrato");
		
		
		
	     String[] opcionesInmueble = new String[inmueblecont.getAllInmueble().size()];
	     for (int i = 0; i < opcionesInmueble.length; i++) {
	         int idInmueble = inmueblecont.getAllInmueble().get(i).getId_inmueble();
	         opcionesInmueble[i] = String.valueOf(idInmueble);
	     }
	     String opcionesAelegirInmueble = (String) JOptionPane.showInputDialog(null,"Elige el ID del Inmueble","Inmuebles", JOptionPane.DEFAULT_OPTION, null, opcionesInmueble, opcionesInmueble[0]);
	     int idInmuebleElegido = Integer.parseInt(opcionesAelegirInmueble);
	     Inmueble inmueble = inmueblecont.getInmuebleById(idInmuebleElegido);	

	     
	     Cliente cliente = null;
	     if(tipocontrato.equalsIgnoreCase("Alquiler")) {
	    	  String [] opcionesInquilino = new String[inquilino.getAllInquilino().size()];
			    for (int i = 0; i < opcionesInquilino.length; i++) {
					int idInquilino = inquilino.getAllInquilino().get(i).getId_cliente();
					opcionesInquilino[i] = String.valueOf(idInquilino);;
				}
			    String opcionesAelegirInquilino = (String)JOptionPane.showInputDialog(null,"Elige el ID del Inquilino", "Inquilinos", JOptionPane.DEFAULT_OPTION, null, opcionesInquilino, opcionesInquilino[0]);
			     int idInquilinoElegido = Integer.parseInt(opcionesAelegirInquilino);
			      cliente = inquilino.getInquilinoById(idInquilinoElegido);	
	     }
	     else if(tipocontrato.equalsIgnoreCase("Venta")) {
	    	  String [] opcionesPropietario = new String[propietario.getAllPropietario().size()];
			    for (int i = 0; i < opcionesPropietario.length; i++) {
					int idPropietario = propietario.getAllPropietario().get(i).getId_cliente();
					opcionesPropietario[i] = String.valueOf(idPropietario);;
				}
			    String opcionesAelegirInquilino = (String)JOptionPane.showInputDialog(null,"Elige el ID del Propietario", "Propietarios", JOptionPane.DEFAULT_OPTION, null, opcionesPropietario, opcionesPropietario[0]);
			     int idPropietarioElegido = Integer.parseInt(opcionesAelegirInquilino);
			      cliente = propietario.getPropietarioById(idPropietarioElegido);
	     }
	   
		    JOptionPane.showMessageDialog(null, "Ingrese fecha de Inicio de Contrato");
		    inicio = validarFecha(inicio);
		    
		    JOptionPane.showMessageDialog(null, "Ingrese fecha de Finalizacion de Contrato");
		fin = validarFecha(fin);
	    boolean aptoMascota = JOptionPane.showConfirmDialog(null, "¿El contrato permite mascotas?", "Permite mascotas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
	
	   // Contrato contrato = new Contrato(0, tipocontrato, descripcion, url,inmueble,cliente, inicio, fin, aptoMascota);
	   // controlador.addContrato(contrato);
	}
	
	
	public void MostrarVentas(VentaControlador venta) {
		  for (Venta ventas : venta.getAllVentas()) {
		        System.out.println("ID Venta: " + ventas.getId_venta());
		        System.out.println("Comprador: " + ventas.getComprador());
		        System.out.println("Monto Total: " + ventas.getMonto_total());
		        System.out.println("Forma Pago: " + ventas.getForma_pago());
		        System.out.println("Empleado que vendio: " + ventas.getEmpleado());
		        System.out.println("----------------------------------------");
		    }		
	}
	
	
	public void registrarVenta() {
	    VentaControlador controlador = new VentaControlador();
	    InmuebleControlador inmuebleCont = new InmuebleControlador();
	    CompradorControlador compradorCont = new CompradorControlador();
	    ContratoControlador contratoCont = new ContratoControlador();
	    AgenteControlador agenteCont = new AgenteControlador();
	    GerenteControlador gerenteCont = new GerenteControlador();
	    

	    String[] opcionesInmueble = new String[inmuebleCont.getAllInmueble().size()];
	     for (int i = 0; i < opcionesInmueble.length; i++) {
	         int idInmueble = inmuebleCont.getAllInmueble().get(i).getId_inmueble();
	         opcionesInmueble[i] = String.valueOf(idInmueble);
	     }
	     String opcionesAelegirInmueble = (String) JOptionPane.showInputDialog(null,"Elige el ID del Inmueble","Inmuebles", JOptionPane.DEFAULT_OPTION, null, opcionesInmueble, opcionesInmueble[0]);
	     int idInmuebleElegido = Integer.parseInt(opcionesAelegirInmueble);
	     Inmueble inmueble = inmuebleCont.getInmuebleById(idInmuebleElegido);
	     
	     
	     String[] opcionesComprador = new String[compradorCont.getAllComprador().size()];
	     for (int i = 0; i < opcionesComprador.length; i++) {
	         int idComprador = compradorCont.getAllComprador().get(i).getId_cliente();
	         opcionesComprador[i] = String.valueOf(idComprador);
	     }
	     String opcionesAelegirComprador = (String) JOptionPane.showInputDialog(null,"Elige el ID del Comprador","Comprador", JOptionPane.DEFAULT_OPTION, null, opcionesComprador, opcionesComprador[0]);
	     int idCompradorElegido = Integer.parseInt(opcionesAelegirComprador);
	     Comprador comprador = compradorCont.getCompradorById(idCompradorElegido);


	     String [] opcionesContrato = new String[contratoCont.getAllContrato().size()];
		    for (int i = 0; i < opcionesContrato.length; i++) {
				int idContrato = contratoCont.getAllContrato().get(i).getId_contrato();
				
				opcionesContrato[i] = String.valueOf(idContrato);
			}	    
		     String opcionesAelegirContrato = (String)JOptionPane.showInputDialog(null,"Elige el ID Del Contrato", "Contratos", JOptionPane.DEFAULT_OPTION, null, opcionesContrato, opcionesContrato[0]);
		     int idContratoElegido = Integer.parseInt(opcionesAelegirContrato);
		     Contrato contrato = contratoCont.getContratoById(idContratoElegido);
	    
	    
	    

		 	String Ingresomonto = validarEntero("Ingrese Monto");
			Double montoTotal = Double.parseDouble(Ingresomonto);	    
			
		    String formaPago = validarNombre("Ingrese Forma de Pago");


		    String [] listaempleados = {"Agente", "Gerente"};
		    
		    String tipoEmpleado = (String) JOptionPane.showInputDialog(null, "Selecciones el Vendedor", "Tipos de Empleados",JOptionPane.DEFAULT_OPTION, null, listaempleados, listaempleados[0]);
		    
		    Empleado empleado = null;
		    if(tipoEmpleado.equalsIgnoreCase("Agente")) {
		    	 String [] opcionesEmpleado = new String[agenteCont.getAllAgente().size()];
				    for (int i = 0; i < opcionesEmpleado.length; i++) {
						int idEmpleado = agenteCont.getAllAgente().get(i).getId_empleado();
						opcionesEmpleado[i] = String.valueOf(idEmpleado);;
					}
				    String opcionesAelegirEmpleado = (String)JOptionPane.showInputDialog(null,"Elige el ID del Empleado", "Empleado", JOptionPane.DEFAULT_OPTION, null, opcionesEmpleado, opcionesEmpleado[0]);
				     int idEmpleadoElegido = Integer.parseInt(opcionesAelegirEmpleado);
				      empleado = agenteCont.getAgenteById(idEmpleadoElegido);
		    }
		    
		    else if(tipoEmpleado.equalsIgnoreCase("Gerente")) {
		    	String [] opcionesEmpleado = new String[gerenteCont.getAllGerente().size()];
			    for (int i = 0; i < opcionesEmpleado.length; i++) {
					int idEmpleado = gerenteCont.getAllGerente().get(i).getId_empleado();
					opcionesEmpleado[i] = String.valueOf(idEmpleado);;
				}
			    String opcionesAelegirEmpleado = (String)JOptionPane.showInputDialog(null,"Elige el ID del Empleado", "Empleado", JOptionPane.DEFAULT_OPTION, null, opcionesEmpleado, opcionesEmpleado[0]);
			     int idEmpleadoElegido = Integer.parseInt(opcionesAelegirEmpleado);
			      empleado = gerenteCont.getGerenteById(idEmpleadoElegido);
		    }
		    
		   

	  

	    Venta venta = new Venta(0, inmueble, comprador, montoTotal, formaPago, empleado, tipoEmpleado, null);
	    controlador.addVenta(venta);
	}
	
	
	
	
	public void VerAlquileres(AlquilerControlador alquiler) {
		  for (Alquiler alquileres : alquiler.getAllAlquiler()) {
		        System.out.println("ID alquiler: " + alquileres.getId_alquiler());
		        System.out.println("Monto Total: " + alquileres.getMonto_total());
		        System.out.println("Comprador: " + alquileres.getFecha());
		        System.out.println("Forma Pago: " + alquileres.getForma_pago());
		        System.out.println("Contrato: " + alquileres.getGarante());
		        System.out.println("Contrato: " + alquileres.getContrato());
		        System.out.println("Contrato: " + alquileres.getCliente());
		        System.out.println("Empleado que vendio: " + alquileres.getEmpleado());
		        System.out.println("Empleado que vendio: " + alquileres.getInmueble());
		        System.out.println("----------------------------------------");
		    }	
	}
	
	public void AgregarAlquiler() {
		AlquilerControlador controlador= new AlquilerControlador();
		GaranteControlador garante = new GaranteControlador();
		ContratoControlador contrato = new ContratoControlador();
		InquilinoControlador inquilino = new InquilinoControlador();
		AgenteControlador agente = new AgenteControlador();
		InmuebleControlador inmueble = new InmuebleControlador();
		GerenteControlador gerente = new GerenteControlador();

		LocalDate fecha = null;
		
		String Ingresomonto = validarEntero("Ingrese Monto");
		int monto = Integer.parseInt(Ingresomonto);
		
	    fecha = validarFecha(fecha);
	    String forma_pago = validarNombre("Ingrese Forma de Pago");
	    
	    
	    
	    
	    String [] opcionesGarante = new String[garante.getAllGarante().size()];
	    for (int i = 0; i < opcionesGarante.length; i++) {
			int idGarante = garante.getAllGarante().get(i).getId_garante();
			opcionesGarante[i] = String.valueOf(idGarante);			
		}
	    String opcionesAelegirGarante = (String)JOptionPane.showInputDialog(null,"Elige el ID del Garante", "Garantes", JOptionPane.DEFAULT_OPTION, null, opcionesGarante, opcionesGarante[0]);
	     int idGaranteElegido = Integer.parseInt(opcionesAelegirGarante);
	     Garante garantes = garante.getGaranteById(idGaranteElegido);
	    
	     
	    
	    
	    String [] opcionesContrato = new String[contrato.getAllContrato().size()];
	    for (int i = 0; i < opcionesContrato.length; i++) {
			int idContrato = contrato.getAllContrato().get(i).getId_contrato();
			
			opcionesContrato[i] = String.valueOf(idContrato);
		}	    
	     String opcionesAelegirContrato = (String)JOptionPane.showInputDialog(null,"Elige el ID Del Contrato", "Contratos", JOptionPane.DEFAULT_OPTION, null, opcionesContrato, opcionesContrato[0]);
	     int idContratoElegido = Integer.parseInt(opcionesAelegirContrato);
	     Contrato contratos = contrato.getContratoById(idContratoElegido);
	 
	     
	     
	     
	    String [] opcionesInquilino = new String[inquilino.getAllInquilino().size()];
	    for (int i = 0; i < opcionesInquilino.length; i++) {
			int idInquilino = inquilino.getAllInquilino().get(i).getId_cliente();
			opcionesInquilino[i] = String.valueOf(idInquilino);;
		}
	    String opcionesAelegirInquilino = (String)JOptionPane.showInputDialog(null,"Elige el ID del Inquilino", "Inquilinos", JOptionPane.DEFAULT_OPTION, null, opcionesInquilino, opcionesInquilino[0]);
	     int idInquilinoElegido = Integer.parseInt(opcionesAelegirInquilino);
	     Cliente cliente = inquilino.getInquilinoById(idInquilinoElegido);
	     
	     
	     
	     String [] opcionesEmpleado = new String[agente.getAllAgente().size()];
		    for (int i = 0; i < opcionesEmpleado.length; i++) {
				int idEmpleado = inquilino.getAllInquilino().get(i).getId_cliente();
				opcionesEmpleado[i] = String.valueOf(idEmpleado);;
			}
		    String opcionesAelegirEmpleado = (String)JOptionPane.showInputDialog(null,"Elige el ID del Empleado", "Empleado", JOptionPane.DEFAULT_OPTION, null, opcionesEmpleado, opcionesEmpleado[0]);
		     int idEmpleadoElegido = Integer.parseInt(opcionesAelegirEmpleado);
		     Empleado empleado = agente.getAgenteById(idEmpleadoElegido);
	    
		     
		     
		     String[] opcionesInmueble = new String[inmueble.getAllInmueble().size()];
		     for (int i = 0; i < opcionesInmueble.length; i++) {
		         int idInmueble = inmueble.getAllInmueble().get(i).getId_inmueble();
		         opcionesInmueble[i] = String.valueOf(idInmueble);
		     }
		     String opcionesAelegirInmueble = (String) JOptionPane.showInputDialog(null,"Elige el ID del Inmueble","Inmuebles", JOptionPane.DEFAULT_OPTION, null, opcionesInmueble, opcionesInmueble[0]);

		     int idInmuebleElegido = Integer.parseInt(opcionesAelegirInmueble);

		     Inmueble inmuebles = inmueble.getInmuebleById(idInmuebleElegido);	    
	

	    
	    Alquiler alquiler = new Alquiler(0, monto, fecha, forma_pago, garantes, contratos, cliente, empleado, inmuebles);
	    controlador.addAlquiler(alquiler);
	    JOptionPane.showMessageDialog(null, "Alquiler Agregado Exitosamente");
	}

	
	
	
	
	
	
	
	
	
//todo inmuebles
	// ---------------------------LISTA INMUEBLES DISPONIBLES---------------------------
	public boolean verInmueblesDisponibles() {	
		boolean repetir;
		
		do {
			repetir = false;
			
		try {
			
			int count = 0; // cuenta los inmuebles activos y disponibles
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if (inmueble.isActivo() && inmueble.isDisponible()) {
			        count++;
			    }
			}
			
			if (count == 0) { // verificar si hay inmuebles disponibles 
			    JOptionPane.showMessageDialog(null, "No hay Inmuebles activos y disponibles cargados");
			    repetir = true;
			    continue;	
			}
			
			String[] opcionesInmuebles = new String[count]; // array con las opciones de inmuebles disponibles
			int index = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if (inmueble.isActivo() && inmueble.isDisponible()) {
			        opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
			                                     " - Dirección: " + inmueble.getDireccion() +
			                                     " - Ambientes: " + inmueble.getCantAmbientes();
			    }
			}
			
			opcionesInmuebles[opcionesInmuebles.length - 1] = "Volver";
			
			//mostramos los inmuebles disponibles
			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,"Seleccione Inmueble", "Visualizar Inmueble",
			        JOptionPane.INFORMATION_MESSAGE,null,opcionesInmuebles, opcionesInmuebles[0]);
			
            if (inmuebleSeleccionado.equals("Volver")) {
                repetir = true; 
                continue;
            }
			
			//mostramos el inmueble seleccionado
			if (inmuebleSeleccionado != null) {
			    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			        String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
			                        " - Dirección: " + inmueble.getDireccion() +
			                        " - Ambientes: " + inmueble.getCantAmbientes();
			        if (opcion.equals(inmuebleSeleccionado)) {
			            JOptionPane.showMessageDialog(null, 
			            		"Datos del Inmueble:\n" + inmueble.toString(),"Datos del Inmueble",JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			}
		} catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
			}
		} while (!repetir);
		return true;
	}
	
	
	
	// ---------------------------VER INMUEBLES---------------------------
	public boolean verInmuebles() {
		boolean repetir;
		do {
			
			repetir = false;
			
			try {
	
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados" );
				repetir = true;
				continue;		
			}	
		
			String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			for (int i = 0; i < opcionesInmuebles.length; i++) {
			Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
			opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();					
			}
					
			opcionesInmuebles[opcionesInmuebles.length - 1] = "Volver";

			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Visualizar Inmueble",
			JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
					
			
            if (inmuebleSeleccionado.equals("Volver")) {
                repetir = true; 
                continue;
            }
			
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
		
			} catch (Exception e) {
            	JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
			}
		} while (!repetir);
		
		return true;

	} 

	
	
	
	//-------------metodos para obtener los datos de Inmueble-----------------------------------------------------------------
	
	public String obtenerTipoInmueble() {
		String[] tipoInmueble = { "Casa","Departamento"};
		String seleccion = null;

		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Inmueble:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
	    
	}
	

	
//-------------------------------------	
	public String obtenerCondicion() {
		String[] tipoInmueble = { "Excelente","Muy bueno","Bueno","Regular","Malo"};
		String seleccion = null;
   
		do {
				
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de condición del Inmueble:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
    
	}
	
	
//--------------------------------------	
	public String obtenerBarrio() {
		String[] barrio = {"Agronomía", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita",
				"Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers",
				"Mataderos", "Monte Castro", "Monserrat", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda",
				"Parque Chacabuco", "Parque Chas", "Parque Patricios", "Puerto Madero", "Recoleta", "Retiro",
				"Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles",
				"Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano",
				"Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo",
				"Villa Santa Rita", "Villa Soldati", "Villa Urquiza"};
	    String seleccion = null;
		
		do {
			
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el Barrio",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, barrio, barrio[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
		
			
	}
	
	public String obtenerPiso() {
	    return JOptionPane.showInputDialog("Ingrese en que piso se encuentra el Departamento");
	}
	
//---------------------------	
	public boolean obtenerDisponible() {
	    String[] disponibleSeleccion = { "Si","No"};
	    String seleccion = null;
	    boolean confirmacion = false;
	    
	    do {		
		    try {
		    	 seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble esta Disponible para poder Ser reservado?",
		    			"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, disponibleSeleccion, disponibleSeleccion[0]);
		    	 
		    	if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		confirmacion = true;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
	    
	    } while (confirmacion == false);
	    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}
	
//-----------------------------------------
	public boolean obtenerActivo() {
	    String[] activoSeleccion = { "Si","No"};
	    String seleccion = null;
	    boolean confirmacion = false;
	   
	    do {		
		    try {
			     seleccion = (String) JOptionPane.showInputDialog(null, "¿Desea habilitar el Inmueble?",
				            "Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, activoSeleccion, activoSeleccion[0]);
		    	 
		    	if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		confirmacion = true;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
	    
	    } while (confirmacion == false);
	    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}
//---------------------------
	


	
	public String obtenerRefaccion() {
		String[] refaccionSeleccion = { "Si","No"};
		String seleccion = null;
	    
		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione si hay que Refaccionar:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, refaccionSeleccion, refaccionSeleccion[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
    
	}

	
	
//---------------------------		
	public boolean obtenerPatio() {
		
		String[] patioSeleccion = { "Si","No"};
		String seleccion = null;
		boolean confirmacion = false;
		do {		
			try {				
				seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble tiene Patio?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patioSeleccion, patioSeleccion[0]);
				
				if(seleccion ==null){
					JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
				}else {
					confirmacion = true;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
				
			}
			
		} while (confirmacion == false);
		
		    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}
//---------------------------
	
	
	public String obtenerMascota() {
		String[] mascotaSeleccion = { "Si","No"};

		String seleccion = null;
	    
		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "¿Es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, mascotaSeleccion, mascotaSeleccion[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
	    
	    
	}
	
/* ---------------------------------------------------------------------------- Selector de Agentes ----------------------------------------------------------------------------------------- */	
	
	public void SelectorAgentes() {
		
		AgenteControlador agentecontrolador = new AgenteControlador();   	
		
		 /* desde aca */  //JOptionPane.showMessageDialog(null, "Empleado");
			
			String[] listaEmpleado = {"Ver empleados","seleccionar empleado","Salir"};
			
			int seleccionEmpleado = JOptionPane.showOptionDialog(null, "Elegir opcion", null, 0, 0, null, listaEmpleado, listaEmpleado[0]);
			
			switch(seleccionEmpleado) {
			
			case 0:  // Ver empleados
			
				if (agentecontrolador.getAllAgente().size()==0) {JOptionPane.showMessageDialog(null, "No se han encontrado agentes.");} else {
				 JOptionPane.showMessageDialog(null, "La lista de empleados"+"\n"+agentecontrolador.getAllAgente());}
				
				 JOptionPane.showMessageDialog(null, "La lista de empleados"+"\n"+agentecontrolador.getAllAgente());	
				
			break;
			
			
			
/*---------------------------------*/  case 1: // Ver empleado por id /* ------------------------------------------------------------------------------------------------------------------------------------------------ */
		
	if (agentecontrolador.getAllAgente().size()==0) { JOptionPane.showMessageDialog(null, "No hay empleados registrados.");}
	else  {
		String[] empleados = new String[agentecontrolador.getAllAgente().size()];
			for (int i = 0; i < empleados.length; i++) {
			empleados[i] = Integer.toString(agentecontrolador.getAllAgente().get(i).getId_empleado());}
										
			
			String empleadoselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
			empleados, empleados[0]);

				// JOptionPane.showMessageDialog(null, agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect)));
					Agente seleccionado = agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect));
					JOptionPane.showMessageDialog(null, "El agente seleccionado es:"+seleccionado.toString()); /* Recordar cambiar los nombres en el archivo princ */ }
				
				break;
				
			case 2: // Salir
				
				break;}}
	
	
/*----------------------------------------------------------------- Fin del metodo SelectorAgente ---------------------------------------------------------------------------------------------------------------------------*/	
	
/* --------------------------------------------------------------- Seleccionar Agente por ID --------------------------------------------------------------------------------------------------------------------------------*/
	
	
	public Agente SelectorAgente() {
	
		AgenteControlador agentecontrolador = new AgenteControlador();
		
		Agente seleccionado = null;
		
	if (agentecontrolador.getAllAgente().size()==0) { JOptionPane.showMessageDialog(null, "No hay empleados registrados.");}
	else  {
		String[] empleados = new String[agentecontrolador.getAllAgente().size()];
			for (int i = 0; i < empleados.length; i++) {
			empleados[i] = Integer.toString(agentecontrolador.getAllAgente().get(i).getId_empleado());}
										
			
			String empleadoselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
			empleados, empleados[0]);

				// JOptionPane.showMessageDialog(null, agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect)));
					 seleccionado = agentecontrolador.getAgenteById(Integer.parseInt(empleadoselect));
					JOptionPane.showMessageDialog(null, "El agente seleccionado es:"+seleccionado.toString());
	
					
	}
	
	
	return seleccionado;
	
	}
	
	
	
	/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

public boolean RealizarReserva(Inmueble inmueble,Empleado empleado2,Cliente cliente2,LocalDate fecha_pago2,double pago2,String forma_pago,String tipo_operacion) {
		
		boolean error = false;
		
		
		try {
			
		ReservaControlador reservacontrolador = new ReservaControlador();
		InmuebleControlador inmueblecontrolador = new InmuebleControlador();
	
		
		if (inmueble==null) {System.out.println("No se ha ingresado ningun inmueble");	error=true; return false;}
		
		if (cliente2==null) {System.out.println("No se ha ingresado ningun cliente"); error=true; return false; }
		
		
		if (empleado2==null) {System.out.println("No se ha ingresado ningun empleado");error = true; return false;}
		
		
		
		if (ValidarPrecio(pago2).equalsIgnoreCase("No se ingreso ningun precio") || ValidarPrecio(pago2).equalsIgnoreCase("error se esta intentado ingresar un caracter especial")) {
			
			error = true;
			
		}
		 
		
		 String tipo_reserva = tipo_operacion;
		
		
		
		
		if (error==false && validarFecha_pagoReserva(fecha_pago2)) {
			
			
			reservacontrolador.addReserva(new Reserva(inmueble,cliente2,fecha_pago2,pago2,forma_pago,empleado2,tipo_reserva));
			
			inmueble.setDisponible(false);
			 inmueble.setActivo(false);
			 
			 inmueblecontrolador.updateInmueble(inmueble);
			
			return true;
			
		}
		
		
		} catch (Exception e) {
			
		//	JOptionPane.showMessageDialog(null, e);
		
		}
		
		
		
		
		
		
		
		
		return false;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}