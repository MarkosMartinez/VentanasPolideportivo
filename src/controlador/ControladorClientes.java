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
	private ModeloCliente mCliente; //TODO Borrar esto, no se usa?

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
			//TODO comprobar que el todo funciona (desde casa no probado.
			if(ventanaClientes.getTextModDni().isEditable()) {
				
				ModeloCliente cliente = new ModeloCliente();
				GestorBBDD gestorbbdd = new GestorBBDD();
				cliente.setDni(ventanaClientes.getTextModDni().getText());
				
				if(ventanaClientes.getTextModDni().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Error!\nAlgun dato introducido no es valido!");	
			}else {
				ventanaClientes.getTextModDni().setEditable(false);
				try {
					cliente = gestorbbdd.getCliente(cliente);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(cliente.getDni() == "-1") {
					JOptionPane.showMessageDialog(null, "Error!\nNo hemos encontrado ningun usuario con ese DNI!");
					ventanaClientes.getTextModDni().setEditable(true);
				}else {
					ventanaClientes.getTextModNombre().setText(cliente.getNombre_apellido());
					ventanaClientes.getTextModNombre().setEditable(true);
					ventanaClientes.getTextModCode().setText(cliente.getCodigo());
					ventanaClientes.getTextModCode().setEditable(true);
					ventanaClientes.getBtnModificar().setEnabled(true);
					ventanaClientes.getBtnEliminar().setVisible(true);
					ventanaClientes.getBtnCargar().setText("Equivocado?");
				}
			}
				}else {
					ventanaClientes.getTextModNombre().setText(null);
					ventanaClientes.getTextModNombre().setEditable(false);
					ventanaClientes.getTextModDni().setText(null);
					ventanaClientes.getTextModDni().setEditable(true);
					ventanaClientes.getTextModCode().setText(null);
					ventanaClientes.getTextModCode().setEditable(false);
					ventanaClientes.getBtnCargar().setText("Cargar Cliente");
					ventanaClientes.getBtnModificar().setEnabled(false);
					ventanaClientes.getBtnEliminar().setVisible(false);
				}			
		}else if(e.getSource() == ventanaClientes.getBtnEliminar()) {
			ModeloCliente cliente = new ModeloCliente();
			GestorBBDD gestorbbdd = new GestorBBDD();
			cliente.setDni(ventanaClientes.getTextModDni().getText());
			try {
				gestorbbdd.eliminarCliente(cliente);
				JOptionPane.showMessageDialog(null, "Usuario Eliminado!");
				ventanaClientes.getTextModNombre().setText(null);
				ventanaClientes.getTextModNombre().setEditable(false);
				ventanaClientes.getTextModDni().setText(null);
				ventanaClientes.getTextModDni().setEditable(true);
				ventanaClientes.getTextModCode().setText(null);
				ventanaClientes.getTextModCode().setEditable(false);
				ventanaClientes.getBtnCargar().setText("Cargar Cliente");
				ventanaClientes.getBtnModificar().setEnabled(false);
				ventanaClientes.getBtnEliminar().setVisible(false);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getSource() == ventanaClientes.getBtnModificar()) {
			ModeloCliente cliente = new ModeloCliente();
			GestorBBDD gestorbbdd = new GestorBBDD();
			
			cliente.setNombre_apellido(ventanaClientes.getTextModNombre().getText());
			cliente.setDni(ventanaClientes.getTextModDni().getText());
			cliente.setCodigo(ventanaClientes.getTextModCode().getText());
			
			try {
				gestorbbdd.modificarCliente(cliente);
				JOptionPane.showMessageDialog(null, "Usuario Modificado!");
				ventanaClientes.getTextModNombre().setText(null);
				ventanaClientes.getTextModNombre().setEditable(false);
				ventanaClientes.getTextModDni().setText(null);
				ventanaClientes.getTextModDni().setEditable(true);
				ventanaClientes.getTextModCode().setText(null);
				ventanaClientes.getTextModCode().setEditable(false);
				ventanaClientes.getBtnCargar().setText("Cargar Cliente");
				ventanaClientes.getBtnModificar().setEnabled(false);
				ventanaClientes.getBtnEliminar().setVisible(false);
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
