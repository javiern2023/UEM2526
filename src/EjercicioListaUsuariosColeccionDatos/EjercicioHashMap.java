package EjercicioListaUsuariosColeccionDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> participantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        int id = 1;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir participante");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Buscar participante");
            System.out.println("4. Eliminar participante");
            System.out.println("5. Número total de participantes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce nombre: ");
                    String nombre = sc.nextLine();
                    participantes.put(id, nombre); //Insertar el nombre e id
                    id++;
                    System.out.println("Participante añadido.");
                    break;

                case 2:
                    System.out.println("\nLista de participantes:");
                    // Recogemos cada par clave-valor en p. entrySet devuelve todos los pares 
                    for (Map.Entry<Integer, String> p : participantes.entrySet()) {
                        System.out.println(p.getKey() + " - " + p.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();

                    if (participantes.containsValue(buscar)) {
                        System.out.println("El participante está inscrito.");
                    } else {
                        System.out.println("No se encontró el participante.");
                    }
                    break;

                case 4:
                    System.out.print("ID del participante a eliminar: ");
                    int eliminar = sc.nextInt();

                    if (participantes.containsKey(eliminar)) {
                        participantes.remove(eliminar);
                        System.out.println("Participante eliminado.");
                    } else {
                        System.out.println("No existe ese participante.");
                    }
                    break;

                case 5:
                    System.out.println("Total de participantes: " + participantes.size());
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}