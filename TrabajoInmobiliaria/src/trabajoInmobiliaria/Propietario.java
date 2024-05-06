package trabajoInmobiliaria;

import java.time.LocalDate;

public class Propietario extends Cliente {
	private int id_propietario;
	private LocalDate fecha_registro;
	public Propietario(String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac,
			int dni, int id_propietario, LocalDate fecha_registro) {
		super(nombre, id_cliente, apellido, correo, telefono, fecha_nac, dni);
		this.id_propietario = id_propietario;
		this.fecha_registro = fecha_registro;
	}
	public int getId_propietario() {
		return id_propietario;
	}
	public void setId_propietario(int id_propietario) {
		this.id_propietario = id_propietario;
	}
	public LocalDate getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(LocalDate fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	

}
