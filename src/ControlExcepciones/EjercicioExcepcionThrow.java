package ControlExcepciones;

public class EjercicioExcepcionThrow {

    public static void main(String[] args) {

        int edad = 15;

        if (edad < 18) {
            throw new IllegalArgumentException("Debes ser mayor de edad");
        }

        System.out.println("Acceso permitido");
    }
}