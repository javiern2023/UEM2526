package ControlExcepciones;

public class EjercicioExcepcionPropiaEdad {

    public static void main(String[] args) {

        try {

            comprobarEdad(15);

        } catch (EjercicioEdadNoValida e) {

            System.out.println(e.getMessage());

        }

    }
    
    public static void comprobarEdad(int edad) throws EjercicioEdadNoValida {

        if (edad < 18) {
            throw new EjercicioEdadNoValida("Edad menor de 18 años");
        }

        System.out.println("Edad válida");
    }
    
}