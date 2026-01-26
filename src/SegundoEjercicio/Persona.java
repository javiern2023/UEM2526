package SegundoEjercicio;

public abstract class Persona {
	protected String dni, nombre;
	
	protected double saldo;

	
	protected Persona() {
		
	}

	protected Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

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

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	protected abstract void calcularDni();
	
}
