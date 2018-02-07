import java.io.*;

class Main {

	public static void main(String[] args) {
		// Crear objeto tipo archivo
		File f = new File("TextFile.txt");
		
		// Escritura
		try {
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			
			wr.append("Se agrega esta linea al archivo. \n");
			wr.append("Segunda linea de texto.");
			wr.close();
			bw.close();
			
		} catch(IOException e) {};

	}

}
