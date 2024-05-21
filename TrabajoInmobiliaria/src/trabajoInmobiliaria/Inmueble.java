package trabajoInmobiliaria;

public class Inmueble {

	private int id_inmueble;
	private String tipo_inmueble;
	private String condicion;
	private boolean disponible;
	private double superficie_cubierta;
	private double superficie_descubierta;
	private String localizacion;
	private String lavadero;
	private String descripcion;
	private int antiguedad;
	private double precio;
	private String banio;
	private boolean refaccionar;
	private String estado;
	private String dormitorio;
	private String cocina;
	private boolean apto_mascota;
	



	public Inmueble(int id_inmueble, String tipo_inmueble, String condicion, boolean disponible,
			double superficie_cubierta, double superficie_descubierta, String localizacion, String lavadero,
			String descripcion, int antiguedad, double precio, String banio, boolean refaccionar, String estado,
			String dormitorio, String cocina, boolean apto_mascota) {
		super();
		this.id_inmueble = id_inmueble;
		this.tipo_inmueble = tipo_inmueble;
		this.condicion = condicion;
		this.disponible = disponible;
		this.superficie_cubierta = superficie_cubierta;
		this.superficie_descubierta = superficie_descubierta;
		this.localizacion = localizacion;
		this.lavadero = lavadero;
		this.descripcion = descripcion;
		this.antiguedad = antiguedad;
		this.precio = precio;
		this.banio = banio;
		this.refaccionar = refaccionar;
		this.estado = estado;
		this.dormitorio = dormitorio;
		this.cocina = cocina;
		this.apto_mascota = apto_mascota;
	}








	public int getId_inmueble() {
		return id_inmueble;
	}








	public void setId_inmueble(int id_inmueble) {
		this.id_inmueble = id_inmueble;
	}








	public String getTipo_inmueble() {
		return tipo_inmueble;
	}








	public void setTipo_inmueble(String tipo_inmueble) {
		this.tipo_inmueble = tipo_inmueble;
	}








	public boolean isDisponible() {
		return disponible;
	}








	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}








	public double getSuperficie_cubierta() {
		return superficie_cubierta;
	}








	public void setSuperficie_cubierta(double superficie_cubierta) {
		this.superficie_cubierta = superficie_cubierta;
	}








	public double getSuperficie_descubierta() {
		return superficie_descubierta;
	}








	public void setSuperficie_descubierta(double superficie_descubierta) {
		this.superficie_descubierta = superficie_descubierta;
	}








	public String getLocalizacion() {
		return localizacion;
	}








	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}








	public String getLavadero() {
		return lavadero;
	}








	public void setLavadero(String lavadero) {
		this.lavadero = lavadero;
	}








	public String getDescripcion() {
		return descripcion;
	}








	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}








	public int getAntiguedad() {
		return antiguedad;
	}








	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}








	public double getPrecio() {
		return precio;
	}








	public void setPrecio(double precio) {
		this.precio = precio;
	}








	public String getBanio() {
		return banio;
	}








	public void setBanio(String banio) {
		this.banio = banio;
	}

	public boolean isRefaccionar() {
		return refaccionar;
	}

	public void setRefaccionar(boolean refaccionar) {
		this.refaccionar = refaccionar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDormitorio() {
		return dormitorio;
	}


	public void setDormitorio(String dormitorio) {
		this.dormitorio = dormitorio;
	}


	public String getCocina() {
		return cocina;
	}


	public void setCocina(String cocina) {
		this.cocina = cocina;
	}



	public boolean isApto_mascota() {
		return apto_mascota;
	}



	public void setApto_mascota(boolean apto_mascota) {
		this.apto_mascota = apto_mascota;
	}


	public String getCondicion() {
		return condicion;
	}




	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}



	
	



	
	
	
	
	
	
	
	
}
