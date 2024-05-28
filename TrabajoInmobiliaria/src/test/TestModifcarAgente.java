package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Empleado;

public class TestModifcarAgente {

	
	
	
		  @DisplayName("Agregar agente sin errores")
		  @Test	
		 public void AgregarAgenteVerdadero() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente.SelectorAgente();
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Cobra", "asdd", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = true;
			 		
			 		
			 		
			 	}
			
			 assertEquals(true,flag);
			 	
		 }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
