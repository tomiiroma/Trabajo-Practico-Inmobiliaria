package trabajoInmobiliaria;

import java.time.LocalDate; 

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
	            opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion() +" "+inmueble.getAlturaDireccion()+ " - Ambientes: " + inmueble.getCantAmbientes();
	        }

	        String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Visualizar Inmueble",
	                JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);

	        if (inmuebleSeleccionado != null) {
	            for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion() +" "+inmueble.getAlturaDireccion()+ " - Ambientes: " + inmueble.getCantAmbientes();					

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

	/* -----------------------------------------------------------------------------Realizar reservas 2 ------------------------------------------------------------------------------- */
	
	
	
	
	public void RealizarReserva() {
		
		boolean error = false;
		Cliente cliente = null;
		Empleado empleado = null;
		LocalDate fecha_pago = null;
		String pago="";
		double montovalidado;
		
		try {
			
		ReservaControlador reservacontrolador = new ReservaControlador();
		
		
		
		Inmueble inmueble = SeleccionarInmueble();
		
		if (inmueble==null) {error=true;}
		
		
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
		
		if (cliente==null) {error=true;}
		
		
		fecha_pago = validarFecha(fecha_pago);
		
		pago = JOptionPane.showInputDialog("Ingresar un número entero o con dos decimales para el monto de la reserva");
		
		montovalidado = ValidarMonto(pago);
		
		String forma_pago = JOptionPane.showInputDialog(null, "Escribar la forma de pago");
		
		
		String[] Empleados = {"Agente","Gerente","Cancelar operación"};
		
		
		int seleccionEmpleados = JOptionPane.showOptionDialog(null, "Seleccionar el tipo de empleado que realizara la reserva", "Modulo reserva", 0, 0, null, Empleados, Empleados[0]);
		
		
		if (seleccionEmpleados==0) {	empleado = SeleccionarAgente();}
		
		else if (seleccionEmpleados==1) { empleado = ObtenerGerenteId();}
		
		else { JOptionPane.showMessageDialog(null, "Se cancelo la operacioón"); error=true; }
		
		if (empleado==null) {error = true;}
		
		if (error==false) {
			
			
			reservacontrolador.addReserva(new Reserva(inmueble,cliente,fecha_pago,montovalidado,forma_pago,empleado));
			
			
		}
		
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		

		
	}
	
	
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
		InquilinoControlador clientecont = new InquilinoControlador();

		
		String tipocontrato = JOptionPane.showInputDialog("Ingrese el tipo de contrato");
		String descripcion = JOptionPane.showInputDialog("Ingrese el descripcion del contrato");
		String url = JOptionPane.showInputDialog("Ingrese la url del contrato");
		
		  int idInmueble = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del inmueble"));
		    Inmueble inmueble = inmueblecont.getInmuebleById(idInmueble);


		    int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente"));
		    Cliente cliente = clientecont.getInquilinoById(idCliente);		
		    
		    inicio = validarFecha(inicio);
		    
		fin = validarFecha(fin);
	    boolean aptoMascota = JOptionPane.showConfirmDialog(null, "¿El contrato permite mascotas?", "Permite mascotas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
	
	    Contrato contrato = new Contrato(0, tipocontrato, descripcion, url,inmueble,cliente, inicio, fin, aptoMascota);
	    controlador.addContrato(contrato);
	}
	
	
	public void MostrarVentas(VentaControlador venta) {
		  for (Venta ventas : venta.getAllVentas()) {
		        System.out.println("ID Venta: " + ventas.getId_venta());
		        System.out.println("Comprador: " + ventas.getComprador());
		        System.out.println("Contrato: " + ventas.getContrato());
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

	    int idInmueble = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del inmueble"));
	    Inmueble inmueble = inmuebleCont.getInmuebleById(idInmueble);

	    int idComprador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del comprador"));
	    Comprador comprador = compradorCont.getCompradorById(idComprador);

	    int idContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del contrato"));
	    Contrato contrato = contratoCont.getContratoById(idContrato);

	    double montoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de la venta"));
	    String formaPago = JOptionPane.showInputDialog("Ingrese la forma de pago");

	    int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado"));
	    String tipoEmpleado = JOptionPane.showInputDialog("Ingrese el tipo de empleado (agente/gerente)");

	    Empleado empleado = null;
	    if (tipoEmpleado.equalsIgnoreCase("agente")) {
	        empleado = agenteCont.getAgenteById(idEmpleado);
	    } else if (tipoEmpleado.equalsIgnoreCase("gerente")) {
	        empleado = gerenteCont.getGerenteById(idEmpleado);
	    }

	    Venta venta = new Venta(0, inmueble, comprador, contrato, montoTotal, formaPago, empleado, tipoEmpleado);
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
		LocalDate fecha = null;
		
		int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Monto Total"));
	    fecha = validarFecha(fecha);
	    String forma_pago = JOptionPane.showInputDialog("Ingrese Forma de Pago");
	    
	    int idGarante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del garante"));
	    Garante garantes = garante.getGaranteById(idGarante);
	    
	    int idContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Contrato"));
	    Contrato contratos = contrato.getContratoById(idContrato);
	    
	    int idInquilino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del del Inquilino"));
	    Cliente cliente = inquilino.getInquilinoById(idInquilino);
	    
	    int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del del Empleado"));
	    Empleado empleado = agente.getAgenteById(idEmpleado);
	    
	    int idInmueble = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del del Inmueble"));
	    Inmueble inmuebles = inmueble.getInmuebleById(idInmueble);
	    
	    Alquiler alquiler = new Alquiler(0, monto, fecha, forma_pago, garantes, contratos, cliente, empleado, inmuebles);
	    controlador.addAlquiler(alquiler);
	}

	
	
	
	
	
	
	
	
	
//todo inmuebles
	
	
	
	
	public boolean verificarTabla() {
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles cargados");
			flag = false;
		}else {
			flag = true;
		}
		
		
		return flag;
	}
	
	
	
	// ---------------------------LISTA INMUEBLES DISPONIBLES---------------------------
	public boolean verInmueblesDisponibles() {	
		boolean repetir;
		
		do {
			repetir = false;
			
		try {
			
			boolean hayInmuebles = verificarTabla();
			
			if(!hayInmuebles){
				repetir = true;
				continue;
			}
			
			
			int count = 0; // cuenta los inmuebles activos y disponibles
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if (inmueble.isActivo() && inmueble.isDisponible()) {
			        count++;
			    }
			}
			
			if (count == 0) { // verificar si hay inmuebles disponibles 
			    JOptionPane.showMessageDialog(null, "No hay Inmuebles activos y/o disponibles cargados");
			    repetir = true;
			    continue;	
			}
			
			String[] opcionesInmuebles = new String[count]; // array con las opciones de inmuebles disponibles
			int index = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if (inmueble.isActivo() && inmueble.isDisponible()) {
			        opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
	        									 " - Tipo de Inmueble: "+ inmueble.getTipo_inmueble() +
			                                     " - Dirección: " + inmueble.getDireccion() +
			                                     " - Ambientes: " + inmueble.getCantAmbientes();
			    }
			}
					
			//mostramos los inmuebles disponibles
			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,"Seleccione Inmueble", "Inmuebles Disponibles",
			        JOptionPane.INFORMATION_MESSAGE,null,opcionesInmuebles, opcionesInmuebles[0]);
			
			
			//mostramos el inmueble seleccionado
			if (inmuebleSeleccionado != null) {
			    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			        String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
			        				" - Tipo de Inmueble: "+ inmueble.getTipo_inmueble() +
			                        " - Dirección: " + inmueble.getDireccion() +
			                        " - Ambientes: " + inmueble.getCantAmbientes();
			        
			        if (opcion.equals(inmuebleSeleccionado)) {
			        	JOptionPane.showMessageDialog(null, "Datos del Inmueble:\n" + inmueble.toString(),"Datos del Inmueble",JOptionPane.INFORMATION_MESSAGE);
			        	break;
			        }
			    }
			    break;
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
				
				boolean hayInmuebles = verificarTabla();
				
				if(!hayInmuebles){
					repetir = true;
					continue;
				}

		
			String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
			for (int i = 0; i < opcionesInmuebles.length; i++) {
				Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
				opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Tipo de Inmueble: "+inmueble.getTipo_inmueble() +" - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
			}		

			
			String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble", "Lista De Inmuebles",
			JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
					
			if(inmuebleSeleccionado !=null){
				Inmueble inmuebleAmostrar = null;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Tipo de Inmueble: "+inmueble.getTipo_inmueble() +" - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
							
			
			if(opcion.equals(inmuebleSeleccionado)){
				inmuebleAmostrar=inmueble;
				break;
				}      
			}
						
				if(inmuebleAmostrar !=null){
					//muestro todos los datos del Inmueble
					JOptionPane.showMessageDialog(null, "Datos del Inmueble:\n" + inmuebleAmostrar.toString(), "Datos del Inmueble", JOptionPane.INFORMATION_MESSAGE);		
					break;
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
		    	 seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble se encuentra en condiciones para habilitarlo?",
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
	
	
	
	
	
	
	
	
	
	
}
