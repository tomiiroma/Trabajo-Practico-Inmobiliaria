package interfaces;

import java.util.List;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

<<<<<<< HEAD
	List<Agente> getAllEmpleados(); 
=======
	List<Agente> getAllAgente(); 
>>>>>>> mainPrueba
    
    Agente getAgenteById(int id); 
    
    void addAgente(Agente agente); 
    
    void updateAgente(Agente agente); 
    
    void deleteAgente(int id); 


}
