package trabajoInmobiliaria;

import java.time.LocalDate;

public class Inquilino extends Cliente{
	
	private int id_inquilino;
	private boolean tiene_mascota;
	

	public Inquilino(String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac,
			int dni, int id_inquilino, boolean tiene_mascota) {
		super(nombre, id_cliente, apellido, correo, telefono, fecha_nac, dni);
		this.id_inquilino = id_inquilino;
		this.tiene_mascota = tiene_mascota;
	}



	public int getId_inquilino() {
		return id_inquilino;
	}

	public void setId_inquilino(int id_inquilino) {
		this.id_inquilino = id_inquilino;
	}



	public boolean isTiene_mascota() {
		return tiene_mascota;
	}



	public void setTiene_mascota(boolean tiene_mascota) {
		this.tiene_mascota = tiene_mascota;
	}
	
	


	
	
}
