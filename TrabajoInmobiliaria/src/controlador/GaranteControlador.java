package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.GaranteRepository;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Garante;

public class GaranteControlador implements GaranteRepository {
	
	    private final Connection connection;

	    public GaranteControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Garante>  getAllGarante() {
	        List<Garante> garantes = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM garante");
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	            Garante garante = new Garante(resultSet.getInt("id_garante"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getString("telefono"));
	                garantes.add(garante);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return garantes;
	    }

	    @Override
	    public Garante getGaranteById(int id) {
	        Garante garante = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM garante WHERE id_garante = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            
	                garante = new Garante(resultSet.getInt("id_garante"), resultSet.getString("nombre"), resultSet.getString("apellido") , resultSet.getString("telefono"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return garante;
	    }

		@Override
	    public void addGarante(Garante garante) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO garante (id_garante, nombre, apellido, telefono) VALUES (?, ?, ?, ?)");
	            statement.setInt(1, garante.getId_garante());
	            statement.setString(2, garante.getNombre());
	            statement.setNString(3, garante.getApellido());
	            statement.setNString(4, garante.getNumero_telefono());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Usuario insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateGarante(Garante garante) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE garante SET nombre = ?, apellido = ? telefono = ? WHERE id_garante = ?");
	            statement.setString(1, garante.getNombre());
	            statement.setString(2, garante.getApellido());
	            statement.setString(4, garante.getNumero_telefono());
	            statement.setInt(4, garante.getId_garante());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteGarante(int id_garante) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM garante WHERE id_garante = ?");
	            statement.setInt(1, id_garante);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Garante eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
