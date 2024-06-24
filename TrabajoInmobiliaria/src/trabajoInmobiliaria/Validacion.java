
package trabajoInmobiliaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import controlador.ControladorEmpleado;
import controlador.InmuebleControlador;
import controlador.VentaControlador;

public interface Validacion {
	
	
	//validar DNI

	default int validarDni(String mensaje) {
        int dni = 0;
        boolean confirmacion = false;
        
        do {
        	try {
				String dniString = JOptionPane.showInputDialog(mensaje);
        		
				if(dniString==null || dniString.trim().isEmpty()){//verificamos is esta vacio
					JOptionPane.showMessageDialog(null, "No se admiten campos en blanco. Por favor ingrese un DNI");
					continue; // q vuelva a ejecutarse el bucle para analizar nuevamente
				}
				
				dniString.trim(); //por las dudas eliminamos los espacios en blancos del principio o final
        	
        	
				if(dniString.length()!=8){
                    JOptionPane.showMessageDialog(null, "El DNI debe tener exactamente 8 dígitos. Ingrese DNI nuevamente");
                    continue;
				}
				
                boolean esNumerico = true; //para verificar si toda la cadena es de tipo entero
                for (int i = 0; i < dniString.length(); i++) {
                    if (!Character.isDigit(dniString.charAt(i))) {
                        esNumerico = false;
                        break; 
                    }
                }
                
                if(!esNumerico){
                    JOptionPane.showMessageDialog(null, "Solo se permiten caracteres numéricos. Ingrese DNI nuevamente");
                    continue;
                }
        	   	
                dni = Integer.parseInt(dniString); // Convertir a entero
                confirmacion = true; // Si todo está correcto, confirmar que el DNI es válido
        		
        	
			} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar DNI. Ingrese DNI nuevamente");
			}
        	
        }while(confirmacion == false);
	
        return dni;
	}
	

	//Validar Nombre
	
	default String validarNombre(String mensaje) {
		String nombre = null;
		boolean confirmacion = false;
	
		do {
			try {
				nombre = JOptionPane.showInputDialog(mensaje);

				if(nombre==null || nombre.trim().isEmpty()){
					JOptionPane.showMessageDialog(null, "No se admiten campos en blanco. Por favor ingrese un Nombre");
					continue;
				}
				
				nombre = nombre.trim();
				

                boolean esString = true; 
                for (int i = 0; i < nombre.length(); i++) {
                    if (!Character.isAlphabetic(nombre.charAt(i))) {
                    	esString = false;
                        break; 
                    }
                }
                
                if(!esString){
                    JOptionPane.showMessageDialog(null, "No se permiten caracteres numericos. Ingrese Nombre nuevamente");
                    continue;
                }
				
                confirmacion = true;
                
			} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar Nombre. Ingrese Nombre nuevamente");
			}

			
		} while (confirmacion==false);
		
		return nombre;
	}
	
	
	//validar el ingreso de pisos en inmueble
	
	
	default String validarEntero(String mensaje) {
		String entero = null;
		boolean confirmacion = false;
	
		do {
			try {
				entero = JOptionPane.showInputDialog(mensaje);

				if(entero==null || entero.trim().isEmpty()){
					JOptionPane.showMessageDialog(null, "No se admiten campos en blanco. Por favor Reingrese los datos");
					continue;
				}
				
				entero = entero.trim();
				
                boolean esEntero = true; 
                for (int i = 0; i < entero.length(); i++) {
                    if (!Character.isDigit(entero.charAt(i))) {
                    	esEntero = false;
                        break; 
                    }
                }
                
                if(!esEntero){
                    JOptionPane.showMessageDialog(null, "Solo se permiten caracteres numericos. Porfavor reingrese los datos.");
                    continue;
                }


				confirmacion = true;
                
			} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error. Reingrese los datos ingresados");
			}

			
		} while (confirmacion==false);
		
		return entero;
	}
	
	
	default double validarDouble(String mensaje) {
		double valor = 0;
		boolean esDouble = false;
	
		do {
			try {
				String entrada = JOptionPane.showInputDialog(mensaje);

				valor = Double.parseDouble(entrada);
				esDouble=true;		
                
			} catch (Exception e) {
                JOptionPane.showMessageDialog( null, "Error. Reingrese los datos ingresados");
			}

			
		} while (esDouble==false);
		
		return valor;
	}
	
	//validar seleccion
	

	
	
	//Validar cadenaString
	
		default String validarCadena(String mensaje) {
			String cadena = null;
			boolean confirmacion = false;
		
			do {
				try {
					cadena = JOptionPane.showInputDialog(mensaje);

					if(cadena==null || cadena.trim().isEmpty()){
						JOptionPane.showMessageDialog(null, "No se admiten campos en blanco. Por favor Reingrese los datos");
						continue;
					}
					
					cadena = cadena.trim();
					
	                boolean valido = true; 
	                for (int i = 0; i < cadena.length(); i++) {
	                    char caracter = cadena.charAt(i);

	                    if (!Character.isDigit(caracter) && !Character.isAlphabetic(caracter)) {
	                    	valido = false;
	                        break; 
	                    }
	                }
	                
	                if(valido == false){
	                	JOptionPane.showMessageDialog(null, "No se permite el ingreso de caracteres especiales");
	                	continue;
	                }
					
					confirmacion = true;
					
	                
				} catch (Exception e) {
	                JOptionPane.showMessageDialog(null, "Error. Reingrese los datos ingresados");
				}

				
			} while (confirmacion==false);
			
			return cadena;
		}
	
	// Revisar luego que mas se le puede implementar.
	
