package interfaces;

import java.util.List;

import trabajoInmobiliaria.Reserva;

public interface ReservaControladorRepository {
	
	
	//prototipos de metodos 
    List<Reserva> getAllReserva(); 
    
    Reserva getReservaById(int id); 
    
    void addReserva(Reserva reserva); 
    
    void updateReserva(Reserva reserva); 
    
    void deleteReserva(int id); 

}
