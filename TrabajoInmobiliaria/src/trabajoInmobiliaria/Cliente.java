package trabajoInmobiliaria;

import java.time.LocalDate;

public class Cliente {
	private String nombre;
	private int id_cliente;
	private String apellido;
	private String correo;
	private int telefono;
	private LocalDate fecha_nac;
	private int dni;
	
	public Cliente(String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac,
			int dni) {
		super();
		this.nombre = nombre;
		this.id_cliente = id_cliente;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.fecha_nac = fecha_nac;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", id_cliente=" + id_cliente + ", apellido=" + apellido + ", correo="
				+ correo + ", telefono=" + telefono + ", fecha_nac=" + fecha_nac + ", dni=" + dni + "]";
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
	
	

}
