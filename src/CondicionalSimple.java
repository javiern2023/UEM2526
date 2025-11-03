import java.util.Scanner;

public class CondicionalSimple {

	public static void main(String[] args) {
		// Estructuras
		/*int nota;
		String nombre;
		
		System.out.println("Dime tú nota: ");
		nota = sc.nextInt();
		System.out.println("Dime tú nombre");
		nombre = sc.nextLine();
		
		if(nombre.equalsIgnoreCase("Alonso")) {
			
		}
		
		//PRIMERA ESTRUCTURA
		if(nota>=0 && nota<5) {
			System.out.print("INSUFICIENTE");
		}
		else {
			if(nota>=5 && nota<6) {
						System.out.print("SUFICIENTE");
			}
			else {
				if(nota>=6 && nota<7) {
					System.out.print("BIEN");
				}
				else {
					if(nota>=7 && nota<9) {
						System.out.print("NOTABLE");
					}
					else {
						if(nota>=9 && nota<10) {
							System.out.print("SOBRESALIENTE");
						}
						else {
							if(nota==10) {
								System.out.print("MATRICULA DE HONOR");
							}
							else System.out.println("Número incorrecto");
						}
					}
				}
			}
		}
		
		//SEGUNDA ESTRUCTURA
		if(nota>=0 && nota<5) {
			System.out.print("INSUFICIENTE");
		}
		else if(nota>=5 && nota<6){
			System.out.print("SUFICIENTE");
		}
		else if(nota>=6 && nota<7) {
			System.out.print("BIEN");
		}
		else if(nota>=7 && nota<9) {
			System.out.print("NOTABLE");
		}
		else if(nota>=9 && nota<10) {
			System.out.print("SOBRESALIENTE");
		}
		else if(nota==10) {
			System.out.print("MATRICULA DE HONOR");
		}
		else System.out.println("Número incorrecto");
		*/
		//Menús
		//1ª: un número entero
		//2ª: una cadena de caracteres
		//3ª: un carácter
		int opcion, num1, num2;
		Scanner sc = new Scanner(System.in);
		
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
		
	}

}
