package Interfaces;

import java.util.List; 
package interfaces;
import java.util.LinkedList;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

	
	List<Agente> getAllAgente(); 

    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    void deleteAgente(int id); 


}
