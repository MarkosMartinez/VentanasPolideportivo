package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModeloActividad;
import vista.GestorActividades;

public class ControladorActividades implements ActionListener{

	private GestorActividades ventanaActividades;
	private ModeloActividad mActividad;

	public ControladorActividades(GestorActividades gestorActividades) {
		ventanaActividades = gestorActividades;
		/*Aqui tambien van los botones*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void inicializar() {
		ventanaActividades.setTitle("Actividades");
		ventanaActividades.setLocationRelativeTo(null);
		ventanaActividades.setVisible(false);
	}

}
