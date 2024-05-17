package trabajoInmobiliaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public interface Validacion {
	
	
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
	
	
	 // Revisar luego que mas se le puede implementar.
	
	default LocalDate validarFecha() {
		int año,mes,dia;
		LocalDate fecha = null;
		boolean flag;
		do {		
		flag=true;
		try {
			año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el año"));
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el mes"));
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el dia"));

			// ver el tema del año (si es para una fecha de nacimiento por ejemplo).
			if (año<1900) {
				
				JOptionPane.showMessageDialog(null, "Año ingresado no válido");
				flag=false;
				
			}
			
			if (mes<1 || mes>12) {
				
				JOptionPane.showMessageDialog(null, "mes ingresado no válido");
				flag=false;
				
				
			}
			
			
			if (dia<1 || dia>31) {
			
				JOptionPane.showMessageDialog(null, "Día ingresado no válido");
				flag=false;
				
				
			}
			
			
			if (flag==true) {
				
				  fecha = LocalDate.of(año, mes, dia);
				
			}
			
			
		} catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la fecha. Debes ingresar números.");
          
        
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "error al ingresar la fecha.");
			
		} 
		
		
		
		
	} while(flag==true);	
		
		return fecha;
	}
	
	// Fin del metodo validar Fecha.
	
	
	
	
	
	
	
}

	
