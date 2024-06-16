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
	        List<Inquilino> inquilinos = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente where tipo_cliente='Inquilino'"); 
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) { 
	            	Inquilino inquilino = new Inquilino(resultSet.getString("nombre"), resultSet.getInt("id_cliente"), resultSet.getString("apellido"), resultSet.getString("correo"), resultSet.getString("direccion"),resultSet.getInt("telefono"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("id_inquilino"));
	                inquilinos.add(inquilino);
	           }
	       } catch (SQLException e) {
	            e.printStackTrace();
	       }
	    
	        return inquilinos;
	    }

	    
	    @Override
	    public Inquilino getInquilinoById(int id_cliente) {
	    	Inquilino inquilino = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id_cliente);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	                inquilino = new Inquilino(resultSet.getString("nombre"), resultSet.getInt("id_cliente"), resultSet.getString("apellido"), resultSet.getString("correo"), resultSet.getString("direccion"),resultSet.getInt("telefono"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("id_inquilino"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return inquilino;
	    }

		@Override
	    public void addInquilino(Inquilino inquilino) {
	        try {
	        	PreparedStatement statement = connection.prepareStatement("INSERT INTO cliente (nombre, apellido, correo,direccion, telefono, fecha_nacimiento, dni, tipo_cliente, id_inquilino) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, inquilino.getNombre());
	            statement.setString(2,inquilino.getApellido());
	            statement.setString(3, inquilino.getCorreo());
	            statement.setString(4, inquilino.getDireccion());
	            statement.setInt(5,inquilino.getTelefono());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(inquilino.getFecha_nacimiento());
	            statement.setDate(6, fecha_nacimiento);
	            statement.setInt(7, inquilino.getDni());
	            statement.setString(8, "Inquilino");
	            statement.setInt(9,inquilino.getId_inquilino());

	           
	            
	            
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
	            PreparedStatement statement = connection.prepareStatement("UPDATE cliente SET nombre = ?, apellido = ?, correo = ?, telefono = ?, fecha_nacimiento = ?, dni = ? WHERE id_cliente = ?");
	            statement.setString(1, inquilino.getNombre());
	            statement.setString(2, inquilino.getApellido());
	            statement.setString(3, inquilino.getCorreo());
	            statement.setInt(4, inquilino.getTelefono());
	            java.sql.Date fecha_nac = java.sql.Date.valueOf(inquilino.getFecha_nacimiento());
	            statement.setDate(5, fecha_nac);
	            statement.setInt(6, inquilino.getDni());
	            statement.setInt(7, inquilino.getId_cliente());
	            
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Inquilino actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteInquilino(int id_cliente) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id_cliente);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Inquilino eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}




}
