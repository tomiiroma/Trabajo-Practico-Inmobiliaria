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
	        
	            	Inmueble inmuebles = new Inmueble(resultSet.getInt("id_inmueble"), 
                            resultSet.getString("localizacion"), 
                            resultSet.getDouble("precio"), 
                            resultSet.getDouble("tamaño"), 
                            resultSet.getInt("cantidadPersonas"),
                            new Propietario(resultSet.getString("nombre_propietario"), //
                			resultSet.getInt("id_propietario"),
                			resultSet.getString("apellido_propietario"),
                			resultSet.getString("email_propietario"),
                			resultSet.getInt("telefono_propietario"),
                			resultSet.getDate("fecha_nacimiento_propietario").toLocalDate(),
                			resultSet.getInt("dni_propietario"),
                			resultSet.getInt("id_propietario")),  // 
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
        			resultSet.getInt("id_propietario")),  // Ver despues 
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
	        try {                                               // id_propietario como clave foranea que conecta los datos del inmueble con el propietario.
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO inmueble (id_inmueble, localizacion, precio, tamaño, cantidadPersonas, id_propietario, operacion, baños, estado, lavadero, patio,dormitorios, cocina, apto_mascota )" + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setInt(1, inmueble.getId_inmueble());
	            statement.setString(2, inmueble.getLocalizacion());
	            statement.setDouble(3, inmueble.getPrecio());
	            statement.setDouble(4, inmueble.getTamaño());
	            statement.setInt(5, inmueble.getCantidadPersonas());
	            statement.setInt(6, inmueble.getPropietario().getId_propietario());
	            statement.setString(7, inmueble.getOperacion());
	            statement.setString(8, inmueble.getBaños());
	            statement.setString(9, inmueble.getEstado());
	            statement.setString(10, inmueble.getLavadero());
	            statement.setString(11, inmueble.getPatio());
	            statement.setString(12, inmueble.getDormitorios());
	            statement.setString(13, inmueble.getCocina());
	            statement.setBoolean(14, inmueble.isApto_mascota());
	            
	            
	            
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
	            PreparedStatement statement = connection.prepareStatement("UPDATE inmueble SET localizacion = ?, precio = ?, tamaño = ?, cantidadPersonas = ?, id_propietario = ?, operacion = ?, baños = ?, estado = ? ,lavadero = ?, patio = ?, dormitorios = ?, cocina = ?, apto_mascota = ? WHERE id_inmueble = ?");
	            statement.setString(1, inmueble.getLocalizacion());
	            statement.setDouble(2, inmueble.getPrecio());
	            statement.setDouble(3, inmueble.getTamaño());
	            statement.setInt(4, inmueble.getCantidadPersonas());
	            statement.setInt(5, inmueble.getPropietario().getId_propietario());
	            statement.setString(6,inmueble.getOperacion());
	            statement.setString(7, inmueble.getBaños());
	            statement.setString(8, inmueble.getEstado());
	            statement.setString(9, inmueble.getLavadero());
	            statement.setString(10,inmueble.getPatio());
	            statement.setString(11,inmueble.getDormitorios());
	            statement.setString(12,inmueble.getCocina());
	            statement.setBoolean(13, inmueble.isApto_mascota());
	            statement.setInt(14, inmueble.getId_inmueble());
	            
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
