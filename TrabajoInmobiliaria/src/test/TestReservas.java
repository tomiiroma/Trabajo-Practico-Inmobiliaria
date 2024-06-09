package Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;


import controlador.GerenteControlador;
import controlador.AgenteControlador;
import controlador.InquilinoControlador;
import controlador.CompradorControlador;
import controlador.InmuebleControlador;

public class TestReservas {

	
	 @DisplayName("Realizar una reserva.")
	  @Test	
	  public void RealizarReservaV() {
		 boolean flag;
		 GerenteControlador gerentecontrolador = new GerenteControlador();
		 InmuebleControlador inmueblecontrolador = new InmuebleControlador();
		 AgenteControlador agentecontrolador = new AgenteControlador();
		 InquilinoControlador inquilinocontrolador = new InquilinoControlador();
		 CompradorControlador compradorcontrolador = new CompradorControlador();
		 
		 Gerente gerentev = new Gerente();
		 
		 Inmueble inmueble = inmueblecontrolador.getInmuebleById(21);
		 Gerente gerente1 = gerentecontrolador.getGerenteById(8);
		 Empleado empleado = gerente1;
		 Cliente cliente = inquilinocontrolador.getInquilinoById(2);
		 
		 
		 LocalDate fecha_pago = null;
		 
		 fecha_pago = LocalDate.now();
		 
		 String  pago ="10000";
		 
		 
		 
		 if (gerentev.RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago)==true) {
			 
			 flag = true;
			 
			 
		 } else {
			 
			 flag = false;
			 
		 }
		 
		 assertEquals(true,flag);
		 
	 }
	
	
	
	 @DisplayName("Realizar una reserva, no se ingresa ningun inmueble.")
	  @Test	
	  public void RealizarReservaf() {
		 boolean flag;
		 GerenteControlador gerentecontrolador = new GerenteControlador();
		 
		 InquilinoControlador inquilinocontrolador = new InquilinoControlador();
		
		 
		 Gerente gerentev = new Gerente();
		 
		 
		 Gerente gerente1 = gerentecontrolador.getGerenteById(8);
		 Empleado empleado = gerente1;
		 Cliente cliente = inquilinocontrolador.getInquilinoById(2);
		 
		
		
		 
		 LocalDate fecha_pago = null;
		 
		 fecha_pago = LocalDate.now();
		 
		 String  pago ="10000";
		 
		Inmueble inmueble = null;
		 
		 if (gerentev.RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago)==true) {
			 
			 flag = true;
			 
			 
		 } else {
			 
			 flag = false;
			 
		 }
		 
		 assertEquals(false,flag);
		 
	 }
	
	
	 
	 @DisplayName("Realizar una reserva, no se ingresa ningun cliente.")
	  @Test	
	  public void RealizarReservafcliente() {
		 boolean flag;
		 GerenteControlador gerentecontrolador = new GerenteControlador();
		 InmuebleControlador inmueblecontrolador = new InmuebleControlador();
	
		
		 
		 Gerente gerentev = new Gerente();
		 
		 Inmueble inmueble = inmueblecontrolador.getInmuebleById(21);
		 Gerente gerente1 = gerentecontrolador.getGerenteById(8);
		 Empleado empleado = gerente1;
		Cliente cliente = null;
		 
		
		
		 
		 LocalDate fecha_pago = null;
		 
		 fecha_pago = LocalDate.now();
		 
		 String  pago ="10000";
		 
		
		 
		 if (gerentev.RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago)==true) {
			 
			 flag = true;
			 
			 
		 } else {
			 
			 flag = false;
			 
		 }
		 
		 assertEquals(false,flag);
		 
	 }
	 
	 
	 @DisplayName("Realizar una reserva, no se ingresa ningun empleado.")
	  @Test	
	  public void RealizarReservafempleado() {
		 boolean flag;
		 
		 InmuebleControlador inmueblecontrolador = new InmuebleControlador();
		 InquilinoControlador inquilinocontrolador = new InquilinoControlador();
		
		 
		 Gerente gerentev = new Gerente();
		 
		 Inmueble inmueble = inmueblecontrolador.getInmuebleById(21);
		
		 Empleado empleado = null;
		 Cliente cliente = inquilinocontrolador.getInquilinoById(2);
		 
		
		
		 
		 LocalDate fecha_pago = null;
		 
		 fecha_pago = LocalDate.now();
		 
		 String  pago ="10000";
		 
		
		 
		 if (gerentev.RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago)==true) {
			 
			 flag = true;
			 
			 
		 } else {
			 
			 flag = false;
			 
		 }
		 
		 assertEquals(false,flag);
		 
	 }
	 
	 
	
	 
	 @DisplayName("Realizar una reserva, se ingresa una fecha invalida.")
	  @Test	
	  public void RealizarReservaffecha() {
		 boolean flag;
		 
		 GerenteControlador gerentecontrolador = new GerenteControlador();
		 InmuebleControlador inmueblecontrolador = new InmuebleControlador();
		 InquilinoControlador inquilinocontrolador = new InquilinoControlador();
		 
		 
		 Gerente gerentev = new Gerente();
		 
		 Inmueble inmueble = inmueblecontrolador.getInmuebleById(21);
		 Gerente gerente1 = gerentecontrolador.getGerenteById(8);
		 Empleado empleado = gerente1;
		 Cliente cliente = inquilinocontrolador.getInquilinoById(2);
		 
		
		
		 
		 LocalDate fecha_pago = null;
		 
		 fecha_pago = LocalDate.of(2020, 10, 22);
		 
		 String  pago ="10000";
		 
		
		 
		 if (gerentev.RealizarReserva(inmueble,empleado,cliente,fecha_pago,pago)==true) {
			 
			 flag = true;
			 
			 
		 } else {
			 
			 flag = false;
			 
		 }
		 
		 assertEquals(false,flag);
		 
	 }
	 
	 
	 
	
	
}
