package interfaces;

import java.util.List;

import trabajoInmobiliaria.ContratoAlquiler;
import trabajoInmobiliaria.Gerente;

public interface ContratoAlquilerControladorRepository {
	
	
	//prototipos de metodos 
    List<ContratoAlquiler> getAllGerente(); // llama a todos los usuarios de la bdd
    
    Gerente getGerenteById(int id); //llama solo a uno, por su id
    
    void addGerente(Gerente user); //añade usuarios a la bdd
    
    void updateGerente(Gerente user); //actualiza los usuarios de la bdd
    
    void deleteGerente(int id); //eliminar usuarios de la bdd

}
