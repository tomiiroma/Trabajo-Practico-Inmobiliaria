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
		
		if(!inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
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
		
		if(!inmuebleControlador.getAllInmueble().isEmpty()){
			flag = true;
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
	//Seteamos el atributo de Disponible. Metodo unicamente utilizado por el Gerente
	public void activarInmueble() {
		
	}
	
	
	

	

	
}
