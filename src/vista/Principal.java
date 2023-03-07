package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame{
	private JPanel contentPane;
	
	public JButton btnGestionarClientes;
	public JButton btnGestionarActividades;
	public JButton btnGestionarInscripciones;

	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnGestionarClientes = new JButton("Gestionar Clientes");
		btnGestionarClientes.setBounds(163, 30, 172, 23);
		contentPane.add(btnGestionarClientes);
		
		btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionarActividades.setBounds(163, 90, 172, 23);
		contentPane.add(btnGestionarActividades);
		
		btnGestionarInscripciones = new JButton("Gestionar Inscipciones");
		btnGestionarInscripciones.setBounds(163, 150, 172, 23);
		contentPane.add(btnGestionarInscripciones);
		
	}

}
