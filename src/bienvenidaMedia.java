import java.util.Scanner;

public class bienvenidaMedia {

	public static void main(String[] args) {
		// Variables
		String nombre;
		int nota1, nota2, nota3, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		nombre=sc.nextLine();
		System.out.print("Dime la primera nota: ");
		nota1=sc.nextInt();
		System.out.print("Dime la segunda nota: ");
		nota2=sc.nextInt();
		System.out.print("Dime la tercera nota: ");
		nota3=sc.nextInt();
		resultado=(nota1+nota2+nota3)/3;
		System.out.print("Bienvenido "+nombre);
		System.out.println(": tu nota es "+resultado);
		
		

	}

}
