package test;

import controlador.InmuebleControlador;    
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Validacion;
import trabajoInmobiliaria.Empleado;

 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;

public class ModificarInmueble implements Validacion{
	
	
	@Test 
	public void modificarInmuebleInmuebleV(){
		
		boolean flag = false;
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		inmuebleControlador.addInmueble(new Inmueble(0, "Casa", "Excelente", "3", "2", "Agronomia", "Corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, false, "1200", "5"));
		//      id_inmueble, tipo_inmueble, condicion, cantAmbientes, piso, barrio, direccion, descripcion, antiguedad, banio, dormitorio, superficie_cubierta, superficie_descubierta, precio, disponible, refaccionar, apto_mascota, patio, activo, alturaDireccion, nroDepto
		

		if(inmuebleControlador.getAllInmueble().isEmpty()){
			flag=false;
			JOptionPane.showMessageDialog(null, "No hay inmuebles en la base de datos");
			
		}else {			
			int contador = 0;
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) { // verificamos que hayan inmuebles con el atributo activo en false, para poder setearlo
				if(inmueble.isActivo()==false) {
					contador ++;
					flag = true;
				}	    	    
			}
			
			if(contador==0){
				JOptionPane.showMessageDialog(null, "No hay Inmuebles disponibles para modificar");
				flag = false; // no hay inmuebles para activar
				
			}else {
				
			//Imprimimos los inmuebles ---con atributo Disponible seteado en False
				
				String[] opcionesInmuebles = new String[contador];
				int index = 0;
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if (inmueble.isActivo()==false) {
						opcionesInmuebles[index++] = "ID Inmueble: " + inmueble.getId_inmueble() + 
														" - Dirección: " + inmueble.getDireccion() +
														" "+inmueble.getAlturaDireccion()+ 
														" - Ambientes: " + inmueble.getCantAmbientes();	
					}
				}
				
				//seleccion del inmueble
				String inmuebleSeleccionado = (String) JOptionPane.showInputDialog(null,
						"Seleccione Inmueble para activar","Activar Inmueble", JOptionPane.QUESTION_MESSAGE,null, opcionesInmuebles,opcionesInmuebles[0]);
				
				
				Inmueble inmuebleAmodificar = null;
				
				if(inmuebleSeleccionado !=null){
					for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
						String opcion = "ID Inmueble: " + inmueble.getId_inmueble() + 
										" - Dirección: " + inmueble.getDireccion() +
										" "+inmueble.getAlturaDireccion()+ 
										" - Ambientes: " + inmueble.getCantAmbientes();					
						
						if(opcion.equals(inmuebleSeleccionado)){
							inmuebleAmodificar=inmueble;
							break;
							}      
						}	
				
		        if(inmuebleSeleccionado!=null){
		        	String[] opcionesModificar = { "Tipo de Inmueble","Condición","Cantidad de Ambientes","Barrio","Dirección","Descripcion",
							"Años Antiguedad","Cantidad de Baños","Cantidad de Dormitorios","m2 Superficie Cubierta",
							"Precio","Refacción","Apto para Mascotas","Patio","Volver"};
						
					String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione un atributo para Modificar:",
							"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, opcionesModificar,
							opcionesModificar[0]);		
		        	
					
					if(opcionSeleccionada.equals("Tipo de Inmueble")){
						String tipoInmueble = obtenerTipoInmueble();
							if (!tipoInmueble.equals("Departamento")) {

								String direccion = null;
								String alturaDireccion = null;
						
								direccion = validarCadena("Ingrese la calle donde se encuentra el Inmueble");
								alturaDireccion = validarCadena("Ingrese la Altura de la calle del Inmueble");
								
							if(inmuebleControlador.getAllInmueble().isEmpty()){
								flag = true;
		                        inmuebleAmodificar.setPiso(null);
		                        inmuebleAmodificar.setNroDepto(null);
								inmuebleAmodificar.setTipo_inmueble(tipoInmueble);
								inmuebleAmodificar.setDireccion(direccion);
								inmuebleAmodificar.setAlturaDireccion(alturaDireccion);

								JOptionPane.showMessageDialog(null, "Tipo de Inmueble, direccion y altura modificados correctamente");
							}else {
								for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
									if(inmueble.getTipo_inmueble().equals("Casa")&&
											inmueble.getDireccion().equalsIgnoreCase(direccion)&&
											inmueble.getAlturaDireccion().equals(alturaDireccion)){
										
										flag = false;
										JOptionPane.showMessageDialog(null, "Error No se pudo modificar la casa. Casa duplicada");
									}else {
										flag = true;
										inmuebleAmodificar.setPiso(null);
										inmuebleAmodificar.setNroDepto(null);
										inmuebleAmodificar.setTipo_inmueble(tipoInmueble);
										inmuebleAmodificar.setDireccion(direccion);
										inmuebleAmodificar.setAlturaDireccion(alturaDireccion);
										
										JOptionPane.showMessageDialog(null, "Tipo de Inmueble, direccion y altura modificados correctamente");
									}			
								}			
							}			
                    
	                     }else {
	                    	String piso = null;
	                    	String nroDepto = null;
	                    	String direccion = null;
							String alturaDireccion = null;	                    	

	             	    	piso = validarEntero("Ingrese el numero de piso donde se encuentra el Departamento");	                         
	         		    	nroDepto=validarCadena("Indique el Número o Letra de depatartamento"); 
							direccion = validarCadena("Ingrese la calle donde se encuentra el Departamento");
							alturaDireccion = validarCadena("Ingrese la Altura de la calle del Departamento");
							
							if(inmuebleControlador.getAllInmueble().isEmpty()){
								flag = true;
								inmuebleAmodificar.setPiso(piso);
								inmuebleAmodificar.setNroDepto(nroDepto);
								inmuebleAmodificar.setTipo_inmueble(tipoInmueble);
								inmuebleAmodificar.setDireccion(direccion);
								inmuebleAmodificar.setAlturaDireccion(alturaDireccion);
								JOptionPane.showMessageDialog(null, "Tipo de Inmueble,Nro de Piso, nro Depto, direccion  y altura modificados correctamente");
							}else {
								for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
									if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
											&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
											&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){	
										flag = false;
										JOptionPane.showMessageDialog(null, "Error No se pudo modificar el Departamento. Departamento Duplicado");			
									}else {
										flag = true;
										// Agregar el inmueble al controlador
										inmuebleAmodificar.setPiso(piso);
										inmuebleAmodificar.setNroDepto(nroDepto);
										inmuebleAmodificar.setTipo_inmueble(tipoInmueble);
										inmuebleAmodificar.setDireccion(direccion);
										inmuebleAmodificar.setAlturaDireccion(alturaDireccion);
										JOptionPane.showMessageDialog(null, "Tipo de Inmueble,Nro de Piso, nro Depto, direccion  y altura modificados correctamente");
									}
								}									
							}              
	                     }										
						
					}else if(opcionSeleccionada.equals("Condición")){
						String condicion = obtenerCondicion();
						inmuebleAmodificar.setCondicion(condicion);
						JOptionPane.showMessageDialog(null, "Tipo de Condicion actualizada");
						
						
					}else if(opcionSeleccionada.equals("Cantidad de Ambientes")){					
						String cantAmbientes = null;
						cantAmbientes = validarEntero("Ingrese la cantidad de Ambientes que tiene el Inmueble");
						inmuebleAmodificar.setCantAmbientes(cantAmbientes);		
						JOptionPane.showMessageDialog(null, "Cantidad de Ambientes Actualizada");
						
						
					}else if(opcionSeleccionada.equals("Barrio")){
						String barrio = obtenerBarrio();
						inmuebleAmodificar.setBarrio(barrio);
						JOptionPane.showMessageDialog(null, "Barrio Actualizado!");
						
						
					}else if(opcionSeleccionada.equals("Dirección")){
						String direccion = null;
						String alturaDireccion = null;
						direccion = validarCadena("Ingrese la calle donde se encuentra el Inmueble");
						inmuebleAmodificar.setDireccion(direccion);
						alturaDireccion = validarCadena("Ingrese la Altura de la calle del Inmueble");
						inmuebleAmodificar.setAlturaDireccion(alturaDireccion);
						
						JOptionPane.showMessageDialog(null, "Dirección Actualizada");

						
					}else if(opcionSeleccionada.equals("Descripcion")){
						String descripcion = null;
						descripcion = validarCadena("Ingrese una descripción del inmueble");
						inmuebleAmodificar.setDescripcion(descripcion);
						JOptionPane.showMessageDialog(null, "Descripcion Actualizada");

						
					}else if(opcionSeleccionada.equals("Años Antiguedad")){
						String antiguedad = null;
						antiguedad = validarEntero("Ingrese la antiguedad que tiene el inmueble");
						inmuebleAmodificar.setAntiguedad(antiguedad);
						JOptionPane.showMessageDialog(null, "Antiguedad actualizada");

						
					}else if(opcionSeleccionada.equals("Cantidad de Baños")){
						String banios = null;
						banios = validarCadena("Ingrese la cantidad de baños ");
						inmuebleAmodificar.setBanio(banios);
						JOptionPane.showMessageDialog(null, "Cantidad de baños Actualizada");

						
					}else if(opcionSeleccionada.equals("Cantidad de Dormitorios")){
						String dormitorio = null;
						dormitorio = validarCadena("Ingrese la cantidad de dormitorios");
						inmuebleAmodificar.setDormitorio(dormitorio);
						JOptionPane.showMessageDialog(null, "Cantidad de dormitorios Actualizada");

						
					}else if(opcionSeleccionada.equals("m2 Superficie Cubierta")) {
						double superficieCubierta = 0;
						superficieCubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie cubierta");
						inmuebleAmodificar.setSuperficie_cubierta(superficieCubierta);	
						JOptionPane.showMessageDialog(null, "m2 cubierta Actualizada");


					}else if(opcionSeleccionada.equals("Patio")){
						boolean tienePatio = obtenerPatio();	

						if(tienePatio==true){
							double superficieDescubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie descubierta");
							inmuebleAmodificar.setSuperficie_descubierta(superficieDescubierta);		
							JOptionPane.showMessageDialog(null, "Patio y M2 superficie descubierta actualizados");
						}else {
							inmuebleAmodificar.setSuperficie_descubierta(0);
							JOptionPane.showMessageDialog(null, "Patio actualizado");
						}			
		
					}else if(opcionSeleccionada.equals("Precio")){
						double precio = 0;
						precio = validarDouble("Ingrese el precio del Inmueble");
						inmuebleAmodificar.setPrecio(precio);					
						JOptionPane.showMessageDialog(null, "Precio actualizado");

						
					}else if(opcionSeleccionada.equals("Refacción")){
						boolean refaccionar = obtenerRefaccion().equals("Si");
						inmuebleAmodificar.setRefaccionar(refaccionar);				
						JOptionPane.showMessageDialog(null, "Refaccion actualizada");

						
					}else if(opcionSeleccionada.equals("Apto para Mascotas")){
						boolean aptoMascota = obtenerMascota().equals("Si");
						inmuebleAmodificar.setApto_mascota(aptoMascota);
						JOptionPane.showMessageDialog(null, "Apto para Mascotas actualizado");
					
						}
					
