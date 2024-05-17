package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


import interfaces.ContratoRepository;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.DatabaseConnection;

public class ContratoControlador implements ContratoRepository{
	

	 private final Connection connection;

	    public ContratoControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Contrato> getAllContrato() {
	        List<Contrato> contratos = new ArrayList<>();
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
	        return contratos;
	    }

	    
	    @Override
	    public Contrato getContratoById(int id) {
	        Contrato contrato = null;
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
	        return contrato;
	    }

		@Override
	    public void addContrato(Contrato contrato) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, contrato.getDescripcion());
	            statement.setDouble(2, contrato.getMonto());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Ambiente insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateContrato(Contrato contrato) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, contrato.getDescripcion());
	           // statement.setLocalDate(2, contrato.getFin_contrato());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteContrato(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Ambiente eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}

}
