package Interfaces;
import java.util.LinkedList;

import trabajoInmobiliaria.Agente;

public interface AgenteRepository {

	LinkedList<Agente> getAllAgente();
	
	void getAgenteById(int id);
	
	void addAgente(Agente agente);
	
	void updateAgente(Agente agente);
	
    void deleteAgente(int id); 

	
	
}
