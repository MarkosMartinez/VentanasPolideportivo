package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.GestorBBDD;
import modelo.ModeloCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class GestorClientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNomApellido;
	private JTextField textDni;
	private JTextField textCodigo;
	private JButton btnGuardar;
	private JTextField textModNombre;
	private JTextField textModDni;
	private JTextField textModCode;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCargar;

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
		
		JPanel panelInsert = new JPanel();
		tabbedPane.addTab("Insertar Cliente", null, panelInsert, null);
		panelInsert.setLayout(null);
		
		textNomApellido = new JTextField();
		textNomApellido.setColumns(10);
		textNomApellido.setBounds(125, 27, 86, 20);
		panelInsert.add(textNomApellido);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido");
		lblNombreYApellido.setBounds(25, 30, 95, 14);
		panelInsert.add(lblNombreYApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(25, 70, 46, 14);
		panelInsert.add(lblDni);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(125, 67, 86, 20);
		panelInsert.add(textDni);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(25, 110, 46, 14);
		panelInsert.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(125, 107, 86, 20);
		panelInsert.add(textCodigo);
		
		btnGuardar = new JButton("Insertar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorBBDD gestorbbdd = new GestorBBDD();
				ModeloCliente cliente = new ModeloCliente();
				cliente.setNombre_apellido(textNomApellido.getText());
				cliente.setDni(textDni.getText());
				cliente.setCodigo(textCodigo.getText());
				if(textNomApellido.getText().length() == 0 || textDni.getText().length() == 0 || textCodigo.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Error!\nAlgun dato introducido no es valido!");	
				}else {
				try {
					gestorbbdd.insertarCliente(cliente);
					JOptionPane.showMessageDialog(null, "Cliente insertado!");
					textNomApellido.setText(null);
					textDni.setText(null);
					textCodigo.setText(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		btnGuardar.setBounds(125, 157, 89, 23);
		panelInsert.add(btnGuardar);
		
		JPanel panelModificar = new JPanel();
		tabbedPane.addTab("Modificar Cliente", null, panelModificar, null);
		panelModificar.setLayout(null);
		
		JLabel lblModNombre = new JLabel("Nombre y Apellido");
		lblModNombre.setBounds(25, 30, 102, 14);
		panelModificar.add(lblModNombre);
		
		JLabel lblModDni = new JLabel("DNI");
		lblModDni.setBounds(25, 70, 60, 14);
		panelModificar.add(lblModDni);
		
		JLabel lblModCodigo = new JLabel("Codigo");
		lblModCodigo.setBounds(25, 110, 60, 14);
		panelModificar.add(lblModCodigo);
		
		setTextModNombre(new JTextField());
		getTextModNombre().setEditable(false);
		getTextModNombre().setBounds(130, 27, 86, 20);
		panelModificar.add(getTextModNombre());
		getTextModNombre().setColumns(10);
		
		setTextModDni(new JTextField());
		getTextModDni().setBounds(130, 67, 86, 20);
		panelModificar.add(getTextModDni());
		getTextModDni().setColumns(10);
		
		setTextModCode(new JTextField());
		getTextModCode().setEditable(false);
		getTextModCode().setBounds(130, 107, 86, 20);
		panelModificar.add(getTextModCode());
		getTextModCode().setColumns(10);
		
		btnCargar = new JButton("Cargar Cliente");
		btnEliminar = new JButton("Eliminar Cliente");
		
		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.setBounds(130, 150, 89, 23);
		panelModificar.add(btnModificar);
		
		btnEliminar.setVisible(false);
		
		btnCargar.setBounds(250, 26, 130, 23);
		panelModificar.add(btnCargar);
		
		btnEliminar.setBounds(250, 66, 130, 23);
		panelModificar.add(btnEliminar);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
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

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnCargar() {
		return btnCargar;
	}

	public void setBtnCargar(JButton btnCargar) {
		this.btnCargar = btnCargar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JTextField getTextModDni() {
		return textModDni;
	}

	public void setTextModDni(JTextField textModDni) {
		this.textModDni = textModDni;
	}

	public JTextField getTextModNombre() {
		return textModNombre;
	}

	public void setTextModNombre(JTextField textModNombre) {
		this.textModNombre = textModNombre;
	}

	public JTextField getTextModCode() {
		return textModCode;
	}

	public void setTextModCode(JTextField textModCode) {
		this.textModCode = textModCode;
	}
}
