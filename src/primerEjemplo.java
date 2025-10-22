import java.util.Scanner;

public class primerEjemplo {

	public static void main(String[] args) {
		// Creación de variables y constantes
		String nombre;
		double nota, nota1, media;
		
		Scanner sc = new Scanner(System.in);
		
		//Petición de datos
		System.out.print("Dime tu nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Dime la nota 1º trimestre");
		nota=sc.nextDouble();
		
		System.out.println("Dime la nota 2º trimestre");
		nota1=sc.nextDouble();
		
		//Operaciones
		media = (nota+nota1)/2;
		
		//Resultados
		System.out.println(nombre+" tu nota media es "+((nota+nota1)/2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
