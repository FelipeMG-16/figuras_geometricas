/*Cuadrado*/

public class Cuadrado extends FigurasGeometricas { /*Se extiende de "Figuras Geom�tricas"*/
	
	/*A�adimos nuestros atributos*/

	private double lado;
	
	public Cuadrado (double lado) { 
		this.lado = lado;
	}
	
	/*A�adimos los m�todos para calcular �rea y per�metro con sus respectivas f�rmulas*/
	
	public double calcularPerimetro () { 
		return (lado*4);
	}
	
	public double calcularArea () { 
		return (lado*lado);
	}
}
