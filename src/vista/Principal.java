package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame{
	private JPanel contentPane;
	
	private JButton btnGestionarClientes;
	private JButton btnGestionarActividades;
	private JButton btnGestionarInscripciones;

	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnGestionarClientes = new JButton("Gestionar Clientes");
		btnGestionarClientes.setBounds(150, 30, 172, 23);
		contentPane.add(btnGestionarClientes);
		
		btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.setBounds(150, 90, 172, 23);
		contentPane.add(btnGestionarActividades);
		
		btnGestionarInscripciones = new JButton("Gestionar Inscipciones");
		btnGestionarInscripciones.setBounds(150, 150, 172, 23);
		contentPane.add(btnGestionarInscripciones);
		
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getBtnGestionarClientes() {
		return btnGestionarClientes;
	}

	public JButton getBtnGestionarActividades() {
		return btnGestionarActividades;
	}

	public JButton getBtnGestionarInscripciones() {
		return btnGestionarInscripciones;
	}

}
