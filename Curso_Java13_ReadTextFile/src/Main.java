import java.io.*;

class Main {

	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("textFile.txt");
			BufferedReader buffer = new BufferedReader(r);
			
			//System.out.println(buffer.readLine());
			
			String temp = "";
			
			while (temp != null) {
				temp = buffer.readLine();
				if (temp == null) {
					break;
				}
				System.out.println(temp);
			}
			
			//r.close();
			buffer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};

	}

}
