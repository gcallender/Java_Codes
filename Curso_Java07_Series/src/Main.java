
class Main {

	public static void main(String[] args) {
		
		// Series numeros impares
		/*for (int i = 0; i < 100; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}*/
		
		// Serie de Fibonacci
		// 1,1,2,3,5,8,13
		int x = 1, anterior = 0, temp = 0;
		while (true) {
			System.out.println(x);
			temp = x;
			x += anterior;
			anterior = temp;
			
			if (x > 30) {
				break;
			}
		}
		
	}

}
