package interfaces;

import java.util.List;

import trabajoInmobiliaria.Empleado;

public interface EmpleadoRepository {

		   List<Empleado> getAllEmpleados(); 
		    
		   Empleado getEmpleadoById(int id); 
		    
		    void addEmpleado(Empleado empleado); 
		    
		    void updateEmpleado(Empleado empleado); 
		    
		    void deleteEmpleado(int id); 	
	
}
