package interfaces;

import java.util.List; 
import trabajoInmobiliaria.Inmueble;

public interface InmuebleRepository {
    
    List<Inmueble> getAllInmueble();
    
    Inmueble getInmuebleById(int id);
    
    void addInmueble(Inmueble inmueble);
    
    void updateInmueble(Inmueble inmueble);
    
    void deleteInmueble(int id);
}
