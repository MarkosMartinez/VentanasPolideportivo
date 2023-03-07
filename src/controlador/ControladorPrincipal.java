package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;
import vista.ProductoFormulario;

public class ControladorPrincipal implements ActionListener{
private Principal frmPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		frmPrincipal = principal;
		frmPrincipal.btnGestionarClientes.addActionListener(this);
		frmPrincipal.btnGestionarActividades.addActionListener(this);
		frmPrincipal.btnGestionarInscripciones.addActionListener(this);
	}
	
	public void inicializar() {
		frmPrincipal.setTitle("Desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frmPrincipal.btnGestionarClientes) {
			/*ProductoModelo productoM = new ProductoModelo();
			vista.ProductoFormulario productoF = new ProductoFormulario(frmPrincipal, true);
			
			ControladorProducto productoC = new ControladorProducto(productoM, productoF);
			productoC.inicializar();
			productoF.setVisible(true);*/
		}
		
	}

}
