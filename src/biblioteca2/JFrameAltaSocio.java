package biblioteca2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import genericTypes.Lista;
import genericTypes.Socio;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameAltaSocio extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDNI;

	/**
	 * Create the frame.
	 */
	public JFrameAltaSocio(JFrame anterior, Lista<Socio> listaSocios) {
		anterior.setVisible(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 436, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anterior.setVisible(true);
				dispose();
			}
		});

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre, apellidos, DNI;

				nombre = textFieldNombre.getText();
				apellidos = textFieldApellidos.getText();
				DNI = textFieldDNI.getText();

				Socio socio = new Socio(nombre, apellidos, DNI);

				listaSocios.insertar(socio);

				anterior.setVisible(true);
				dispose();

			}
		});

		JLabel lblNombre = new JLabel("Nombre");

		JLabel lblApellidos = new JLabel("Apellidos");

		JLabel lblDni = new JLabel("DNI");

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);

		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(btnAdd)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnCancelar).addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel.createSequentialGroup().addGap(12).addComponent(lblDni)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(262, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING,
						gl_panel.createSequentialGroup().addGap(12).addComponent(lblApellidos)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldApellidos, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel.createSequentialGroup().addGap(12).addComponent(lblNombre)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
								.addContainerGap(12, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNombre).addComponent(
								textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblApellidos)
								.addComponent(textFieldApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblDni).addComponent(
								textFieldDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAdd, Alignment.TRAILING).addComponent(btnCancelar, Alignment.TRAILING))
						.addContainerGap()));
		gl_panel.linkSize(SwingConstants.VERTICAL, new Component[] { btnCancelar, btnAdd });
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] { btnCancelar, btnAdd });
		panel.setLayout(gl_panel);
	}
}
