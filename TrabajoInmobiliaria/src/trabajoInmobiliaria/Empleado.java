package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import controlador.ContratoControlador;
import controlador.InmuebleControlador;
import controlador.InquilinoControlador;
import controlador.PropietarioControlador;




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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getTipo_empleado() {
		return tipo_empleado;
	}


	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
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
}
