package Test;

import javax.swing.JOptionPane;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import controlador.AgenteControlador;
import trabajoInmobiliaria.Agente;


public class TestEliminarAgente {

	
	
	
	@DisplayName("Eliminar agente sin operaciones previas.")
	@Test
	public void EliminarAgenteV() {
		
		boolean flag=true;
		
		AgenteControlador gerentecontrolador = new AgenteControlador();

		if (gerentecontrolador.getAllAgente().size()==0) {
			
			JOptionPane.showMessageDialog(null, "No se han encontrado agentes.");
			
		} else {

		String[] borrarempleado = new String[gerentecontrolador.getAllAgente().size()];
		for (int i = 0; i < borrarempleado.length; i++) {
			

			  Agente agente = gerentecontrolador.getAllAgente().get(i);
			    borrarempleado[i] = agente.getId_empleado() + "  " + agente.getNombre() + " " + agente.getApellido() + "  " + agente.getCorreo();
		   
		}

		try {
			String empleadoborrarselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
					borrarempleado, borrarempleado[0]);
			int indiceSeleccionado = -1;

			for (int i = 0; i < borrarempleado.length; i++) {
		        if (borrarempleado[i].equals(empleadoborrarselect)) {
		            indiceSeleccionado = i; 
		        }
		    }
			

			 if (indiceSeleccionado != -1) {
			        
			 String idEmpleadoSeleccionado = Integer.toString(gerentecontrolador.getAllAgente().get(indiceSeleccionado).getId_empleado());

			 
			 gerentecontrolador.deleteAgente((Integer.parseInt(idEmpleadoSeleccionado)));
			 
			 
			 for (Agente agente : gerentecontrolador.getAllAgente()) {
				 
				 
				 if (agente.getId_agente() == Integer.parseInt(idEmpleadoSeleccionado)) {
					 
					 flag = false;
					 
					 break;
				 }
				 
				 
			 }
			 			 
			        
			    } else {
			        JOptionPane.showMessageDialog(null, "Agente no encontrado.");
			    }
			
			

			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	
		
		
		JOptionPane.showMessageDialog(null, flag);
	
	
		} 	assertEquals(true,flag);}
	
	
	
	
	@DisplayName("Eliminar agente vinculado a operaciones.")
	@Test
	public void EliminarAgenteF() {
		
		boolean flag=true;
		
		AgenteControlador gerentecontrolador = new AgenteControlador();

		if (gerentecontrolador.getAllAgente().size()==0) {
			
			JOptionPane.showMessageDialog(null, "No se han encontrado agentes.");
			
		} else {

		String[] borrarempleado = new String[gerentecontrolador.getAllAgente().size()];
		for (int i = 0; i < borrarempleado.length; i++) {
			

			  Agente agente = gerentecontrolador.getAllAgente().get(i);
			    borrarempleado[i] = agente.getId_empleado() + "  " + agente.getNombre() + " " + agente.getApellido() + "  " + agente.getCorreo();
		   
		}

		try {
			String empleadoborrarselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
					borrarempleado, borrarempleado[0]);
			int indiceSeleccionado = -1;

			for (int i = 0; i < borrarempleado.length; i++) {
		        if (borrarempleado[i].equals(empleadoborrarselect)) {
		            indiceSeleccionado = i; 
		        }
		    }
			

			 if (indiceSeleccionado != -1) {
			        
			 String idEmpleadoSeleccionado = Integer.toString(gerentecontrolador.getAllAgente().get(indiceSeleccionado).getId_empleado());

			
			 
			 gerentecontrolador.deleteAgente(((1)));
			 
			
			 
			 for (Agente agente : gerentecontrolador.getAllAgente()) {
				 
				 
				 if (agente.getId_agente() == 1) {
					 
					 flag = false;
					 
					 break;
				 }
				 
				 
			 }
			 			 
			        
			    } else {
			        JOptionPane.showMessageDialog(null, "Agente no encontrado.");
			    }
			
			

			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	
		
		
		JOptionPane.showMessageDialog(null, flag);
	
	
		} 	assertEquals(false,flag);}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
