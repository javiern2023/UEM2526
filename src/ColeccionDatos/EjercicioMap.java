package ColeccionDatos;

/* Map guarda los datos en formato CLAVE - VALOR. Como un diccionario
 * Muy usadas para buscar rápido por claves.
 * HashMap guarda sin orden.
 * LinkedHashMap guarda en orden de inserción.
 * TreeMap guarda en orden por clave.
 * */

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> personas = new HashMap<>();

		personas.put("Ana", 20);
		personas.put("Luis", 25);

		System.out.println(personas.get("Ana"));
		
		//HashMap<String, Alumno> mapa = new HashMap<>();

		//mapa.put("1", new Alumno("Juan", 20));
		
		Scanner sc = new Scanner(System.in);
        
        // Pedir datos
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        // Insertar en el HashMap
        personas.put(nombre, edad);

        // Mostrar todos los datos
        System.out.println("\nPersonas guardadas:");

        for (String n : personas.keySet()) {
            System.out.println("Nombre: " + n + " Edad: " + personas.get(n));
        }
	}

}
