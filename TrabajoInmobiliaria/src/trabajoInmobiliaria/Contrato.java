package trabajoInmobiliaria;

import java.time.LocalDate;

import controlador.ContratoControlador;
import controlador.PropietarioControlador;

public class Contrato {
	
	private int id_contrato;
	private String tipo_contrato;
	private String descripcion;
	private byte[] url_contrato;
	private Inmueble inmueble;
	private Cliente cliente;
	LocalDate inicio_contrato;
	LocalDate fin_contrato;
	private boolean apto_mascota;


	

	public Contrato(int id_contrato, String tipo_contrato, String descripcion, byte[] url_contrato, Inmueble inmueble,
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

	
	public Contrato() {
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


	
	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}



	public byte[] getUrl_contrato() {
		return url_contrato;
	}


	public void setUrl_contrato(byte[] url_contrato) {
		this.url_contrato = url_contrato;
	}


	public boolean isApto_mascota() {
		return apto_mascota;
	}

	public void setApto_mascota(boolean apto_mascota) {
		this.apto_mascota = apto_mascota;
	}
	
	

	@Override
	public String toString() {
		return "Contrato [id_contrato=" + id_contrato + ", tipo_contrato=" + tipo_contrato + ", descripcion="
				+ descripcion + ", url_contrato=" + url_contrato + ", inmueble=" + inmueble + ", cliente=" + cliente
				+ ", inicio_contrato=" + inicio_contrato + ", fin_contrato=" + fin_contrato + ", apto_mascota="
				+ apto_mascota + "]";
	}


	public void MostrarContrato(ContratoControlador contrato) {
		  for (Contrato contratos : contrato.getAllContrato()) {
		        System.out.println("ID Contrato: " + contratos.getId_contrato());
		        System.out.println("Tipo de Contrato: " + contratos.getTipo_contrato());
		        System.out.println("Descripcion: " + contratos.getDescripcion());
		        System.out.println("URL Contrato: " + contratos.getUrl_contrato());
		        System.out.println("Inmueble: " + contratos.getInmueble());
		        System.out.println("Cliente: " + contratos.getCliente());
		        System.out.println("Inicio Contrato: " + contratos.getInicio_contrato());
		        System.out.println("Fin Contrato: " + contratos.getFin_contrato());
		        System.out.println("Apto Mascoras: " + contratos.isApto_mascota());
		        System.out.println("----------------------------------------");
		    }		
	}
	
	
	
}