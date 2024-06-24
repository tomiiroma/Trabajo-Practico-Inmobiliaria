
package controlador;


import java.sql.Connection;   
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.ReservaRepository;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;


public class ReservaControlador implements ReservaRepository{
	
	
	 private final Connection connection;

	    public ReservaControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Reserva> getAllReserva() {
	    	
	        List<Reserva> reservas = new ArrayList<>();
	        try {
	        	PreparedStatement statement = connection.prepareStatement
	        	("SELECT reserva.*, empleado.tipo_empleado FROM reserva JOIN empleado ON reserva.fk_empleado_id = empleado.id_empleado");
	        	ResultSet resultSet = statement.executeQuery();
	            ControladorCliente clientec = new ControladorCliente();
	        	InmuebleControlador controlador = new InmuebleControlador();
	            ControladorEmpleado empleadocontrolador = new ControladorEmpleado();
	            while (resultSet.next()) {
	            	
	            	 int id_reserva = resultSet.getInt("id_reserva");

	            	
	            	 String tipoEmpleado = resultSet.getString("tipo_empleado");
	     
	            	
	            	 int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	                
	                 int fkclienteId = resultSet.getInt("fk_cliente_id");
	                 
	                 Inmueble inmueble = controlador.getInmuebleById(fkInmuebleId);
	                 
	                 
	                 Cliente cliente = clientec.getClienteById(fkclienteId);
	                 int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	                 
	                
	            	
	                 LocalDate Fecha_pago = resultSet.getDate("fecha_pago").toLocalDate();   
	                 
	                 String forma_pago = resultSet.getString("forma_pago");
	            	
	            	 double montoTotal = resultSet.getDouble("monto_total");
	            	
	            	 fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	            	 Empleado empleado = empleadocontrolador.getEmpleadoById(fkEmpleadoId);
	            	
	                 String tipo_reserva = resultSet.getString("tipo_reserva");

	            	
	                 Reserva reserva = new Reserva(id_reserva,inmueble, cliente, Fecha_pago, montoTotal, forma_pago, empleado,tipo_reserva);	       
	                 reservas.add(reserva);
	            }
	        } catch (SQLException e) {
	           e.printStackTrace();
	       }
	   
	        return reservas;
	    }

	    
	 //   @Override
	  //  public Reserva getReservaById(int id) {
	    //	Reserva reserva = null;
	    //    try {
	      //      PreparedStatement statement = connection.prepareStatement("SELECT * FROM reserva WHERE id = ?");
	     //       statement.setInt(1, id);
	            
	     //       ResultSet resultSet = statement.executeQuery();
	            
	     //       if (resultSet.next()) {
	            	// public Comprador(int comprador, double presupuesto) le falta Herencia con cliente.
	             //   user = new Garante(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	      //      }
	 //       } catch (SQLException e) {
	       //     e.printStackTrace();
	   //       return reserva;
	//    }
	    
	    
	    
	    @Override
	    public Reserva getReservaById(int id) {
	    	Reserva reserva = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM reserva WHERE id_reserva = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            ReservaControlador controladorReserva = new ReservaControlador();
	            InmuebleControlador controladorInmueble = new InmuebleControlador();
	            CompradorControlador controladorComprador = new CompradorControlador();
	            AgenteControlador controladorAgente = new AgenteControlador();
	            GerenteControlador controladorGerente = new GerenteControlador();            
	            
	            if (resultSet.next()) {
	                int id_reserva = resultSet.getInt("id_reserva");
	                int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	                int fkCompradorId = resultSet.getInt("fk_cliente_id");
	                LocalDate fechaPago = resultSet.getDate("fecha_pago").toLocalDate();
	                double montototal = resultSet.getDouble("monto_total");
	                String forma_pago = resultSet.getString("forma_pago");
	                int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	                String tipo_reserva = resultSet.getString("tipo_reserva");


	                Inmueble inmueble = controladorInmueble.getInmuebleById(fkInmuebleId);
	                Comprador comprador = controladorComprador.getCompradorById(fkCompradorId);


	                Empleado empleado = null;


	                reserva = new Reserva(id_reserva, inmueble, comprador,fechaPago, montototal, forma_pago, empleado,tipo_reserva);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return reserva;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

		@Override
	    public void addReserva(Reserva reserva) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO reserva (fk_inmueble_id, fk_cliente_id, fecha_pago, monto_total, forma_pago, fk_empleado_id, tipo_reserva) VALUES (?, ?, ?, ?, ?, ?, ?)");
	            statement.setInt(1, reserva.getInmueble().getId_inmueble());
	            statement.setInt(2, reserva.getCliente().getId_cliente());
	            java.sql.Date fecha_pago = java.sql.Date.valueOf(reserva.getFecha_pago());
	            statement.setDate(3, fecha_pago);
	            statement.setDouble(4,reserva.getPago());
	            statement.setString(5,reserva.getForma_pago());
	            statement.setInt(6,reserva.getEmpleado().getId_empleado());
	            statement.setString(7, reserva.getTipo_reserva());
	            
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