package trabajoInmobiliaria;

import java.time.LocalDate;

public class Contrato {
	
	private int id_contrato;
	private String tipo_contrato;
	private String descripcion;
	private String url_contrato;
	private Inmueble inmueble;
	private Cliente cliente;
	LocalDate inicio_contrato;
	LocalDate fin_contrato;
	private boolean apto_mascota;


	


	public Contrato(int id_contrato, String tipo_contrato, String descripcion, String url_contrato, Inmueble inmueble,
			Cliente cliente, LocalDate inicio_contrato, LocalDate fin_contrato, boolean apto_mascota) {
		super();
		this.id_contrato = id_contrato;
		this.tipo_contrato = tipo_contrato;
		this.descripcion = descripcion;
		this.url_contrato = url_contrato;
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.inicio_contrato = inicio_contrato;
		this.fin_contrato = fin_contrato;
		this.apto_mascota = apto_mascota;
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


	
	
	
	
	
}
