package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModeloCliente;
import vista.GestorClientes;

public class ControladorClientes implements ActionListener {
	private GestorClientes ventanaClientes;
	private ModeloCliente mCliente;

	public ControladorClientes(GestorClientes gestorClientes) {
		ventanaClientes = gestorClientes;
		/*Aqui tambien van los botones*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void inicializar() {
		ventanaClientes.setTitle("Clientes");
		ventanaClientes.setLocationRelativeTo(null);
		ventanaClientes.setVisible(false);
	}
	
}
