import java.util.Scanner;

public class ejercicioMenu {

	public static void main(String[] args) {
		// variables
		int opcion, numero;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("== MENÚ DE OPCIONES ==");
			System.out.println("1.- Par e impar");
			System.out.println("2.- Calcular sueldo");
			System.out.println("3.- Precio final producto");
			System.out.println("4.- Salir");
			System.out.print("Indique la opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.print("Dime el número final: ");
						numero = sc.nextInt();
						
						for(int i=0;i<=numero;i++) {
							if(numero%2==0) System.out.println("Es par");
							else System.out.println("Es impar");
						}
						
						
					break;
				case 2: int valor;						
					break;
				case 3:
					break;
				case 4: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opcion incorrecta");
			}
			
		}while(opcion!=4);
		

	}
	
}
