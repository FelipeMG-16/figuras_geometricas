/*C�rculo*/

public class Circulo extends FigurasGeometricas{ /*Se extiende de "Figuras Geom�tricas"*/
	
	/*A�adimos nuestros atributos*/
	
	private double radio;
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	/*A�adimos los m�todos para calcular �rea y per�metro con sus respectivas f�rmulas*/

	public double calcularPerimetro () { 
		return 2*3.1416*radio;
	}
	
	public double calcularArea () { 
		return (radio * radio) * 3.1416;
	
	}

}
