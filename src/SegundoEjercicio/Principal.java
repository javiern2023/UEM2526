package SegundoEjercicio;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		Gestion g = new Gestion();
		g.menuPrincipal(0);
		p = new Alumno();
		listaPersonas.add((Alumno)p);
		
		p = new Profesor();
		listaPersonas.add((Profesor)p);
		
		for(Persona p1 : listaPersonas) {
			if(p1 instanceof Alumno) {
				Alumno a = (Alumno) p1; //Casteo
				if(a.getExpediente().equals("1234")) {
					
				}
			}
		}
		
		
	}

	

}
