/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * Creado el 20 mar. 2019
 * 
 * @author <a href="mailto:joaalsai@ieslavereda.es">Joaquin Vicente Alonso
 *         Saiz</a>
 *
 */
public class Colecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Persona> personas = new HashSet<Persona>();
		Persona p1 = new Persona("Pepe", "Martinez");
		Persona p11 = new Persona("Pepe", "Martinez");
		Persona p2 = new Persona("Manuel", "Sanchez");
		Persona p3 = new Persona("Teresa", "Ruiz");
		

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p3);
		personas.add(p3);
		
		System.out.println(p1.hashCode());
		System.out.println(p11.hashCode());

		System.out.println(p11.equals(p1));
		System.out.println(personas.contains(p11));
		
		for (Persona p : personas) {
			System.out.println(p);
		}

		Set<Integer> numerosHashSet = new HashSet<Integer>();
		numerosHashSet.add(7);
		numerosHashSet.add(1000);
		numerosHashSet.add(67);
		numerosHashSet.add(500);
		numerosHashSet.add(489847);
		numerosHashSet.add(0);

		System.out.println("\nHashSet");
		for (Integer num : numerosHashSet) {
			System.out.println(num);
		}

		System.out.println("\nTreeSet");
		Set<Integer> numerosTreeSet = new TreeSet<Integer>();
		numerosTreeSet.add(23);
		numerosTreeSet.add(0);
		numerosTreeSet.add(676);
		numerosTreeSet.add(65);
		numerosTreeSet.add(11);

		for (Integer i : numerosTreeSet) {
			System.out.println(i);
		}

		Set<Integer> numerosLinkedHashSet = new LinkedHashSet<Integer>();

		numerosLinkedHashSet.add(7);
		numerosLinkedHashSet.add(1000);
		numerosLinkedHashSet.add(67);
		numerosLinkedHashSet.add(500);
		numerosLinkedHashSet.add(489847);
		numerosLinkedHashSet.add(0);

		System.out.println("\nLinkedHashSet");
		for (Integer num : numerosLinkedHashSet) {
			System.out.println(num);
		}

		List<Integer> numerosArrayList = new ArrayList<Integer>();
		numerosArrayList.add(2);
		numerosArrayList.add(5);
		numerosArrayList.add(3);
		numerosArrayList.add(1);
		numerosArrayList.add(7);
		numerosArrayList.add(2);

		System.out.println("\nArrayList");
		for (Integer num : numerosArrayList) {
			System.out.println(num);
		}

		System.out.println("\nLinkedList");
		List<Integer> numerosLinkedList = new LinkedList<Integer>();
		numerosLinkedList.add(5);
		numerosLinkedList.add(15);
		numerosLinkedList.add(225);
		numerosLinkedList.add(125);
		for (Integer num : numerosLinkedList) {
			System.out.println(num);
		}

		Queue<Integer> numQueue = new LinkedList<Integer>();
		numQueue.offer(3);
		numQueue.offer(7);
		numQueue.offer(4);
		numQueue.offer(2);
		numQueue.offer(1);
		int size = numQueue.size();
		System.out.println("\nQueue");
		for (int i = 0; i <= size; i++) {
			System.out.println(numQueue.remove());
		}

	}

}
