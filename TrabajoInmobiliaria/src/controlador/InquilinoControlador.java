package controlador;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.InquilinoRepository;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.DatabaseConnection;

public class InquilinoControlador implements InquilinoRepository{
	

	 private final Connection connection;

	    public InquilinoControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Inquilino> getAllInquilino() {
	        List<Inquilino> inquilino = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        // public Inquilino(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int inquilino, double presupuesto)
	            //	Inquilino inquilinos = new Inquilino(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Comprador);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return inquilino;
	    }

	    
	    @Override
	    public Inquilino getInquilinoById(int id) {
	    	Inquilino inquilino = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	// public Inquilino(int inquilino, double presupuesto) le falta Herencia con cliente.
	             //   user = new Garante(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return inquilino;
	    }

		@Override
	    public void addInquilino(Inquilino inquilino) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, inquilino.getNombre());
	            statement.setString(2, inquilino.getCorreo());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Inquilino insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateInquilino(Inquilino inquilino) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, inquilino.getNombre());
	            statement.setString(2, inquilino.getApellido());
	            statement.setInt(3, inquilino.getId_cliente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Inquilino actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteInquilino(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Inquilino eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}




}
