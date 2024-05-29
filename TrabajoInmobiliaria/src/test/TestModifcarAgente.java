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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 12345670, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel12", "Fernandez", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "asda sd", "Fernandez", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "asdd123", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "asd dds", fecha_nacimiento, 42323232, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 423232321, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
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
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, -2332321, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
	
		  
		  @DisplayName("Modificar agente con error en la fecha, ingresa una fecha futura")
		  @Test	
		 public void AgregarAgenteF7() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2026,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
	
	
		  
		  @DisplayName("Modificar agente con error en la fecha, ingresa una fecha menor al año 1900")
		  @Test	
		 public void AgregarAgenteF8() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(1890,8, 10);
			  
			 	
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  @DisplayName("Modificar agente con error en la fecha, ingresa una fecha nula")
		  @Test	
		 public void AgregarAgenteF9() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 12345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  
		  
		  @DisplayName("Modificar agente con error en el telefono, ingresa un telefono negativo")
		  @Test	
		 public void AgregarAgenteF10() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			 
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, -2345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  @DisplayName("Modificar agente con error en el telefono, ingresa un telefono con mas de 8 digitos.")
		  @Test	
		 public void AgregarAgenteF11() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			 
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 122345678, "Agente@agente.com", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  
		  @DisplayName("Modificar agente con error en el mail ingresa un mail sin cumplir con el @ y el .com.")
		  @Test	
		 public void AgregarAgenteF12() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			 
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 12234567, "Agentemail", "Daniel1234", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  
		  
		  @DisplayName("Modificar agente con error en el password, ingresa una password sin cumplir con los requerimientos de 6 caracteres y 2 números obligatorios")
		  @Test	
		 public void AgregarAgenteF14() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 42332321, 12234567, "Agente@mail.com", "Dani", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  
		  
		  @DisplayName("Modificar agente con error en el DNI, ingresa el DNI que tiene repetido otro agente en la base de datos")
		  @Test	
		 public void AgregarAgenteF15() {
			 
			  Gerente gerente1 = new Gerente();
			  
			 LocalDate fecha_nacimiento = null;
			 
			 
			 fecha_nacimiento = LocalDate.of(2000,8, 10);
			  
			 AgenteControlador agente1 = new AgenteControlador();
			 	
			 Agente	agente = new Agente();
			 
			 agente = agente1.getAgenteById(6);
			
			 	boolean flag=false;
			 	
			 	if (gerente1.ModificarAgente2(agente, "Daniel", "Fernandez", fecha_nacimiento, 87654321, 12234567, "Agentemail@mail.com", "Dani12", 3030)==true) {
			 		
			 		
			 		flag = false;
			 		
			 		
			 		
			 	}
			
			 assertEquals(false,flag);
			 	
		 }
		  
		  
		  
		  
		  
		  
	
}
