import java.util.Scanner;

public class ejemploArrayNotas {

	public static void main(String[] args) {
		// Variables
		int opcion;
		double nota=7.5;
		double arrayNotas [] = {-1,-1,-1};
		Scanner sc = new Scanner (System.in);
		String numero = String.valueOf(nota);
		nota = Integer.parseInt(numero);
		do {
			System.out.println("1.- Insertar nota");
			System.out.println("2.- Mostrar notas");
			System.out.println("3.- Salir");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: System.out.println("Dime la nota");
						nota = sc.nextDouble();
						for(int i=0;i<arrayNotas.length;i++) {
							if(arrayNotas[i]==-1) {
								arrayNotas[i]=nota;
								break;
							}
						}
						
					break;
				case 2: for(int i=0;i<arrayNotas.length;i++) {
							System.out.println("La nota de "+i+ "es "+arrayNotas[i]);
						}
						
					break;
				case 3: System.out.println("Hasta pronto");
					break;
					default: System.out.println("Opcion incorrecta");
				}
		}while(opcion!=3);

	}

}
