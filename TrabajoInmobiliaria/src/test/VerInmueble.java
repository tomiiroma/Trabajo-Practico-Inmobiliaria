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
		
		boolean flag = true;
		
		if(!inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
		}
		
		if(flag){
			System.out.println("Ver lista De Inmuebles");
		}
		
		assertEquals(true, flag);

	}
	
	@Test
	//ver lista de inmuebles sin inmuebles en la base de datos
	public void verlistaCompletaInmueblesF(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = true;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
		}
		
		if(flag){
			System.out.println("No hay inmuebles cargados en la base de datos");
		}
		
		assertEquals(false, flag);
	}
	
	

	
	@Test
	//ver lista de inmuebles Disponibles 
	public void verlistaInmueblesDisponiblesV(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = true;
		
		if(!inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
		}
		
		
		for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
		    if(inmueble.isDisponible() == true && inmueble.isActivo() == true) {
		    	flag = true;
		    }
		}
		
		if(flag){
			System.out.println("Mostrar Inmuebles disponibles");
		}
		
		assertEquals(true, flag);
	}

	
	@Test
	//ver lista de inmuebles Disponibles. No hay inmuebles cargados
	public void verlistaInmueblesDisponiblesF1(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = true;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
		}
		
		/* Si no hay inmubles no estaria esto tampoco
		 
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if(inmueble.isDisponible() == true && inmueble.isActivo() == true) {
			    	flag = true;
			    }
			}
		*/	
		if(flag){
			System.out.println("No hay inmuebles");
		}
		
		assertEquals(false, flag);
	}
	
	@Test
	//Hay inmuebles en la base de datos. Pero el atributo Disponible seteado en True y atributo Activo Seteado en False.
	public void verlistaInmueblesDisponiblesF2(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = true;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag = false;
		}
		
		 
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if(inmueble.isDisponible() == true && inmueble.isActivo() == false) {
			    	flag = true;
			    }
			}
		
			
		if(flag){
			System.out.println("no hay inmuebles disponibles");
		}
		
		assertEquals(false, flag);
	}
	
	
	@Test
	//Hay inmuebles en la base de datos. Pero el atributo Disponible seteado en False y atributo Activo Seteado en True.
	public void verlistaInmueblesDisponiblesF3(){
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = true;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag = false;
		}
		
		 
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
			    if(inmueble.isDisponible() == false && inmueble.isActivo() == true) {
			    	flag = true;
			    }
			}
		
			
		if(flag){
			System.out.println("No Hay inmuebles disponibles");
		}
		
		assertEquals(false, flag);
	}
	
	
	
	
	
	@Test
	//Activamos el inmueble seteando el atributo de Disponible. Metodo unicamente utilizado por el Gerente ||||| para q funcione deben haber inmuebles cargados por agente con inmuebles con atributo seteados en isDisponible()== false
	public void activarInmuebleV() {	
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			//no hay inmuebles disponibles
			flag = false;
		}
			
		
		int contador = 0;
		for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
		    if(inmueble.isDisponible()==false) {
	            contador ++;
		    	flag = true; // si hay inmuebles para activar
		    }	    	    
		}
		
	    if (contador == 0) { 
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
	    			boolean activo = obtenerDisponible();
	    			
	    			if(activo){	            		
	    				inmueble.setDisponible(true);
	    				inmuebleControlador.updateInmueble(inmueble);
	    				System.out.println("Felicidades! El inmueble ya se encuentra Disponible");
	    				flag = true;
	    			}else {
	    				System.out.println("El inmueble no se ha activado");
	    			}
	    		}	        
	    	}
	    }
	    
	    

		assertEquals(true, flag);
	}
	
	
	@Test
	//Activar Inmueble. No hay Inmuebles en la base de datos
	public void activarInmuebleF() {	
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag = false;
			JOptionPane.showMessageDialog(null, "No hay inmuebles en base de datos");
		}
	
	/*	
		int contador = 0;
		for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
		    if(inmueble.isDisponible()==false) {
	            contador ++;
		    	flag = true; // si hay inmuebles para activar
		    }	    	    
		}
		
	    if (contador == 0) { 
	        JOptionPane.showMessageDialog(null, "No hay Inmuebles por activar");
	        flag = false; // no hay inmuebles para activar
	    }
	    
	    
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
	        	  boolean activo = obtenerDisponible();
	            	
	            if(activo){	            		
	            	inmueble.setDisponible(true);
	            	inmuebleControlador.updateInmueble(inmueble);
	            	System.out.println("Felicidades! El inmueble ya se encuentra Disponible");
	            	flag = true;
	            }else {
	            	System.out.println("Error! No se pudo realizar la operacion");
	            }
	          }	        
	    }
	*/
		assertEquals(false, flag);
	}
	
	
	@Test
	//Hay inmuebles en la base de datos pero no hay Inmuebles con el atributo isDisponible() == true. Metodo unicamente utilizado por el Gerente ||||| para q funcione deben haber inmuebles cargados por agente con inmuebles con atributo seteados en isDisponible()== false
	public void activarInmuebleF2() {	
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
	        JOptionPane.showMessageDialog(null, "No hay Inmuebles en la base de datos");
			flag = true;
		}
			
		
		int contador = 0;
		for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo disponible en false, para poder setearlo
		    if(!inmueble.isDisponible()==false) {
	            contador ++;
		    	flag = false; // no hay inmuebles para activar
		    }	    	    
		}
		
	    if (contador == 0) { 
	        JOptionPane.showMessageDialog(null, "No hay Inmuebles por activar");
	        flag = false; // no hay inmuebles para activar
	        
	    }
	        /*
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
	    			boolean activo = obtenerDisponible();
	    			
	    			if(activo){	            		
	    				inmueble.setDisponible(true);
	    				inmuebleControlador.updateInmueble(inmueble);
	    				System.out.println("Felicidades! El inmueble ya se encuentra Disponible");
	    				flag = true;
	    				
	    			}else {
	    				
	    				inmueble.setDisponible(false);
	    				JOptionPane.showMessageDialog(null, "El inmueble sigue sin estar Disponible");	 
	    			}
	    		}	      
	    	}
	    }
	         */
	    
		assertEquals(false, flag);
	}
	
	
	
	

	
	public boolean obtenerDisponible() {
	    String[] disponibleSeleccion = { "Si","No"};
	    String seleccion = null;
	    boolean confirmacion = false;
	    
	    do {		
		    	 seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble se encuentra en condiciones para habilitarlo?",
		    			"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, disponibleSeleccion, disponibleSeleccion[0]);
		    	 
		    	if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		confirmacion = true;
		    	}				
			
	    
	    } while (confirmacion == false);
	    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}
	

	
}
