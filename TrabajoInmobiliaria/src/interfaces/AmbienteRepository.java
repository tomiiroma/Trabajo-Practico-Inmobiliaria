package interfaces;

import java.util.List;

import trabajoInmobiliaria.Ambiente;

public interface AmbienteRepository {
	
	//prototipos de metodos 
    List<Ambiente> getAllAmbiente(); 
    
    Ambiente getAmbienteById(int id); 
    
    void addAmbiente(Ambiente ambiente); 
    
    void updateAmbiente(Ambiente ambiente); 
    
    void deleteAmbiente(int id); 

}
