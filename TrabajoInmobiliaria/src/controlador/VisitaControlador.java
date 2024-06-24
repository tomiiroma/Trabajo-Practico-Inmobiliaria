package controlador;

import java.sql.Connection;   
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.ReservaRepository;
import interfaces.VisitaRepository;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.Visita;


public class VisitaControlador implements VisitaRepository{
	
	 private final Connection connection;

	    public VisitaControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	
	    @Override
	    public List<Visita> getAllVisita() {
	        List<Visita> visitas = new ArrayList<>();
	        try {
	           PreparedStatement statement = connection.prepareStatement("SELECT * FROM visita ");
	           ResultSet resultSet = statement.executeQuery();
	           
		       InmuebleControlador controlador1 = new InmuebleControlador();
		       ControladorCliente controlador2 = new ControladorCliente();
		       ControladorEmpleado controlador3 = new ControladorEmpleado();
		       

	           while (resultSet.next()) {
	        	   
	               int id_visita = resultSet.getInt("id_visita");
	               
	               LocalDate fecha_visita = resultSet.getDate("fecha_visita").toLocalDate();
	               

	               int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	                	Inmueble inmueble = controlador1.getInmuebleById(fkInmuebleId);

	               
	               int fkClienteId = resultSet.getInt("fk_cliente_id");
	                 	Cliente cliente = controlador2.getClienteById(fkClienteId);

	               
	               int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	            	 	Empleado empleado = controlador3.getEmpleadoById(fkEmpleadoId);

		             Visita visita = new Visita(id_visita,inmueble,cliente,fecha_visita,empleado);	       
		              visitas.add(visita);


	           }
	        } catch (SQLException e) {
	        }
	      return visitas;
	    }

	    
	    @Override
	    public Visita getVisitaById(int id) {
	    	Visita visita = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM visita WHERE id_visita = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
			       InmuebleControlador controlador1 = new InmuebleControlador();
			       ControladorCliente controlador2 = new ControladorCliente();
			       ControladorEmpleado controlador3 = new ControladorEmpleado();

	            if (resultSet.next()) {
		               int id_visita = resultSet.getInt("id_visita");
		               
		               LocalDate fecha_visita = resultSet.getDate("fecha_visita").toLocalDate();
		               

		               int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
		                	Inmueble inmueble = controlador1.getInmuebleById(fkInmuebleId);

		               
		               int fkClienteId = resultSet.getInt("fk_cliente_id");
		                 	Cliente cliente = controlador2.getClienteById(fkClienteId);

		               
		               int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
		            	 	Empleado empleado = controlador3.getEmpleadoById(fkEmpleadoId);
	                

		            visita = new Visita(id_visita,inmueble,cliente,fecha_visita,empleado);	

	            } else {
	                System.out.println("No se encontró la visita con el id: " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return visita;
	    }

	    
	    
	    
	    
		@Override
	    public void addVisita(Visita visita) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO visita (fk_inmueble_id, fk_cliente_id, fecha_visita, fk_empleado_id) VALUES (?, ?, ?, ?)");
	            statement.setInt(1, visita.getInmueble().getId_inmueble());
	            statement.setInt(2, visita.getCliente().getId_cliente());
	            java.sql.Date fecha_visita = java.sql.Date.valueOf(visita.getFecha_visita());
	            statement.setDate(3, fecha_visita);
	            statement.setInt(4, visita.getEmpleado().getId_empleado());

         
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Visita insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		
		@Override
		public void updateVisita(Visita visita) {
		    try {
		        String sql = "UPDATE visita SET fk_inmueble_id = ?, fk_cliente_id = ?, fecha_visita = ?, fk_empleado_id = ? WHERE id_visita = ?";
		        PreparedStatement statement = connection.prepareStatement(sql);
		        statement.setInt(1, visita.getInmueble().getId_inmueble());
		        statement.setInt(2, visita.getCliente().getId_cliente());
		        java.sql.Date fecha_visita = java.sql.Date.valueOf(visita.getFecha_visita());
		        statement.setDate(3, fecha_visita);
		        statement.setInt(4, visita.getEmpleado().getId_empleado());
		        statement.setInt(5, visita.getId_visita());

		        int rowsUpdated = statement.executeUpdate();
		        if (rowsUpdated > 0) {
		            System.out.println("Visita actualizada exitosamente");
		        } else {
		            System.out.println("No se encontró ninguna visita con ese ID.");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}

		
		
		

	    @Override
	    public void deleteVisita(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Visita eliminada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
	    }


}
