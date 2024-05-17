package trabajoInmobiliaria;

import java.time.LocalDate;

public class Alquiler {
	private int	id_alquiler; 
	private Propietario propietario;
	private Reserva reserva;
	private Inquilino inquilino;
	private LocalDate ini_contrato;
	private LocalDate fin_crontato;
	private Inmueble inmueble;
	private Boolean PermisoMascota;
	
	public Alquiler(int id_alquiler,Propietario propietario, Reserva reserva, Inquilino inquilino, LocalDate ini_contrato,
			LocalDate fin_crontato, Inmueble inmueble, Boolean permisoMascota) {
		super();
		this.id_alquiler = id_alquiler;
		this.propietario = propietario;
		this.reserva = reserva;
		this.inquilino = inquilino;
		this.ini_contrato = ini_contrato;
		this.fin_crontato = fin_crontato;
		this.inmueble = inmueble;
		PermisoMascota = permisoMascota;
	}

	

	@Override
	public String toString() {
		return "Alquiler [id_alquiler=" + id_alquiler + ", propietario=" + propietario + ", reserva=" + reserva
				+ ", inquilino=" + inquilino + ", ini_contrato=" + ini_contrato + ", fin_crontato=" + fin_crontato
				+ ", inmueble=" + inmueble + ", PermisoMascota=" + PermisoMascota + "]";
	}



	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public LocalDate getIni_contrato() {
		return ini_contrato;
	}

	public void setIni_contrato(LocalDate ini_contrato) {
		this.ini_contrato = ini_contrato;
	}

	public LocalDate getFin_crontato() {
		return fin_crontato;
	}

	public void setFin_crontato(LocalDate fin_crontato) {
		this.fin_crontato = fin_crontato;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public Boolean getPermisoMascota() {
		return PermisoMascota;
	}

	public void setPermisoMascota(Boolean permisoMascota) {
		PermisoMascota = permisoMascota;
	}



	public int getId_alquiler() {
		return id_alquiler;
	}



	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	
	
	
	
	
}
