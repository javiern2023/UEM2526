package ControlExcepciones;

import java.util.Scanner;

public class EjercicioExcepcionFinally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int numero = sc.nextInt();
            int resultado = 10 / numero;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error matemático");

        } catch (Exception e) {

            System.out.println("Error general");

        } finally {

            System.out.println("Programa finalizado");

        }

    }
}