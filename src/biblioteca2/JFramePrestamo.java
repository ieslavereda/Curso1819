package biblioteca2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import genericTypes.Libro;
import genericTypes.Lista;
import genericTypes.Nodo;
import genericTypes.Socio;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFramePrestamo extends JFrame {

	private JPanel contentPane;
	private JTable tableSocios;
	private JTable tableLibros;
	private Lista<Socio> listaSocios;
	private Lista<Libro> listaLibros;

	/**
	 * Create the frame.
	 */
	public JFramePrestamo(Lista<Socio> listaSocios,Lista<Libro> listaLibros) {

		
		this.listaLibros=listaLibros;
		this.listaSocios=listaSocios;
		
		setTitle("Prestamo");
		setBounds(100, 100, 635, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblEjemplar = new JLabel("Ejemplar");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblSocios = new JLabel("Socios");
		
		JLabel lblLibros = new JLabel("Libros");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnPrestar = new JButton("Prestar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblSocios)
							.addPreferredGap(ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
							.addComponent(lblLibros))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPrestar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEjemplar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSocios)
						.addComponent(lblLibros))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEjemplar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnPrestar)))
		);
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnCancelar, btnPrestar});
		panel.setLayout(new GridLayout(1, 0, 5, 0));
		
		JPanel panelSocio = new JPanel();
		panel.add(panelSocio);
		panelSocio.setLayout(new BorderLayout(0, 0));
		
		tableSocios = new JTable();
		tableSocios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tableLibros.setEnabled(true);
			}
		});
		
		panelSocio.add(tableSocios, BorderLayout.CENTER);
		
		JPanel panelLibro = new JPanel();
		panel.add(panelLibro);
		panelLibro.setLayout(new BorderLayout(0, 0));
		
		tableLibros = new JTable();
		tableLibros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Socio seleccionado: " + tableSocios.getValueAt(tableSocios.getSelectedRow(), 0));
				System.out.println("Libro seleccionado: " + tableLibros.getValueAt(tableLibros.getSelectedRow(), 0));				
			}
		});
		panelLibro.add(tableLibros, BorderLayout.CENTER);
		contentPane.setLayout(gl_contentPane);
		
		// Cargar los socios en la tabla tableSocios
		cargarSocios();
		
		// Cargar los libros en la tabla tableLibros y la deshabilitamos
		cargarLibros();
		tableLibros.setEnabled(false);
	}
	
	
	
	
	private void cargarSocios() {
		
		Nodo<Socio> nodo = listaSocios.getCabeza();
		DefaultTableModel dtm = new DefaultTableModel(new Object[][] {}, new String[] { "DNI", "Nombre", "Apellidos" });
		Socio socio;

		while (nodo != null) {

			socio = nodo.getInfo();

			dtm.addRow(new String[] { socio.getDNI(), socio.getNombre(),
					socio.getApellidos() });

			nodo = nodo.getSiguiente();
		}
		
		tableSocios.setModel(dtm);
		
	}
	private void cargarLibros() {
		Nodo<Libro> nodo = listaLibros.getCabeza();
		DefaultTableModel dtm = new DefaultTableModel(new Object[][] {}, new String[] { "ISBN", "Titulo", "Cantidad" });
		Libro libro;

		while (nodo != null) {

			libro = nodo.getInfo();

			dtm.addRow(new String[] { libro.getISBN(), libro.getTitulo(),
					String.valueOf(libro.getEjemplares().getCantidad()) });

			nodo = nodo.getSiguiente();
		}
		
		tableLibros.setModel(dtm);
	}
 
}
