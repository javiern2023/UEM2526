package PrimerEjercicioClases;

import java.util.ArrayList;

public class Persona {
	// Atributos o propiedades
	protected String dni, nombre, movil;
	protected ArrayList <Coches> coches = new ArrayList<>();

	// Constructores 
	protected Persona() {
		
	}

	protected Persona(String Dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	protected Persona(String dni, String nombre, String movil) {
		this.dni = dni;
		this.nombre = nombre;
		this.movil = movil;
	}

	// Métodos
	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getMovil() {
		return movil;
	}

	protected void setMovil(String movil) {
		this.movil = movil;
	}
	
	 
	protected void anadirCoche(Coches c) {
		
	}
	
	
}
