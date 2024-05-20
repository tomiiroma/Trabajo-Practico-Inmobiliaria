package trabajoInmobiliaria;

import java.time.LocalDate;




public class Empleado{

	private int id_empleado;
	private String nombre;
	private String apellido;
	private LocalDate fecha_nac;
	private int dni;
	private int telefono;
	private String correo;
	private String tipo_empleado;
	private String contraseña;
	

	
	
	
	
	public Empleado(int id_empleado, String nombre, String apellido, LocalDate fecha_nac, int dni, int telefono,
			String correo, String tipo_empleado, String contraseña) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
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
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
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
	
	
	
}
