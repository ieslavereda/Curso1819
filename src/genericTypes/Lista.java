package genericTypes;

/**
 * Clase que implementa una lista generica
 * 
 * @author <a href="mailto:joaalsai@ieslavereda.es">Joaquin Vicente Alonso
 *         Saiz</a>
 * @version v1.0 5/3/2019
 * 
 * @param <E> Tipo de dato Generico
 */
public class Lista<E> {
	
	/**
	 * La variable {@link #cantidadDeListas} representa 
	 * las listas creadas.
	 * <ul>
	 * 		<li>Valor inicial {@vaule #cantidadDeListas}
	 * </ul>
	 */
	public static int cantidadDeListas=0;

	private Nodo<E> cabeza;
	private int cantidad;

	/**
	 * Crea una lista vacia
	 */
	public Lista() {

		this.cabeza = null;
		this.cantidad = 0;
	}

	/**
	 * Obtiene el elemento de la posicion posicion
	 * @param posicion	Posicion del elemento a obtener
	 * @return			Devuelve el elemento que ocupa la posicion posicion
	 */
	public E obtenerPosicion(int posicion) {

		Nodo<E> nodo = cabeza;
		E info = null;
		if (posicion <= cantidad) {
			for (int i = 0; i < posicion; i++)
				nodo = nodo.getSiguiente();
			info = nodo.getInfo();
		}

		return info;
	}

	public void insertar(E info) {

		Nodo<E> n = new Nodo<E>(info);

		if (cantidad == 0) {
			cabeza = n;
		} else {
			n.setSiguiente(cabeza);
			cabeza = n;
		}
		cantidad++;
	}

	

	public void setCabeza(Nodo<E> cabeza) {
		this.cabeza = cabeza;
	}

	/**
	 * @return the cabeza
	 */
	public Nodo<E> getCabeza() {
		return cabeza;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Lista [\n" + "cantidad= " + cantidad + "\n" + cabeza + " ]\n";
	}

}
