package EjercicioListaUsuariosColeccionDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayListObjeto {

    public static void main(String[] args) {

        ArrayList<Participante> lista = new ArrayList<>();
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
                    lista.add(p);
                    break;

                case 2:
                    for (Participante part : lista) {
                        System.out.println(part);
                    }
                    break;

                case 3:
                    System.out.print("DNI a buscar: ");
                    String buscar = sc.nextLine();

                    boolean encontrado = false;

                    for (Participante part : lista) {
                        if (part.getDni().equals(buscar)) {
                            System.out.println(part);
                            encontrado = true;
                        }
                    }

                    if (!encontrado)
                        System.out.println("No encontrado");

                    break;

                case 4:
                    System.out.print("DNI a eliminar: ");
                    String eliminar = sc.nextLine();

                    boolean eliminado = false;

                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getDni().equals(eliminar)) {
                            lista.remove(i);
                            eliminado = true;
                            break;
                        }
                    }

                    if (eliminado) {
                        System.out.println("Participante eliminado");
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Total: " + lista.size());
                    break;
            }

        } while (opcion != 0);
    }
}