package interfaces;

import java.util.List;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

	
	List<Agente> getAllAgente(); 

    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    String deleteAgente(int id); 


}