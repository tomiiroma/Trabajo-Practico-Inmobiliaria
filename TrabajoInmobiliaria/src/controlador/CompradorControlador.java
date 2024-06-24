package controlador;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.CompradorRepository;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Inquilino;

public class CompradorControlador implements CompradorRepository{

	 private final Connection connection;

	    public CompradorControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Comprador> getAllComprador() {
	        List<Comprador> compradores = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT id_cliente,nombre,apellido,correo,direccion,telefono,fecha_nacimiento,dni,id_comprador FROM cliente WHERE tipo_cliente='Comprador'");
	            ResultSet resultSet = statement.executeQuery();
	            
	            while (resultSet.next()) {
	                Comprador comprador = new Comprador(resultSet.getString("nombre"), 
	                                                    resultSet.getInt("id_cliente"), 
	                                                    resultSet.getString("apellido"), 
	                                                    resultSet.getString("correo"), 
	                                                    resultSet.getString("direccion"), 
	                                                    resultSet.getInt("telefono"), 
	                                                    resultSet.getDate("fecha_nacimiento").toLocalDate(), 
	                                                    resultSet.getInt("dni"),
	                                                    resultSet.getInt("id_comprador"));

	                compradores.add(comprador);	
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return compradores;
	    }


	    @Override
	    public Comprador getCompradorById(int id) {
	        Comprador comprador = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT nombre,id_cliente,apellido,correo,direccion,telefono,fecha_nacimiento,dni,id_comprador FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	
	            	comprador = new Comprador(resultSet.getString("nombre"), resultSet.getInt("id_cliente"), resultSet.getString("apellido"), resultSet.getString("correo"), resultSet.getString("direccion"),resultSet.getInt("telefono"), resultSet.getDate("fecha_nacimiento").toLocalDate(), resultSet.getInt("dni"), resultSet.getInt("id_comprador"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return comprador;
	    }

		@Override
	    public void addComprador(Comprador comprador) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO cliente (nombre, id_cliente, apellido, correo, telefono, fecha_nac, dni, comprador, Presupuesto) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, comprador.getNombre());
	            statement.setInt(2, comprador.getId_cliente());	            
	            statement.setString(3, comprador.getApellido());
	            statement.setString(4, comprador.getCorreo());
	            statement.setInt(5, comprador.getTelefono());
	            java.sql.Date fecha_nacimiento = java.sql.Date.valueOf(comprador.getFecha_nacimiento());
	            statement.setDate(6, fecha_nacimiento);
	            statement.setInt(7, comprador.getDni());
	            
	            
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Cliente comprador insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateComprador(Comprador comprador) {
	        try {																								// ver si utilizar como clave el id_cliente o comprador.
	            PreparedStatement statement = connection.prepareStatement("UPDATE cliente SET nombre = ?, apellido = ? correo = ?, telefono = ?, fecha_nac = ?, dni = ?, Presupuesto = ? WHERE id_cliente = ?");
	          statement.setString(1, comprador.getNombre());
	          statement.setString(2, comprador.getApellido());
	          statement.setString(3, comprador.getCorreo());
	          statement.setInt(4, comprador.getTelefono());
	          java.sql.Date fecha_nac = java.sql.Date.valueOf(comprador.getFecha_nacimiento());
	          statement.setDate(5, fecha_nac);  
	          statement.setInt(6, comprador.getDni());
	          statement.setInt(7, comprador.getId_cliente());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario comprador actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteComprador(int id_cliente) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id_cliente);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Usuario eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}
}
