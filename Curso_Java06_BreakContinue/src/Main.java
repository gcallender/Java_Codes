
class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				// Se sale del ciclo for
				//System.out.println("Ejecucion de break");
				//break;
				// Se salta las instrucciones a continuacion,
				// pero continua el ciclo for
				System.out.println("Ejecucion de continue");
				continue;
			}
			System.out.println("El valor de 'i' es: " + i);
		}
		System.out.println("Has dejado el ciclo for ");

	}

}
