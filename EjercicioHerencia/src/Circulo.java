/*Círculo*/

public class Circulo extends FigurasGeometricas{ /*Se extiende de "Figuras Geométricas"*/
	
	/*Añadimos nuestros atributos*/
	
	private double radio;
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	/*Añadimos los métodos para calcular área y perímetro con sus respectivas fórmulas*/

	public double calcularPerimetro () { 
		return 2*3.1416*radio;
	}
	
	public double calcularArea () { 
		return (radio * radio) * 3.1416;
	
	}

}
