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
		
		//                                                                                                                                                                      precio,disponible,                  
	    inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "2", "Agronomia", "corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, false, false, false, false, false, "1200", "5"));
		boolean flag = false;
		
		if(inmuebleControlador.getAllInmueble().isEmpty()){
			System.out.println("No hay inmuebles en la base de datos");
			flag = false;
			
		}else {

		}
		
		
		
			
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(true, flag);		
	}
	
	
	


	
}
