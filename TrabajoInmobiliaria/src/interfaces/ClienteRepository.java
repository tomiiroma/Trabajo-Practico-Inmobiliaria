package interfaces;

import java.util.LinkedList;

import trabajoInmobiliaria.Cliente;

public interface ClienteRepository {
	LinkedList<Cliente> getAllCliente();
	
	void getClienteById(int id);
	
	void addCliente(Cliente Cliente);
	
	void updateCliente(Cliente cliente );
	
    void deleteCliente(int id); 
}
