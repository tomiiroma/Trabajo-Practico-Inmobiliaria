package interfaces;

import java.util.List;

import trabajoInmobiliaria.Garante;

public interface GaranteRepository {
	
	
		//prototipos de metodos 
	    List<Garante> getAllGarante(); // llama a todos los usuarios de la bdd
	    
	    Garante getGaranteById(int id); //llama solo a uno, por su id
	    
	    void addGarante(Garante user); //añade usuarios a la bdd
	    
	    void updateGarante(Garante user); //actualiza los usuarios de la bdd
	    
	    void deleteGarante(int id); //eliminar usuarios de la bdd
	

	
	
	
}
