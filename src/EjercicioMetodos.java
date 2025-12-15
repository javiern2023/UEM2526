import java.util.Scanner;

public class EjercicioMetodos {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		String dni [] = {"123", "456"};
		mostrarDni(dni); //Paso por referencia
		System.out.println(dni[0]);
		
		opcion = mostrarMenu(sc);
		menuOpciones(opcion);
		int num1=6, num2=8, resultado;
		resultado = sumar(num1, num2); //Paso por valor
		System.out.println("El resultado es: "+resultado);
		resultado = restar(num1, num2);
		resultado = multiplicar(num1, num2);
		resultado = dividir(num1, num2);
		
	}
	
	public static void mostrarDni(String dni []) {
		dni[0]="987";
	}
	public static int mostrarMenu(Scanner sc) {
		
		System.out.println("== MENU DE OPCIONES ==");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		int opcion = sc.nextInt();
		return opcion;
	}
	
	public static void menuOpciones(int opcion) {
		/*do {
			switch(opcion) {
			case 1: //sumar();
				break;
			case 2: //restar()
				break;
				
			}
		}*/
		
	}
	
	public static int sumar(int num1, int num2) {
		int resultado = num1+num2;
		//System.out.println("La suma es: "+resultado);
		return resultado;
	}
	public static int restar(int valor1, int valor2) {
		int resultado = valor1-valor2;
		//System.out.println("La resta es: "+resultado);
		return resultado;
	}
	public static int multiplicar(int valor1, int valor2) {
		int resultado = valor1*valor2;
		//System.out.println("La multiplicación es: "+resultado);
		return resultado;
	}
	public static int dividir(int valor1, int valor2) {
		int resultado = valor1/valor2;
		//System.out.println("La division es: "+resultado);
		return resultado;
	}
	

}