/* --------------------------------------------------------------------------- Validar Fechas ----------------------------------------------------------------------------------------------------------------*/	
	
	default LocalDate validarFecha(LocalDate fecha) {
		int año,mes,dia;
		boolean flag;
		do {		
		flag=true;
		try {

			año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
			// ver el tema del año (si es para una fecha de nacimiento por ejemplo).
			if (año<1900) {
				
				JOptionPane.showMessageDialog(null, "Año ingresado no válido");
				flag=false;
				
			}
	if (flag==true) {		
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
			if (mes<1 || mes>12) {
				
				JOptionPane.showMessageDialog(null, "mes ingresado no válido");
				flag=false;
				
				
			}} else { mes=0;}
	
	if (flag==true) {		
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));
			
			if (dia<1 || dia>31) {
			
				JOptionPane.showMessageDialog(null, "Día ingresado no válido");
				flag=false;
				
				
			}} else { dia=0;}
			
		
			if (flag==true) {
				
				  fecha = LocalDate.of(año, mes, dia);
				
			}
			
			
		} catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la fecha. Debes ingresar números.");
            flag=false;
        
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "error al ingresar la fecha.");
			flag=false;
		} 
		
		
		
		
	} while(!flag==true);	
		
		return fecha;
	}
	
	// Fin del metodo validar Fecha.
	
	
	/* -------------------------------------------------------------------------------------------------  Validar Telefono: ------------------------------------------------------------------------------------*/ 
	
	default int validarTelefono(String telefonoen) {
		boolean flag = true;
		boolean flagNumerico;
		boolean error=false, errorvacios;
		int telefono=0;
		do {
			flag = true;
			flagNumerico = true;
			errorvacios = false;
	if (error==true) {
		telefonoen = JOptionPane.showInputDialog("Ingrese el telefono");
	}
	
	if (telefonoen.isEmpty() || telefonoen.contains(" ")) {
            
			JOptionPane.showMessageDialog(null, "El telefono contiene espacios vacios o directamente esta vacio.");
			error = true;
			flag=false;
			errorvacios=true;
        }

		if (telefonoen.length() != 8 && errorvacios==false) {
			
			JOptionPane.showMessageDialog(null,"Debe contener 8 caracteres numericos"); // En caso de querer mas caracteres numericos se va a tener que hacer long
	        error = true;
	        flag=false;
	    } else {
		
		  for (int i = 0; i < telefonoen.length(); i++) {
	            if (!Character.isDigit(telefonoen.charAt(i))) {
	                flagNumerico = false;
	                error = true;
	                flag=false;
	            }
	        }}
		  
	
	if (flagNumerico == false) {	JOptionPane.showMessageDialog(null, "Se ingreso una cadena de texto en lugar de numerico.");}	  
		  
		  
		  
	if (flagNumerico == true && flag==true)	{
		try {
			
			telefono = Integer.parseInt(telefonoen);
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e);
		}
		
		}}while(!flag==true);
		
		
		
		return telefono;
		
	}
	
	/* --------------------------------------------------------------------------------------- Validar Correo --------------------------------------------------------------------------------------------------------- */
	
	/* pruebas no definitivo */
	
	default String validarEmail(String email) {
	boolean flag=true;
	String mail;
		
	do {	
		
		if (flag==false) {	email = JOptionPane.showInputDialog("Ingresar un correo electronico ------@------.com");}
		
		
		flag = true;
		
		mail = "^[^@]+@[^@]+\\.com$"; 
		
		Pattern pattern = Pattern.compile(mail);
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.matches()) {
			
			JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válidoo");
			flag = false;
			
		} 
		
		}while(!flag);
		
		return email;
		
	}
	
	
	/* ------------------------------------------------------------------------------------ Validar Contraseña ---------------------------------------------------------------------------------------------------------- */
	
	
	default boolean validarContraseña(String contraseña) {
	boolean flag=true;
	int acumnum=0;
		if (contraseña.isEmpty() || contraseña.contains(" ")) {
            
			JOptionPane.showMessageDialog(null, "La password esta vacio o contiene espacios.");
			flag=false;
			
        } else if (contraseña.length() < 6 && flag==true) {
			
        	JOptionPane.showMessageDialog(null, "La contraseña posee menos de 6 carácteres.");
        	flag=false;
        } 
		
		
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(contraseña);
        
        if (!matcher.matches() && flag==true) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener solo caracteres alfabéticos y numéricos.");
            flag = false;
        }
		


		for (int i = 0; i < contraseña.length(); i++) {
			
			 if (Character.isDigit(contraseña.charAt(i))) {
				 
				 acumnum++;
				 
			 }
			
			
		}

		if (acumnum < 2 && flag==true) {
			
			JOptionPane.showMessageDialog(null, "La contraseña debe contener por lo menos 2 numeros.");
			flag = false;
		}
	
		
			
			return flag;
			
		}
	
	
