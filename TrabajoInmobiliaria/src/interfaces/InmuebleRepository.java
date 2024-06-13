package interfaces;


import java.util.LinkedList; 
import java.util.List;

import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;

public interface InmuebleRepository {
	
    
	List<Inmueble> getAllInmueble();
	
	void getInmuebleById(int id);
	
	void addInmueble(Inmueble Inmueble);
	
	void updateInmueble(Inmueble Inmueble );
	
    void deleteInmueble(int id); 

}
