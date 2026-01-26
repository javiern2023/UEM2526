package SegundoEjercicio;

public class Alumno extends Persona{
	protected String expediente;


	protected Alumno() {
		super();
	}
	
	protected Alumno(String dni, String nombre, String expediente) {
		super(dni, nombre);
		this.expediente = expediente;
	}

	protected String getExpediente() {
		return expediente;
	}

	protected void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	@Override
	protected void calcularDni() {
		// TODO Auto-generated method stub
		
	}
}
