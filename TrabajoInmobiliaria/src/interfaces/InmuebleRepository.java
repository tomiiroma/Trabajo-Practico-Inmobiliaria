package interfaces;

import java.util.List;

import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;

public interface InmuebleRepository {
	
	//prototipos de metodos 
    List<Inmueble> getAllInmueble(); 
    
    Inmueble getInmuebleById(int id); 
    
    void addInmueble(Inmueble inmueble); 
    
    void updateInmueble(Inmueble inmueble); 
    
    void deleteInmueble(int id); 

}
