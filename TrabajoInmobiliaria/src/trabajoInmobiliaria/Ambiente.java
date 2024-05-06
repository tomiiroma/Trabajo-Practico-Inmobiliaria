package trabajoInmobiliaria;

public class Ambiente {
	private String baños;
	private String Estado;
	private String lavadero;
	private String patio;
	private String dormitorios;
	private String cociona;
	public Ambiente(String baños, String estado, String lavadero, String patio, String dormitorios, String cociona) {
		super();
		this.baños = baños;
		Estado = estado;
		this.lavadero = lavadero;
		this.patio = patio;
		this.dormitorios = dormitorios;
		this.cociona = cociona;
	}
	@Override
	public String toString() {
		return "Ambiente [baños=" + baños + ", Estado=" + Estado + ", lavadero=" + lavadero + ", patio=" + patio
				+ ", dormitorios=" + dormitorios + ", cociona=" + cociona + "]";
	}
	public String getBaños() {
		return baños;
	}
	public void setBaños(String baños) {
		this.baños = baños;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getLavadero() {
		return lavadero;
	}
	public void setLavadero(String lavadero) {
		this.lavadero = lavadero;
	}
	public String getPatio() {
		return patio;
	}
	public void setPatio(String patio) {
		this.patio = patio;
	}
	public String getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(String dormitorios) {
		this.dormitorios = dormitorios;
	}
	public String getCociona() {
		return cociona;
	}
	public void setCociona(String cociona) {
		this.cociona = cociona;
	}

	

}
