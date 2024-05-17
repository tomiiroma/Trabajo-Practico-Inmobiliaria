package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.PropietarioRepository;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Propietario;

public class PropietarioControlador implements PropietarioRepository {

	
	 private final Connection connection;

	    public PropietarioControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Propietario>  getAllPropietario() {
	        List<Propietario> compradores = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        
	       // Constructor -> (String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni, int id_propietario, LocalDate fecha_registro)
	        
	            //	Propietario propietarios = new Propietario(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Comprador);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return compradores;
	    }

	    @Override
	    public Propietario getPropietarioById(int id) {
	        Propietario comprador = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	// public Propietario (String nombre, int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni, int id_propietario, LocalDate fecha_registro)
	             //   user = new Propietario(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente")); 
	            	//poner datos de propietario (Arriba).
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return comprador;
	    }

		@Override
	    public void addPropietario(Propietario propietario) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, propietario.getNombre());
	            statement.setString(2, propietario.getCorreo());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Usuario insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updatePropietario(Propietario propietario) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	          statement.setString(1, propietario.getNombre());
	            statement.setString(2, propietario.getApellido());
	            statement.setInt(3, propietario.getId_cliente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deletePropietario(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Usuario eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}
	
	
	
	
	
	
	
	
	
	
}
