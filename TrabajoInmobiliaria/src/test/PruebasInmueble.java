package test;
import controlador.InmuebleControlador;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;



public class PruebasInmueble {


	
	@Test
	//ver lista de inmuebles correctamente
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
		
		if(!flag){
			System.out.println("Ver lista De Inmuebles");
		}
		
		assertEquals(false, flag);
	}
	
	
	
	
	
}
