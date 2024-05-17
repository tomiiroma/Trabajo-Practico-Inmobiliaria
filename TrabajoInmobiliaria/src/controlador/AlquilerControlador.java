package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.AlquilerRepository;
import trabajoInmobiliaria.Alquiler;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.Reserva;

public class AlquilerControlador implements AlquilerRepository {

	

	   private final Connection connection;

	    public AlquilerControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Alquiler>  getAllAlquiler() {
	        List<Alquiler> users = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        
	        // Constructor 
	        
	            //	Agente user = new Alquiler(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Alquiler);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return users;
	    }

	    @Override
	    public Alquiler getAlquilerById(int id) {
	        Alquiler alquiler = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Alquiler WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	//Alquiler(Propietario propietario, Reserva reserva, Inquilino inquilino, LocalDate ini_contrato, LocalDate fin_crontato, Inmueble inmueble, Boolean permisoMascota)
	             //   user = new Agente(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return alquiler;
	    }

		@Override
	    public void addAlquiler(Alquiler alquiler) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO Alquiler (Inmueble.localizacion, Inquilino.nombre) VALUES (?, ?)");
	            statement.setString(1, alquiler.getInmueble().getLocalizacion());
	            statement.setString(2, alquiler.getInquilino().getNombre());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Alquiler insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateAlquiler(Alquiler alquiler) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, alquiler.getInmueble().getLocalizacion());
	            statement.setString(2, alquiler.getInquilino().getNombre());
	            statement.setInt(3, alquiler.getId_alquiler());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Alquiler actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteAlquiler(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Alquiler eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
