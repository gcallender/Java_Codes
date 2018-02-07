import java.io.*;


public class Main {

	public static void main(String[] args) {
		String texto = "";
		int x = 0;
		double y = 54.3;
		
		/*
		 * Entrada de texto por consola		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		
		try {
			texto = buffer.readLine();
		}
		catch(IOException e) {};
		
		texto = texto.concat("-Esto es una Concatenacion-");
		texto = texto.toLowerCase();
		texto = texto.toUpperCase();
		int numChar = texto.length();
		
		System.out.println(texto);
		System.out.println("La frase tiene: " + numChar + " caracteres");
		 */
		
		/*
		 * Convertir String a Numeros (entero)
		texto = "4";
		x = Integer.parseInt(texto);
		double x1 = Double.parseDouble(texto);
		System.out.println(x);
		System.out.println((x + 2));
		 */
		
		/*
		 * Convertir Numeros a String
		 */ 
		texto = String.valueOf(y);
		texto = texto.concat("-Double");
		System.out.println(texto);
	}

}
