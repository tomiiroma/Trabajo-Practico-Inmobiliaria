package trabajoInmobiliaria;

import java.time.LocalDate;

import controlador.InquilinoControlador;

public class Inquilino extends Cliente implements Validacion{
	
	private int id_inquilino;
	

	public Inquilino() {
		
	}
	

	public Inquilino(String nombre, String apellido, String correo, String direccion, int telefono,
			LocalDate fecha_nacimiento, int dni, int id_inquilino) {
		super(nombre, apellido, correo, direccion, telefono, fecha_nacimiento, dni);
		this.id_inquilino = id_inquilino;
	}



	public Inquilino(String nombre, int id_cliente, String apellido, String correo,String direccion, int telefono,
			LocalDate fecha_nacimiento, int dni, int id_inquilino) {
		super(nombre, id_cliente, apellido, correo, direccion, telefono, fecha_nacimiento, dni);
		this.id_inquilino = id_inquilino;
	}



	public int getId_inquilino() {
		return id_inquilino;
	}

	public void setId_inquilino(int id_inquilino) {
		this.id_inquilino = id_inquilino;
	}

	public void MostrarInquilinos(InquilinoControlador controlador) {
		  for (Inquilino inquilino : controlador.getAllInquilino()) {
		        System.out.println("ID Cliente: " + inquilino.getId_cliente());
		        System.out.println("Nombre: " + inquilino.getNombre());
		        System.out.println("Apellido: " + inquilino.getApellido());
		        System.out.println("Correo: " + inquilino.getCorreo());
		        System.out.println("Teléfono: " + inquilino.getTelefono());
		        System.out.println("Fecha de Nacimiento: " + inquilino.getFecha_nacimiento());
		        System.out.println("DNI: " + inquilino.getDni());
		        System.out.println("ID Inquilino: " + inquilino.getId_inquilino());
		        System.out.println("----------------------------------------");
		    }
	}

	

	
	
}
