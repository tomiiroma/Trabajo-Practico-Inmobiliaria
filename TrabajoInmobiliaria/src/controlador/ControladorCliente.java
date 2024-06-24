package controlador;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.ClienteRepository;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.DatabaseConnection;

public class ControladorCliente implements ClienteRepository {

	
	

	   private final Connection connection;

	    public ControladorCliente() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Cliente>  getAllClientes() {
	        List<Cliente> agentes = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente"); 
	            ResultSet resultSet = statement.executeQuery();
	       
	            while (resultSet.next()) {
	        
	            	
	            	Cliente cliente = new Cliente(
	            			resultSet.getString("nombre"),
	            			resultSet.getInt("id_cliente"),
	            			resultSet.getString("apellido"),
	            			resultSet.getString("correo"),
	            			resultSet.getString("direccion"),
	            			resultSet.getInt("telefono"),
	            			resultSet.getDate("fecha_nacimiento").toLocalDate(),
	            			resultSet.getInt("dni"),
	            			resultSet.getInt("id_Propietario"));
;

	            	
	            	
	                agentes.add(cliente);
	          }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	       
	        return agentes;
	    }

	    @Override
	    public Cliente getClienteById(int id) {
	       Cliente cliente = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            
	            	cliente = new Cliente(resultSet.getString("nombre"),
	            			resultSet.getInt("id_cliente"),
	            			resultSet.getString("apellido"),
	            			resultSet.getString("correo"),
	            			resultSet.getString("direccion"),
	            			resultSet.getInt("telefono"),
	            			resultSet.getDate("fecha_nacimiento").toLocalDate(),
	            			resultSet.getInt("dni"),
	            			resultSet.getInt("id_Propietario"));
	            	
	           
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return cliente;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
