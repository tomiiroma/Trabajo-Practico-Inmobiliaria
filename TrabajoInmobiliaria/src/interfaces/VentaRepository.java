package interfaces;

import java.util.List;

import trabajoInmobiliaria.Venta;

public interface VentaRepository {

	
	List<Venta> getAllVentas(); 
    
    Venta getVentaById(int id); 
    
    void addVenta(Venta Venta); 
    
    void updateVenta(Venta venta); 
    
    void deleteVenta(int id); 
	
	
	
	
}
