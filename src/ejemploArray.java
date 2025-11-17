import java.util.Scanner;

public class ejemploArray {

	public static void main(String[] args) {
		// Variables
		int cantidad;
		double nota, media=0;
		double arrayNotas [];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cuantas notas vas a introducir: ");
		cantidad = sc.nextInt();
		
		arrayNotas = new double[cantidad];
		
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.println("Dime la nota: ");
			arrayNotas[i]=sc.nextDouble();
		}
		
		for(int i=0;i<arrayNotas.length;i++) {
			media+=arrayNotas[i];
			//System.out.println("La nota en la posicion: "+i+" es "+arrayNotas[i]);
		}
		System.out.println("La media de las notas es: "+(media/cantidad));

	}

}
