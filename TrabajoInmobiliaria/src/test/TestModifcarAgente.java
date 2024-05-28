package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Empleado;
import controlador.AgenteControlador;
public class TestModifcarAgente {

	
	
	
		  @DisplayName("Modificar agente sin errores")
		  @Test	
		 public void AgregarAgenteVerdadero() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Cobra", "asdd", fecha_nacimiento, 12345670, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = true;
			 		
			 		
			 		
			 	}
			
			 assertEquals(true,flag);
			 	
		 }	
	
	
	
	
		  @DisplayName("Modificar agente con error en el nombre, Ingresa numeros.")
		  @Test	
		 public void AgregarAgenteF() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asd12", "asdd", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
	
	
	
		  @DisplayName("Modificar agente con error en el nombre, Espacios vacios.")
		  @Test	
		 public void AgregarAgenteF2() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asda sd", "asdd", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
	
		  @DisplayName("Modificar agente con error en el apellido, ingresa numeros.")
		  @Test	
		 public void AgregarAgenteF3() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asdasd", "asdd123", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
		  @DisplayName("Modificar agente con error en el apellido, Espacios vacios.")
		  @Test	
		 public void AgregarAgenteF4() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asdasd", "asd dds", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
		  @DisplayName("Modificar agente con error en el DNI, más de 8 digitos.")
		  @Test	
		 public void AgregarAgenteF5() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asdasd", "asddds", fecha_nacimiento, 423232321, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
		  @DisplayName("Modificar agente con error en el DNI, ingresa número negativo")
		  @Test	
		 public void AgregarAgenteF6() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(2);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asdasd", "asddds", fecha_nacimiento, -2332321, 12345678, "Agente@agente.com", "cobra1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
	
	
	
	
}