/* ---------------------------------------------------------------------------------------- VALIDAR MONTO ------------------------------------------------------------------------------------------------------------------ */	
	
	default double ValidarMonto(String monto) {
        double monto_final=0;
		String numero = monto;
		boolean valido=true, validacion_final; 
		
		do {
			
			validacion_final = false; 
			
			if (valido==false) {
				
				numero = JOptionPane.showInputDialog(null, "Ingresar un monto con el siguiente formato numero + . + 2 digitos");
				
			}
		
		boolean	flag = ValidarNumero(numero); /* Se valida el monto en la subfuncion, esta se encarga de validar si se escribio un numero entero, en caso de serlo retorna valor True */
		
		
        String patron = "\\d+(\\.\\d{2})?"; /* Patron que permite escribir infinitos digitos luego separado con un . y escribir decimales*/
          
        Pattern pattern = Pattern.compile(patron); /* se asigna el patron */
        
        Matcher matcher = pattern.matcher(numero);
        
        if (flag == true) {	monto =	monto+".00"; /* Si en la Bandera se optiene verdadero significa que se escribio un entero y a este se le asigna .00 para evitar conflictos con la otra bandera. */
        JOptionPane.showMessageDialog(null, numero);
        valido = true;}
        
        else {
        
       if (matcher.matches()) {
    	   
    	   /* Se valida que el valor ingresado corresponda a un double o sea un valor con decimales pero el patron solo admite 2 digitos despues del punto. */
    	   
    	   valido = true;
    	   
    	   
       } else {
    	   
    	   
    	   JOptionPane.showMessageDialog(null, "Se debe agregar un numero");
    	   valido = false;
    	   
       }}
    	
        if (valido == true) {double num = Double.parseDouble(numero);
        	if (num>=10000) {
        		
        		monto_final = num;
        		
        		validacion_final = true;
        		
        	} else { JOptionPane.showMessageDialog(null, "Se ingreso un valor negativo o un 0");
        	validacion_final = false;}
        	
        	
        
        }
        
		}while(validacion_final == false);
        
		
		return monto_final;
	}
	
	
	
	/* ------------------------------------------------------------------------------------------------------ SUBFUNCION DEL VALIDAR MONTO ---------------------------------------------------------------------------------------------------*/
	default boolean ValidarNumero(String monto) {
	boolean	flag = false;
		
		String patronNumeroEntero = "\\d+";  /* Patron numero sin decimales */
		
		 Pattern pattern2 = Pattern.compile(patronNumeroEntero);
	        
	        Matcher matcher2 = pattern2.matcher(monto);
		
	        if (matcher2.matches()) {
	            
	        	flag = true;
	        	
	        } else {
	        	
	        	flag = false;
	            
	        }
	        
	        return flag;
	    
	}
	
