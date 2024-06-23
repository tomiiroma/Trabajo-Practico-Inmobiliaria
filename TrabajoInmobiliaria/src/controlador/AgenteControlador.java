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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado WHERE id_empleado = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	                int id_empleado = resultSet.getInt("id_empleado");
	                String nombre = resultSet.getString("nombre");
	                String apellido = resultSet.getString("apellido");
	                LocalDate fecha_nacimiento = resultSet.getDate("fecha_nacimiento").toLocalDate();
	                int dni = resultSet.getInt("dni");
	                int telefono = resultSet.getInt("telefono");
	                String correo = resultSet.getString("correo");
	                String tipo_empleado = resultSet.getString("tipo_empleado");
	                String contraseña = resultSet.getString("contraseña");
	                int id_agente = resultSet.getInt("id_agente");
	                
	                agente = new Agente(id_empleado, nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, contraseña, id_agente);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return agente;
	    }


		@Override
	    public void addAgente(Agente agente) {
	        try {																																  // ID_AGENTE Se deberia sacar, ya que va a generar un error ya que no existe en la bdd
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO empleado (nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, id_agente, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, agente.getNombre());
	            statement.setString(2, agente.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(agente.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4,agente.getDni());
	            statement.setInt(5,agente.getTelefono());
	            statement.setString(6, agente.getCorreo());
	            statement.setString(7, agente.getTipo_empleado());
	            statement.setInt(8, agente.getId_agente());
	            statement.setString(9, agente.getContraseña());
	            
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
		public String deleteAgente(int id) {
		    try {
		        
		        String sql = "SELECT COUNT(*) AS total FROM " +
		                     "(SELECT 1 FROM venta WHERE fk_empleado_id = ? " +
		                     "UNION ALL " +
		                     "SELECT 1 FROM visita WHERE fk_empleado_id = ? " +
		                     "UNION ALL " +
		                     "SELECT 1 FROM reserva WHERE fk_empleado_id = ? " +
		                     "UNION ALL " +
		                     "SELECT 1 FROM reunion WHERE fk_empleado_id = ? " +
		                     "UNION ALL " +
		                     "SELECT 1 FROM alquiler WHERE fk_empleado_id = ?) AS ref_count";
		        
		        PreparedStatement checkStatement = connection.prepareStatement(sql);
		        for (int i = 1; i <= 5; i++) {
		            checkStatement.setInt(i, id);
		        }
		        
		        ResultSet resultSet = checkStatement.executeQuery();
		        resultSet.next();
		        int referencesCount = resultSet.getInt("total");
		        
		        if (referencesCount > 0) {
		            JOptionPane.showMessageDialog(null,"El empleado no puede ser eliminado porque tiene referencias en otras tablas.");
		            return "El empleado no puede ser eliminado, tiene referencias en otras tablas.";
		        }
		        
		        PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM empleado WHERE id_empleado = ?");
		        deleteStatement.setInt(1, id);
		        
		        int rowsDeleted = deleteStatement.executeUpdate();
		        if (rowsDeleted > 0) {
		            System.out.println("Empleado eliminado exitosamente");
		            return "Empleado eliminado";
		        } else {
		            System.out.println("No se encontró ningún empleado con ese ID.");
		            return "No se encontro ningun empleado";
		        }
		        
		    } catch (SQLException e) {
		        e.printStackTrace();
		        return "error";
		    }
		}

		
		
		
		
		
		
		
		
		
	  /*  @Override
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
	
	*/
	
	
	
	
	
	
	
	
	
	
	
}