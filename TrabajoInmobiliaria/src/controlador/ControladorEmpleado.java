package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trabajoInmobiliaria.Empleado;
import interfaces.EmpleadoRepository;
import trabajoInmobiliaria.DatabaseConnection;

public class ControladorEmpleado implements EmpleadoRepository {

	
	
	 private final Connection connection;

	    public ControladorEmpleado() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }

	    @Override
	    public List<Empleado> getAllEmpleados() {
	        List<Empleado> empleados = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado");
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	            	Empleado empleado = new Empleado(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nacimiento").toLocalDate(),resultSet.getInt("dni"),resultSet.getInt("telefono"),resultSet.getString("correo"),resultSet.getString("tipo_empleado"),resultSet.getString("Contraseña"));
	                empleados.add(empleado);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return empleados;
	    }

	    @Override
	    public Empleado getEmpleadoById(int id) {
	        Empleado empleado = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empleado WHERE id_empleado = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	                empleado = new Empleado(resultSet.getInt("id_empleado"), resultSet.getString("nombre"), resultSet.getString("apellido"), resultSet.getDate("fecha_nacimiento").toLocalDate(),resultSet.getInt("dni"),resultSet.getInt("telefono"),resultSet.getString("correo"),resultSet.getString("tipo_empleado"),resultSet.getString("Contraseña"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return empleado;
	    }

		@Override
	    public void addEmpleado(Empleado empleado) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO empleado (nombre, apellido, fecha_nacimiento, dni, telefono, correo, tipo_empleado, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, empleado.getNombre());
	            statement.setString(2, empleado.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(empleado.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4, empleado.getDni());
	            statement.setInt(5, empleado.getTelefono());
	            statement.setString(6, empleado.getCorreo());
	            statement.setString(7, empleado.getTipo_empleado());
	            statement.setString(8, empleado.getContraseña());
	            
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Usuario insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateEmpleado(Empleado empleado) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE empleado SET nombre = ?, apellido = ?, fecha_nacimiento = ?, dni = ?, telefono = ?, correo = ?, contraseña = ? WHERE id_empleado = ?");
	            statement.setString(1, empleado.getNombre());
	            statement.setString(2, empleado.getApellido());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(empleado.getFecha_nacimiento());
	            statement.setDate(3, fecha_nacimiento);
	            statement.setInt(4, empleado.getDni());
	            statement.setInt(5, empleado.getTelefono());
	            statement.setString(6, empleado.getCorreo());
	            statement.setString(8, empleado.getContraseña());
	            statement.setInt(9, empleado.getId_empleado());
	            
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteEmpleado(int id_empleado) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id_empleado);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Usuario eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
