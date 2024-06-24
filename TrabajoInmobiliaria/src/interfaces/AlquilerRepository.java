package interfaces;

import java.util.List;  

import trabajoInmobiliaria.Alquiler;

public interface AlquilerRepository {

	List<Alquiler> getAllAlquiler(); 
    
    Alquiler getAlquilerById(int id); 
    
    void addAlquiler(Alquiler alquiler); 
    
    void updateAlquiler(Alquiler alquiler); 
    
    void deleteAlquiler(int id); 
	
	
	
	
	
	
}
