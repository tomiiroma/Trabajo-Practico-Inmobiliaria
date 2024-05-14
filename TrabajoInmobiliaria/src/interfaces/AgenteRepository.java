package interfaces;

import java.util.List;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {
	
	
	
	List<Agente> getAllComprador(); 
    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    void deleteAgente(int id); 
	
	
	

}