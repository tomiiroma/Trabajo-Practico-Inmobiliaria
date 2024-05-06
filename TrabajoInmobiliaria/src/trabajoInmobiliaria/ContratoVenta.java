package trabajoInmobiliaria;

import java.time.LocalDate;

public class ContratoVenta extends Contrato{

	String Condiciones;
	double precio_venta;
	Comprador comprador;
	LocalDate fecha_contrato;
	public ContratoVenta(String condiciones, double precio_venta, Comprador comprador, LocalDate fecha_contrato) {
		super();
		Condiciones = condiciones;
		this.precio_venta = precio_venta;
		this.comprador = comprador;
		this.fecha_contrato = fecha_contrato;
	}
	@Override
	public String toString() {
		return "ContratoVenta [Condiciones=" + Condiciones + ", precio_venta=" + precio_venta + ", comprador="
				+ comprador + ", fecha_contrato=" + fecha_contrato + "]";
	}
	public String getCondiciones() {
		return Condiciones;
	}
	public void setCondiciones(String condiciones) {
		Condiciones = condiciones;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public LocalDate getFecha_contrato() {
		return fecha_contrato;
	}
	public void setFecha_contrato(LocalDate fecha_contrato) {
		this.fecha_contrato = fecha_contrato;
	}
	
	
	
}
