package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.CompradorRepository;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.DatabaseConnection;

public class CompradorControlador implements CompradorRepository{

	 private final Connection connection;

	    public CompradorControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Comprador>  getAllComprador() {
	        List<Comprador> compradores = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        // public Comprador(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int comprador, double presupuesto)
	            //	Comprador compradores = new Comprador(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Comprador);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return compradores;
	    }

	    @Override
	    public Comprador getCompradorById(int id) {
	        Comprador comprador = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	// public Comprador(int comprador, double presupuesto) le falta Herencia con cliente.
	             //   user = new Garante(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return comprador;
	    }

		@Override
	    public void addComprador(Comprador comprador) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, comprador.getNombre());
	            statement.setString(2, comprador.getCorreo());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Usuario insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateComprador(Comprador comprador) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	          statement.setString(1, comprador.getNombre());
	            statement.setString(2, comprador.getApellido());
	            statement.setInt(3, comprador.getId_cliente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteComprador(int id) {
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
