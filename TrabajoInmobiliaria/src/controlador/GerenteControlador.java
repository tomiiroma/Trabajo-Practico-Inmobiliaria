package controlador;


import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.GerenteRepository;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Gerente;



public class GerenteControlador implements GerenteRepository{

	 private final Connection connection;

	    public GerenteControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Gerente> getAllGerente() {
	        List<Gerente> gerente = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado where tipo_empleado = 'Gerente'");
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	            	Gerente Gerentes = new Gerente(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("telefono"), resultSet.getString("correo"), resultSet.getString("tipo_empleado"), resultSet.getString("contraseña"),resultSet.getInt("id_gerente"));
	                
	            	gerente.add(Gerentes);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	      }
	    
	        return gerente;
	    }

	    
	    @Override
	    public Gerente getGerenteById(int id) {
	    	Gerente gerente = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado WHERE id_empleado = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	 
	            	gerente = new Gerente(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("telefono"), resultSet.getString("correo"), resultSet.getString("tipo_empleado"), resultSet.getString("contraseña"),resultSet.getInt("id_gerente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return gerente;
	    }

		@Override
	    public void addGerente(Gerente gerente) {
	        try {										// Podria utilizar un Inner join en una consulta insert	// Consultarle al profe sobre id_gerente. // Consultar si es valido.
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO empleado (id_empleado,nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, contraseña, id_gerente) VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, gerente.getNombre()); // Verificar si id_empleado es auto increment y consultarle al profe si este valor debe ser null en java.
	            statement.setString(2, gerente.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(gerente.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4, gerente.getDni());
	            statement.setInt(5, gerente.getTelefono());
	            statement.setString(6, gerente.getCorreo());
	            statement.setString(7, gerente.getTipo_empleado());
	            statement.setString(8, gerente.getContraseña());
	            statement.setInt(9, gerente.getId_gerente());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Gerente insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateGerente(Gerente gerente) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE empleado SET nombre = ?, apellido = ?, fecha_nacimiento = ?, dni = ?, telefono = ?, correo = ?, contraseña = ? WHERE id_empleado = ?");
	            statement.setString(1, gerente.getNombre());
	            statement.setString(2, gerente.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(gerente.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4, gerente.getDni());
	            statement.setInt(5, gerente.getTelefono());
	            statement.setNString(6, gerente.getCorreo());
	            statement.setString(7, gerente.getContraseña());
	            statement.setInt(8, gerente.getId_empleado());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Gerente actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteGerente(int id_empleado) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM empleado WHERE id_empleado = ?");
	            statement.setInt(1, id_empleado);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Gerente eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	

	    }

}