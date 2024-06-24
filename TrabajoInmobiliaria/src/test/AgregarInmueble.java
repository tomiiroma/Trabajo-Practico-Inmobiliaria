package test;

import controlador.InmuebleControlador;    
import trabajoInmobiliaria.Gerente;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Validacion;
import trabajoInmobiliaria.Empleado;
 

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.swing.JOptionPane;

public class AgregarInmueble implements Validacion{
	
	
/*	@Test 
	public void agregarInmuebleV() { //metodo principal q permite agregar Inmuebles al sistema
		


		
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		boolean flag = false;
				
		
		String descripcion = null;
		String piso = null; 
		String cantAmbientes = null;
		String antiguedad = null;
		String banios = null;
		String direccion = null;
		String dormitorio = null;
		String alturaDireccion = null;
		String nroDepto = null;
		double precio =0;
		double superficieCubierta = 0;
		double superficieDescubierta = 0;
		
		
		boolean correcto = false;
		
		String tipoInmueble = obtenerTipoInmueble();
		String condicion = obtenerCondicion();
		
		 cantAmbientes = validarEntero("Ingrese la cantidad de Ambientes que tiene el Inmueble");
		 
		 if (tipoInmueble.equals("Departamento")) {
		    piso = validarEntero("Ingrese el numero de piso donde se encuentra el Departamento");
		    nroDepto=validarCadena("Indique el Número o Letra de depatartamento"); //validar despues 
		 }
		
		String barrio = obtenerBarrio();
		direccion = validarCadena("Ingrese la dirección");
		alturaDireccion = validarCadena("Ingrese la Altura de la calle del Inmueble");
		descripcion = validarCadena("Ingrese una descripción del inmueble");
		antiguedad = validarEntero("Ingrese la antiguedad que tiene el inmueble");
		banios = validarEntero("Ingrese la cantidad baños que tiene el inmueble");
		dormitorio = validarEntero("Ingrese la cantidad dormitorios que tiene el inmueble");
		superficieCubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie cubierta");
			
		boolean tienePatio = obtenerPatio();
		if(tienePatio==true){
			superficieDescubierta = validarDouble("Ingrese la cantidad la cantidad de m2 de superficie descubierta");
		}
		precio = validarDouble("Ingrese el precio del Inmueble");
		boolean disponible = obtenerDisponible();
		boolean refaccionar = obtenerRefaccion().equals("Si");
		boolean aptoMascota = obtenerMascota().equals("Si");
		boolean activo = true; //esto cambia segun las operaciones que se hagan con el inmueble
		
		if(tipoInmueble.equals("Departamento") && validarDepto(direccion, alturaDireccion, piso, nroDepto)){
			JOptionPane.showMessageDialog(null, "Error! No se pudo registrar el Departamento. Departamento duplicado.");
			return;
		}
		
		if(tipoInmueble.equals("Casa") && validarCasa(direccion, alturaDireccion)){
			JOptionPane.showMessageDialog(null, "Error! No se pudo registrar la Casa. Casa duplicada.");
			return;
		}
		
		
		
	    // Agregar el inmueble al controlador
	    inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
	            banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
		
		JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente: ");
		
		assertEquals(true, flag);
	}
	
	*/
	
	
	
	
	
	
	@Test 
	public void agregarInmuebleCasaV() {
		//Agregar Nuevo Inmueble (de tipo Casa  Tiene Patio, se encuentra Disponible, se encuentra sin Refaccionar y es apto para mascotas) 
		//Inmueble Registrado como Gerente
		boolean flag = false;
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		

		String descripcion = "aaa";
		String piso = null; 
		String cantAmbientes = "4";
		String antiguedad = "50";
		String banios = "1";
		String direccion = "Corrientes";
		String dormitorio = "4";
		String alturaDireccion = "1200";
		String nroDepto = null;
		double precio =30000;
		double superficieCubierta = 120;
		double superficieDescubierta = 30;
					
		String tipoInmueble = "Casa";
		String condicion = "Excelente";		 

		
		String barrio = "Recoleta";
			
		boolean tienePatio = true;

		boolean disponible = true;
		boolean refaccionar = false;
		boolean aptoMascota = true;
		boolean activo = true; //esto cambia segun las operaciones que se hagan con el inmueble
		

		if(tipoInmueble.equalsIgnoreCase("Casa")){
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
				banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				
			}else {
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Casa")&&
							inmueble.getDireccion().equalsIgnoreCase(direccion)&&
							inmueble.getAlturaDireccion().equals(alturaDireccion)){
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar la casa. Casa duplicada");
						flag = false;
					}else {
						flag = true;
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}			
				}		
			}
			
	
		}else if(tipoInmueble.equalsIgnoreCase("Departamento")){
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				// Agregar el inmueble al controlador
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
						banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
				
			}else {		
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
							&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
							&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){
						
						flag = false;
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar el Departamento. Departamento Duplicado");			
					}else {
						flag = true;
						// Agregar el inmueble al controlador
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}
				}	
			}				
		}
				
		inmuebleControlador.deleteAllInmuebles();
		assertEquals(true, flag);
		
	}
	

	@Test 
	public void agregarInmuebleCasaF1() {
		//Agregar Nuevo Inmueble (de tipo Casa  Tiene Patio, se encuentra Disponible, se encuentra sin Refaccionar y es apto para mascotas) 
		//Inmueble Registrado como Gerente
		boolean flag = false;
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		inmuebleControlador.addInmueble(new Inmueble(0, "Casa", "Excelente", "3", "2", "Agronomia", "Corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, true, "1200", "5"));
		//      id_inmueble, tipo_inmueble, condicion, cantAmbientes, piso, barrio, direccion, descripcion, antiguedad, banio, dormitorio, superficie_cubierta, superficie_descubierta, precio, disponible, refaccionar, apto_mascota, patio, activo, alturaDireccion, nroDepto

		

		String descripcion = "aaa";
		String piso = null; 
		String cantAmbientes = "4";
		String antiguedad = "50";
		String banios = "1";
		String direccion = "Corrientes";
		String dormitorio = "4";
		String alturaDireccion = "1200";
		String nroDepto = null;
		double precio =30000;
		double superficieCubierta = 120;
		double superficieDescubierta = 30;
					
		String tipoInmueble = "Casa";
		String condicion = "Excelente";		 

		
		String barrio = "Recoleta";
			
		boolean tienePatio = true;

		boolean disponible = true;
		boolean refaccionar = false;
		boolean aptoMascota = true;
		boolean activo = true; //esto cambia segun las operaciones que se hagan con el inmueble
		

		if(tipoInmueble.equalsIgnoreCase("Casa")){
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
				banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				
			}else {
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Casa")&&
							inmueble.getDireccion().equalsIgnoreCase(direccion)&&
							inmueble.getAlturaDireccion().equals(alturaDireccion)){
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar la casa. Casa duplicada");
						flag = false;
					}else {
						flag = true;
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}			
				}		
			}
			
	
		}else if(tipoInmueble.equalsIgnoreCase("Departamento")){
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				// Agregar el inmueble al controlador
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
						banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
				
			}else {		
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
							&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
							&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){
						
						flag = false;
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar el Departamento. Departamento Duplicado");			
					}else {
						flag = true;
						// Agregar el inmueble al controlador
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}
				}	
			}				
		}
				
		inmuebleControlador.deleteAllInmuebles();
		assertEquals(false, flag);
		
	}
	
	
	
	
	
	
	
	@Test 
	public void agregarInmuebleDeptoV2() {
		//Agregar Nuevo Inmueble (de tipo Departamento  Tiene Patio, se encuentra Disponible, se encuentra sin Refaccionar y es apto para mascotas) 
		//Inmueble Registrado como Gerente
		boolean flag = false;
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		

		String tipoInmueble = "Departamento";
		String piso = "1"; 
		String nroDepto = "3";
		String cantAmbientes = "4";
		String antiguedad = "50";
		String banios = "1";
		String dormitorio = "4";
		String direccion = "Corrientes";
		String alturaDireccion = "1200";
		String descripcion = "aaa";
		double precio =30000;
		double superficieCubierta = 120;
		double superficieDescubierta = 30;				
		String condicion = "Excelente";		 

		
		String barrio = "Recoleta";
			
		boolean tienePatio = true;

		boolean disponible = true;
		boolean refaccionar = false;
		boolean aptoMascota = true;
		boolean activo = true; //esto cambia segun las operaciones que se hagan con el inmueble
		

		if(tipoInmueble.equalsIgnoreCase("Casa")){
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
				banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				
			}else {
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Casa")&&
							inmueble.getDireccion().equalsIgnoreCase(direccion)&&
							inmueble.getAlturaDireccion().equals(alturaDireccion)){
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar la casa. Casa duplicada");
						flag = false;
					}else {
						flag = true;
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}			
				}		
			}
			
	
		}else if(tipoInmueble.equalsIgnoreCase("Departamento")){
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				// Agregar el inmueble al controlador
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
						banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
				
			}else {		
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
							&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
							&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){	
						flag = false;
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar el Departamento. Departamento Duplicado");			
					}else {
						flag = true;
						// Agregar el inmueble al controlador
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}
				}	
			}				
		}
				
		inmuebleControlador.deleteAllInmuebles();
		assertEquals(true, flag);
		
	}
	
	
	@Test 
	public void agregarInmuebleDeptoF1() {
		//Agregar Nuevo Inmueble  de tipo departamento duplicado
		boolean flag = false;
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		
		
		inmuebleControlador.addInmueble(new Inmueble(0, "Departamento", "Excelente", "3", "1", "Agronomia", "Corrientes", "Lindo Depto con buena vista", "30", "2", "1", 100, 50, 60000, true, false, false, false, true, "1200", "3"));
		//id_inmueble, tipo_inmueble, condicion, cantAmbientes, piso, barrio, direccion, descripcion, antiguedad, banio, dormitorio, superficie_cubierta, superficie_descubierta, precio, disponible, refaccionar, apto_mascota, patio, activo, alturaDireccion, nroDepto

		String tipoInmueble = "Departamento";
		String piso = "1"; 
		String nroDepto = "3";
		String cantAmbientes = "4";
		String antiguedad = "50";
		String banios = "1";
		String dormitorio = "4";
		String direccion = "Corrientes";
		String alturaDireccion = "1200";
		String descripcion = "aaa";
		double precio = 30000;
		double superficieCubierta = 120;
		double superficieDescubierta = 30;				
		String condicion = "Excelente";		 

		
		String barrio = "Recoleta";
			
		boolean tienePatio = true;

		boolean disponible = true;
		boolean refaccionar = false;
		boolean aptoMascota = true;
		boolean activo = true; //esto cambia segun las operaciones que se hagan con el inmueble
		

		if(tipoInmueble.equalsIgnoreCase("Casa")){
			
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
				banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				
			}else {
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Casa")&&
							inmueble.getDireccion().equalsIgnoreCase(direccion)&&
							inmueble.getAlturaDireccion().equals(alturaDireccion)){
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar la casa. Casa duplicada");
						flag = false;
					}else {
						flag = true;
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}			
				}		
			}
			
	
		}else if(tipoInmueble.equalsIgnoreCase("Departamento")){
			if(inmuebleControlador.getAllInmueble().isEmpty()){
				flag = true;
				// Agregar el inmueble al controlador
				inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
						banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
				JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
				
			}else {		
				for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
					if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
							&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
							&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){	
						flag = false;
						JOptionPane.showMessageDialog(null, "Error No se pudo registrar el Departamento. Departamento Duplicado");			
					}else {
						flag = true;
						// Agregar el inmueble al controlador
						inmuebleControlador.addInmueble(new Inmueble(0, tipoInmueble, condicion, cantAmbientes, piso,barrio, direccion, descripcion, antiguedad,
								banios, dormitorio, superficieCubierta, superficieDescubierta, precio, disponible, refaccionar, aptoMascota, tienePatio,activo,alturaDireccion,nroDepto));
						JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
					}
				}	
			}				
		}
				
		inmuebleControlador.deleteAllInmuebles();
		assertEquals(false, flag);
		
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
