import java.util.Scanner;

/*La aplicación debe ofrecer un menú al usuario para poder realizar las 
 * siguientes tareas:

1.- Insertar vehículo.

2.- Eliminar el vehículo y dejar dicho hueco vacío.

3.- Modificar vehículo.

4.- Salir.

El ejercicio debe de controlar que no se repiten matrículas dentro del 
array.

Una vez terminado el ejercicio podemos añadir funcionalidades. Por ejemplo 
realizar la venta de un  vehículo a un cliente con su DNI, mostrar vehículos 
para la venta disponibles, mostrar los vehículos vendidos, mostrar los 
vehículos de un cliente en concreto*/

public class concesionarioVehiculos {

	public static void main(String[] args) {
		// Variables
		int opcion;
		final int FILAS = 100;
		final int COLUMNAS = 5;
		String bastidor;
		Scanner sc = new Scanner(System.in);
		String vehiculos [][] = new String [FILAS][COLUMNAS];
		do {
			System.out.println("== MENÚ DE OPCIONES ==");
			System.out.println("1.- INSERTAR VEHÍCULO");
			System.out.println("2.- ELIMINAR VEHÍCULO");
			System.out.println("3.- MODIFICAR VEHÍCULO");
			System.out.println("4.- SALIR");
			System.out.println("5.- MOSTRAR VEHICULOS");
			System.out.println("6.- VENDER VEHICULO");
			System.out.println("7.- MOSTRAR VEHICULOS DISPONIBLES");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: boolean existe = false;
						System.out.print("Dime el bastidor: ");
						bastidor=sc.nextLine();
						for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null && vehiculos[i][0].equalsIgnoreCase(bastidor)) {
								existe = true;
								System.out.println("Ese bastidor ya existe, no puedes guardarlo");
								break;
							}
						}
						if(!existe) {
							for(int i=0;i<vehiculos.length;i++) {
								if(vehiculos[i][0]==null) {
									vehiculos[i][0]=bastidor;
									System.out.print("Dime la marca: ");
									vehiculos[i][1]=sc.nextLine();
									System.out.print("Dime el modelo: ");
									vehiculos[i][2]=sc.nextLine();
									System.out.print("Dime el precio: ");
									vehiculos[i][3]=sc.nextLine();
									i=vehiculos.length;
									System.out.println("Vehiculo guardado correctamente");
								}
							}
						}
						
					break;
				case 2: System.out.print("Dime el bastidor: ");
						bastidor=sc.nextLine();
						for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null && vehiculos[i][0].equalsIgnoreCase(bastidor)) {
								vehiculos[i][0]=null;
							}
						}
					break;
				case 3: System.out.print("Dime el bastidor: ");
						bastidor=sc.nextLine();
						for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null && vehiculos[i][0].equalsIgnoreCase(bastidor)) {
								System.out.print("Dime el bastidor nuevo: ");
								vehiculos[i][0]=sc.nextLine();
								System.out.print("Dime la marca: ");
								vehiculos[i][1]=sc.nextLine();
								System.out.print("Dime el modelo: ");
								vehiculos[i][2]=sc.nextLine();
								System.out.print("Dime el precio: ");
								vehiculos[i][3]=sc.nextLine();
								i=vehiculos.length;
							}
						}
					break;
				case 4: System.out.println("Gracias por participar");
					break;
				case 5: for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null) {
								System.out.println("-------------");
								System.out.println("El bastidor es: "+vehiculos[i][0]);
								System.out.println("La marca es: "+vehiculos[i][1]);
								System.out.println("El modelo es: "+vehiculos[i][2]);
								System.out.println("El precio es: "+vehiculos[i][3]);
							}
						}
					break;
				case 6: System.out.print("Dime el bastidor: ");
						bastidor=sc.nextLine();
						for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null && vehiculos[i][4]==null && vehiculos[i][0].equalsIgnoreCase(bastidor)) {
								System.out.print("Dime tu dni: ");
								vehiculos[i][4]=sc.nextLine();
							}
						}
					break;
				case 7: for(int i=0;i<vehiculos.length;i++) {
							if(vehiculos[i][0]!=null && vehiculos[i][4]==null) {
								System.out.println("-------------");
								System.out.println("El bastidor es: "+vehiculos[i][0]);
								System.out.println("La marca es: "+vehiculos[i][1]);
								System.out.println("El modelo es: "+vehiculos[i][2]);
								System.out.println("El precio es: "+vehiculos[i][3]);
							}
						}
					break;
				default: System.out.println("Opcion incorrecta");
			}
		}while(opcion!=4);
	}

}
