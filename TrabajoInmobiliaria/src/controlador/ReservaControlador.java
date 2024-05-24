package controlador;


import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.ReservaRepository;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.DatabaseConnection;

public class ReservaControlador implements ReservaRepository{
	
	
	 private final Connection connection;

	    public ReservaControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Reserva> getAllReserva() {
	        List<Reserva> reservas = new ArrayList<>();
	     //   try {
	          //  PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	           // ResultSet resultSet = statement.executeQuery();
	       
	         //   while (resultSet.next()) {
	        // public Comprador(String nombre,int id_cliente, String apellido, String correo, int telefono, LocalDate fecha_nac, int dni,int comprador, double presupuesto)
	            //	Comprador compradores = new Comprador(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	             //   users.add(Comprador);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	        return reservas;
	    }

	    
	    @Override
	    public Reserva getReservaById(int id) {
	    	Reserva reserva = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	// public Comprador(int comprador, double presupuesto) le falta Herencia con cliente.
	             //   user = new Garante(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return reserva;
	    }

		@Override
	    public void addReserva(Reserva reserva) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO reserva (fk_inmueble_id, fk_cliente_id, fecha_pago, monto_total, forma_pago, fk_empleado_id) VALUES (?, ?, ?, ?, ?, ?)");
	            statement.setInt(1, reserva.getFk_inmueble());
	            statement.setInt(2, reserva.getFk_cliente());
	            java.sql.Date fecha_pago = java.sql.Date.valueOf(reserva.getFecha_pago());
	            statement.setDate(3, fecha_pago);
	            statement.setDouble(4,reserva.getPago());
	            statement.setString(5,reserva.getForma_pago());
	            statement.setInt(6,reserva.getFk_empleado());
	            
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Reserva insertada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateReserva(Reserva reserva) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setDouble(1, reserva.getPago());
	         
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Reserva actualizada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteReserva(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Reserva eliminada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}



	
	
	
	
	
	

}
