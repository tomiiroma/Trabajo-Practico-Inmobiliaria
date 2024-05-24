package trabajoInmobiliaria;

import java.time.LocalDate;

public class Cliente {
	private String nombre;
	private int id_cliente;
	private String apellido;
	private String correo;
	private String direccion;
	private int telefono;
	private LocalDate fecha_nacimiento;
	private int dni;

	
	public Cliente(String nombre, int id_cliente, String apellido, String correo, String direccion, int telefono, LocalDate fecha_nacimiento,
			int dni) {
		super();
		this.nombre = nombre;
		this.id_cliente = id_cliente;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
	}

	
	public Cliente(String nombre, String apellido, String correo,String direccion, int telefono, LocalDate fecha_nacimiento, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", id_cliente=" + id_cliente + ", apellido=" + apellido + ", correo="
				+ correo + ", telefono=" + telefono + ", fecha_nac=" + fecha_nacimiento + ", dni=" + dni + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nac) {
		this.fecha_nacimiento = fecha_nac;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	

}
