package Interfaces;

import java.util.LinkedList;

import trabajoInmobiliaria.Inmueble;

public interface InmuebleRepository {
	
	LinkedList<Inmueble> getAllInmueble();
	
	void getInmuebleById(int id);
	
	void addInmueble(Inmueble Inmueble);
	
	void updateInmueble(Inmueble Inmueble );
	
    void deleteInmueble(int id); 
}
