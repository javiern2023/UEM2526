package ColeccionDatos;

import java.util.Scanner;

/* Las pilas funcionan: última en entrar, primera en salir.
 * */

import java.util.Stack;

public class EjercicioPila {

	public static void main(String[] args) {
		
		Stack<String> pila = new Stack<>();

		pila.push("A");
		pila.push("B");

		pila.pop();   // elimina último
		pila.peek();  // consulta último
		
		//Stack<Alumno> pila = new Stack<>();
		//pila.push(new Alumno("Pedro", 21));
		
		Scanner sc = new Scanner(System.in);
        

        // Pedir letra
        System.out.print("Introduce una letra: ");
        String letra = sc.nextLine();

        // Añadir a la pila
        pila.push(letra);

        // Mostrar pila
        System.out.println("\nContenido de la pila:");
        for (String l : pila) {
            System.out.println(l);
        }
	}

}
