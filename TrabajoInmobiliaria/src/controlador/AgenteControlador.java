package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.AgenteRepository;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Agente;
import java.time.LocalDate;

import javax.swing.JOptionPane;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AgenteControlador implements AgenteRepository{

	
	
	   private final Connection connection;

	    public AgenteControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Agente>  getAllAgente() {
	        List<Agente> agentes = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado where tipo_empleado = 'Agente'"); 
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	        
	            	
	            	Agente agente = new Agente(resultSet.getInt("id_empleado"),resultSet.getString("nombre"),resultSet.getString("apellido"),resultSet.getDate("fecha_nacimiento").toLocalDate(),resultSet.getInt("dni"),resultSet.getInt("telefono"),resultSet.getString("correo"),resultSet.getString("tipo_empleado"),resultSet.getString("contraseña"), resultSet.getInt("id_agente"));
	            	
	            	
	            	
	                agentes.add(agente);
	          }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	       
	        return agentes;
	    }

	    @Override
	    public Agente getAgenteById(int id) {
	        Agente agente = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            
	            	agente = new Agente(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("telefono"), resultSet.getString("correo"),  resultSet.getString("tipo_empleado"),resultSet.getString("contraseña"),resultSet.getInt("id_agente"));
	           
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return agente;
	    }

		@Override
	    public void addAgente(Agente agente) {
	        try {																																  // ID_AGENTE Se deberia sacar, ya que va a generar un error ya que no existe en la bdd
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO empleado (nombre, apellido, fecha_nacimiento, dni, telefono, correo, id_agente, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, agente.getNombre());
	            statement.setString(2, agente.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(agente.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4,agente.getDni());
	            statement.setInt(5,agente.getTelefono());
	            statement.setString(6, agente.getCorreo());
	            statement.setInt(7, agente.getId_agente());
	            statement.setString(8, agente.getContraseña());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Agente insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateAgente(Agente agente) {                                                                                                                       // ID_AGENTE Se deberia sacar, ya que va a generar un error ya que no existe en la bdd
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE empleado SET nombre = ?, apellido = ?, fecha_nacimiento = ?, dni = ?, telefono = ?, correo = ?, id_agente = ?, contraseña = ? WHERE id_empleado = ?");
	            statement.setString(1, agente.getNombre());
	            statement.setString(2, agente.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(agente.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4,agente.getDni());
	            statement.setInt(5, agente.getTelefono());
	            statement.setString(6, agente.getCorreo());
	            statement.setInt(7, agente.getId_agente());
	            statement.setString(8, agente.getContraseña());
	            statement.setInt(9, agente.getId_empleado());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteAgente(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM empleado WHERE id_empleado = ?");
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
