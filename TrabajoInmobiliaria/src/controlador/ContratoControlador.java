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
import trabajoInmobiliaria.Inquilino;
import trabajoInmobiliaria.Reserva;

public class ContratoControlador implements ContratoRepository{
	

	 private final Connection connection;

	    public ContratoControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }
	    
	    // (int id_contrato, LocalDate inicio_contrato, LocalDate fin_contrato, Cliente cliente,
		// String descripcion, double  monto, Reserva reserva) 
	    @Override
	    public List<Contrato> getAllContrato() {
	        List<Contrato> contratos = new ArrayList<>();
	   //     try {
	   //        PreparedStatement statement = connection.prepareStatement("SELECT * FROM contrato ");
	  //          ResultSet resultSet = statement.executeQuery();
	       
	      //      while (resultSet.next()) {
	        
	           /* 	Contrato contrato = new Contrato(resultSet.getInt("id_contrato"),
                            resultSet.getDate("inicio_contrato").toLocalDate(),
                            resultSet.getDate("fin_contrato").toLocalDate(),
                            new Cliente(
                            		resultSet.getString("nombre"),
                            		resultSet.getInt("id_cliente"),
                                        resultSet.getString("apellido"),
                                        resultSet.getString("correo"),
                                        resultSet.getInt("telefono"), 
                                        resultSet.getDate("fecha_nac").toLocalDate(),
                                        resultSet.getInt("dni")),
                            resultSet.getString("descripcion"),
                            resultSet.getDouble("monto"),
                            new Reserva(
                            			
                            /*			resultSet.getInt("id_reserva"),
                                        resultSet.getDate("fecha_reserva").toLocalDate(),
                                        resultSet.getDate("fecha_expiracion").toLocalDate(),
                                        resultSet.getDouble("pago"),
                                        new Comprador(resultSet.getInt("id_comprador"),
                                                      resultSet.getString("nombre_comprador"),
                                                      resultSet.getString("apellido_comprador"),
                                                      resultSet.getString("correo_comprador"),
                                                      resultSet.getInt("telefono_comprador"),
                                                      resultSet.getDate("fecha_nac_comprador").toLocalDate(),
                                                      resultSet.getInt("dni_comprador")),
                                        new Inquilino(resultSet.getInt("id_inquilino"),
                                                       resultSet.getString("nombre_inquilino"),
                                                       resultSet.getString("apellido_inquilino"),
                                                       resultSet.getString("correo_inquilino"),
                                                       resultSet.getInt("telefono_inquilino"),
                                                       resultSet.getDate("fecha_nac_inquilino").toLocalDate(),
                                                       resultSet.getInt("dni_inquilino")),
                                        resultSet.getBoolean("estado_reserva"))); */

	            
	             //   users.add(Ambiente);
	      //      }
	     //   } catch (SQLException e) {
	     //       e.printStackTrace();
	   //     }
	    //    return users;
	      return contratos;
	    }

	    
	    @Override
	    public Contrato getContratoById(int id) {
	        Contrato contrato = null;
	        try {
	            PreparedStatement statement = connection.prepareStatement("SELECT * FROM contrato WHERE id = ?");
	            statement.setInt(1, id);
	            
	            ResultSet resultSet = statement.executeQuery();
	            
	            if (resultSet.next()) {
	            	// public Comprador(int comprador, double presupuesto) le falta Herencia con cliente.
	             //   user = new Garante(resultSet.getInt("id_empleado"), resultSet.getString("name"), resultSet.getString("apellido") , resultSet.getString("telefono"), resultSet.getInt("fk_cliente"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return contrato;
	    }

		@Override
	    public void addContrato(Contrato contrato) {
	        try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, correo) VALUES (?, ?)");
	            statement.setString(1, contrato.getDescripcion());
	            statement.setDouble(2, contrato.getMonto());
	            
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
