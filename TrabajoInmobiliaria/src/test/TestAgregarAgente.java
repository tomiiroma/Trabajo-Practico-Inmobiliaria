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
	  boolean flagdni = false;
	  int dni = 0;
	  AgenteControlador controladoragente = new AgenteControlador();
	  do {
	  
		  dni = (int) (Math.random() * 10000000 + 40000000);
		  flagdni = true;
	  for (Agente agente : controladoragente.getAllAgente() ) {
		
		 
			
			  
			  if (dni == agente.getDni()) {
				  
				  
				  flagdni=false;
				  
			  }
			  
	  }
			  
			  
	  }while(flagdni==false);
			  
		  
		  
		  
	  
	  
	 LocalDate fecha_nacimiento = null;
	 
	 fecha_nacimiento = LocalDate.of(2000,8, 10);
	  
	 	Gerente gerente1 = new Gerente(); 
	
	 	boolean flag=false;
	 	
	 	if (gerente1.AgregarAgente("Borrame","EnTestEliminarAgente", fecha_nacimiento , dni , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
	 		
	 		
	 		flag = true;
	 		
	 		
	 		
	 	}
	
	 assertEquals(true,flag);
	 	
 }	
	
	
  @DisplayName("Agregar agente con error en el nombre (Espacios)")	
  @Test	
  public void AgregarAgentealt1nombre() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel el master","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
  
  @DisplayName("Agregar agente con error en el nombre (números)")	
  @Test	
  public void AgregarAgentealt2nombre() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel1","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  
  
  
	
  @DisplayName("Agregar agente con error en el apellido(numeros)")
  @Test	
  public void AgregarAgenteAlt3Apellido() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez123", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con error en el apellido(espacios)")
  @Test	
  public void AgregarAgenteAlt4Apellido() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fer nandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }
  
  
  
  
  
  
	
  @DisplayName("Agregar agente con error en la fecha de nacimiento(Mayor)")	
  @Test	
  public void AgregarAgenteAlt5fecha() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2100,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
	
  @DisplayName("Agregar agente con error en la fecha de nacimiento(Menor)")	
  @Test	
  public void AgregarAgenteAlt6fecha() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(1800,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  
  @DisplayName("Agregar agente con error en la fecha de nacimiento(Vacio)")	
  @Test	
  public void AgregarAgenteAlt7fecha() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42130100 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
    
  
  @DisplayName("Agregar agente con error en el ingreso del DNI más de 8 digitos")		
  @Test	
  public void AgregarAgenteAlt8Dni() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 421301002 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con error en el ingreso del DNI numeros negativos")		
  @Test	
  public void AgregarAgenteAlt9Dni() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , -1000000 , 47502342, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }
  
  
	
  @DisplayName("Agregar agente con error en el ingreso del teléfono más de 8 digitos")	
  @Test	
  public void AgregarAgenteAlt10telefono() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42131002 , 475023422, "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  
  
  
  
  
  @DisplayName("Agregar agente con error en el ingreso del teléfono")	
  @Test	
  public void AgregarAgenteAlt11telefono() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42131002 , -1234567 , "Daniel@gmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  

  
  @DisplayName("Agregar agente con error en el ingreso del mail sin arroba")	
  @Test	
  public void AgregarAgentealt12mail() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42430100 , 47502342, "Danielgmail.com", "asdasd20")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con error en la contraseña.")	
  @Test	
  public void AgregarAgenteAlt13password() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 42430100 , 47502342, "Daniel@gmail.com", "asd")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
  @DisplayName("Agregar agente con DNI repetido.")	
  @Test	
  public void AgregarAgenteAlt14AgenteRepetido() {
 	 
 	 LocalDate fecha_nacimiento = null;
 	 
 	 fecha_nacimiento = LocalDate.of(2000,8, 10);
 	  
 	 	Gerente gerente1 = new Gerente(); 
 	
 	 	boolean flag=false;
 	 	
 	 	if (gerente1.AgregarAgente("Daniel","Fernandez", fecha_nacimiento , 87654321 , 47502342, "Daniel@gmail.com", "asdasd23")==true) {
 	 		
 	 		
 	 		flag = true;
 	 		
 	 		
 	 		
 	 	}
 	
 	 assertEquals(false,flag);
 	 	
  }	
  
  
	
}
