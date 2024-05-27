package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controlador.AgenteControlador;

import controlador.GerenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.DatabaseConnection;

import trabajoInmobiliaria.Gerente;
	
	
	
public class Pruebas {
	
  @Test	
 public void AgregarEmpleadoV() {
	 
	 LocalDate fecha_nacimiento = null;
	 
	 fecha_nacimiento = LocalDate.of(2000,8, 10);
	  
	 	Gerente gerente1 = new Gerente(); 
	
	 	boolean flag=false;
	 	
	 	if (gerente1.AgregarAgente2("Daniel","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
	 		
	 		
	 		flag = true;
	 		
	 		
	 		
	 	}
	
	 assertEquals(true,flag);
	 	
 }	
	
	
	
  @Test	
  public void AgregarEmpleadoF() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel el numero 1","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
