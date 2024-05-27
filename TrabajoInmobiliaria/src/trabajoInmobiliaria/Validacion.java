
package trabajoInmobiliaria;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

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
					
	                boolean valido = true; 
	                for (int i = 0; i < cadena.length(); i++) {
	                    char caracter = cadena.charAt(i);

	                    if (!Character.isDigit(caracter) || !Character.isAlphabetic(caracter)) {
	                    	valido = false;
	                        break; 
	                    }
	                }
	                
	                if(valido == false){
	                	JOptionPane.showMessageDialog(null, "No se permite el ingreso de caracteres especiales");
	                	continue;
	                }
					
					cadena = cadena.trim();
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
			
        } else if (contraseña.length() < 8 && flag==true) {
			
        	JOptionPane.showMessageDialog(null, "La contraseña posee menos de 8 carácteres.");
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
	
	
	
	
	
	
	
	
	
}

	
