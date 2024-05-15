package interfaces;

import java.util.List;

import trabajoInmobiliaria.ContratoVenta;

public interface ContratoVentaRepository {
	   List<ContratoVenta> getAllContratoVenta(); 
	    
	   ContratoVenta getContratoVentaById(int id); 
	    
	    void addContratoVenta(ContratoVenta contratoVenta); 
	    
	    void updateContratoVenta(ContratoVenta contratoVenta); 
	    
	    void deleteContratoVenta(int id); 
}
