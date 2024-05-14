package trabajoInmobiliaria;

public class Inmueble {

	private int id_inmueble;
	private String localizacion;
	private double precio;
	private double tamaño;
	private int cantidadPersonas;
	private Propietario propietario;
	private String operacion; // Puede ser booleano
	private Ambiente ambiente;
	
	
	Inmueble(int id_inmueble,String localizacion,double precio,double tamaño,int cantidadPersonas,Propietario propietario,String operacion,Ambiente ambiente) {
		
		this.id_inmueble = id_inmueble;
		this.localizacion = localizacion;
		this.precio = precio;
		this.tamaño = tamaño;
		this.cantidadPersonas = cantidadPersonas;
		this.propietario = propietario;
		this.operacion = operacion;
		this.ambiente = ambiente;
		
	}


	public int getId_inmueble() {
		return id_inmueble;
	}


	public void setId_inmueble(int id_inmueble) {
		this.id_inmueble = id_inmueble;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	public int getCantidadPersonas() {
		return cantidadPersonas;
	}


	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}


	public Propietario getPropietario() {
		return propietario;
	}


	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	public String getOperacion() {
		return operacion;
	}


	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}


	public Ambiente getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}


	@Override
	public String toString() {
		return "Inmueble [id_inmueble=" + id_inmueble + ", localizacion=" + localizacion + ", precio=" + precio
				+ ", tamaño=" + tamaño + ", cantidadPersonas=" + cantidadPersonas + ", propietario=" + propietario
				+ ", operacion=" + operacion + ", ambiente=" + ambiente + "]";
	}
	
	
	
	
	
}
