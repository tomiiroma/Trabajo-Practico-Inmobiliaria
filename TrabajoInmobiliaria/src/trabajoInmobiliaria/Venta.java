package trabajoInmobiliaria;

public class Venta {
	private int id_venta;
	private int fk_inmueble;
	private int fk_cliente;
	private int fk_contrato;
	private double monto_total;
	private String forma_pago;
	private int fk_empleado_id;
	
	// Viejos atributos no coinciden con la base de datos.
	
	// private Reserva reserva;
	// private Inmueble inmueble;
	// private Comprador comprador;
	
	double precio_venta;

	public Venta(int id_venta, int fk_inmueble, int fk_cliente, int fk_contrato, double monto_total, String forma_pago,
			int fk_empleado_id ) {
		super();
		this.id_venta = id_venta;
		this.fk_inmueble = fk_inmueble;
		this.fk_cliente = fk_cliente;
		this.fk_contrato = fk_contrato;
		this.monto_total = monto_total;
		this.forma_pago = forma_pago;
		this.fk_empleado_id = fk_empleado_id;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public int getFk_inmueble() {
		return fk_inmueble;
	}

	public void setFk_inmueble(int fk_inmueble) {
		this.fk_inmueble = fk_inmueble;
	}

	public int getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}

	public int getFk_contrato() {
		return fk_contrato;
	}

	public void setFk_contrato(int fk_contrato) {
		this.fk_contrato = fk_contrato;
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

	public int getFk_empleado_id() {
		return fk_empleado_id;
	}

	public void setFk_empleado_id(int fk_empleado_id) {
		this.fk_empleado_id = fk_empleado_id;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Viejo contructor , getters y setters
	
	
	
	
	
/*	public Venta(int id_venta,Reserva reserva, Inmueble inmueble, Comprador comprador, String forma_pago,
			double precio_venta) {
		super();
		this.id_venta = id_venta;
		this.reserva = reserva;
		this.inmueble = inmueble;
		this.comprador = comprador;
		this.forma_pago = forma_pago;
		this.precio_venta = precio_venta;
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
	
	

	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	
	
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}


	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}*/
	
	
}
