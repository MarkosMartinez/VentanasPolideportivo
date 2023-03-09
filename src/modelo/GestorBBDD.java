package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GestorBBDD extends Conector{

	Conector conector = new Conector();
	
	//Clientes ----------------------------------------------
	public void insertarCliente(ModeloCliente cliente) throws SQLException {
		conector.conectar();
		PreparedStatement insertar = conector.getCon().prepareStatement("INSERT INTO usuarios (nombre_apellido, dni, codigo) VALUES (?,?,?);");
		insertar.setString(1, cliente.getNombre_apellido());
		insertar.setString(2, cliente.getDni());
		insertar.setString(3, cliente.getCodigo());
		insertar.execute();
		conector.cerrar();	
}

	public ModeloCliente getCliente(ModeloCliente cliente) throws SQLException {
		conector.conectar();
		PreparedStatement gettear =conector.getCon().prepareStatement("SELECT * FROM usuarios WHERE dni =?");
		gettear.setString(1, cliente.getDni());
		ResultSet resultado=gettear.executeQuery();
		if(resultado.next()) {
		cliente.setId(resultado.getInt("id"));
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre_apellido(resultado.getString("nombre_apellido"));
		cliente.setCodigo(resultado.getString("codigo"));

		}else {
			cliente.setDni("-1");
		}
		
		conector.cerrar();
		return cliente;
	}

	public void eliminarCliente(ModeloCliente cliente) throws SQLException {
		conector.conectar();
		PreparedStatement pstDelete = conector.getCon().prepareStatement("DELETE FROM usuarios WHERE dni =?");
		pstDelete.setString(1, cliente.getDni());
		pstDelete.execute();
		conector.cerrar();
		
	}

	public void modificarCliente(ModeloCliente cliente) throws SQLException {
		conector.conectar();
		PreparedStatement pstModificar = conector.getCon().prepareStatement("UPDATE usuarios SET nombre_apellido = ?, codigo=? WHERE dni = ?;");
		pstModificar.setString(1, cliente.getNombre_apellido());
		pstModificar.setString(2, cliente.getCodigo());
		pstModificar.setString(3, cliente.getDni());
		pstModificar.execute();
		conector.cerrar();
		
	}
	
}
