package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

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
	        List<Propietario> propietarios = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente where tipo_cliente='Propietario'");
	            ResultSet resultSet = statement.executeQuery();
	       
	           while (resultSet.next()) {
	        
	       
	        
	            	Propietario propietario = new Propietario(resultSet.getString("nombre"), resultSet.getInt("id_cliente"), resultSet.getString("apellido"), resultSet.getString("correo"),resultSet.getString("direccion") ,resultSet.getInt("telefono"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("id_propietario"));
	               propietarios.add(propietario);
	            }
	       } catch (SQLException e) {
	            e.printStackTrace();
	      }
	   
	        return propietarios;
	    }

	    @Override
	    public Propietario getPropietarioById(int id) {
	        Propietario propietario = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	
	                propietario = new Propietario(resultSet.getString("nombre"), resultSet.getInt("id_cliente"), resultSet.getString("apellido"), resultSet.getString("correo"),resultSet.getString("direccion") ,resultSet.getInt("telefono"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("id_propietario")); 
	            
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return propietario;
	    }

		@Override
	    public void addPropietario(Propietario propietario) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO cliente (nombre, apellido, correo, direccion, telefono, fecha_nacimiento, dni, tipo_cliente, id_propietario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, propietario.getNombre());
	            statement.setString(2, propietario.getApellido());
	            statement.setString(3, propietario.getCorreo());
	            statement.setString(4, propietario.getDireccion());
	            statement.setInt(5, propietario.getTelefono());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(propietario.getFecha_nacimiento());
	            statement.setDate(6, fecha_nacimiento);
	            statement.setInt(7, propietario.getDni());
	            statement.setString(8, "Propietario");
	            statement.setInt(9, propietario.getId_propietario());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Propietario insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updatePropietario(Propietario propietario) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE cliente SET nombre = ?, apellido = ?, correo = ?, telefono = ?, fecha_nacimiento = ?, dni = ?  WHERE id_cliente = ?");
	          statement.setString(1, propietario.getNombre());
	            statement.setString(2, propietario.getApellido());
	            statement.setString(3, propietario.getCorreo());
	            statement.setInt(4, propietario.getTelefono());
	            java.sql.Date fecha_nac = java.sql.Date.valueOf(propietario.getFecha_nacimiento());
	            statement.setDate(5, fecha_nac);
	            statement.setInt(6, propietario.getDni());
	            statement.setInt(7, propietario.getId_cliente());

	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Propietario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deletePropietario(int id_cliente) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id_cliente);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Usuario eliminado exitosamente");
	            }
	        }catch(MySQLIntegrityConstraintViolationException  err) { 
	        	if(err.getMessage().contains("contrato")) {
		        	JOptionPane.showMessageDialog(null, "El cliente esta con un contrato activo");   		
	        	}else {
	        		JOptionPane.showMessageDialog(null, "No se puede eliminar este cliente");
	        	}
	        
	        }catch(SQLException e) {
	        	  e.printStackTrace();
	        }
	
	    }

	
}
