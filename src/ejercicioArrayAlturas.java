import java.util.Scanner;

/* 2.- Programa Java para leer la altura de N personas y calcular la altura 
 * media. Calcular cuántas personas tienen una altura superior a la media y 
 * cuántas tienen una altura inferior a la media. El valor de N se pide por 
 * teclado y debe ser entero positivo.
 * */
public class ejercicioArrayAlturas {

	public static void main(String[] args) {
		// Variables
		int personas=0, alturasTotales=0, superior=0, inferior=0;
		double mediaAlturas;
		boolean correcto=false;
		Scanner sc = new Scanner(System.in);
		int alturas [];
		
		while(!correcto) { 
			System.out.print("Dime el numero de personas: ");
			personas=sc.nextInt();
			if(personas<=0) System.out.println("Valor incorrecto");
			else correcto=true;
		}
		alturas = new int [personas];
		
		//Bucle para guardar las alturas
		for(int i=0;i<alturas.length;i++) {
			System.out.print("Dime la altura: ");
			alturas[i]=sc.nextInt();
		}
		
		//Bucle para calcular la media 
		for(int i=0;i<alturas.length;i++) {
			alturasTotales+=alturas[i];
		}
		mediaAlturas=alturasTotales/alturas.length;
		
		//Bucle para contar superiore e inferior
		for(int i=0;i<alturas.length;i++) {
			if(alturas[i]>mediaAlturas) superior++;
			if(alturas[i]<mediaAlturas) inferior++;
		}
		
		System.out.println("La altura media es "+mediaAlturas);
		System.out.println("Las personas superiores "+superior);
		System.out.println("Las personas inferiores "+inferior);
	}

}
