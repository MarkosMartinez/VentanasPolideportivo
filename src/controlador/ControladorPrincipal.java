package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;

public class ControladorPrincipal implements ActionListener{
private Principal ventanaPrincipal;
private ControladorClientes Clientes;
private ControladorActividades Actividades;
private ControladorInscripciones Inscripciones;
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
		/*System.out.println("Algun boton ha sido clickado");*/
		if(e.getSource() == ventanaPrincipal.getBtnGestionarClientes()) {
			System.out.println("Boton Gestionar Clientes ha sido clickado");
			
			/*
			ProductoModelo productoM = new ProductoModelo();
			vista.ProductoFormulario productoF = new ProductoFormulario(frmPrincipal, true);
			
			ControladorProducto productoC = new ControladorProducto(productoM, productoF);
			productoC.inicializar();
			productoF.setVisible(true);
			 */
		}
		
		if(e.getSource() == ventanaPrincipal.getBtnGestionarActividades()) {
			System.out.println("Boton Gestionar Actividades ha sido clickado");
			
		}
		
		if(e.getSource() == ventanaPrincipal.getBtnGestionarInscripciones()) {
			System.out.println("Boton Gestionar Inscripciones ha sido clickado");
			
		}
		
	}

}
