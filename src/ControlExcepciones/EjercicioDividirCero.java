package ControlExcepciones;

import java.util.Scanner;

/* try -- Código que puede fallar
catch -- Captura el error
finally -- Siempre se ejecuta
throw -- Lanzar excepción manual
throws -- Indicar que un método puede lanzar excepción
Excepción propia -- Crear errores personalizados
 * */

public class EjercicioDividirCero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Introduce un número: ");
            int a = sc.nextInt();

            System.out.print("Introduce otro número: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
        	
            System.out.println("Error: no se puede dividir entre 0");

        }

    }
}