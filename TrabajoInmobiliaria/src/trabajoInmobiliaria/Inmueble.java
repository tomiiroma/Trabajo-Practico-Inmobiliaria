
package trabajoInmobiliaria;

public class Inmueble {

	private int id_inmueble;
	private String tipo_inmueble;
	private String condicion;
	private String cantAmbientes;
	private String piso;
	private String barrio;
	private String direccion;
	private String descripcion;
	private String antiguedad;
	private String banio;
	private String dormitorio;
	private double superficie_cubierta;
	private double superficie_descubierta;
	private double precio;
	private boolean disponible;
	private boolean refaccionar;
	private boolean apto_mascota;
	private boolean patio;
	private boolean activo;
	private String alturaDireccion;
	private String nroDepto;







	public Inmueble(int id_inmueble, String tipo_inmueble, String condicion, String cantAmbientes, String piso,
			String barrio, String direccion, String descripcion, String antiguedad, String banio, String dormitorio,
			double superficie_cubierta, double superficie_descubierta, double precio, boolean disponible,
			boolean refaccionar, boolean apto_mascota, boolean patio, boolean activo, String alturaDireccion,
			String nroDepto) {
		super();
		this.id_inmueble = id_inmueble;
		this.tipo_inmueble = tipo_inmueble;
		this.condicion = condicion;
		this.cantAmbientes = cantAmbientes;
		this.piso = piso;
		this.barrio = barrio;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.antiguedad = antiguedad;
		this.banio = banio;
		this.dormitorio = dormitorio;
		this.superficie_cubierta = superficie_cubierta;
		this.superficie_descubierta = superficie_descubierta;
		this.precio = precio;
		this.disponible = disponible;
		this.refaccionar = refaccionar;
		this.apto_mascota = apto_mascota;
		this.patio = patio;
		this.activo = activo;
		this.alturaDireccion = alturaDireccion;
		this.nroDepto = nroDepto;
	}


	public Inmueble() {
		
	}


	public Inmueble(int fkInmuebleId) {
		// TODO Auto-generated constructor stub
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




	public String getCondicion() {
		return condicion;
	}




	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}




	public String getCantAmbientes() {
		return cantAmbientes;
	}




	public void setCantAmbientes(String cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}




	public String getPiso() {
		return piso;
	}




	public void setPiso(String piso) {
		this.piso = piso;
	}




	public String getBarrio() {
		return barrio;
	}




	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public String getAntiguedad() {
		return antiguedad;
	}




	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}




	public String getBanio() {
		return banio;
	}




	public void setBanio(String banio) {
		this.banio = banio;
	}




	public String getDormitorio() {
		return dormitorio;
	}




	public void setDormitorio(String dormitorio) {
		this.dormitorio = dormitorio;
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




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public boolean isDisponible() {
		return disponible;
	}




	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}




	public boolean isRefaccionar() {
		return refaccionar;
	}




	public void setRefaccionar(boolean refaccionar) {
		this.refaccionar = refaccionar;
	}




	public boolean isApto_mascota() {
		return apto_mascota;
	}




	public void setApto_mascota(boolean apto_mascota) {
		this.apto_mascota = apto_mascota;
	}




	public boolean isPatio() {
		return patio;
	}




	public void setPatio(boolean patio) {
		this.patio = patio;
	}




	public boolean isActivo() {
		return activo;
	}




	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	


	public String getAlturaDireccion() {
		return alturaDireccion;
	}


	public void setAlturaDireccion(String alturaDireccion) {
		this.alturaDireccion = alturaDireccion;
	}


	public String getNroDepto() {
		return nroDepto;
	}


	public void setNroDepto(String nroDepto) {
		this.nroDepto = nroDepto;
	}


	@Override
	public String toString() {
		return "\nLista de Inmuebles"+"\n"
				+ "\nId de Inmueble:" + id_inmueble 
				+ "\nTipo de Inmueble: " + tipo_inmueble
				+"\nPiso: "+piso
				+"\nNro Departameno: "+nroDepto
				+"\nCantidad de Ambientes: "+cantAmbientes
				+ "\nCondición: " + condicion
				+ "\nDisponibilidad: " + disponible 
				+ "\nm2 superficie cubierta: " + superficie_cubierta
				+ "\nm2 superficie descubierta: " + superficie_descubierta 
				+ "\nBarrio: " + barrio 
				+"\nDireccion del Inmueble: "+direccion
				+"\nAltura Direccion"
				+ "\nPatio: "+ patio 
				+ "\nDescripción: " + descripcion 
				+ "\nAños de antiguedad: " + antiguedad 
				+ "\nPrecio del inmueble: " + precio
				+ "\nCantidad de Baños: " + banio 
				+ "\nSe debe refaccionar: " + refaccionar 
				+ "\nCantidad de Dormitorios: "+ dormitorio 
				+ "\nEs apto para mascota: " + apto_mascota
				+"\nInmueble Activo: "+activo;
	}


	
	
	
}
