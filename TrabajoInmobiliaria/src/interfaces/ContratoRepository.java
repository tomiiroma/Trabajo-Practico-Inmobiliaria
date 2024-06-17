package interfaces;

import java.util.List; 

import trabajoInmobiliaria.Contrato;

public interface ContratoRepository {

	   List<Contrato> getAllContrato(); 
	    
	   Contrato getContratoById(int id); 
	    
	    void addContrato(Contrato contrato); 
	    
	    void updateContrato(Contrato contrato); 
	    
	    void deleteContrato(int id); 

}
