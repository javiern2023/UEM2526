package ColeccionDatos;

/* Es una colección de datos tipo cola (FIFO). First In First Out
 * LinkedList es una cola normal
 * PriorityQueue es una cola que se le asigna prioridades
 * */
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class EjercicioQueue {

	public static void main(String[] args) {
		
		Queue<String> cola = new LinkedList<>();

		cola.add("Luis");
		cola.add("Jimena");

		cola.poll(); // elimina primero
		cola.peek(); // consulta primero
		
		 Scanner sc = new Scanner(System.in);
	     
	     // Pedir cliente
	     System.out.print("Introduce el nombre del cliente: ");
	     String cliente = sc.nextLine();
	     
	     // Insertar en la cola
	     cola.add(cliente);

	     // Consultar el primero
	     String primero = cola.peek();

	     // Mostrarlo
	     System.out.println("El primer cliente es: " + primero);

	     // Eliminarlo
	     String eliminado = cola.poll();
	     System.out.println("Cliente atendido y eliminado: " + eliminado);

	     // Mostrar cola final
	     System.out.println("Clientes que quedan en la cola: " + cola);

	}

}
