import java.util.Scanner;

/* 3.- En España cada persona está identificada con un Documento Nacional 
 * de Identidad (DNI) en el que figura un número y una letra, por ejemplo 
 * 56999545W

La letra que sigue al número se calcula siguiendo la metodología que vamos a 
indicar. Crea un programa que calcule la letra de un DNI a partir del número 
de DNI que introduzca el usuario. Es decir, se debe pedir el DNI sin la letra
 por teclado y el programa nos devolverá el DNI completo (con la letra).

Para calcular la letra, se debe tomar el resto de dividir nuestro número de 
DNI entre 23. El resultado debe estar por tanto entre 0 y 22.

Crea una aplicación donde, dado un DNI SÓLO NUMÉRICO, busque en un array de 
caracteres la posición que corresponda y devuelva su letra. Esta es la tabla 
de caracteres:

Posición     0   1   2   3  4   5   6  7  8  9  10  11  12  13  14  15  16  
17  18  19  20  21  22

Letra            T   R  W A  G  M  Y  F  P  D  X    B   N    J    Z    S   
Q    V   H    L   C   K   E
 * 
 * */
public class ejercicioArrayDni {

	public static void main(String[] args) {
		// Variables
		int numeroDni, posicion;
		
		Scanner sc = new Scanner(System.in);
		String letras [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E",""};
		
		System.out.print("Dime tu dni: ");
		numeroDni=sc.nextInt();
		posicion=numeroDni%23;
		
		String dniCadena = String.valueOf(numeroDni);
		numeroDni=Integer.parseInt(dniCadena);
		
		System.out.println("El dni es: "+dniCadena+letras[posicion]);
	}

}
