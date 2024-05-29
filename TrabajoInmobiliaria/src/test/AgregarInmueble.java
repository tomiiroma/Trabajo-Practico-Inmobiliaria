package test;
import controlador.InmuebleControlador; 
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Empleado;
 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;


public class AgregarInmueble {
	
	public void agregarInmueble() { //agregar inmueble siendo gerente
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		boolean flag = false;
		
		String descripcion = null;
		String piso = null; 
		String cantAmbientes = null;
		String antiguedad = null;
		String banios = null;
		String dormitorios= null;
		String direccion = null;
		String dormitorio = null;
		String alturaDireccion = null;
		String nroDepto = null;
		String tipoInmueble = obtenerTipoInmueble();
		String condicion = obtenerCondicion();
		double precio =0;
		double superficieCubierta = 0;
		double superficieDescubierta = 0;
		
		
		
		
		
		
		assertEquals(true, flag);
	}
	
	
	
	
	
	public String obtenerTipoInmueble() {
		String[] tipoInmueble = { "Casa","Departamento"};
		String seleccion = null;

		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Inmueble:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
	    
	}
	
	
	public String obtenerCondicion() {
		String[] tipoInmueble = { "Excelente","Muy bueno","Bueno","Regular","Malo"};
		String seleccion = null;
   
		do {
				
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de condición del Inmueble:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, tipoInmueble, tipoInmueble[0]);
				
				if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		return seleccion;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
			
		} while (true);
    
	}
	
	
}
