/*1.- Programa Java que guarda en un array 10 números enteros que se leen 
 * por teclado. A continuación se recorre el array y calcula cuántos números 
 * son positivos, cuántos negativos y cuántos ceros.
 * */

import java.util.Scanner;

public class ejercicioArrayParesImpares {

	public static void main(String[] args) {
		// Variables
		final int COLUMNAS = 10;
		int positivos=0, negativos=0, ceros=0;
		Scanner sc = new Scanner(System.in);
		int arrayEnteros [] = new int [COLUMNAS];
		
		//Bucle para guardar los números en el array
		for(int i=0;i<arrayEnteros.length;i++) {
			System.out.print("Dime el número a guardar: ");
			arrayEnteros[i]=sc.nextInt();
		}
		
		for(int i=0;i<arrayEnteros.length;i++) {
			if(arrayEnteros[i]>0) positivos++;
			else if(arrayEnteros[i]==0) ceros++;
			else negativos++;
		}
		
		System.out.println("Cantidad de números positivos: "+positivos);
		System.out.println("Cantidad de números negativos: "+negativos);
		System.out.println("Cantidad de números ceros: "+ceros);
		
	}

}
