package trabajoInmobiliaria;

import java.time.LocalDate;

public class Contrato {
	
	private int id_contrato;
	LocalDate inicio_contrato;
	LocalDate fin_contrato;
	private Cliente cliente;
	private Inmueble inmueble;
	private String descripcion;
	private double monto;
	private Reserva reserva;


	public Contrato(int id_contrato, LocalDate inicio_contrato, LocalDate fin_contrato, Cliente cliente,
			 String descripcion, double monto, Reserva reserva) {
		super();
		this.id_contrato = id_contrato;
		this.inicio_contrato = inicio_contrato;
		this.fin_contrato = fin_contrato;
		this.cliente = cliente;
		this.descripcion = descripcion;
		this.monto = monto;
		this.reserva = reserva;
	}



	public int getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(int id_contrato) {
		this.id_contrato = id_contrato;
	}

	public LocalDate getInicio_contrato() {
		return inicio_contrato;
	}

	public void setInicio_contrato(LocalDate inicio_contrato) {
		this.inicio_contrato = inicio_contrato;
	}

	public LocalDate getFin_contrato() {
		return fin_contrato;
	}

	public void setFin_contrato(LocalDate fin_contrato) {
		this.fin_contrato = fin_contrato;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}


	
	
	
	
	
}
