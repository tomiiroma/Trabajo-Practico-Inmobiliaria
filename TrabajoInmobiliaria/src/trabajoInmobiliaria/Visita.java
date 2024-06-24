package trabajoInmobiliaria;

import java.time.LocalDate;

public class Visita {
	
	private int id_visita;
	private Inmueble inmueble;
	private Cliente cliente;
	private LocalDate fecha_visita;
    private Empleado empleado;
	public Visita(int id_visita, Inmueble inmueble, Cliente cliente, LocalDate fecha_visita, Empleado empleado) {
		super();
		this.id_visita = id_visita;
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.fecha_visita = fecha_visita;
		this.empleado = empleado;
	}
	public int getId_visita() {
		return id_visita;
	}
	public void setId_visita(int id_visita) {
		this.id_visita = id_visita;
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
	public LocalDate getFecha_visita() {
		return fecha_visita;
	}
	public void setFecha_visita(LocalDate fecha_visita) {
		this.fecha_visita = fecha_visita;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

    
    
    
    


	
	
}
