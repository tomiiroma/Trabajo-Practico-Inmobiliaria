package trabajoInmobiliaria;

import java.time.LocalDate;

import controlador.PropietarioControlador;

public class Propietario extends Cliente {
	private int id_propietario;
	
	public Propietario(String nombre, int id_cliente, String apellido, String correo,String direccion, int telefono, LocalDate fecha_nacimiento,
			int dni, int id_propietario) {
		super(nombre, id_cliente, apellido, correo,direccion, telefono, fecha_nacimiento, dni);
		this.id_propietario = id_propietario;
		
	}
	
	public Propietario(String nombre, String apellido, String correo, String direccion, int telefono,
			LocalDate fecha_nacimiento, int dni, int id_inquilino) {
		super(nombre, apellido, correo, direccion, telefono, fecha_nacimiento, dni);
		this.id_propietario = id_inquilino;
	}
	public int getId_propietario() {
		return id_propietario;
	}
	public void setId_propietario(int id_propietario) {
		this.id_propietario = id_propietario;
	}

	
	public void MostrarPropietario(PropietarioControlador propietario) {
		  for (Propietario propietarios : propietario.getAllPropietario()) {
		        System.out.println("ID Cliente: " + propietarios.getId_cliente());
		        System.out.println("Nombre: " + propietarios.getNombre());
		        System.out.println("Apellido: " + propietarios.getApellido());
		        System.out.println("Correo: " + propietarios.getCorreo());
		        System.out.println("Teléfono: " + propietarios.getTelefono());
		        System.out.println("Fecha de Nacimiento: " + propietarios.getFecha_nacimiento());
		        System.out.println("DNI: " + propietarios.getDni());
		        System.out.println("ID Inquilino: " + propietarios.getId_propietario());
		        System.out.println("----------------------------------------");
		    }		
	}

}
