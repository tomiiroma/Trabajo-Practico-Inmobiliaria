package controlador;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


import interfaces.ContratoRepository;
import trabajoInmobiliaria.Cliente;
import trabajoInmobiliaria.Comprador;
import trabajoInmobiliaria.Contrato;
import trabajoInmobiliaria.DatabaseConnection;
import trabajoInmobiliaria.Inmueble;
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Reserva;


public class ContratoControlador implements ContratoRepository{
	

	 private final Connection connection;

	    public ContratoControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	
	    @Override
	    public List<Contrato> getAllContrato() {
	        List<Contrato> contratos = new ArrayList<>();
	        try {
	           PreparedStatement statement = connection.prepareStatement("SELECT * FROM contrato ");
	           ResultSet resultSet = statement.executeQuery();
	       InmuebleControlador controlador = new InmuebleControlador();
	       InquilinoControlador inquilino = new InquilinoControlador();
	       PropietarioControlador propietario = new PropietarioControlador();


	           while (resultSet.next()) {
	        	   
	               int idContrato = resultSet.getInt("id_contrato");
	               String tipo_contrato = resultSet.getString("tipo_contrato");
	               String descripcion = resultSet.getString("descripcion");
	               byte[] url_contrato = resultSet.getBytes("url_contrato");	               
	               LocalDate inicioContrato = resultSet.getDate("inicio_contrato").toLocalDate();
	               LocalDate finContrato = resultSet.getDate("fin_contrato").toLocalDate();

	               int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	               int fkClienteId = resultSet.getInt("fk_cliente_id");

	              Inmueble inmueble = controlador.getInmuebleById(fkInmuebleId);
	              
	              Cliente cliente = null;
	              switch (resultSet.getString("tipo_contrato")) {
	                  case "Venta":
	                      cliente = propietario.getPropietarioById(fkClienteId);
	                      break;
	                  case "Alquiler":
	                      cliente = inquilino.getInquilinoById(fkClienteId);
	                      break;
	              }
	              
	               boolean aptoMascota = resultSet.getBoolean("apto_mascota");	               

	              Contrato contrato = new Contrato(idContrato, tipo_contrato, descripcion,url_contrato,inmueble,cliente,inicioContrato,finContrato,aptoMascota);
	              
	              contratos.add(contrato);
	           }
	        } catch (SQLException e) {
	        }
	      return contratos;
	    }

	    
	    @Override
	    public Contrato getContratoById(int id) {
	        Contrato contrato = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM contrato WHERE id_contrato = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            InmuebleControlador controlador = new InmuebleControlador();
	            InquilinoControlador inquilino = new InquilinoControlador();
	            PropietarioControlador propietario = new PropietarioControlador();

	            if (resultSet.next()) {
	                int idContrato = resultSet.getInt("id_contrato");
	                String tipo_contrato = resultSet.getString("tipo_contrato");
	                String descripcion = resultSet.getString("descripcion");
		               byte[] url_contrato = resultSet.getBytes("url_contrato");	               
	                LocalDate inicioContrato = resultSet.getDate("inicio_contrato").toLocalDate();
	                LocalDate finContrato = resultSet.getDate("fin_contrato").toLocalDate();
	                int fkInmuebleId = resultSet.getInt("fk_inmueble_id");
	                int fkClienteId = resultSet.getInt("fk_cliente_id");

	                Inmueble inmueble = controlador.getInmuebleById(fkInmuebleId);
	                
	                Cliente cliente = null;
	                if ("Venta".equalsIgnoreCase(tipo_contrato)) {
	                    cliente = propietario.getPropietarioById(fkClienteId);
	                } else if ("Alquiler".equalsIgnoreCase(tipo_contrato)) {
	                    cliente = inquilino.getInquilinoById(fkClienteId);
	                }

	                boolean aptoMascota = resultSet.getBoolean("apto_mascota");

	                contrato = new Contrato(idContrato, tipo_contrato, descripcion, url_contrato, inmueble, cliente, inicioContrato, finContrato, aptoMascota);
	            } else {
	                System.out.println("No se encontró el contrato con id: " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return contrato;
	    }

		@Override
	    public void addContrato(Contrato contrato) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO contrato (tipo_contrato, descripcion, url_contrato, fk_inmueble_id, fk_cliente_id, inicio_contrato, fin_contrato, apto_mascota) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	            statement.setString(1, contrato.getTipo_contrato());
	            statement.setString(2, contrato.getDescripcion());
	            statement.setBytes(3, contrato.getUrl_contrato());
	            statement.setInt(4, contrato.getInmueble().getId_inmueble());
	            statement.setInt(5, contrato.getCliente().getId_cliente());
	            java.sql.Date inicio_contrato = java.sql.Date.valueOf(contrato.getInicio_contrato());
	            statement.setDate(6, inicio_contrato);
	            java.sql.Date fin_contrato = java.sql.Date.valueOf(contrato.getFin_contrato());
	            statement.setDate(7, fin_contrato);
	            statement.setBoolean(8, contrato.isApto_mascota());

	            
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Ambiente insertado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		@Override
	    public void updateContrato(Contrato contrato) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, apellido = ? WHERE id = ?");
	            statement.setString(1, contrato.getDescripcion());
	           // statement.setLocalDate(2, contrato.getFin_contrato());
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Usuario actualizado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteContrato(int id) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
	            statement.setInt(1, id);
	            
	            int rowsDeleted = statement.executeUpdate();
	            if (rowsDeleted > 0) {
	                System.out.println("Ambiente eliminado exitosamente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
	
}

}
