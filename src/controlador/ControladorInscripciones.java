package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModeloInscripcion;
import vista.GestorInscripciones;

public class ControladorInscripciones implements ActionListener{

	private GestorInscripciones ventanaInscripciones;
	private ModeloInscripcion mInscripcion;

	public ControladorInscripciones(GestorInscripciones gestorInscripciones) {
		ventanaInscripciones = gestorInscripciones;
		/*Aqui tambien van los botones*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void inicializar() {
		ventanaInscripciones.setTitle("Inscripciones");
		ventanaInscripciones.setLocationRelativeTo(null);
		ventanaInscripciones.setVisible(false);
	}
}
