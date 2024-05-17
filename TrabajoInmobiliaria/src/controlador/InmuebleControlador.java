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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM inmueble "); // Buscar el nombre en la base de datos.
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	        
	            	Inmueble inmuebles = new Inmueble(resultSet.getInt("id_inmueble"), 
                            resultSet.getString("localizacion"), 
                            resultSet.getDouble("precio"), 
                            resultSet.getDouble("tamaño"), 
                            resultSet.getInt("cantidadPersonas"),
                            new Propietario(resultSet.getString("nombre_propietario"),
                			resultSet.getInt("id_propietario"),
                			resultSet.getString("apellido_propietario"),
                			resultSet.getString("email_propietario"),
                			resultSet.getInt("telefono_propietario"),
                			resultSet.getDate("fecha_nacimiento_propietario").toLocalDate(),
                			resultSet.getInt("dni_propietario"),
                			resultSet.getInt("id_propietario")),  
                            resultSet.getString("operacion"), 
                            resultSet.getString("baños"), 
                            resultSet.getString("estado"), 
                            resultSet.getString("lavadero"), 
                            resultSet.getString("patio"),
                            resultSet.getString("dormitorios"), 
                            resultSet.getString("cocina"), 
                            resultSet.getBoolean("apto_mascota")); 
	             
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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM inmueble WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	
	               inmueble = new Inmueble(resultSet.getInt("id_inmueble"), 
                    resultSet.getString("localizacion"), 
                    resultSet.getDouble("precio"), 
                    resultSet.getDouble("tamaño"), 
                    resultSet.getInt("cantidadPersonas"),
                    new Propietario(resultSet.getString("nombre_propietario"),
        			resultSet.getInt("id_propietario"),
        			resultSet.getString("apellido_propietario"),
        			resultSet.getString("email_propietario"),
        			resultSet.getInt("telefono_propietario"),
        			resultSet.getDate("fecha_nacimiento_propietario").toLocalDate(),
        			resultSet.getInt("dni_propietario"),
        			resultSet.getInt("id_propietario")),  
                    resultSet.getString("operacion"), 
                    resultSet.getString("baños"), 
                    resultSet.getString("estado"), 
                    resultSet.getString("lavadero"), 
                    resultSet.getString("patio"),
                    resultSet.getString("dormitorios"), 
                    resultSet.getString("cocina"), 
                    resultSet.getBoolean("apto_mascota")); 
         
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return inmueble;
	    }

		@Override
	    public void addInmueble(Inmueble inmueble) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (localizacion, precio) VALUES (?, ?)");
	            statement.setString(1, inmueble.getLocalizacion());
	            statement.setDouble(2, inmueble.getPrecio());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Inmueble insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateInmueble(Inmueble inmueble) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, inmueble.getLocalizacion());
	            statement.setDouble(2, inmueble.getPrecio());
	            statement.setInt(3, inmueble.getId_inmueble());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Inmueble actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteInmueble(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Inmueble eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}




}
