package test;
import controlador.InmuebleControlador; 
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Empleado;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;
public class EliminarInmueble {

		@Test
		//Eliminar Inmueble siendo Gerente. 
		//Ser gerente. Deben haber inmuebles en la base de datos e Inmuebles con el atributo isActivo()==true 
		// ya que dicho inmueble no puede corresponder a una operación en curso(sea venta o alquiler).
		
		public void eliminarInmuebleV() {
			InmuebleControlador inmuebleControlador = new InmuebleControlador();
			
		    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, true, false, false, "1200", "5"));
			
			boolean flag = false;
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
				flag = false;		//no hay inmuebles
				
			}else {
				
				int contador = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder eliminar los q no estan involucadrados en alguna operacion
					if(inmueble.isActivo()==false) {
						contador ++;
						flag = true; // si hay inmuebles disponibles para eliminar
					}	    	    
				}
				
				if (contador == 0) { 
					JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para eliminar");
					flag = false; // no hay inmuebles disponibles para eliminar
					
				}else {
					//si hay inmuebles los muestra aca
					String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
					for (int i = 0; i < opcionesInmuebles.length; i++) {
						Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
						opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
					}
					
					
					//seleccionar un inmueble
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
							}
							
						}
					}       
				}
			}
				
			
			inmuebleControlador.deleteAllInmuebles(); 
			assertEquals(true, flag);		
		}
		
		
		
		
		

		@Test
		//Eliminar Inmueble siendo Gerente. No hay inmuebles en la base de datos
		public void eliminarInmuebleF2() {
			InmuebleControlador inmuebleControlador = new InmuebleControlador();
			
			boolean flag = false;
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
				flag = false;		//no hay inmuebles
				
			}else {
				
				int contador = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder eliminar los q no estan involucadrados en alguna operacion
					if(inmueble.isActivo()==false) {
						contador ++;
						flag = true; // si hay inmuebles disponibles para eliminar
					}	    	    
				}
				
				if (contador == 0) { 
					JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para eliminar");
					flag = false; // no hay inmuebles disponibles para eliminar
					
				}else {
					//si hay inmuebles los muestra aca
					String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
					for (int i = 0; i < opcionesInmuebles.length; i++) {
						Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
						opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
					}
					
					
					//seleccionar un inmueble
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
							int eliminarInmueble;
							
							String[] preguntaEleccion = { "Si", "No" };
							eliminarInmueble = JOptionPane.showOptionDialog(null, "Desea eliminar el inmueble: ", "Eliminar Inmueble", 0,
									0, null, preguntaEleccion, preguntaEleccion[0]);
							
							if(eliminarInmueble == 0){
								// Realizar la eliminación del inmueble
								inmuebleControlador.deleteInmueble(inmuebleAEliminar.getId_inmueble());
								JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
								flag = true;		
								
							}else if(eliminarInmueble==1){
								JOptionPane.showMessageDialog(null, "No se ha eliminado el inmueble");
								flag = false;
							}
							
						}
					}       
				}
			}
	
			
			inmuebleControlador.deleteAllInmuebles(); 
			assertEquals(false, flag);
		}
		
		
		@Test
		//Eliminar Inmueble siendo Gerente. 
		//Ser gerente. Deben haber inmuebles en la base de datos e Inmuebles con el atributo isActivo()==true 
		// ya que dicho inmueble no puede corresponder a una operación en curso(sea venta o alquiler).
		//el gerente selecciona que no quiere eliminar dicho inmueble
		
		public void eliminarInmuebleF1() {
			InmuebleControlador inmuebleControlador = new InmuebleControlador();
			
		    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, true, false, false, "1200", "5"));
			
			boolean flag = false;
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
				flag = false;		//no hay inmuebles
				
			}else {
				
				int contador = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder eliminar los q no estan involucadrados en alguna operacion
					if(inmueble.isActivo()==false) {
						contador ++;
						flag = true; // si hay inmuebles disponibles para eliminar
					}	    	    
				}
				
				if (contador == 0) { 
					JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para eliminar");
					flag = false; // no hay inmuebles disponibles para eliminar
					
				}else {
					//si hay inmuebles los muestra aca
					String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
					for (int i = 0; i < opcionesInmuebles.length; i++) {
						Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
						opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
					}
					
					
					//seleccionar un inmueble
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
								
							}else if(respuestaSeleccionada==1){
								JOptionPane.showMessageDialog(null, "No se ha eliminado el inmueble");
								flag = false;
							}
							
						}
					}       
				}
			}
				
			
			inmuebleControlador.deleteAllInmuebles(); 
			assertEquals(false, flag);		
		}
		
		
		
		@Test
		//Ser gerente , hay inmuebles en la base de datos pero solo hay inmuebles con atributo inmueble.isActivo()==true
		public void eliminarInmuebleF3() {
			InmuebleControlador inmuebleControlador = new InmuebleControlador();
			
		    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, true, false, true, "1200", "5"));

			
			boolean flag = false;
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
				flag = false;		//no hay inmuebles
				
			}else {
				
				int contador = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo Activo en false, para poder eliminar los q no estan involucadrados en alguna operacion
					if(inmueble.isActivo()==false) {
						contador ++;
					}	    	    
				}
				
				if (contador == 0) { 
					JOptionPane.showMessageDialog(null, "No hay Inmuebles inactvivos para eliminar");
					flag = false;		//no hay inmuebles inactivos para poder eliminar
					
				}else {
					//si hay inmuebles los muestra aca
					String[] opcionesInmuebles = new String[inmuebleControlador.getAllInmueble().size()];
					for (int i = 0; i < opcionesInmuebles.length; i++) {
						Inmueble inmueble = inmuebleControlador.getAllInmueble().get(i);
						opcionesInmuebles[i] = "ID Inmueble: " + inmueble.getId_inmueble() + " - Dirección: " + inmueble.getDireccion()+ " - Ambientes: " +inmueble.getCantAmbientes();
					}
					
					
					//seleccionar un inmueble
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
							int eliminarInmueble;
							
							String[] preguntaEleccion = { "Si", "No" };
							eliminarInmueble = JOptionPane.showOptionDialog(null, "Desea eliminar el inmueble: ", "Eliminar Inmueble", 0,
									0, null, preguntaEleccion, preguntaEleccion[0]);
							
							if(eliminarInmueble == 0){
								// Realizar la eliminación del inmueble
								inmuebleControlador.deleteInmueble(inmuebleAEliminar.getId_inmueble());
								JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
								
							}else if(eliminarInmueble==1){
								JOptionPane.showMessageDialog(null, "No se ha eliminado el inmueble");
							}
							
						}
					}       
				}
			}
			
			inmuebleControlador.deleteAllInmuebles(); 
			assertEquals(false, flag);		
		}
	
}