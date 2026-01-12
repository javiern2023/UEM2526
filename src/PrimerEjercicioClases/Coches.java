package PrimerEjercicioClases;

public class Coches {
	protected String bastidor, matricula, marca, modelo;
	protected Persona p;

	protected Coches(String bastidor, String matricula, String marca, String modelo) {
		this.bastidor = bastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	protected void anadirPersona(Persona p) {
		this.p = p;
	}
	
}
