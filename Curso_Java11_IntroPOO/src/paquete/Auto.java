package paquete;

public class Auto {
	// Atributos del objeto
	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	boolean encendido = false;
	String modelo;
	// Constructores
	public Auto() {
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 4;
	}
	// Metodos
	public double obtenerPeso() {
		return this.peso;
	}
	public void encender() {
		this.encendido = true;
		System.out.println("El auto esta encendido.");
	}
	public void apagar() {
		this.encendido = false;
		System.out.println("El auto esta apagado.");
	}
	public void estado() {
		if (this.encendido) {
			System.out.println("El auto esta encendido.");
		}
		else {
			System.out.println("El auto esta apagado.");
		}
	}
	public void informacion() {
		System.out.println("Este es un auto comun y corriente");
	}
}

// Herencia
class AutoBMW extends Auto {
	public AutoBMW() {
		this.modelo = "BMW";
	}
	
	public void turbo() {
		System.out.println("Has viajado a 100 kms/hora.");
	}
	public void informacion() {
		System.out.println("Este es un auto BMW del año 2011");
	}
}
class AutoToyota extends Auto {
	public AutoToyota() {
		this.modelo = "Toyota";
	}
	
	public String obtenerModelo() {
		return this.modelo;
	}
	public void informacion() {
		System.out.println("Este es un auto Toyota del año 2009");
	}
}


