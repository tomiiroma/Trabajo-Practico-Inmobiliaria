package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import controlador.AgenteControlador;
import controlador.ReservaControlador;
import controlador.InmuebleControlador;
import controlador.GerenteControlador;
import controlador.InquilinoControlador;
import controlador.CompradorControlador;

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

	public void HacerReserva() {
		String monto_total = "0"; LocalDate fecha_pago = null; String forma_pago = "";
		int fk_inmueble=0,  fk_empleado=0, fk_cliente = 0;
		double pago=0;
		boolean error = false;
		try {
			
			ReservaControlador reservacontrolador = new ReservaControlador();
			
			
			Inmueble inmueble = SeleccionarInmueble();
			
			JOptionPane.showMessageDialog(null, "A ver"+inmueble);
			if (inmueble == null) { JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun inmueble.");	
			error = true;
			}
			
			else {

				 fk_inmueble = inmueble.getId_inmueble();
				
			}
			
			
			
			String[] opcionescliente = {"Inquilino","Comprador","Cancelar"};
			
			int opcionselect = JOptionPane.showOptionDialog(null, "Seleccionar el tipo de cliente", null, 0, 0, null, opcionescliente, opcionescliente[0]);
			
			switch (opcionselect) {
			
			
			case 0:
			
				Inquilino inquilino = SelectorInquilino();
				
				if (inquilino == null)  {JOptionPane.showMessageDialog(null,"No se ha encontrado ningun inquilino");  error=true;}
				
				else { fk_cliente = inquilino.getId_cliente();}
				
				break;

			case 1:
				
				Comprador comprador = SelectorComprador();
				
				if (comprador == null) { JOptionPane.showMessageDialog(null, "No se ha encontrado ningun comprador"); error=true;}
				
				else {fk_cliente = comprador.getId_cliente();}
				
				break;
				
			case 2:
				
				error = true;
				
				break;
				
			default:
				break;
			}
			
			
			
			fecha_pago = LocalDate.now();
			
			
			monto_total = JOptionPane.showInputDialog("Ingresar el monto requerido como entero o como decimal con dos decimales.");
			
			pago = ValidarMonto(monto_total);
			
			forma_pago = JOptionPane.showInputDialog("Ingresar una forma de pago");
			
			String[] Empleados = {"Agente","Gerente","Cancelar"};
			
			int selectEmpleado = JOptionPane.showOptionDialog(null, "Seleccionar quien realizara la operación", "Reserva", 0, 0, null, Empleados, Empleados[0]);
			
			switch (selectEmpleado) {
			case 0:
				
				Agente agente = SeleccionarAgente();
				
				if (agente == null) {
					
					JOptionPane.showMessageDialog(null, "No se ha ingresado ningun agente");				
					error = true;
					
				} else {
					
					fk_empleado = agente.getId_empleado();
					
				}
				
				
				break;

			case 1:
				
				Gerente gerente = ObtenerGerenteId();
				
				if (gerente == null) { JOptionPane.showMessageDialog(null, "No se ha ingresado ningun Gerente"); error=true;}
				
				else { fk_empleado = gerente.getId_empleado();}
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Se cancelo la operación");
				error = true;
				
				break;
			default:
				break;
			}
			
		
			
			if (error==false) {
			reservacontrolador.addReserva(new Reserva(0,fk_inmueble,fk_cliente,fecha_pago,pago,forma_pago,fk_empleado));
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
