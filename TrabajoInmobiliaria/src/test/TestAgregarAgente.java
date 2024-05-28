package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controlador.AgenteControlador;

import controlador.GerenteControlador;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.DatabaseConnection;

import trabajoInmobiliaria.Gerente;
	
	
	
public class TestAgregarAgente {
  @DisplayName("Agregar agente sin errores")
  @Test	
 public void AgregarAgenteVerdadero() {
	 
	 LocalDate fecha_nacimiento = null;
	 
	 fecha_nacimiento = LocalDate.of(2000,8, 10);
	  
	 	Gerente gerente1 = new Gerente(); 
	
	 	boolean flag=false;
	 	
	 	if (gerente1.AgregarAgente2("Borrame","EnTestEliminarAgente", fecha_nacimiento , 42430100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
	 		
	 		
	 		flag = true;
	 		
	 		
	 		
	 	}
	
	 assertEquals(true,flag);
	 	
 }	
	
	
  @DisplayName("Agregar agente con error en el nombre")	
  @Test	
  public void AgregarAgentealt1nombre() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel el numero 1","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
	
  @DisplayName("Agregar agente con error en el apellido")
  @Test	
  public void AgregarAgenteAlt2Apellido() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez123", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
  @DisplayName("Agregar agente con error en la fecha de nacimiento")	
  @Test	
  public void AgregarAgenteAlt3fecha() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2100,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez123", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
  @DisplayName("Agregar agente con error en el ingreso del DNI")		
  @Test	
  public void AgregarAgenteAlt4Dni() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2100,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez123", fecha_nacimiento , 421301002 , 47502342, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
  @DisplayName("Agregar agente con error en el ingreso del teléfono")	
  @Test	
  public void AgregarAgenteAlt5telefono() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2100,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez123", fecha_nacimiento , 421301002 , 475023422, "Daniel@gmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  @DisplayName("Agregar agente con error en el ingreso del mail")	
  @Test	
  public void AgregarAgentealt6mail() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez", fecha_nacimiento , 42430100 , 47502342, "Danielgmail.com", "asdasd20", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con error en la contraseña.")	
  @Test	
  public void AgregarAgenteAlt7password() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez", fecha_nacimiento , 42430100 , 47502342, "Daniel@gmail.com", "asd", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con DNI repetido.")	
  @Test	
  public void AgregarAgenteAlt8AgenteRepetido() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente2("Daniel","Fernandez", fecha_nacimiento , 42430100 , 47502342, "Daniel@gmail.com", "asd", 23213)==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
	
}
