package modelo;

import java.sql.PreparedStatement;
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
	
}
