package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Primero extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldISBN;
	private JButton btnSave;
	private ListaDoblementeEnlazada lista;
	private Nodo aux;
	private JButton btnAdd;
	private JButton btnAnterior;
	private JButton btnSiguiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primero frame = new Primero();
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
	public Primero() {

		lista = new ListaDoblementeEnlazada();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cargarLista();

			}
		});
		mnFile.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grabarLista();
			}
		});
		mnFile.add(mntmSave);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				aux = aux.getAnterior();
				actualizarFrame(aux.getLibro());
				btnSiguiente.setEnabled(true);
				if (aux.getAnterior() == null) {
					btnAnterior.setEnabled(false);
				}
			}
		});
		btnAnterior.setEnabled(false);

		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				aux = aux.getSiguiente();
				actualizarFrame(aux.getLibro());
				btnAnterior.setEnabled(true);
				if (aux.getSiguiente() == null) {
					btnSiguiente.setEnabled(false);
				}
			}
		});
		btnSiguiente.setEnabled(false);

		JLabel lblTitulo = new JLabel("Titulo");

		JLabel lblAutor = new JLabel("Autor");

		JLabel lblIsbn = new JLabel("ISBN");

		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);

		textFieldAutor = new JTextField();
		textFieldAutor.setColumns(10);

		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);

		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textFieldTitulo.setText("");
				textFieldAutor.setText("");
				textFieldISBN.setText("");

				btnAdd.setEnabled(false);
				btnSave.setEnabled(true);
				btnAnterior.setEnabled(false);
				btnSiguiente.setEnabled(false);

			}
		});

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnSave.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup().addComponent(lblTitulo)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textFieldTitulo,
												GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(
										gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblAutor).addComponent(lblIsbn))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldISBN, GroupLayout.DEFAULT_SIZE, 181,
																Short.MAX_VALUE)
														.addComponent(textFieldAutor)))))
						.addGroup(gl_panel.createSequentialGroup().addGap(12).addComponent(btnAnterior)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSave)
								.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE).addComponent(btnAdd)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSiguiente)))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblTitulo).addComponent(
								textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(12)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblAutor).addComponent(
								textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(12)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblIsbn).addComponent(
								textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnAnterior)
								.addComponent(btnSiguiente).addComponent(btnAdd).addComponent(btnSave))
						.addContainerGap()));
		panel.setLayout(gl_panel);
	}

	private void guardar() {
		String titulo = textFieldTitulo.getText();
		String autor = textFieldAutor.getText();
		String ISBN = textFieldISBN.getText();

		Libro libro = new Libro(titulo, autor, ISBN);
		lista.insertarCabeza(new Nodo(libro));

		btnSave.setEnabled(false);
		btnAdd.setEnabled(true);

		actualizarFrame(lista.getCabeza().getLibro());
		aux = lista.getCabeza();
		if (lista.getCantidad() > 1) {
			btnSiguiente.setEnabled(true);
		}
	}

	private void actualizarFrame(Libro libro) {
		textFieldTitulo.setText(libro.getTitulo());
		textFieldAutor.setText(libro.getAutor());
		textFieldISBN.setText(libro.getISBN());
	}

	private void cargarLista() {
		JFileChooser jf = new JFileChooser();
		int opcion = jf.showOpenDialog(null);

		ObjectInputStream ois = null;

		if (opcion == JFileChooser.APPROVE_OPTION) {
			try {

				ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(jf.getSelectedFile())));

				lista = (ListaDoblementeEnlazada) ois.readObject();
				JOptionPane.showMessageDialog(null, "La lista ha sido cargada", "Informacion",
						JOptionPane.INFORMATION_MESSAGE, null);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (ois != null)
					try {
						ois.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}

		aux = lista.getCabeza();
		if (aux != null) {
			actualizarFrame(aux.getLibro());
			if (aux.getLibro() != null) {
				btnSiguiente.setEnabled(true);
			}
		}
	}

	private void grabarLista() {
		JFileChooser jf = new JFileChooser();
		int opcion = jf.showSaveDialog(null);

		if (opcion == JFileChooser.APPROVE_OPTION) {
			System.out.println(jf.getSelectedFile().getAbsolutePath());
			ObjectOutputStream oos = null;
			try {

				oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(jf.getSelectedFile())));
				oos.writeObject(lista);

				JOptionPane.showMessageDialog(null, "La lista ha sido guardada", "Informacion",
						JOptionPane.INFORMATION_MESSAGE, null);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (oos != null)
					try {
						oos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}

	}
}
