package Arreglo;

public class Arreglo_unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] intArray2;
		//Declarar un array de String
		String[] arr;
		//Asignar memoria para 5 strings
		arr =new String[5];
		//Inicializar el primer elemento del Array
		arr[0]="cero";
		arr[1]="uno";
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		
		System.out.println("elemento en el indice: " +arr[1]);
		//Acceder a todos los elementos del arreglo
		for (int i=0; i<arr.length; i++) //arr.length calcula la longitud del arreglo
		{
			System.out.println("Elemento en el indice: " + i + " :" + arr[i]);
		}
	}

}
