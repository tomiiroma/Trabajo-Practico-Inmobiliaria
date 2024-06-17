package controlador;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.AlquilerRepository;
import trabajoInmobiliaria.Alquiler;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Garante;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Propietario;
import trabajoInmobiliaria.Reserva;

public class AlquilerControlador implements AlquilerRepository {

	

	   private final Connection connection;

	    public AlquilerControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    
	    @Override
	    public List<Alquiler>  getAllAlquiler() {
	        List<Alquiler> alquileres = new ArrayList<>();
	       try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM alquiler ");
	            ResultSet resultSet = statement.executeQuery();
	            GaranteControlador garante = new GaranteControlador();
	            ContratoControlador contrato = new ContratoControlador();
	            InquilinoControlador inquilino = new InquilinoControlador();
	            AgenteControlador agente = new AgenteControlador();
	            InmuebleControlador inmueble = new InmuebleControlador();
	       
	         while (resultSet.next()) {
	        
	        	   int idAlquiler = resultSet.getInt("id_alquiler");
	               int monto = resultSet.getInt("monto_total");
	               LocalDate fecha = resultSet.getDate("inicio_contrato").toLocalDate(); 
	               String formaPago = resultSet.getString("forma_pago");
	               
	               int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	               int fkClienteId = resultSet.getInt("fk_cliente_id");
	               int fkgaranteId = resultSet.getInt("fk_garante_id");
	               int fkcontratoid = resultSet.getInt("fk_contrato_id");
	               int fkagenteid = resultSet.getInt("fk_empleado_id");
	               
	               Cliente cliente= null;
	               Empleado empleado = null;
	               Garante garantes = garante.getGaranteById(fkgaranteId);
	               Contrato contratos = contrato.getContratoById(fkcontratoid);
	               cliente = inquilino.getInquilinoById(fkClienteId);
	               empleado = agente.getAgenteById(fkagenteid);
	               Inmueble inmuebles = inmueble.getInmuebleById(fkInmuebleId);

	              Alquiler alquiler = new Alquiler(idAlquiler,monto,fecha,formaPago,garantes,contratos,cliente,empleado,inmuebles);
	        	 alquileres.add(alquiler);
	        
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	       }
	        return alquileres;
	    }

	    @Override
	    public Alquiler getAlquilerById(int id) {
	        Alquiler alquiler = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM alquiler ");
	            ResultSet resultSet = statement.executeQuery();
	            GaranteControlador garante = new GaranteControlador();
	            ContratoControlador contrato = new ContratoControlador();
	            InquilinoControlador inquilino = new InquilinoControlador();
	            AgenteControlador agente = new AgenteControlador();
	            InmuebleControlador inmueble = new InmuebleControlador();
	       
	         if (resultSet.next()) {
	        
	        	   int idAlquiler = resultSet.getInt("id_alquiler");
	               int monto = resultSet.getInt("monto_total");
	               LocalDate fecha = resultSet.getDate("inicio_contrato").toLocalDate(); 
	               String formaPago = resultSet.getString("forma_pago");
	               
	               int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	               int fkClienteId = resultSet.getInt("fk_cliente_id");
	               int fkgaranteId = resultSet.getInt("fk_id_garante");
	               int fkcontratoid = resultSet.getInt("fk_contrato_id");
	               int fkagenteid = resultSet.getInt("fk_empleado_id");
	               
	               Cliente cliente= null;
	               Empleado empleado = null;
	               Garante garantes = garante.getGaranteById(fkgaranteId);
	               Contrato contratos = contrato.getContratoById(fkcontratoid);
	               cliente = inquilino.getInquilinoById(fkClienteId);
	               empleado = agente.getAgenteById(fkagenteid);
	               Inmueble inmuebles = inmueble.getInmuebleById(fkInmuebleId);

	               alquiler = new Alquiler(idAlquiler,monto,fecha,formaPago,garantes,contratos,cliente,empleado,inmuebles);
	        
	            }else {
	                System.out.println("No se encontró el contrato con id: " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	       }
	        return alquiler;
	    }

		@Override
	    public void addAlquiler(Alquiler alquiler) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO Alquiler (monto_total, fecha, forma_pago, fk_id_garante, fk_contrato_id, fk_cliente_id, fk_empleado_id, fk_inmueble_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setInt(1, alquiler.getMonto_total());
	            java.sql.Date fecha = java.sql.Date.valueOf(alquiler.getFecha());
	            statement.setDate(2, fecha);
	            statement.setString(3, alquiler.getForma_pago());
	            statement.setInt(4, alquiler.getGarante().getId_garante());       
	            statement.setInt(5, alquiler.getContrato().getId_contrato());
	            statement.setInt(6, alquiler.getCliente().getId_cliente());
	            statement.setInt(7, alquiler.getEmpleado().getId_empleado());
	            statement.setInt(8, alquiler.getInmueble().getId_inmueble());
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Alquiler insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateAlquiler(Alquiler alquiler) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, alquiler.getInmueble().getDireccion());
	            statement.setInt(3, alquiler.getId_alquiler());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Alquiler actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteAlquiler(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Alquiler eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
