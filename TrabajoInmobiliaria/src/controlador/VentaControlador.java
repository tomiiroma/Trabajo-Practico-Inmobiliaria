package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.VentaRepository;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Inmueble;
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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
	            ResultSet resultSet = statement.executeQuery();
	            while (resultSet.next()) {
	            	  resultSet.getInt("id_venta");
	                  int idReserva = resultSet.getInt("id_reserva");
	            int  idInmueble = resultSet.getInt("id_inmueble");
	                  int idComprador = resultSet.getInt("id_comprador");
	                  String formaPago = resultSet.getString("forma_pago");
	           double precioVenta = resultSet.getDouble("precio_venta");

	                  
	                  /*    idVenta,
	                  Venta venta = new Venta(
	                      getReservaById(idReserva),
	                      getInmuebleById(idInmueble),
	                      getCompradorById(idComprador),
	                      formaPago,
	                      precioVenta
	                  */
	          //     ventas.add(venta);
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
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	          //      venta = new Venta(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return venta;
	    }

		@Override
	    public void addVenta(Venta venta) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO venta (fk_inmueble_id, fk_cliente_id, fk_contrato_id, monto_total, forma_pago, fk_empleado_id) VALUES (?, ?, ?, ?, ?, ?)");
	            statement.setInt(1, venta.getFk_inmueble());
	            statement.setInt(2, venta.getFk_cliente());
	            statement.setInt(3, venta.getFk_contrato());
	            statement.setDouble(4, venta.getMonto_total());
	            statement.setString(5, venta.getForma_pago());
	            statement.setInt(6, venta.getFk_empleado_id());
	            
	            
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
	            statement.setString(1, venta.getForma_pago().toString());
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
