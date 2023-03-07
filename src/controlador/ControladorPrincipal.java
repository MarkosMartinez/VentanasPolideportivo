package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;

public class ControladorPrincipal implements ActionListener{
private Principal ventanaPrincipal;
	
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
		/*System.out.println("Boton clickado");*/
		if(e.getSource() == ventanaPrincipal.getBtnGestionarClientes()) {
			/*ProductoModelo productoM = new ProductoModelo();
			vista.ProductoFormulario productoF = new ProductoFormulario(frmPrincipal, true);
			
			ControladorProducto productoC = new ControladorProducto(productoM, productoF);
			productoC.inicializar();
			productoF.setVisible(true);*/
		}
		
		if(e.getSource() == ventanaPrincipal.getBtnGestionarActividades()) {
			
		}
		
		if(e.getSource() == ventanaPrincipal.getBtnGestionarInscripciones()) {
			
		}
		
	}

}
