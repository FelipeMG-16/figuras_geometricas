/*Impresi�n de resultados*/

public class Resultados extends FigurasGeometricas{ /*Se extiende de Figuras Geometricas*/

	public static void main(String[] args) {
	
	/*Objetos*/
		
	Circulo Circulo = new Circulo(5); /*Asignamos valores para nuestras variables, en este caso como se declar� "public Circulo (double radio)" colocamos el valor para radio*/
	Triangulo Triangulo1 = new Triangulo (5,8,5); /*Asignamos valores para nuestras variables, en este caso como se declar� "public Triangulo (double base, double altura, double lado)" colocamos el valor para base, altura y lado en ese orden*/
	Cuadrado Cuadrado1 = new Cuadrado (5); /*/*Asignamos valores para nuestras variables, en este caso como se declar� "public Cuadrado (double lado)" colocamos el valor para lado*/
	
	/*Impresi�n resultados circulo*/
	System.out.println("CIRCULO");
	System.out.println("El per�metro del c�rculo es: " + Circulo.calcularPerimetro()); 
	System.out.println("El �re del c�rculo es: " + Circulo.calcularArea());
	System.out.println(); /*Salto de l�nea*/
	
	/*Impresi�n resultados triangulo*/
	System.out.println("TRIANGULO");
	System.out.println("El per�metro del triangulo es: "+ Triangulo1.calcularPerimetro());
	System.out.println("El �re del triangulo es: "+ Triangulo1.calcularArea());
	System.out.println(); /*Salto de l�nea*/
	
	/*Impresi�n resultados cuadrado*/
	System.out.println("CUADRADO");
	System.out.println("El per�metro del cuadrado es: "+ Cuadrado1.calcularPerimetro());
	System.out.println("El �rea del cuadrado es: "+ Cuadrado1.calcularArea());
	
	}
}
