package test;
import controlador.InmuebleControlador;   
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Empleado;
 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;



public class VerInmueble {


	
	@Test
	//ver lista de inmuebles correctamente(Si hay inmuebles en la base de datos)
	public void verlistaCompletaInmueblesV(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, true, false, false, "1200", "5"));

		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay Inmuebles en la base de datos");
			flag = false;
		
		}else {
			flag = true;
			JOptionPane.showMessageDialog(null, "Se muestra la lista de Inmuebles correctamente");
		}
		

		
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(true, flag);
	}
	
	
	
	@Test
	//ver lista de inmuebles sin inmuebles en la base de datos
	public void verlistaCompletaInmueblesF(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		inmuebleControlador.deleteAllInmuebles(); 
		
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles cargados en la base de datos");
			flag = false;
		}else {
			JOptionPane.showMessageDialog(null, "Inmuebles");
		}
		
		assertEquals(false, flag);
	}
	
	
//**********************************************************************
	
	@Test
	//ver lista de inmuebles Disponibles 
	public void verlistaInmueblesDisponiblesV(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		//                                                                                                                                                                      precio,disponible,                 ,activo 
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, false, "1200", "5"));
	
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
			flag = false;	
		}else {
			
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.isDisponible() == true && inmueble.isActivo() == false) {
					flag = true;
					
				}else if(inmueble.isDisponible() == false && inmueble.isActivo() == false){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para msotrar");
					
				}else if(inmueble.isDisponible() == true && inmueble.isActivo() == true){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para mostrar 2");
				}
			}	
		}
		
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(true, flag);
	}

	
	@Test
	//ver lista de inmuebles Disponibles. No hay inmuebles cargados en la base de datos
	public void verlistaInmueblesDisponiblesF1(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		inmuebleControlador.deleteAllInmuebles(); 
			
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
			flag = false;	
		}else {		
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.isDisponible() == true && inmueble.isActivo() == false) {
					flag = true;
					
				}else if(inmueble.isDisponible() == false && inmueble.isActivo() == false){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para msotrar");
					
				}else if(inmueble.isDisponible() == true && inmueble.isActivo() == true){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para mostrar 2");
				}
			}
		}
		
		assertEquals(false, flag);
	}
	
	@Test
	//Hay inmuebles en la base de datos. Pero el atributo Disponible seteado en False
	public void verlistaInmueblesDisponiblesF2(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		//                                                                                                                                                                      precio,disponible,                  ,activo 
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, false, false, false, false, false, "1200", "5"));
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles en la base de datos");
			flag = false;
			
		}else {
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.isDisponible() == true && inmueble.isActivo() == false) {
					flag = true;
					
				}else if(inmueble.isDisponible() == false && inmueble.isActivo() == false){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para mostrar 1");
					
				}else if(inmueble.isDisponible() == true && inmueble.isActivo() == true){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para mostrar 2");
				}
			}
			
		}
		
		
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(false, flag);
	}
	
	
	@Test
	//Hay inmuebles en la base de datos. Pero el atributo Disponible seteado en True y atributo Activo Seteado en True.
	public void verlistaInmueblesDisponiblesF3(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		
		//                                                                                                                                                                        precio,disponible,                 ,activo 
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, true, "1200", "5"));
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles en la base de datos");
			flag = false;
			
		}else {
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.isDisponible() == true && inmueble.isActivo() == false) {
					flag = true;
					
				}else if(inmueble.isDisponible() == false && inmueble.isActivo() == false){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para msotrar");
					
				}else if(inmueble.isDisponible() == true && inmueble.isActivo() == true){
					flag = false;
					JOptionPane.showMessageDialog(null, "No hay inmuebles disponibles para mostrar 2");
				}
			}
			
		}
			
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(false, flag);
	}
	
	
	
	
	@Test
	// Activar Inmuebles cargados por Agente
	// Ser gerente y además deben haber inmuebles en la base de datos Inmuebles con el atributo isDisponible()==false.
	public void activarInmuebleV() {
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		//                                                                                                                                                                            disponible,                  
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, false, false, false, false, false, "1200", "5"));
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles en la base de datos");
			flag = false;
			
		}else {
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
				if(inmueble.isDisponible()==false) {
					contador ++;
					flag = true;
				}	    	    
			}
			
			if(contador==0){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles por activar");
				flag = false; // no hay inmuebles para activar
			}else {
				
			//Imprimimos los inmuebles ---con atributo Disponible seteado en False
				
				String[] opcionesInmuebles = new String[contador];
				int index = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if (inmueble.isDisponible()==false) {
						opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
														" - Dirección: " + inmueble.getDireccion() +
														" - Ambientes: " + inmueble.getCantAmbientes();
					}
				}
				
				//seleccion del gerente
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,
						"Seleccione Inmueble para activar","Activar Inmueble", JOptionPane.QUESTION_MESSAGE,null, opcionesInmuebles,opcionesInmuebles[0]);
				
				
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
									" - Dirección: " + inmueble.getDireccion() +
									" - Ambientes: " + inmueble.getCantAmbientes();
													
		    		if (opcion.equals(inmuebleSeleccionado)) {	
		    			
		    			int activarInmueble;
						String[] preguntaEleccion = { "Si", "No" };
						activarInmueble = JOptionPane.showOptionDialog(null, "Desea activar el inmueble: ", "Eliminar Inmueble", 0,
								0, null, preguntaEleccion, preguntaEleccion[0]);
						
						if(activarInmueble == 0){
							// Realizar la eliminación del inmueble
		    				inmueble.setDisponible(true);
		    				inmuebleControlador.updateInmueble(inmueble);
							JOptionPane.showMessageDialog(null, "El Inmueble ha sido activado Correctamente");
							flag = true;
							
						}else if(activarInmueble==1){
							JOptionPane.showMessageDialog(null, "El inmueble no ha sido activado");
						}else {
							JOptionPane.showMessageDialog(null, "Opcion no valida");
						}
		    		}
				}
			}						
		}					
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(true, flag);		
	}
	
	
	
	@Test
	// Activar Inmuebles cargados por Agente
	// Ser gerente y además no haber inmuebles en la base de datos
	public void activarInmuebleF1() {
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		//                                                                                                                                                                            disponible,                  
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay inmuebles cargados en la base de datos - - - metodo activar inmuebles");
			flag = false;
			
		}else {
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
				if(inmueble.isDisponible()==false) {
					contador ++;
					flag = true;
				}	    	    
			}
			
			if(contador==0){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles por activar");
				flag = false; // no hay inmuebles para activar
			}else {
				
			//Imprimimos los inmuebles ---con atributo Disponible seteado en False
				
				String[] opcionesInmuebles = new String[contador];
				int index = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if (inmueble.isDisponible()==false) {
						opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
														" - Dirección: " + inmueble.getDireccion() +
														" - Ambientes: " + inmueble.getCantAmbientes();
					}
				}
				
				//seleccion del gerente
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,
						"Seleccione Inmueble para activar","Activar Inmueble", JOptionPane.QUESTION_MESSAGE,null, opcionesInmuebles,opcionesInmuebles[0]);
				
				
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
									" - Dirección: " + inmueble.getDireccion() +
									" - Ambientes: " + inmueble.getCantAmbientes();
													
		    		if (opcion.equals(inmuebleSeleccionado)) {	
		    			
		    			int activarInmueble;
						String[] preguntaEleccion = { "Si", "No" };
						activarInmueble = JOptionPane.showOptionDialog(null, "Desea activar el inmueble: ", "Eliminar Inmueble", 0,
								0, null, preguntaEleccion, preguntaEleccion[0]);
						
						if(activarInmueble == 0){
							// Realizar la eliminación del inmueble
		    				inmueble.setDisponible(true);
		    				inmuebleControlador.updateInmueble(inmueble);
							JOptionPane.showMessageDialog(null, "El Inmueble ha sido activado Correctamente");
							flag = true;
							
						}else if(activarInmueble==1){
							JOptionPane.showMessageDialog(null, "El inmueble no ha sido activado");
						}else {
							JOptionPane.showMessageDialog(null, "Opcion no valida");
						}
		    		}
				}
			}						
		}					
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(false, flag);		
	}
	

	@Test
	// Activar Inmuebles cargados por Agente
	// Ser gerente y deben haber inmuebles en la base de datos e Inmuebles con el atributo isDisponible() == true.
	public void activarInmuebleF2() {
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		//                                                                                                                                                                            disponible,                  
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, false, "1200", "5"));
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles en la base de datos");
			flag = false;
			
		}else {
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
				if(inmueble.isDisponible()==false) {
					contador ++;
					flag = true;
				}	    	    
			}
			
			if(contador==0){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles por activar");
				flag = false; // no hay inmuebles para activar
			}else {
				
			//Imprimimos los inmuebles ---con atributo Disponible seteado en False
				
				String[] opcionesInmuebles = new String[contador];
				int index = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if (inmueble.isDisponible()==false) {
						opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() +
														" - Dirección: " + inmueble.getDireccion() +
														" - Ambientes: " + inmueble.getCantAmbientes();
					}
				}
				
				//seleccion del gerente
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,
						"Seleccione Inmueble para activar","Activar Inmueble", JOptionPane.QUESTION_MESSAGE,null, opcionesInmuebles,opcionesInmuebles[0]);
				
				
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					String opcion = "ID Inmueble: " + inmueble.getId_inmueble() +
									" - Dirección: " + inmueble.getDireccion() +
									" - Ambientes: " + inmueble.getCantAmbientes();
													
		    		if (opcion.equals(inmuebleSeleccionado)) {	
		    			
		    			int activarInmueble;
						String[] preguntaEleccion = { "Si", "No" };
						activarInmueble = JOptionPane.showOptionDialog(null, "Desea activar el inmueble: ", "Eliminar Inmueble", 0,
								0, null, preguntaEleccion, preguntaEleccion[0]);
						
						if(activarInmueble == 0){
							// Realizar la eliminación del inmueble
		    				inmueble.setDisponible(true);
		    				inmuebleControlador.updateInmueble(inmueble);
							JOptionPane.showMessageDialog(null, "El Inmueble ha sido activado Correctamente");
							flag = true;
							
						}else if(activarInmueble==1){
							JOptionPane.showMessageDialog(null, "El inmueble no ha sido activado");
						}else {
							JOptionPane.showMessageDialog(null, "Opcion no valida");
						}
		    		}
				}
			}						
		}					
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(false, flag);		
	}

	
}
