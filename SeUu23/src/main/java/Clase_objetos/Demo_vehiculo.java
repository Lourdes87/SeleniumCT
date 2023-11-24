package Clase_objetos;

public class Demo_vehiculo {

	public static void main(String[] args) {
		Vehiculo minivan =new Vehiculo();
		 int rango;
		 
		 minivan.pasajeros =9;
		 minivan.capacidad =15;
		 minivan.kmh=20;
		 
		rango= minivan.capacidad * minivan.kmh;
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango+ "kilometros");

		Vehiculo carro= new Vehiculo ();
		carro.pasajeros =4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);
	}

}
