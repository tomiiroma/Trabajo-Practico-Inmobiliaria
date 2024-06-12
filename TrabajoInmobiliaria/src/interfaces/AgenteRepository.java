<<<<<<< HEAD
package Interfaces;

import java.util.List;
=======
package interfaces;
import java.util.LinkedList;
>>>>>>> dfc8f0e8d47d152c909565a21c38ea5f77334c97

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

	
	List<Agente> getAllAgente(); 

    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    void deleteAgente(int id); 


}
