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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameListadoLibros extends JFrame {

	private JPanel contentPane;
	private Lista<Libro> listaLibros;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public JFrameListadoLibros(Lista<Libro> listaLibros) {
		this.listaLibros = listaLibros;
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel lblLibros = new JLabel("Libros");

		JScrollPane scrollPane = new JScrollPane();

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblLibros)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addContainerGap(309, Short.MAX_VALUE)
						.addComponent(btnCancelar).addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblLibros)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE).addComponent(btnCancelar)
						.addContainerGap()));

		table = new JTable();
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);

		cargarLibrosEnTabla();
	}

	private void cargarLibrosEnTabla() {

		Nodo<Libro> nodo = listaLibros.getCabeza();
		DefaultTableModel dtm = new DefaultTableModel(new Object[][] {}, new String[] { "ISBN", "Titulo", "Cantidad" });
		Libro libro;

		while (nodo != null) {

			libro = nodo.getInfo();

			dtm.addRow(new String[] { libro.getISBN(), libro.getTitulo(),
					String.valueOf(libro.getEjemplares().getCantidad()) });

			nodo = nodo.getSiguiente();
		}
		
		table.setModel(dtm);

	}

}
