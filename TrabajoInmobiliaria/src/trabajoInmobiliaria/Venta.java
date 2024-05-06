package trabajoInmobiliaria;

public class Venta {
	
	private Reserva reserva;
	private Inmueble inmueble;
	private Comprador comprador;
	private Garante garante;
	private String Condiciones_pago;
	double precio_venta;
	public Venta(Reserva reserva, Inmueble inmueble, Comprador comprador, Garante garante, String condiciones_pago,
			double precio_venta) {
		super();
		this.reserva = reserva;
		this.inmueble = inmueble;
		this.comprador = comprador;
		this.garante = garante;
		Condiciones_pago = condiciones_pago;
		this.precio_venta = precio_venta;
	}
	@Override
	public String toString() {
		return "Venta [reserva=" + reserva + ", inmueble=" + inmueble + ", comprador=" + comprador + ", garante="
				+ garante + ", Condiciones_pago=" + Condiciones_pago + ", precio_venta=" + precio_venta + "]";
	}
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public Garante getGarante() {
		return garante;
	}
	public void setGarante(Garante garante) {
		this.garante = garante;
	}
	public String getCondiciones_pago() {
		return Condiciones_pago;
	}
	public void setCondiciones_pago(String condiciones_pago) {
		Condiciones_pago = condiciones_pago;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	

}
