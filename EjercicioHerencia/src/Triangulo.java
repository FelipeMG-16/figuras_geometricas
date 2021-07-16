/*Triangulo*/

public class Triangulo extends FigurasGeometricas { /*Se extiende de "Figuras Geométricas"*/

	/*Añadimos nuestros atributos*/

	private double base; 
	private double altura; 
	private double lado; 
	
	public Triangulo (double base, double altura, double lado) { 
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	/*Añadimos los métodos para calcular área y perímetro con sus respectivas fórmulas*/

	
	public double calcularPerimetro () { 
		return (lado + lado + lado);
	}
	
	public double calcularArea () { 
		return (base*altura) / 2;
	}
}