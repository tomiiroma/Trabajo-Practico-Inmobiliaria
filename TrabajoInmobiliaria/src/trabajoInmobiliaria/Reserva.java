package trabajoInmobiliaria;

import java.time.LocalDate;

public class Reserva {
	private Inmueble inmueble;
	private LocalDate fecha_reserva;
	private LocalDate fecha_expiracion;
	private double pago;
	private Comprador comprador;
	private Inquilino inquilino;
	private Boolean estadoreserva;
	public Reserva(Inmueble inmueble, LocalDate fecha_reserva, LocalDate fecha_expiracion, double pago,
			Comprador comprador, Inquilino inquilino, Boolean estadoreserva) {
		super();
		this.inmueble = inmueble;
		this.fecha_reserva = fecha_reserva;
		this.fecha_expiracion = fecha_expiracion;
		this.pago = pago;
		this.comprador = comprador;
		this.inquilino = inquilino;
		this.estadoreserva = estadoreserva;
	}
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	public LocalDate getFecha_reserva() {
		return fecha_reserva;
	}
	public void setFecha_reserva(LocalDate fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	public LocalDate getFecha_expiracion() {
		return fecha_expiracion;
	}
	public void setFecha_expiracion(LocalDate fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public Inquilino getInquilino() {
		return inquilino;
	}
	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	public Boolean getEstadoreserva() {
		return estadoreserva;
	}
	public void setEstadoreserva(Boolean estadoreserva) {
		this.estadoreserva = estadoreserva;
	}

	
	
}
