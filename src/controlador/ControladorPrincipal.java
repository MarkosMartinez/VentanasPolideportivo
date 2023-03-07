package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GestorActividades;
import vista.GestorClientes;
import vista.GestorInscripciones;
import vista.Principal;

public class ControladorPrincipal implements ActionListener{
private Principal ventanaPrincipal;
/*Poner los gestores o los controladores?*/
	
	public ControladorPrincipal(Principal principal) {
		ventanaPrincipal = principal;
		ventanaPrincipal.getBtnGestionarClientes().addActionListener(this);
		ventanaPrincipal.getBtnGestionarActividades().addActionListener(this);
		ventanaPrincipal.getBtnGestionarInscripciones().addActionListener(this);
	}
	
	public void inicializar() {
		ventanaPrincipal.setTitle("Desktop");
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ventanaPrincipal.getBtnGestionarClientes()) {
			GestorClientes gestorClientes = new GestorClientes();
			ControladorClientes cClientes = new ControladorClientes(gestorClientes);
			cClientes.inicializar();
			gestorClientes.setModal(true);
			gestorClientes.setVisible(true);
		}else if(e.getSource() == ventanaPrincipal.getBtnGestionarActividades()) {
			GestorActividades gestorActividades = new GestorActividades();
			ControladorActividades cActividades = new ControladorActividades(gestorActividades);
			cActividades.inicializar();
			gestorActividades.setModal(true);
			gestorActividades.setVisible(true);
			
		}else if(e.getSource() == ventanaPrincipal.getBtnGestionarInscripciones()) {
			GestorInscripciones gestorInscripciones = new GestorInscripciones();
			ControladorInscripciones cIncripciones = new ControladorInscripciones(gestorInscripciones);
			cIncripciones.inicializar();
			gestorInscripciones.setModal(true);
			gestorInscripciones.setVisible(true);
			
		}
		
	}

}