					 flag = true;
					 inmuebleControlador.updateInmueble(inmuebleAmodificar);
	                 JOptionPane.showMessageDialog(null, "Inmueble actualizado exitosamente");
			        	
			        }
	
				}else {
					JOptionPane.showMessageDialog(null, "error");
				}
				
			}
			
		}
				
		
		inmuebleControlador.deleteAllInmuebles(); 
		assertEquals(true, flag);
	}
	
	
	
	
	
	
	
	
	//METODOS PARA AGREGAR INMUEBLE************************************************************************************************************
	
	
	public String obtenerBarrio() {
		String[] barrio = {"Agronomía", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita",
				"Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers",
				"Mataderos", "Monte Castro", "Monserrat", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda",
				"Parque Chacabuco", "Parque Chas", "Parque Patricios", "Puerto Madero", "Recoleta", "Retiro",
				"Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles",
				"Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano",
				"Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo",
				"Villa Santa Rita", "Villa Soldati", "Villa Urquiza"};
	    String seleccion = null;
		
		do {
			
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el Barrio",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, barrio, barrio[0]);
				
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
	
	
	
	
	
	
	
	
	public boolean obtenerDisponible() {
	    String[] disponibleSeleccion = { "Si","No"};
	    String seleccion = null;
	    boolean confirmacion = false;
	    
	    do {		
		    try {
		    	 seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble se encuentra en condiciones para habilitarlo?",
		    			"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, disponibleSeleccion, disponibleSeleccion[0]);
		    	 
		    	if(seleccion ==null){
		    		JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
		    	}else {
		    		confirmacion = true;
		    	}
				
			} catch (Exception e) {
	    		JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
	
			}
	    
	    } while (confirmacion == false);
	    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}	
	
	
	
	
	public String obtenerRefaccion() {
		String[] refaccionSeleccion = { "Si","No"};
		String seleccion = null;
	    
		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione si hay que Refaccionar:",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, refaccionSeleccion, refaccionSeleccion[0]);
				
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
	
	

	
	
	public boolean obtenerPatio() {
		
		String[] patioSeleccion = { "Si","No"};
		String seleccion = null;
		boolean confirmacion = false;
		do {		
			try {				
				seleccion = (String) JOptionPane.showInputDialog(null, "¿El inmueble tiene Patio o Balcón?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, patioSeleccion, patioSeleccion[0]);
				
				if(seleccion ==null){
					JOptionPane.showMessageDialog(null, "Porfavor Seleccione una opción valida.");
				}else {
					confirmacion = true;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error! Porfavor Seleccione una opción valida.");
				
			}
			
		} while (confirmacion == false);
		
		    
	    // Si la selección es "Si", devolvemos true, de lo contrario, devolvemos false
	    return seleccion.equals("Si");
	}
	
	
	public String obtenerMascota() {
		String[] mascotaSeleccion = { "Si","No"};

		String seleccion = null;
	    
		do {
			
			try {
				seleccion = (String) JOptionPane.showInputDialog(null, "¿Es apto para mascotas?",
						"Inmobiliaria Maguez | Menu Gerente", JOptionPane.DEFAULT_OPTION, null, mascotaSeleccion, mascotaSeleccion[0]);
				
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
