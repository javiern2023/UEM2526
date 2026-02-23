package ColeccionDatos;

/* Es una estructura que usa la combinación de cola + pila
 * Permite añadir y quitar por delante y por detrás
 * 
 * */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EjercicioDeque {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();

		deque.addFirst("A");
		deque.addLast("B");

		deque.removeFirst();
		deque.removeLast();
		
		//Deque<Alumno> alumnos = new ArrayDeque<>();
		
		Scanner sc = new Scanner(System.in);
        Deque<String> nombres = new ArrayDeque<>();

        String opcion;

        do {
            System.out.println("\n¿Dónde quieres añadir el nombre?");
            System.out.println("1. Al principio");
            System.out.println("2. Al final");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine();

            if (opcion.equals("1") || opcion.equals("2")) {

                System.out.print("Introduce el nombre: ");
                String nombre = sc.nextLine();

                if (opcion.equals("1")) {
                    nombres.addFirst(nombre);  // añadir al principio
                } else {
                    nombres.addLast(nombre);   // añadir al final
                }
            }

        } while (!opcion.equals("3"));

        // Mostrar todos los nombres
        System.out.println("\nLista de nombres:");
        for (String n : nombres) {
            System.out.println(n);
        }
	}
}
