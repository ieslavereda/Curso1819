package biblioteca2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import genericTypes.Lista;
import genericTypes.Nodo;
import genericTypes.Socio;

public class JFrameListadoSocios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Lista<Socio> listaSocios;

	/**
	 * Create the frame.
	 */
	public JFrameListadoSocios(Lista<Socio> listaSocios) {

		this.listaSocios = listaSocios;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel lblSocio = new JLabel("Socio");

		JScrollPane scrollPane = new JScrollPane();

		JButton btnNewButton = new JButton("New button");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
								.addComponent(lblSocio).addComponent(btnNewButton, Alignment.TRAILING))
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblSocio)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE).addGap(18)
						.addComponent(btnNewButton).addContainerGap()));

		table = new JTable();

		String[] cabecera = { "DNI", "Nombre", "Apellidos" };
		Object[][] cuerpo = new Object[][] {};
//		Object[] fila;
//		
		DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);
//		
//		Nodo<Socio> nodo = listaSocios.getCabeza();
//		
//		while (nodo!=null) {
//			Socio s = nodo.getInfo();
//			fila = new Object[] {s.getDNI(),s.getNombre(),s.getApellidos()};
//			dtm.addRow(fila);
//			nodo = nodo.getSiguiente();
//		}	

		table.setModel(dtm);
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		actualizarTabla();
	}

	private void actualizarTabla() {

		Nodo<Socio> nodo = listaSocios.getCabeza();
		Object[] fila = new Object[3];

		while (nodo != null) {

			fila[0] = nodo.getInfo().getDNI();
			fila[1] = nodo.getInfo().getNombre();
			fila[2] = nodo.getInfo().getApellidos();
			((DefaultTableModel) table.getModel()).addRow(fila);

			nodo = nodo.getSiguiente();
		}

	}

}
