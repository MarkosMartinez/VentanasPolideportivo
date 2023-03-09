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
		ventanaClientes.getBtnCargar().addActionListener(this);
		ventanaClientes.getBtnEliminar().addActionListener(this);
		ventanaClientes.getBtnModificar().addActionListener(this);
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
		}else if(e.getSource() == ventanaClientes.getBtnCargar()) {
			//TODO Aqui meter lo que tiene que hacer el boton y eliminarlo del GestorCliente. Un metodo para obtener los textbox?
			//TODO comprobar que el insertar funciona.
		}
	}

	public void inicializar() {
		ventanaClientes.setTitle("Clientes");
		ventanaClientes.setLocationRelativeTo(null);
		ventanaClientes.setVisible(false);
	}
	
}
