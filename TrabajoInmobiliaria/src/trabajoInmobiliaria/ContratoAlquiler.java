package trabajoInmobiliaria;

import java.time.LocalDate;

public class ContratoAlquiler extends Contrato{
	
	LocalDate ini_contrato;
	LocalDate fin_contrato;
	String permisos;
	double precio;
	Inquilino inquilino;
	public ContratoAlquiler(LocalDate ini_contrato, LocalDate fin_contrato, String permisos, double precio,
			Inquilino inquilino) {
		super();
		this.ini_contrato = ini_contrato;
		this.fin_contrato = fin_contrato;
		this.permisos = permisos;
		this.precio = precio;
		this.inquilino = inquilino;
	}
	@Override
	public String toString() {
		return "ContratoAlquiler [ini_contrato=" + ini_contrato + ", fin_contrato=" + fin_contrato + ", permisos="
				+ permisos + ", precio=" + precio + ", inquilino=" + inquilino + "]";
	}
	public LocalDate getIni_contrato() {
		return ini_contrato;
	}
	public void setIni_contrato(LocalDate ini_contrato) {
		this.ini_contrato = ini_contrato;
	}
	public LocalDate getFin_contrato() {
		return fin_contrato;
	}
	public void setFin_contrato(LocalDate fin_contrato) {
		this.fin_contrato = fin_contrato;
	}
	public String getPermisos() {
		return permisos;
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Inquilino getInquilino() {
		return inquilino;
	}
	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	
	

}
