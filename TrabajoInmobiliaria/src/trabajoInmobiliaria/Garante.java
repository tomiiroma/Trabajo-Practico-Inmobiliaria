package trabajoInmobiliaria;

public class Garante {
	
	private int id_garante;
	private String nombre;
	private String apellido;
	private int telefono;
	public Garante(int id_garante, String nombre, String apellido, int telefono) {
		super();
		this.id_garante = id_garante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Garante [id_garante=" + id_garante + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + "]";
	}
	public int getId_garante() {
		return id_garante;
	}
	public void setId_garante(int id_garante) {
		this.id_garante = id_garante;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
}
