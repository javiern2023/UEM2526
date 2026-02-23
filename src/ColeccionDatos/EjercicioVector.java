package ColeccionDatos;

import java.util.Scanner;
import java.util.Vector;

public class EjercicioVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Vector<String> elementos = new Vector<>();

        String dato;

        do {
            System.out.print("Introduce un elemento (fin para salir): ");
            dato = sc.nextLine();

            if (!dato.equalsIgnoreCase("fin")) {
                elementos.add(dato);  // añadir al vector
            }

        } while (!dato.equalsIgnoreCase("fin"));

        // Mostrar elementos
        System.out.println("\nElementos guardados:");
        for (String e : elementos) {
            System.out.println(e);
        }

	}

}
