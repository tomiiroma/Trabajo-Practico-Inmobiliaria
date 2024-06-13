package interfaces;

import java.util.List;

import trabajoInmobiliaria.Comprador;

public interface CompradorRepository {

	
		//prototipos de metodos 
	    List<Comprador> getAllComprador(); 
	    
	    Comprador getCompradorById(int id); 
	    
	    void addComprador(Comprador user); 
	    
	    void updateComprador(Comprador user); 
	    
	    void deleteComprador(int id); 
	

	
	
	

	
}
