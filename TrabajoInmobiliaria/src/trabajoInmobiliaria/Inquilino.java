package trabajoInmobiliaria;

import java.time.LocalDate;

public class Inquilino extends Cliente{
	
	private int id_inquilino;
	

	public Inquilino(String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac,
			int dni, int id_inquilino) {
		super(nombre, id_cliente, apellido, correo, telefono, fecha_nac, dni);
		this.id_inquilino = id_inquilino;
	}



	public int getId_inquilino() {
		return id_inquilino;
	}

	public void setId_inquilino(int id_inquilino) {
		this.id_inquilino = id_inquilino;
	}





	
	
}
