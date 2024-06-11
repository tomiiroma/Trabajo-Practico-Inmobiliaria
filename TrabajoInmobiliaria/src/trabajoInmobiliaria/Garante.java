package trabajoInmobiliaria;

public class Garante {
	
	
	private int id_garante;
	private String nombre;
	private String apellido;
	private String numero_telefono;
	
	
	public Garante(int id_garante, String nombre, String apellido, String numero_telefono) {
		super();
		this.id_garante = id_garante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_telefono = numero_telefono;
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
	public String getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	
	
	

}
