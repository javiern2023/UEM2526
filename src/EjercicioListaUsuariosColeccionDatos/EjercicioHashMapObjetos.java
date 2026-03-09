package EjercicioListaUsuariosColeccionDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioHashMapObjetos {

    public static void main(String[] args) {

        HashMap<String, Participante> mapa = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n1 Añadir");
            System.out.println("2 Mostrar");
            System.out.println("3 Buscar");
            System.out.println("4 Eliminar");
            System.out.println("5 Total");
            System.out.println("0 Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    Participante p = new Participante(dni, nombre);

                    mapa.put(dni, p);
                    break;

                case 2:
                    for (Map.Entry<String, Participante> entry : mapa.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("DNI a buscar: ");
                    String buscar = sc.nextLine();

                    if (mapa.containsKey(buscar)) {
                        System.out.println(mapa.get(buscar));
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                case 4:
                    System.out.print("DNI a eliminar: ");
                    String eliminar = sc.nextLine();

                    mapa.remove(eliminar);
                    break;

                case 5:
                    System.out.println("Total: " + mapa.size());
                    break;
            }

        } while (opcion != 0);
    }
}