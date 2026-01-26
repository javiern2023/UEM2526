package PrimerEjercicioClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*Persona p = new Persona();
		System.out.println("Su nombre es: "+p.getNombre());
		p.setNombre("Vicente");
		System.out.println("Su nombre es: "+p.getNombre());
		Persona p1 = new Persona("1234","Javier");
		Persona p2 = new Persona("6789G","Maria","67587");
		Coches c = new Coches("asdf","1234rfv","Volvo","s60");*/
		int opcion;
		Scanner sc = new Scanner(System.in);
		String bastidor, matricula, marca, modelo;	
		
		ArrayList <Coches> listaCoches = new ArrayList<>();
		ArrayList <Persona> listaPersonas = new ArrayList<>();
		
		do {
			System.out.println("1.- Dar de alta coche");
			System.out.println("2.- Dar de alta persona");
			System.out.println("3.- Realizar venta");
			System.out.println("0.- Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: System.out.print("Dime el bastidor: ");
					bastidor=sc.nextLine();
					System.out.print("Dime la matricula: ");
					matricula=sc.nextLine();
					System.out.print("Dime la marca: ");
					marca=sc.nextLine();
					System.out.print("Dime el modelo: ");
					modelo=sc.nextLine();
					Coches c = new Coches(bastidor,matricula,marca,modelo);
					listaCoches.add(c);
				break; 
			}	
		} while(opcion!=0);
		
		
		
		
		
		Persona p = new Persona();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}

}
