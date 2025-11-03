//HE JUNTADO LOS EJERCICIOS 3, 4 Y 5 EN UNO SOLO.
import java.util.Scanner;

public class ejercicioNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("-ESTE COMPARADOR SOLO FUNCIONA CON NÚMEROS ENTEROS-");
		System.out.println("Dime los números que quieras comparar:");
		
		System.out.println("Número 1:");
		num1 = sc.nextInt();
		if (num1%2 == 0) {
			System.out.println("Este número es par.");
		}else {
			System.out.println("Este número es impar.");
		}
		
		System.out.println("Número 2:");
		num2 = sc.nextInt();
		if (num2%2 == 0) {
			System.out.println("Este número es par.");
		}else {
			System.out.println("Este número es impar.");
		}
		
		System.out.println("Número 3:");
		num3 = sc.nextInt();
		if (num3%2 == 0) {
			System.out.println("Este número es par.");
		}else {
			System.out.println("Este número es impar.");
		}
		
		
		if (num1==num2 && num1==num3) {
			System.out.println("Los números que quieras comparar son todos iguales.");
		}else {
			int mayor = Math.max(num1, Math.max(num2, num3));
			int menor = Math.min(num1, Math.min(num2, num3));
			System.out.println(mayor + " es el número más alto.");
			System.out.println(menor + " es el número más bajo.");
			
			if (num1>num2 && num2>num3) {
				System.out.println("El orden ascendente es: "+num3+", "+num2+" y "+num1+".");
			}else if(num1<num2 && num2>num3 && num3<num1) {
				System.out.println("El orden ascendente es: "+num3+", "+num1+" y "+num2+".");
			}else if(num1>num2 && num2<num3 && num3>num1) {
				System.out.println("El orden ascendente es: "+num2+", "+num1+" y "+num3+".");
			}else if(num1>num3 && num2<num3 && num2<num1) {
				System.out.println("El orden ascendente es: "+num2+", "+num3+" y "+num1+".");
			}else if(num1<num2 && num2<num3) {
				System.out.println("El orden ascendente es: "+num1+", "+num2+" y "+num3+".");
			}else if(num1<num2 && num2>num3 && num3>num1) {
				System.out.println("El orden ascendente es: "+num1+", "+num3+" y "+num2+".");
			}
		}
		
	}

}