/* -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/	
	
	
/*-------------------------------------------------------------------------------------------- ValidarNombre 2 ---------------------------------------------------------------------------------------------------------------- */	
	
	default boolean validarNombre2(String nombre) {
		
		boolean confirmacion = true;
	
		
			try {
				

				if(nombre==null || nombre.trim().isEmpty()){
					JOptionPane.showMessageDialog(null, "No se admiten campos en blanco.");
					confirmacion = false;
				}
				
				nombre = nombre.trim();
				

                boolean esString = true; 
                for (int i = 0; i < nombre.length(); i++) {
                    if (!Character.isAlphabetic(nombre.charAt(i))) {
                    	esString = false;
                        break; 
                    }
                }
                
                if(!esString){
                    JOptionPane.showMessageDialog(null, "No se permiten espacios en blanco o caracteres numericos.");
                    confirmacion = false;
                }
				
               
                
			} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar Nombre. Ingrese Nombre nuevamente");
                confirmacion = false;
			}

			
		
		
		return confirmacion;
	}
	
	
/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */	
	
/* ------------------------------------------------------------------------------------------------- VALIDAR DNI 2 ---------------------------------------------------------------------------------------------------------- */
	
	
	default boolean validarDni2(int dni) {
	    
	    if (String.valueOf(dni).length() != 8) {
	        JOptionPane.showMessageDialog(null, "El DNI debe tener exactamente 8 dígitos.");
	        return false;
	    } else if (dni<0) { JOptionPane.showMessageDialog(null, "Se ingreso un dni negativo."); return false; }

	    return true;
	}
	
	
/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */	

/* --------------------------------------------------------------------------- Validar Fechas 2----------------------------------------------------------------------------------------------------------------*/	
		
		default boolean validarFecha2(LocalDate fecha) {
		    boolean error = true;

		   LocalDate fecha_hoy = LocalDate.now();
		   
		    LocalDate Es_menor = fecha_hoy.minusYears(18);
		    
		    
		    if (fecha == null) {
		        JOptionPane.showMessageDialog(null, "La fecha no puede ser nula o se ingreso un dia o mes no validos.");
		        error = false;
		    }
		    
		    else if (fecha.isBefore(LocalDate.of(1900, 1, 1))) {
		    	
		    	JOptionPane.showMessageDialog(null, "La fecha no puede ser anterior al 1900.");
		    	error = false;
		    } else if (fecha.isAfter(Es_menor)) {
		    	
		    	
		    	JOptionPane.showMessageDialog(null, "El agente debe ser mayor de 18 años...");
		    	error = false;
		    	
		    	
		    }

		    return error; // 
		}
		
/* -------------------------------------------------------------------------------- Validar Telefono --------------------------------------------------------------------------------------------------------------------- */
		
		
		default boolean validarTelefono2(int telefonoen) {
		    boolean error = true;

		  
		    if (String.valueOf(telefonoen).length() != 8) {
		        JOptionPane.showMessageDialog(null, "El telefono debe tener 8 dígitos numéricos");
		        error = false;
		    } else if (telefonoen < 0) { JOptionPane.showMessageDialog(null, "Se ingreso un número negativo."); error=false;}

		   
		    return error;
		}
		
		
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/		
	
