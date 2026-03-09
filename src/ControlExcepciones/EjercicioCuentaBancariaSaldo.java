package ControlExcepciones;

public class EjercicioCuentaBancariaSaldo {

    public static void main(String[] args) {

        try {

            retirar(100, 200);

        } catch (EjercicioSaldoInsuficiente e) {

            System.out.println(e.getMessage());

        }

    }
    
    public static void retirar(double saldo, double cantidad) throws EjercicioSaldoInsuficiente {

        if (cantidad > saldo) {
            throw new EjercicioSaldoInsuficiente("Saldo insuficiente");
        }

        System.out.println("Retirada realizada");
    }
    
}