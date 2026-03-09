package ControlExcepciones;

import java.util.Scanner;

public class EjercicioNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();

            int resultado = 10 / numero;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("No se puede dividir entre cero");

        } catch (Exception e) {

            System.out.println("Error general");

        }

    }
}