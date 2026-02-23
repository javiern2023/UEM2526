package EjercicioElectrodomesticos;

public class Lavadora extends Electrodomestico implements prueba{
	protected int carga;
	protected final int CARGA=5;
	
	protected Lavadora() {
		super();
		this.carga=CARGA;
	}

	protected Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga=CARGA;
	}

	protected Lavadora(double precioBase, double peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	protected int getCarga() {
		return carga;
	}
	
	@Override
	protected void precioFinal() {
		super.precioFinal();
		if(carga>30) this.precioBase+=50;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", peso=" + peso + ", color=" + color
				+ ", consumoEnergetico=" + consumoEnergetico + "]";
	}

	@Override
	public void calcularValor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String muestra(int numero) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	protected void calcularValor() {
		
		
	}*/
	
	
	

}
