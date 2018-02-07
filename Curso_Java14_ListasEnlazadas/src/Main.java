import java.util.*;

public class Main {

	public static void main(String[] args) {

		LinkedList lista = new LinkedList();
		
		lista.add("Palabra");
		lista.add(5);
		lista.add(1, 17);
		lista.add("Chao");
		
		//lista.remove(0);
		lista.removeLast();
		
		System.out.println("El tamaño de la lista es: " + lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.getLast());

	}

}
