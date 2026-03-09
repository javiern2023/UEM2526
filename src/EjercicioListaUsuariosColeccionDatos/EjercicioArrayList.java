package EjercicioListaUsuariosColeccionDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {

    public static void main(String[] args) {

        ArrayList<String> participantes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

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
                    participantes.add(nombre);
                    System.out.println("Participante añadido.");
                    break;

                case 2:
                    System.out.println("\nLista de participantes:");
                    for (String p : participantes) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();

                    if (participantes.contains(buscar)) {
                        System.out.println("El participante está inscrito.");
                    } else {
                        System.out.println("No se encontró el participante.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();

                    if (participantes.remove(eliminar)) {
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