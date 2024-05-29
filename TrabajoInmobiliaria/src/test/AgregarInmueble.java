package test;
import controlador.InmuebleControlador; 
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Empleado;
 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;


public class AgregarInmueble {
	
	
	@Test
	//Eliminar Inmueble siendo Gerente. 
	public void eliminarInmueble() {
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
			flag = false;		//no hay inmuebles
			
		}else {
			
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder setearlo
				if(inmueble.isActivo()==false) {
					contador ++;
					flag = true; // si hay inmuebles disponibles para eliminar
				}	    	    
			}
			
			if (contador == 0) { 
				JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para eliminar");
				flag = false; // no hay inmuebles disponibles para eliminar
				
			}else {
				
				String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
				for (int i = 0; i < opcionesInmuebles.length; i++) {
					Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
					opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
				}
				
				
				
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble a Eliminar", "Eliminar Inmueble",
						JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
				
				
				if(inmuebleSeleccionado != null){
					Inmueble inmuebleAEliminar = null;
					// Buscar el inmueble seleccionado en la lista de inmuebles
					for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
						String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
						if (opcion.equals(inmuebleSeleccionado)) {
							inmuebleAEliminar = inmueble;
							break;
						}
					}
					
					if (inmuebleAEliminar != null) {
						int respuestaSeleccionada;
						
						String[] preguntaEleccion = { "Si", "No" };
						respuestaSeleccionada = JOptionPane.showOptionDialog(null, "Desea eliminar el inmueble: ", "Eliminar Inmueble", 0,
								0, null, preguntaEleccion, preguntaEleccion[0]);
						
						if(respuestaSeleccionada == 0){
							// Realizar la eliminación del inmueble
							inmuebleControlador.deleteInmueble(inmuebleAEliminar.getId_inmueble());
							JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
							flag = true;		
							
						}else if(respuestaSeleccionada==1){
							JOptionPane.showMessageDialog(null, "No se ha eliminado el inmueble");
							flag = false;
						}
						
					}
				}       
			}
		}
			
		assertEquals(true, flag);
		
	}
	
	
	@Test
	//Eliminar Inmueble siendo Gerente. 
	public void eliminarInmuebleF() {
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		if(!inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
			flag = true;
			
		}else {
			
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder setearlo
				if(inmueble.isActivo()==true) {
					contador ++;
					flag = false; // si hay inmuebles disponibles para eliminar
				}	    	    
			}
			
			if (contador == 0) { 
				JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para eliminar.");
				flag = false; // no hay inmuebles disponibles para eliminar
				
			}else {
				
				String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
				for (int i = 0; i < opcionesInmuebles.length; i++) {
					Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
					opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
				}
				
				
				
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione Inmueble a Eliminar", "Eliminar Inmueble",
						JOptionPane.QUESTION_MESSAGE, null, opcionesInmuebles, opcionesInmuebles[0]);
				
				
				if(inmuebleSeleccionado != null){
					Inmueble inmuebleAEliminar = null;
					// Buscar el inmueble seleccionado en la lista de inmuebles
					for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
						String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
						if (opcion.equals(inmuebleSeleccionado)) {
							inmuebleAEliminar = inmueble;
							break;
						}
					}
					
					if (inmuebleAEliminar != null) {
						// Realizar la eliminación del inmueble
						inmuebleControlador.deleteInmueble(inmuebleAEliminar.getId_inmueble());
						JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
						flag = true;
					}
				}       
			}
		}
			
		assertEquals(false, flag);
		
	}
	
	
	
	
	
	
	
	
}
