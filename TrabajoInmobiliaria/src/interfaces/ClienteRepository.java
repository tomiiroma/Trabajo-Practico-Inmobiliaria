package interfaces;

import java.util.List; 

import trabajoInmobiliaria.Alquiler;
import trabajoInmobiliaria.Cliente;

public interface ClienteRepository {

	
	
	
List<Cliente> getAllClientes(); 
    
    Cliente getClienteById(int id); 
    
}
