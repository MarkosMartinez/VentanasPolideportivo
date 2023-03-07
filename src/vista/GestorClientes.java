package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class GestorClientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnGuardar;
	private JTextField textCodigo;
	private JTextField textDni;
	private JTextField textNomApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorClientes dialog = new GestorClientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorClientes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 228);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		textNomApellido = new JTextField();
		textNomApellido.setBounds(132, 45, 86, 20);
		contentPanel.add(textNomApellido);
		textNomApellido.setColumns(10);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido");
		lblNombreYApellido.setBounds(27, 50, 95, 14);
		contentPanel.add(lblNombreYApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(27, 85, 46, 14);
		contentPanel.add(lblDni);
		
		textDni = new JTextField();
		textDni.setBounds(132, 82, 86, 20);
		contentPanel.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(27, 120, 46, 14);
		contentPanel.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(132, 117, 86, 20);
		contentPanel.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnGuardar = new JButton("Insertar");
		btnGuardar.setBounds(132, 159, 89, 23);
		contentPanel.add(btnGuardar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton cerrarButton = new JButton("Cerrar");
				cerrarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cerrarButton.setActionCommand("Cancel");
				buttonPane.add(cerrarButton);
			}
		}
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextDni() {
		return textDni;
	}

	public void setTextDni(JTextField textDni) {
		this.textDni = textDni;
	}

	public JTextField getTextNomApellido() {
		return textNomApellido;
	}

	public void setTextNomApellido(JTextField textNomApellido) {
		this.textNomApellido = textNomApellido;
	}
}
