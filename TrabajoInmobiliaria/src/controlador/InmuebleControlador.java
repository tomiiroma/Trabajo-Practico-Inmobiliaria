package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.InmuebleRepository;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.DatabaseConnection;

public class InmuebleControlador implements InmuebleRepository{
	

	 private final Connection connection;

	    public InmuebleControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
   
	    
	    
	    @Override
	    public List<Inmueble> getAllInmueble() {
	        List<Inmueble> inmueble = new ArrayList<>();
	        
	       try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM inmueble "); // Buscar el nombre en la base de datos. consultarle al profe me parece que necesita un join con Propietario.
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	        
	            	Inmueble inmuebles = new Inmueble(
	            		    resultSet.getInt("id_inmueble"), 
                            resultSet.getString("tipo_inmueble"), 
                            resultSet.getString("condicion"), 
                            resultSet.getString("cantAmbientes"), 
                            resultSet.getString("barrio"), 
                            resultSet.getString("direccion"), 
                            resultSet.getString("descripcion"), 
                            resultSet.getString("antiguedad"), 
                            resultSet.getString("banio"),                            
                            resultSet.getString("dormitorio"), 
                            resultSet.getDouble("superficie_cubierta"),
                            resultSet.getDouble("superficie_descubierta"),
                            resultSet.getDouble("precio"), 
                            resultSet.getBoolean("disponible"),
                            resultSet.getBoolean("refaccionar"),
                            resultSet.getBoolean("apto_mascota"),
                    		resultSet.getBoolean("patio"));     

          
	            	   inmueble.add(inmuebles);
	          }
	        } catch (SQLException e) {
	            e.printStackTrace();
	       }
	        return inmueble;
	    }

	    
	    @Override
	    public Inmueble getInmuebleById(int id) {
	    	Inmueble inmueble = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM inmueble WHERE id_inmueble  = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	
	               inmueble = new Inmueble(
	            		    resultSet.getInt("id_inmueble"), 
                            resultSet.getString("tipo_inmueble"), 
                            resultSet.getString("condicion"), 
                            resultSet.getString("cantAmbientes"), 
                            resultSet.getString("barrio"), 
                            resultSet.getString("direccion"), 
                            resultSet.getString("descripcion"), 
                            resultSet.getString("antiguedad"), 
                            resultSet.getString("banio"),                            
                            resultSet.getString("dormitorio"), 
                            resultSet.getDouble("superficie_cubierta"),
                            resultSet.getDouble("superficie_descubierta"),
                            resultSet.getDouble("precio"), 
                            resultSet.getBoolean("disponible"),
                            resultSet.getBoolean("refaccionar"),
                            resultSet.getBoolean("apto_mascota"),
                    		resultSet.getBoolean("patio"));          
	              
         
	            }
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return inmueble;
	   
	    }

		@Override
	    public void addInmueble(Inmueble inmueble) {
	        try {                                               // id_propietario como clave foranea que conecta los datos del inmueble con el propietario.
	            PreparedStatement statement = connection.prepareStatement(
	            	    "INSERT INTO inmueble (id_inmueble, tipo_inmueble, condicion, disponible, cantAmbientes, superficie_cubierta, superficie_descubierta, barrio, direccion, patio, descripcion, antiguedad, precio, banio, refaccionar, dormitorio, apto_mascota) " +
	            	    	    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
	                );
	            
	            statement.setInt(1, inmueble.getId_inmueble());
	            statement.setString(2, inmueble.getTipo_inmueble());
	            statement.setString(3, inmueble.getCondicion());
	            statement.setBoolean(4, inmueble.isDisponible());
	            statement.setString(5, inmueble.getCantAmbientes());
	            statement.setDouble(6, inmueble.getSuperficie_cubierta());
	            statement.setDouble(7, inmueble.getSuperficie_descubierta());
	            statement.setString(8, inmueble.getBarrio());
	            statement.setString(9, inmueble.getDireccion());
	            statement.setBoolean(10, inmueble.ispatio());
	            statement.setString(11, inmueble.getDescripcion());
	            statement.setString(12, inmueble.getAntiguedad());
	            statement.setDouble(13, inmueble.getPrecio());
	            statement.setString(14, inmueble.getBanio());
	            statement.setBoolean(15, inmueble.isRefaccionar());
	            statement.setString(16, inmueble.getDormitorio());
	            statement.setBoolean(17, inmueble.isApto_mascota());
      
	            
	            

 
	            int rowsInserted = statement.executeUpdate();
	            
	            if (rowsInserted > 0) {
	                System.out.println("Inmueble Agregado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateInmueble(Inmueble inmueble) {
	        try {
	        	PreparedStatement statement = connection.prepareStatement(
	        		    "INSERT INTO inmueble (id_inmueble, tipo_inmueble, condicion, disponible, cantAmbientes, superficie_cubierta, superficie_descubierta, barrio, direccion, patio, descripcion, antiguedad, precio, banio, refaccionar, dormitorio, apto_mascota) " +
	        		    	    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
	        		);	            
	            statement.setInt(1, inmueble.getId_inmueble());
	            statement.setString(2, inmueble.getTipo_inmueble());
	            statement.setString(3, inmueble.getCondicion());
	            statement.setBoolean(4, inmueble.isDisponible());
	            statement.setString(5, inmueble.getCantAmbientes());
	            statement.setDouble(6, inmueble.getSuperficie_cubierta());
	            statement.setDouble(7, inmueble.getSuperficie_descubierta());
	            statement.setString(8, inmueble.getBarrio());
	            statement.setString(9, inmueble.getDireccion());
	            statement.setBoolean(10, inmueble.ispatio());
	            statement.setString(11, inmueble.getDescripcion());
	            statement.setString(12, inmueble.getAntiguedad());
	            statement.setDouble(13, inmueble.getPrecio());
	            statement.setString(14, inmueble.getBanio());
	            statement.setBoolean(15, inmueble.isRefaccionar());
	            statement.setString(16, inmueble.getDormitorio());
	            statement.setBoolean(17, inmueble.isApto_mascota());

	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Inmueble actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteInmueble(int id_inmueble) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM inmueble WHERE id_inmueble = ?");
	            statement.setInt(1, id_inmueble);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Inmueble eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}




}
