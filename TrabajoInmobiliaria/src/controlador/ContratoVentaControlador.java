package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.ContratoVentaRepository;
import trabajoInmobiliaria.ContratoVenta;
import trabajoInmobiliaria.DatabaseConnection;

public class ContratoVentaControlador implements ContratoVentaRepository{
	
	 private final Connection connection;

	    public ContratoVentaControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<ContratoVenta> getAllContratoVenta() {
	        List<ContratoVenta> contratosVenta = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        // public Ambiente(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int comprador, double presupuesto)
	            //	Ambiente ambientes = new Ambiente(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Ambiente);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return contratosVenta;
	    }

	    
	    @Override
	    public ContratoVenta getContratoVentaById(int id) {
	    	ContratoVenta contratoVenta = null;
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
	        return contratoVenta;
	    }

		@Override
	    public void addContratoVenta(ContratoVenta contratoVenta) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, contratoVenta.getNombre());
	            statement.setString(2, contratoVenta.getCorreo());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("ContratoVenta insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateContratoVenta(ContratoVenta contratoVenta) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, contratoVenta.getNombre());
	            statement.setString(2, contratoVenta.getApellido());
	            statement.setInt(3, contratoVenta.getId_cliente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("ContratoVenta actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteContratoVenta(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("ContratoVenta eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}




}
