package trabajoInmobiliaria;

import java.time.LocalDate;

public class Comprador extends Cliente{
	private int comprador;
	private double Presupuesto;
	public Comprador(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int comprador, double presupuesto) {
		super(nombre,id_cliente,apellido,correo,telefono,fecha_nac,dni);
		this.comprador = comprador;
		Presupuesto = presupuesto;
	}
	@Override
	public String toString() {
		return "Comprador [comprador=" + comprador + ", Presupuesto=" + Presupuesto + "]";
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
