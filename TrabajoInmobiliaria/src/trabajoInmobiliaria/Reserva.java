package trabajoInmobiliaria;

import java.time.LocalDate;

public class Reserva {
	
	private int id_reserva;
	private Inmueble inmueble;
	private Cliente cliente;
	private LocalDate fecha_pago;
	private double pago;
    private String forma_pago;
    private Empleado empleado;
    private String tipo_reserva;
    private Propietario propietario;
    
    
	public Reserva(Inmueble inmueble, Cliente cliente, LocalDate fecha_pago, double pago,
			String forma_pago, Empleado empleado, String tipo_reserva) {
		super();
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.fecha_pago = fecha_pago;
		this.pago = pago;
		this.forma_pago = forma_pago;
		this.empleado = empleado;
		this.tipo_reserva = tipo_reserva;
	}

	
	public Reserva(int id_reserva, Inmueble inmueble, Cliente cliente, LocalDate fecha_pago, double pago,
			String forma_pago, Empleado empleado, String tipo_reserva, Propietario propietario) {
		super();
		this.id_reserva = id_reserva;
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.fecha_pago = fecha_pago;
		this.pago = pago;
		this.forma_pago = forma_pago;
		this.empleado = empleado;
		this.tipo_reserva = tipo_reserva;
		this.propietario = propietario;
	}

	public Reserva() {
		
	}





	public Reserva(
			int id_reserva, 
			Inmueble inmueble, 
			Cliente cliente, 
			LocalDate fecha_pago, 
			double pago,
			String forma_pago, 
			Empleado empleado, 
			String tipo_reserva) {
		super();
		this.id_reserva = id_reserva;
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.fecha_pago = fecha_pago;
		this.pago = pago;
		this.forma_pago = forma_pago;
		this.empleado = empleado;
		this.tipo_reserva = tipo_reserva;
	}
	

	


	public Propietario getPropietario() {
		return propietario;
	}





	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}












	@Override
	public String toString() {
		return "ID inmueble: " + inmueble.getId_inmueble() 
			   +", Tipo inmueble: " + inmueble.getTipo_inmueble() 
			   +", Dirección: " + inmueble.getDireccion()+" "+inmueble.getAlturaDireccion() 
			   +", Nombre: " + cliente.getNombre()+" "+ cliente.getApellido() 
			   +", Dni: " + cliente.getDni() 
			   +", Fecha pago: " + fecha_pago 
			   +", Monto: $"+ pago 
			   +", Forma pago: " + forma_pago ;
	}




	public Inmueble getInmueble() {
		return inmueble;
	}




	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public LocalDate getFecha_pago() {
		return fecha_pago;
	}




	public void setFecha_pago(LocalDate fecha_pago) {
		this.fecha_pago = fecha_pago;
	}




	public double getPago() {
		return pago;
	}




	public void setPago(double pago) {
		this.pago = pago;
	}




	public String getForma_pago() {
		return forma_pago;
	}




	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}




	public Empleado getEmpleado() {
		return empleado;
	}




	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}




	public String getTipo_reserva() {
		return tipo_reserva;
	}




	public void setTipo_reserva(String tipo_reserva) {
		this.tipo_reserva = tipo_reserva;
	}






	public int getId_reserva() {
		return id_reserva;
	}






	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	

	



	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 /* ------------------------------------------------------------------------------ CONSTRUCTOR VIEJO ------------------------------------------------------------------------------------------------------------ */   
 
	/*	private LocalDate fecha_expiracion; */
	/*	private Comprador comprador;
	private Inquilino inquilino; */
	/*private Boolean estadoreserva; */
	
	/*public Reserva(Inmueble inmueble, LocalDate fecha_reserva, LocalDate fecha_expiracion, double pago,
			Comprador comprador, Inquilino inquilino, Boolean estadoreserva) {
		super();
		this.inmueble = inmueble;
		this.fecha_reserva = fecha_reserva;       
		this.fecha_expiracion = fecha_expiracion; 
		this.pago = pago;
		this.comprador = comprador;
		this.inquilino = inquilino;               
		this.estadoreserva = estadoreserva;       
	}*/
	
	


	
	
}
