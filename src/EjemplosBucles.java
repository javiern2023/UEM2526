import java.util.Scanner;

public class EjemplosBucles {

	public static void main(String[] args) {
		// Bucles
		int opcion, num1, num2;
		Scanner sc = new Scanner (System.in);
		boolean valor =true;
		
		opcion=4;
		/*while (!valor) {
			System.out.println("== MENÚ OPCIONES ==");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Resto");
			System.out.println("6.- Salir");
			opcion=sc.nextInt();
		}*/

		/*do {
			System.out.print("Dime el primer número: ");
			num1=sc.nextInt();
			
			System.out.println("== MENÚ OPCIONES ==");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Resto");
			System.out.println("6.- Salir");
			opcion=sc.nextInt();
			
			System.out.print("Dime el segundo número: ");
			num2=sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.println("La suma es: "+(num1+num2));
					break;
				case 2: if(num1>=num2) System.out.println("La resta es: "+(num1-num2));
						else System.out.println("La resta es: "+(num2-num1));
					break;
				case 3: System.out.println("La multiplicación es: "+(num1*num2));
					break;
				case 4: if(num2==0) System.out.println("Divisor igual que cero");
						else System.out.println("La división es: "+(num1/num2));
					break;
				case 5: if(num2==0) System.out.println("Divisor igual que cero");
						else System.out.println("El resto es: "+(num1%num2)); 
					break;
				case 6: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opción incorrecta");
			}
		}while(opcion!=6);*/
		
		//Bucle for
		for(int i=2;i<=opcion;i--) {
			if(i%2==0) {
				System.out.print("El numero "+i+" es par");
				continue;
			}
			else System.out.print("El numero "+i+" es impar");
		}
		
	}
}
