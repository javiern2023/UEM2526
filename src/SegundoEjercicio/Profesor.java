package SegundoEjercicio;

public class Profesor extends Persona implements PersonalUniversidad{
	protected String nomina;

	protected Profesor() {
		super(); //LLamar al constructor de la clase padre
	}

	protected Profesor(String dni, String nombre) {
		super(dni, nombre);
	}

	protected Profesor(String dni, String nombre, String nomina) {
		super(dni, nombre);
		this.nomina = nomina;
	}

	protected String getNomina() {
		return nomina;
	}

	protected void setNomina(String nomina) {
		this.nomina = nomina;
	}

	@Override
	public String toString() {
		
		return "Profesor [nomina=" + nomina + ", dni=" + dni + ", nombre=" + nombre + "]";
	}

	@Override
	protected void calcularDni() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculo() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
