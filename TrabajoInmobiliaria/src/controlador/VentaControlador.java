package controlador;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.VentaRepository;
import trabajoInmobiliaria.Agente;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Empleado;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Reserva;
import trabajoInmobiliaria.Venta;

public class VentaControlador implements VentaRepository {

	
	
	 private final Connection connection;

	    public VentaControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }

	    @Override
	    public List<Venta> getAllVentas() {
	        List<Venta> ventas = new ArrayList<>();
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM venta");
	            ResultSet resultSet = statement.executeQuery();
	            InmuebleControlador controladorInmueble = new InmuebleControlador();
	            CompradorControlador controladorComprador = new CompradorControlador();
	            ContratoControlador controladorContrato = new ContratoControlador();
	            AgenteControlador controladorAgente = new AgenteControlador();
	            GerenteControlador controladorGerente = new GerenteControlador();
	            ReservaControlador controladorReserva = new ReservaControlador();
	            
	            while (resultSet.next()) {
	            	
	            	
	            	  int id_venta = resultSet.getInt("id_venta");
	            	  
	            	  int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	            	  int fkCompradorId = resultSet.getInt("fk_cliente_id");
	            	  int fkContratoId = resultSet.getInt("fk_contrato_id");
	            	  double montototal = resultSet.getInt("monto_total");
	            	  int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	            	  int fkReservaId = resultSet.getInt("fk_reserva_id");

	            	  
	            	  String forma_pago = resultSet.getString("forma_pago");

	            	  Inmueble inmueble = controladorInmueble.getInmuebleById(fkInmuebleId);
	            	  Comprador comprador = controladorComprador.getCompradorById(fkCompradorId);
	                  Contrato contrato = controladorContrato.getContratoById(fkContratoId);
	                  Reserva reserva = controladorReserva.getReservaById(fkReservaId);
	                  String tipoEmpleado = resultSet.getString("tipo_empleado");

	                  
	                  Empleado empleado = null;
	                  
	                  if(tipoEmpleado.equalsIgnoreCase("agente")) {
	                	  empleado = controladorAgente.getAgenteById(fkEmpleadoId);
	                  }else if(tipoEmpleado.equalsIgnoreCase("gerente")) {
	                	  empleado = controladorGerente.getGerenteById(fkEmpleadoId);
	                  }
	                  	
	                  Venta venta = new Venta(id_venta, inmueble, comprador, contrato, montototal,forma_pago,empleado, tipoEmpleado,reserva);
	                  
	                  ventas.add(venta);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return ventas;
	    }

	    @Override
	    public Venta getVentaById(int id) {
	        Venta venta = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM venta WHERE id_venta = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            InmuebleControlador controladorInmueble = new InmuebleControlador();
	            CompradorControlador controladorComprador = new CompradorControlador();
	            ContratoControlador controladorContrato = new ContratoControlador();
	            AgenteControlador controladorAgente = new AgenteControlador();
	            GerenteControlador controladorGerente = new GerenteControlador();
	            ReservaControlador controladorReserva = new ReservaControlador();

	            if (resultSet.next()) {
	                int id_venta = resultSet.getInt("id_venta");
	                int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	                int fkCompradorId = resultSet.getInt("fk_cliente_id");
	                int fkContratoId = resultSet.getInt("fk_contrato_id");
	                double montototal = resultSet.getDouble("monto_total");
	                String forma_pago = resultSet.getString("forma_pago");
	                int fkEmpleadoId = resultSet.getInt("fk_empleado_id");
	                String tipoEmpleado = resultSet.getString("tipo_empleado");
	            	int fkReservaId = resultSet.getInt("fk_reserva_id");


	                Inmueble inmueble = controladorInmueble.getInmuebleById(fkInmuebleId);
	                Comprador comprador = controladorComprador.getCompradorById(fkCompradorId);
	                Contrato contrato = controladorContrato.getContratoById(fkContratoId);
	                Reserva reserva = controladorReserva.getReservaById(fkReservaId);

	                Empleado empleado = null;
	                if ("agente".equalsIgnoreCase(tipoEmpleado)) {
	                    empleado = controladorAgente.getAgenteById(fkEmpleadoId);
	                } else if ("gerente".equalsIgnoreCase(tipoEmpleado)) {
	                    empleado = controladorGerente.getGerenteById(fkEmpleadoId);
	                }

	                venta = new Venta(id_venta, inmueble, comprador, contrato, montototal, forma_pago, empleado, tipoEmpleado,reserva);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return venta;
	    }


		@Override
	    public void addVenta(Venta venta) {
	        try {
	            PreparedStatement statement = connection.prepareStatement(
	                    "INSERT INTO venta (id_venta, fk_inmueble_id,fk_cliente_id,  fk_contrato_id, monto_total, forma_pago, fk_empleado_id, tipo_empleado, fk_reserva_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
	                );

	                statement.setInt(1, venta.getId_venta());
	                statement.setInt(2, venta.getInmueble().getId_inmueble());
	                statement.setInt(3, venta.getComprador().getId_cliente());
	                statement.setInt(4, venta.getContrato().getId_contrato());
	                statement.setDouble(5, venta.getMonto_total());
	                statement.setString(6, venta.getForma_pago());
	                statement.setInt(7, venta.getEmpleado().getId_empleado()); 
	                statement.setString(8, venta.getEmpleado().getTipo_empleado());
	                statement.setInt(9, venta.getReserva().getId_reserva());

	        	        
	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Venta insertada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateVenta(Venta venta) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, email = ? WHERE id = ?");
	            statement.setString(1, venta.getInmueble().toString());
	            statement.setString(2, venta.getForma_pago());
	            statement.setInt(3, venta.getId_venta());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Venta actualizada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteVenta(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Venta eliminada exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}