package biblioteca2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import genericTypes.*;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		
		Lista<Socio> listaSocios = new Lista<Socio>();
		Lista<Libro> listaLibros = new Lista<Libro>();
		
		frame = this;
		setResizable(false);
		setTitle("Menu  Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 163, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 5, 5));
		
		JButton btnAltaSocio = new JButton("Alta socio");
		btnAltaSocio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameAltaSocio frameAltaSocio = new JFrameAltaSocio(frame,listaSocios);
				frameAltaSocio.setVisible(true);
			}
		});
		panel.add(btnAltaSocio);
		
		JButton btnAltaLibro = new JButton("Alta libro");
		btnAltaLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameLibro jfl = new JFrameLibro(listaLibros);
				jfl.setVisible(true);
				
			}
		});
		panel.add(btnAltaLibro);
		
		JButton btnListadoSocios = new JButton("Listado socios");
		btnListadoSocios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameListadoSocios jfls = new JFrameListadoSocios(listaSocios);
				jfls.setVisible(true);
			}
		});
		panel.add(btnListadoSocios);
		
		JButton btnListadoLibros = new JButton("Listado libros");
		btnListadoLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrameListadoLibros jfll=new JFrameListadoLibros(listaLibros);
				jfll.setVisible(true);
			}
		});
		panel.add(btnListadoLibros);
		
		JButton btnPrestamo = new JButton("Prestamo");
		panel.add(btnPrestamo);
		
		JButton btnDevolucion = new JButton("Devolucion");
		panel.add(btnDevolucion);
		
		JButton btnListadoLS = new JButton("Listado l/s");
		panel.add(btnListadoLS);
		
		JButton btnSituacionLibro = new JButton("Situacion libro");
		panel.add(btnSituacionLibro);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(listaSocios);
				System.out.println(listaLibros);
				
			}
		});
		panel.add(btnTest);
	}
}
