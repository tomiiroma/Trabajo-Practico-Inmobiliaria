package trabajoInmobiliaria;

import java.time.LocalDate;

public class Comprador extends Cliente{
	
	private int id_comprador;
	public Comprador(String nombre,int id_cliente, String apellido, String correo,String direccion, int telefono, LocalDate fecha_nacimiento, int dni,int id_comprador) {
		super(nombre,id_cliente,apellido,correo,direccion,telefono,fecha_nacimiento,dni);
		this.id_comprador = id_comprador;
	}

	
	
	public int getId_comprador() {
		return id_comprador;
	}
	public void setId_comprador(int comprador) {
		this.id_comprador = comprador;
	}

}