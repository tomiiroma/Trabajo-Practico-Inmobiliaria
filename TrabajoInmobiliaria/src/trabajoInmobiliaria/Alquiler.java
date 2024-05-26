package trabajoInmobiliaria;

import java.time.LocalDate;

public class Alquiler {
	private int	id_alquiler; 
	private int monto_total;
	private LocalDate fecha;
	private String forma_pago;
	private Garante garante;
	private Contrato contrato;
	private Cliente cliente;
	private Empleado empleado;
	private Inmueble inmueble;
	public Alquiler(int id_alquiler, int monto_total, LocalDate fecha, String forma_pago, Garante garante,
			Contrato contrato, Cliente cliente, Empleado empleado, Inmueble inmueble) {
		super();
		this.id_alquiler = id_alquiler;
		this.monto_total = monto_total;
		this.fecha = fecha;
		this.forma_pago = forma_pago;
		this.garante = garante;
		this.contrato = contrato;
		this.cliente = cliente;
		this.empleado = empleado;
		this.inmueble = inmueble;
	}
	@Override
	public String toString() {
		return "Alquiler [id_alquiler=" + id_alquiler + ", monto_total=" + monto_total + ", fecha=" + fecha
				+ ", forma_pago=" + forma_pago + ", garante=" + garante + ", contrato=" + contrato + ", cliente="
				+ cliente + ", empleado=" + empleado + ", inmueble=" + inmueble + "]";
	}
	public int getId_alquiler() {
		return id_alquiler;
	}
	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	public int getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(int monto_total) {
		this.monto_total = monto_total;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	public Garante getGarante() {
		return garante;
	}
	public void setGarante(Garante garante) {
		this.garante = garante;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	
	
	
	
	
}
