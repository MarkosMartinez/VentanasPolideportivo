package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ProductoFormulario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductoFormulario frame = new ProductoFormulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductoFormulario() {
		setTitle("Pantalla Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionarClientes = new JButton("Gestionar Clientes");
		btnGestionarClientes.setBounds(140, 30, 140, 23);
		contentPane.add(btnGestionarClientes);
		
		JButton btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.setBounds(140, 90, 140, 23);
		contentPane.add(btnGestionarActividades);
		
		JButton btnGestionarInscripciones = new JButton("Gestionar Inscipciones");
		btnGestionarInscripciones.setBounds(140, 150, 140, 23);
		contentPane.add(btnGestionarInscripciones);
	}

}
