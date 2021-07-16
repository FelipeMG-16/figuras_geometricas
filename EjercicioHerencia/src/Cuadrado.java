/*Cuadrado*/

public class Cuadrado extends FigurasGeometricas { /*Se extiende de "Figuras Geométricas"*/
	
	/*Añadimos nuestros atributos*/

	private double lado;
	
	public Cuadrado (double lado) { 
		this.lado = lado;
	}
	
	/*Añadimos los métodos para calcular área y perímetro con sus respectivas fórmulas*/
	
	public double calcularPerimetro () { 
		return (lado*4);
	}
	
	public double calcularArea () { 
		return (lado*lado);
	}
}
