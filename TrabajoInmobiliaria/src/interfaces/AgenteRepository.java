package interfaces;

import java.util.List;  
import java.util.LinkedList;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

	
	List<Agente> getAllAgente(); 

    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    void deleteAgente(int id); 


}
