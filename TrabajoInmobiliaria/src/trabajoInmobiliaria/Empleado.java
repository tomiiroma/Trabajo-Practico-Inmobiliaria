package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.ReservaControlador;
import controlador.InmuebleControlador;
import controlador.GerenteControlador;
import controlador.InquilinoControlador;
import controlador.CompradorControlador;
import controlador.VentaControlador;

public class Empleado implements InicioSesion, Validacion{

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


	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", dni=" + dni + ", telefono=" + telefono + ", correo="
				+ correo + ", tipo_empleado=" + tipo_empleado + ", contraseña=" + contraseña + "]";
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

	/* ------------------------------------------------------------------------------------------------------- Realizar reservas 2 ------------------------------------------------------------------------------- */
	
	
	
	
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
	
	
	public void RealizarVenta() {
		
		VentaControlador ventacontrolador = new VentaControlador();
		int identificador_inmueble=0 , identificador_cliente=0, ID_empleado=0;
		boolean error=false;
		double  monto_total;
		String validar_monto , forma_pago;
		
		String [] RealizarVent = {"Realizar venta","cancelar operacion"};
		
		int opciones = JOptionPane.showOptionDialog(null, "Seleccionar una opcion","Módulo venta", 0, 0, null, RealizarVent, RealizarVent[0]);
		
	
		switch (opciones) {
			
			case 0:
			
			Inmueble inmueble = SeleccionarInmueble();	// Este metodo retorna un inmueble
				
			if (inmueble == null) { JOptionPane.showMessageDialog(null, "No se ha ingresado ningun inmueble"); error=true;}
			
			else { identificador_inmueble = inmueble.getId_inmueble();}
				
			Cliente cliente = SelectorComprador();
			
			if (cliente == null ) {JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun comprador"); error = true;}
			
			else {  identificador_cliente = cliente.getId_cliente();}
			
			/* Espacio para un metodo que retorne un contrato. */
			
			int identificador_contrato = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el id del contrato"));
			
			/* fin del espacio para el metodo que retorne un contrato */
			
			validar_monto = JOptionPane.showInputDialog(null, "Ingresar el monto requerido para la transacción");
			
			monto_total = ValidarMonto(validar_monto);
			
			forma_pago = JOptionPane.showInputDialog(null, "Ingresar la forma de pago");
			
		
			
			String[] SeleccionarEmpleado = {"Agente" , "Gerente"};
			
			int SeleccionEmpleado = JOptionPane.showOptionDialog(null, "Seleccionar el tipo de empleado que realizara la operacion", "Módulo venta", 0, 0, null, SeleccionarEmpleado, SeleccionarEmpleado[0]);
			
			if (SeleccionEmpleado==0) 
			{ Agente empleado = SeleccionarAgente();  
			  ID_empleado = empleado.getId_empleado();
			}
			else if (SeleccionEmpleado==1) {
				Gerente empleado = ObtenerGerenteId();
			 ID_empleado = empleado.getId_empleado();
			}
			else {error=true;}
			
			if (error==false) {	ventacontrolador.addVenta(new Venta(0,identificador_inmueble,identificador_cliente,identificador_contrato,monto_total,forma_pago,ID_empleado));}
			
			break;
			
			case 1:
				
				JOptionPane.showMessageDialog(null, "Se ha cancelado la operación");
				
				break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
