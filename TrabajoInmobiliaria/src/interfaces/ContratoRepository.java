package Interfaces;

import trabajoInmobiliaria.Contrato;

public interface ContratoRepository {
	
	void getContratoById(int id);
	
	void addContrato(Contrato Contrato);
	
    void deleteContrato(int id); 

}
