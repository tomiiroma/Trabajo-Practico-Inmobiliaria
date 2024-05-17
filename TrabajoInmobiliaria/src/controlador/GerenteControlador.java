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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado ");
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	            								// Idem con Agente consultarle al profe
	            	Gerente Gerentes = new Gerente(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nac").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("telefono"), resultSet.getString("correo"), resultSet.getInt("id_gerente"), resultSet.getString("contraseña"));
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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	 
	               gerente = new Gerente(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nac").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("telefono"), resultSet.getString("correo"), resultSet.getInt("id_gerente"), resultSet.getString("contraseña"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return gerente;
	    }

		@Override
	    public void addGerente(Gerente gerente) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, gerente.getNombre());
	            statement.setString(2, gerente.getCorreo());
	            
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
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, gerente.getNombre());
	            statement.setString(2, gerente.getApellido());
	            statement.setInt(3, gerente.getId_gerente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Gerente actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteGerente(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Gerente eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	

	    }

}

