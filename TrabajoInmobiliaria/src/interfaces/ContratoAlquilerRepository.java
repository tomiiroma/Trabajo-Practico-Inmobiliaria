package interfaces;

import java.util.List;

import trabajoInmobiliaria.ContratoAlquiler;

public interface ContratoAlquilerRepository {
	   List<ContratoAlquiler> getAllContratoAlquiler(); 
	    
	   ContratoAlquiler getContratoAlquilerById(int id); 
	    
	    void addContratoAlquiler(ContratoAlquiler contratoAlquiler); 
	    
	    void updateContratoAlquiler(ContratoAlquiler contratoAlquiler); 
	    
	    void deleteContratoAlquiler(int id); 

}
