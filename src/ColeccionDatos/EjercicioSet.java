package ColeccionDatos;

import java.util.HashSet;
import java.util.Scanner;

/* Un Set es una colección que NO permite elementos duplicados.
 * Se usa para controlar datos no repetidos y comprobar rápidamente
 * la pertenencia. Se puede usar con objetos.
 * HashSet no manteniene orden
 * LikedHashSet guarda según el orden de inserción.
 * TreeSet el ordenado es automáticamente.
 * */

public class EjercicioSet {

	public static void main(String[] args) {
		HashSet<String> nombres = new HashSet<>();

		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Ana"); // no se repite
		
		//HashSet<Alumno> alumnos = new HashSet<>();
		//alumnos.add(new Alumno("Juan", 20));
		//Para objetos es recomendable implementar equals() y hashCode().
		
		 Scanner sc = new Scanner(System.in);
	     
	     System.out.print("Introduce un nombre: ");
	     String nombre = sc.nextLine();

	     if (nombres.contains(nombre)) {
	          System.out.println("El nombre ya existe. No se puede insertar.");
	     } else {
	          nombres.add(nombre);
	          System.out.println("Nombre guardado correctamente.");
	     }

	     System.out.println("\nLista de nombres:");
	     for (String n : nombres) {
	         System.out.println(n);
	     }
		
	}

}
