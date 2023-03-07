package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.GestorBBDD;
import modelo.ModeloCliente;
import vista.GestorClientes;

public class ControladorClientes implements ActionListener {
	private GestorClientes ventanaClientes;
	private ModeloCliente mCliente;

	public ControladorClientes(GestorClientes gestorClientes) {
		ventanaClientes = gestorClientes;
		ventanaClientes.getBtnGuardar().addActionListener(this);
		/*Aqui tambien van los botones*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ventanaClientes.getBtnGuardar()) {
			ModeloCliente cliente = new ModeloCliente();
			cliente.setNombre_apellido(ventanaClientes.getTextNomApellido().getText());
			cliente.setDni(ventanaClientes.getTextDni().getText());
			cliente.setCodigo(ventanaClientes.getTextCodigo().getText());
			GestorBBDD gestorbbdd = new GestorBBDD();
			try {
				gestorbbdd.insertarCliente(cliente);
				JOptionPane.showMessageDialog(null, "Cliente insertado!");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void inicializar() {
		ventanaClientes.setTitle("Clientes");
		ventanaClientes.setLocationRelativeTo(null);
		ventanaClientes.setVisible(false);
	}
	
}
