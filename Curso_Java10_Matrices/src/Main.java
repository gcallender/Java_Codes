
class Main {

	public static void main(String[] args) {
		int x[][] = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x[i][j] = cont;
				cont++;
				System.out.println("Arreglo x[" + i + "][" + j + "]: " + x[i][j]);
			}
		}

		int aux[][] = new int[2][3];
		System.out.println(aux.length);
		System.out.println(aux[0].length);
		/*for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[i].length; j++) {
				aux[i][j] = cont;
				cont++;
				System.out.println("Arreglo aux[" + i + "][" + j + "]: " + x[i][j]);
			}
		}*/		
	}

}
