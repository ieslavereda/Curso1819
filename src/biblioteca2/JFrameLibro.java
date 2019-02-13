package biblioteca2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import genericTypes.Libro;
import genericTypes.Lista;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldISBN;
	private Lista<Libro> listaLibros; 
	private JSpinner spinner;
	
	

	/**
	 * Create the frame.
	 */
	public JFrameLibro(Lista<Libro> listaLibros) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.listaLibros = listaLibros;
		
		setTitle("Libro");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblTitulo = new JLabel("Titulo");
		
		JLabel lblAutor = new JLabel("Autor");
		
		JLabel lblIsbn = new JLabel("ISBN");
		
		JLabel lblCantidadDeEjemplares = new JLabel("Cantidad de ejemplares");
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setColumns(10);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(10, 1, 50, 1));
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// comprobar campos
				// añadir libro
				addLibro();
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTitulo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldTitulo, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCantidadDeEjemplares)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAutor)
								.addComponent(lblIsbn))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldISBN, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
								.addComponent(textFieldAutor, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnAdd)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitulo)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAutor)
						.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIsbn)
						.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadDeEjemplares)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAdd))
					.addContainerGap())
		);
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnCancelar, btnAdd});
		panel.setLayout(gl_panel);
	}
	
	private void addLibro() {
		String titulo,autor,isbn;
		
		titulo = textFieldTitulo.getText();
		autor = textFieldAutor.getText();
		isbn = textFieldISBN.getText();
		
		listaLibros.insertar(new Libro(titulo,autor,isbn,Integer.parseInt(spinner.getValue().toString())));
		
	}
}
