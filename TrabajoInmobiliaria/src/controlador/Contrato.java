package controlador;

import java.util.List;

import interfaces.ContratoRepository;

public class Contrato {
	//prototipos de metodos 
    List<Contrato> getAllContrato(); // llama a todos los usuarios de la bdd
    
    ContratoAlquiler getContratoById(int id); //llama solo a uno, por su id
    
    void addGerente(Contrato contrato); //añade usuarios a la bdd
    
    void updateGerente(Contrato contrato); //actualiza los usuarios de la bdd
    
    void deleteGerente(int id); //eliminar usuarios de la bdd

}
