import java.util.Scanner;

public class tiendaTablets {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			menuPrincipal();
			opcion = sc.nextInt();
			menuOpciones(opcion, sc);
			opcion=9;
		} while (opcion != 0);

	}
	
	public static void menuOpciones(int opcion, Scanner sc) {
		String arrayTablets [][] = new String [100][6];
		arrayTablets[2][0]="987";
		switch(opcion) {
			case 1: darAltaTablet(sc, arrayTablets);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				 break;
			case 0: System.out.print("Hasta pronto");
				break;
			default: System.out.println("Opcion incorrecta");
		}
	}
	
	public static void darAltaTablet(Scanner sc, String arrayTablets [][]) {
		for(int i=0;i<arrayTablets[i].length;i++) {
			if(arrayTablets[i][0]==null) {
				System.out.print("Dime el id: ");
				arrayTablets[i][0] = sc.nextLine();
				System.out.print("Dime la marca: ");
				arrayTablets[i][1] = sc.nextLine();
				System.out.print("Dime el modelo: ");
				arrayTablets[i][2] = sc.nextLine();
				System.out.print("Dime el color: ");
				arrayTablets[i][3] = sc.nextLine();
				System.out.println("Dime el precio: ");
				arrayTablets[i][4] = sc.nextLine();
			}
		}
		
		
		
	}
	
	public static void menuPrincipal() {
		System.out.println("== MENÚ DE OPCIONES ==");
		System.out.println("1.- Insertar tablet");
		System.out.println("2.- Modificar datos tablet");
		System.out.println("3.- Vender tablet a un cliente");
		System.out.println("4.- Mostrar todas las tablets");
		System.out.println("5.- Mostrar tablets disponibles");
		System.out.println("6.- Mostrar tablets vendidas");
		System.out.println("0.- Salir");
		System.out.println("Indique la tarea a realizar");
	}
	

}
