import java.util.*;

class Main {

	public static void main(String[] args) {
		// FILO : First In - Last Out
		Stack pila = new Stack();
		pila.push(50);			// indice 0
		pila.push("String");	// indice 1
		pila.push(17);
		pila.push("Hola");
		
		// Solo se puede obtener el ultimo valor
		// Peek para ver y método pop para obtener
		
		System.out.println("El ultimo elemento de la pila es: " + pila.peek());
		
		while (pila.empty() == false) {
			System.out.println(pila.pop());
		}

	}

}
