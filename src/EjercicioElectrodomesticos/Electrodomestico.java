package EjercicioElectrodomesticos;

public abstract class Electrodomestico {
	protected double precioBase, peso;
	protected String color;
	protected char consumoEnergetico;
	protected final double PRECIOBASE=100, PESO=5;
	protected final String COLOR="blanco";
	protected final char CONSUMO='F';
	
	protected Electrodomestico() {
		color=COLOR;
		consumoEnergetico=CONSUMO;
		precioBase=PRECIOBASE;
		peso=PESO;
		precioFinal();
	}

	protected Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		color=COLOR;
		consumoEnergetico=CONSUMO;
		precioFinal();
	}

	protected Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		//this.color = color;
		comprobarColor(color);
		//this.consumoEnergetico = consumoEnergetico;
		comprobarConsumoEnergetico(consumoEnergetico);
		precioFinal();
	}

	protected double getPrecioBase() {
		return precioBase;
	}

	protected double getPeso() {
		return peso;
	}

	protected String getColor() {
		return color;
	}

	protected char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		switch(letra) {
			case 'A': this.consumoEnergetico='A';
				break;
			case 'B': this.consumoEnergetico='B';
				break;
			case 'C': this.consumoEnergetico='C';
				break;
			case 'D': this.consumoEnergetico='D';
				break;
			case 'E': this.consumoEnergetico='E';
				break;
			case 'F': this.consumoEnergetico='F';
				break;
			default: this.consumoEnergetico='F';	
		}
	}
	
	private void comprobarColor(String color) {
		color = color.toLowerCase();
		switch(color) {
			case "blanco": this.color="blanco";
				break;
			case "negro": this.color="negro";
				break;
			case "rojo": this.color="rojo";
				break;
			case "azul": this.color="azul";
				break;
			case "gris": this.color="gris";
				break;
			default: this.color="blanco";	
		}
	}
	
	protected void precioFinal() {
		switch(consumoEnergetico) {
			case 'A': this.precioBase+=100;
				break;
			case 'B': this.precioBase+=80;
				break;
			case 'C': this.precioBase+=60;
				break;
			case 'D': this.precioBase+=50;
				break;
			case 'E': this.precioBase+=30;
				break;
			case 'F': this.precioBase+=10;
				break;
			default: this.precioBase+=10;;	
		}
		if(peso>=0 && peso<=19) this.precioBase+=10;
		else if(peso>=20 && peso<=49) this.precioBase+=50;
		else if(peso>=50 && peso<=79) this.precioBase+=80;
		else if(peso>80) this.precioBase+=100;
		else this.precioBase+=10;
	}
	
	//protected abstract void calcularValor();
	
}