/* --------------------------------------------------------------------------------------------------------------- Validar Email ------------------------------------------------------------------------------------------- */		
		
		
		/* pruebas no definitivo */
		
		default boolean validarEmail2(String email) {
		boolean flag=true;
		String mail;
			
			mail = "^[^@]+@[^@]+\\.com$"; 
			
			Pattern pattern = Pattern.compile(mail);
			Matcher matcher = pattern.matcher(email);
			
			if (!matcher.matches()) {
				
				JOptionPane.showMessageDialog(null, "El correo electrónico ingresado no es válidoo");
				flag = false;
				
			} 
			
			
			
			return flag;
			
		}
		
		
/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/		
		
		
		
/* ------------------------------------------------------------------------------------------------------ Validar fecha PagoReservas --------------------------------------------------------------------------------------------- */		

		
		default boolean validarFecha_pagoReserva(LocalDate fecha) {
		    boolean error = true;

		   
		    
		    
		    
		    if (fecha == null) {
		        JOptionPane.showMessageDialog(null, "La fecha no puede ser nula o se ingreso un dia o mes no validos.");
		        error = false;
		    }
		    
		    else if (fecha.isBefore(LocalDate.now())) {
		    	
		    	JOptionPane.showMessageDialog(null, "La fecha no puede ser anterior al dia de hoy.");
		    	error = false;
		    } else if (fecha.isAfter(LocalDate.of(2028, 5, 30))) {
		    	
		    	
		    	JOptionPane.showMessageDialog(null, "Se ingreso una fecha que no es valida.");
		    	error = false;
		    	
		    	
		    }

		    return error; // 
		}
		

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
		InmuebleControlador inmuebleControlador = new InmuebleControlador();
		VentaControlador ventaControlador = new VentaControlador();

		
		default boolean validarCasa(String direccion, String alturaDireccion) {
			
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.getTipo_inmueble().equals("Casa") && inmueble.getDireccion().equalsIgnoreCase(direccion) 
						&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)){
					
					return true; // encontro misma casa
				}
			}
				
			return false; // no encontro misma casa
		}
		
		
		default boolean validarCasa2(String direccion, String alturaDireccion, int idInmueble) {
		    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {

		    	if (inmueble.getTipo_inmueble().equals("Casa") &&
		                inmueble.getId_inmueble() != idInmueble && 
		                inmueble.getDireccion().equals(direccion) &&
		                inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)){
		            return true;
		        }
		    }

		    return false;
		}
		
		
		
		
		
		default boolean validarDepto1(String direccion, String alturaDireccion, String piso, String nroDepto) {
			
			for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {
				if(inmueble.getTipo_inmueble().equals("Departamento") && inmueble.getDireccion().equals(direccion)
						&& inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion)&& inmueble.getPiso().equalsIgnoreCase(piso)
						&& inmueble.getNroDepto().equalsIgnoreCase(nroDepto)){				
					return true;
				}
			}
			
			return false;
		}

		
		default boolean validarDepto2(String direccion, String alturaDireccion, String piso, String nroDepto, int idInmueble) {
		    for (Inmueble inmueble : inmuebleControlador.getAllInmueble()) {

		    	if (inmueble.getTipo_inmueble().equals("Departamento") &&
		                inmueble.getId_inmueble() != idInmueble && 
		                inmueble.getDireccion().equals(direccion) &&
		                inmueble.getAlturaDireccion().equalsIgnoreCase(alturaDireccion) &&
		                inmueble.getPiso().equalsIgnoreCase(piso) &&
		                inmueble.getNroDepto().equalsIgnoreCase(nroDepto)) {
		            return true;
		        }
		    }

		    return false;
		}
		
		
		
		default boolean validarVenta(int idInmueble, int idComprador,int idEmpleado, int idReserva) {
			
	        for (Venta venta : ventaControlador.getAllVentas()) {
	            if (venta.getInmueble() != null && 
	            	venta.getInmueble().getId_inmueble() == idInmueble &&
	                venta.getComprador().getId_cliente() == idComprador &&
	                venta.getEmpleado().getId_empleado() == idEmpleado &&
	                venta.getReserva().getId_reserva() == idReserva) {
	                return true;
	            }
	        }
	        return false;
	    }
		
		
		
		
		
		
		/* ----------------------------------------------------------------------------------------- Validar Correo ------------------------------------------------------------------------------------------------------------------------- */	
		default String ValidarMailDuplicado(String correo) {
			
			ControladorEmpleado controlador = new ControladorEmpleado();
			
			
			
			
			for (Empleado empleado : controlador.getAllEmpleados()) {
				
				
				if (empleado.getCorreo().equalsIgnoreCase(correo)) {
					
					
					return "El correo se encuentra registrado.";
					
					
				}
				
				
				
				
			}
			
			
			return "Mail valido";
		}
		
		
