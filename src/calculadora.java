import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// Variables
		int num1, num2, opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el primer numero");
		num1=sc.nextInt();
		System.out.println("Dime el segundo numero");
		num2=sc.nextInt();
		
		System.out.println("La suma es "+(num1+num2));
		if(num1>num2) {
			System.out.println("La resta es "+(num1-num2));
		}
		else {
			System.out.println("La resta es "+(num2-num1));
		}
		System.out.println("La multiplicación es "+(num1*num2));
		if(num2==0) {
			System.out.println("La división no se puede hacer");
		}
		else {
			System.out.println("La división es "+(num1/num2));
		}
		if(num2==0) {
			System.out.println("El resto no se puede hacer");
		}
		else {
			System.out.println("El resto es "+(num1%num2));
		}
		/*System.out.println("== MENÚ DE OPERACIONES ==");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Resto");
		System.out.print("Indica la opción a realizar: ");
		opcion=sc.nextInt();*/
		
		

	}

}
