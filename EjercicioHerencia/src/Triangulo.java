/*Triangulo*/

public class Triangulo extends FigurasGeometricas { /*Se extiende de "Figuras Geom�tricas"*/

	/*A�adimos nuestros atributos*/

	private double base; 
	private double altura; 
	private double lado; 
	
	public Triangulo (double base, double altura, double lado) { 
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	/*A�adimos los m�todos para calcular �rea y per�metro con sus respectivas f�rmulas*/

	
	public double calcularPerimetro () { 
		return (lado + lado + lado);
	}
	
	public double calcularArea () { 
		return (base*altura) / 2;
	}
}