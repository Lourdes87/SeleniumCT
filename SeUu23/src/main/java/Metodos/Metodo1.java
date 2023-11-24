package Metodos;

public class Metodo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado= suma (3,4);
		System.out.println(resultado);
		
		int resultado2= suma (10,345);
		System.out.println(resultado2);
		
		int resultado3= suma (1,1);
		System.out.println(resultado3);
		
		//llamamos al metodo sobre cargado
		int resultado4= suma (10,20,40);
		System.out.println(resultado4);

	}
	public static int suma (int a, int b) {
		int c= a+b;
		return c;
	}
	
	//sobre carga de metodos
	public static int suma (int a, int b, int c) {
		int d= a+b+c;
		return d;
	}

}
