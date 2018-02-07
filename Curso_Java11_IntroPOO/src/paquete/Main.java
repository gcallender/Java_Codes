package paquete;

import paquete.Pelota;

class Main {

	public static void main(String[] args) {
		// Uso de metodos y cambios de atributos.
		//Pelota p = new Pelota();
		//System.out.println("La pelota pesa: " + p.obtenerPeso() + " grs.");
		//p.peso = 300;
		//System.out.println(p.peso);
		//System.out.println("La pelota pesa: " + p.obtenerPeso() + " grs.");
		
		// Uso de "Herencia"
		//AutoBMW car = new AutoBMW();
		//car.encender();
		// El metodo "turbo" es propio de la clase AutoBMW.
		//car.turbo();		
		
		// Uso de "Polimorfismo".
		Auto carAux = new Auto();
		Auto car1 = new AutoBMW();
		Auto car2 = new AutoToyota();
		carAux.informacion();
		car1.informacion();
		car2.informacion();
		//System.out.println(carAux.getClass());
		//System.out.println(car1.getClass());
		//System.out.println(car2.getClass());
		
		// OBS: Si los objetos heredados se crean usando la clase
		// padre, solo se pueden usar los metodos propios de esta clase,
		// pero si las clases hijas poseen metodos alterados usando
		// la propiedad de "polimorfismo", los metodos son sobreescritos
		// por los de la clase hija.
		
	}

}
