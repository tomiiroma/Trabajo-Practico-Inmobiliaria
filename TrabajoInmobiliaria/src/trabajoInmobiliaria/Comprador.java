package trabajoInmobiliaria;

import java.time.LocalDate;

public class Comprador extends Cliente{
	
	private int comprador;
	private double Presupuesto;
	public Comprador(String nombre,int id_cliente, String apellido, String correo,String direccion, int telefono, LocalDate fecha_nacimiento, int dni,int comprador, double presupuesto) {
		super(nombre,id_cliente,apellido,correo,direccion,telefono,fecha_nacimiento,dni);
		this.comprador = comprador;
		Presupuesto = presupuesto;
	}

	
	
	public int getComprador() {
		return comprador;
	}
	public void setComprador(int comprador) {
		this.comprador = comprador;
	}
	public double getPresupuesto() {
		return Presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		Presupuesto = presupuesto;
	}
	
	
}
