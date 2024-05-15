package trabajoInmobiliaria;

import java.time.LocalDate;

public class Garante extends Cliente{
	
	private int id_garante;

	public Garante(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int id_garante) {
		super(nombre,id_cliente,apellido,correo,telefono,fecha_nac,dni);
		this.id_garante = id_garante;
		
	}
	

	@Override
	public String toString() {
		return "Garante [id_garante=" + id_garante + "]";
	}


	public int getId_garante() {
		return id_garante;
	}
	public void setId_garante(int id_garante) {
		this.id_garante = id_garante;
	}


	
}