/* Ver si modificar despues con las del metodo agregar Agente y Gerente */
		
		
		default String ValidarDniDuplicado(int dni) {
			
			ControladorEmpleado controlador = new ControladorEmpleado();
			
			for (Empleado empleado : controlador.getAllEmpleados()) {
				
				
				if (dni == empleado.getDni()) {
					
					
					return "El DNI se encuentra repetido";
					
					
				}
				
				
				
				
			}
			
			
			
			
			return "Se puede registrar";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 default String ValidarPrecio(double precio) {

			 

			 try {
				
			
				
				 if (precio >= 10000) {
					 
					 return "el precio es valido";
					 
				 } else {
					 
					 
					 return "El monto debe ser mayor a 10000";
					 
				 }
				 
			
			 
			 } catch (Exception e) {
			
			
				 return "error se esta intentado ingresar un caracter especial";
			 
			 
			 }
			 
			 
			 
			 
			
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   // Método para validar enteros
	    default boolean validarEntero2(String texto) {
	        if (texto.isEmpty()) {
	            return false;
	        }

	        texto = texto.trim();
	        
	        try {
	            double valor = Double.parseDouble(texto);
	            if (!texto.matches("[-+]?[0-9]*\\.?[0-9]+")) {
	                return false;
	            }
	            
	        } catch (NumberFormatException e) {
	            return false;
	        }

	        return true;
	    }
	    
	    
		   // Método para double
	    default boolean validarDobule(String texto) {
	        if (texto.isEmpty()) {
	            return false;
	        }

	        texto = texto.trim();
	        for (int i = 0; i < texto.length(); i++) {
	            if (!Character.isDigit(texto.charAt(i))) {
	                return false;
	            }
	        }

	        return true;
	    }
	    
	    
	    //validar cadena 2
	    
	    default boolean validarCadena2(String texto) {
	        if (texto.isEmpty()) {
	            return false;
	        }

	        texto = texto.trim();
	        for (int i = 0; i < texto.length(); i++) {
	            char caracter = texto.charAt(i);

	            if (!Character.isLetterOrDigit(caracter) && caracter != ' ') {
	                return false;
	            }
	        }

	        return true;
	    }
	    
	    
	    default boolean validarCadena3(String texto) {
	        if (texto.isEmpty()) {
	            return false;
	        }

	        texto = texto.trim();
	        for (int i = 0; i < texto.length(); i++) {
	            char caracter = texto.charAt(i);

	            if (!Character.isLetterOrDigit(caracter) && caracter != ' ') {
	                return false;
	            }
	        }

	        return true;
	    }
	    
	    
	    
	    
		  default boolean VerificarFecha(String fechaString) {
		    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		    	
		    	try {
		    		LocalDate fecha = LocalDate.parse(fechaString, formatter);
		    		return true;
		    	}catch(DateTimeParseException e){
		    		return false;
		    	}
		    }
		  
		  
		  
		  default  boolean esNumero(String numero) {
			       
		        try {
		            Integer.parseInt(numero);
		            return true;
		        } catch (NumberFormatException e) {
		            return false;
		        }
		    }
	    
}
