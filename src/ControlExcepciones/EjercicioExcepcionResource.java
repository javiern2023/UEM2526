package ControlExcepciones;

import java.util.ArrayList;
import java.util.Scanner;
import EjercicioListaUsuariosColeccionDatos.Participante;

public class EjercicioExcepcionResource {

    public static void main(String[] args) {

        ArrayList<Participante> lista = new ArrayList<>();

        // try-with-resources: el Scanner se cierra automáticamente
        try (Scanner sc = new Scanner(System.in)) {

            int opcion;

            do {
                System.out.println("\n1. Añadir participante");
                System.out.println("2. Mostrar participantes");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                // Puede lanzar InputMismatchException
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("DNI: ");
                        String dni = sc.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        // Validamos que no esté vacío
                        if (dni.isEmpty() || nombre.isEmpty()) {
                            throw new IllegalArgumentException("DNI o nombre no puede estar vacío");
                        }

                        lista.add(new Participante(dni, nombre));
                        System.out.println("Participante añadido");
                        break;

                    case 2:
                        System.out.println("Lista de participantes:");
                        for (Participante p : lista) {
                            System.out.println(p);
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción incorrecta");
                }

            } while (opcion != 0);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getClass().getSimpleName());
        }

    }

}

