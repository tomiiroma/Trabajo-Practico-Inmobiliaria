package trabajoInmobiliaria;

public class Comprador {
	private int comprador;
	private double Presupuesto;
	public Comprador(int comprador, double presupuesto) {
		super();
		this.comprador = comprador;
		Presupuesto = presupuesto;
	}
	@Override
	public String toString() {
		return "Comprador [comprador=" + comprador + ", Presupuesto=" + Presupuesto + "]";
	}
	public int getComprador() {
		return comprador;
	}
	public void setComprador(int comprador) {
		this.comprador = comprador;
	}
	public double getPresupuesto() {
		return Presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		Presupuesto = presupuesto;
	}
	
	
}
