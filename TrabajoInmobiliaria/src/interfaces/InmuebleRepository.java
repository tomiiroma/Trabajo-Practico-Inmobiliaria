package interfaces;

<<<<<<< HEAD
=======
import java.util.LinkedList;
>>>>>>> dfc8f0e8d47d152c909565a21c38ea5f77334c97
import java.util.List;

import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;

public interface InmuebleRepository {
	
<<<<<<< HEAD
	//prototipos de metodos 
    List<Inmueble> getAllInmueble(); 
    
    Inmueble getInmuebleById(int id); 
    
    void addInmueble(Inmueble inmueble); 
    
    void updateInmueble(Inmueble inmueble); 
    
=======
	List<Inmueble> getAllInmueble();
	
	void getInmuebleById(int id);
	
	void addInmueble(Inmueble Inmueble);
	
	void updateInmueble(Inmueble Inmueble );
	
>>>>>>> dfc8f0e8d47d152c909565a21c38ea5f77334c97
    void deleteInmueble(int id); 

}
