package trabajoInmobiliaria;

public class Venta {
	private int id_venta;
	private Inmueble inmueble;
	private Comprador comprador;
	private double monto_total;
	private String forma_pago;
	private Empleado empleado;
	private String tipo_empleado;
	private Reserva reservaVenta;
	

	





	public Venta(int id_venta, Inmueble inmueble, Comprador comprador, double monto_total, String forma_pago,
			Empleado empleado, String tipo_empleado, Reserva reservaVenta) {
		super();
		this.id_venta = id_venta;
		this.inmueble = inmueble;
		this.comprador = comprador;
		this.monto_total = monto_total;
		this.forma_pago = forma_pago;
		this.empleado = empleado;
		this.tipo_empleado = tipo_empleado;
		this.reservaVenta = reservaVenta;
	}
	










	public int getId_venta() {
		return id_venta;
	}




	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
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









	public double getMonto_total() {
		return monto_total;
	}




	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}




	public String getForma_pago() {
		return forma_pago;
	}




	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}




	public Empleado getEmpleado() {
		return empleado;
	}




	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}




	public String getTipo_empleado() {
		return tipo_empleado;
	}




	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}




	public Reserva getReserva() {
		return reservaVenta;
	}




	public void setReserva(Reserva reservaVenta) {
		this.reservaVenta = reservaVenta;
	}



	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", inmueble=" + inmueble + ", comprador=" + comprador + ", monto_total=" + monto_total + ", forma_pago=" + forma_pago + ", empleado=" + empleado
				+ ", tipo_empleado=" + tipo_empleado + ", reservaVenta=" + reservaVenta + "]";
	}


	
	
	
	
	
	
}
