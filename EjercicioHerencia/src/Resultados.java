/*Impresión de resultados*/

public class Resultados extends FigurasGeometricas{ /*Se extiende de Figuras Geometricas*/

	public static void main(String[] args) {
	
	/*Objetos*/
		
	Circulo Circulo = new Circulo(5); /*Asignamos valores para nuestras variables, en este caso como se declaró "public Circulo (double radio)" colocamos el valor para radio*/
	Triangulo Triangulo1 = new Triangulo (5,8,5); /*Asignamos valores para nuestras variables, en este caso como se declaró "public Triangulo (double base, double altura, double lado)" colocamos el valor para base, altura y lado en ese orden*/
	Cuadrado Cuadrado1 = new Cuadrado (5); /*/*Asignamos valores para nuestras variables, en este caso como se declaró "public Cuadrado (double lado)" colocamos el valor para lado*/
	
	/*Impresión resultados circulo*/
	System.out.println("CIRCULO");
	System.out.println("El perímetro del círculo es: " + Circulo.calcularPerimetro()); 
	System.out.println("El áre del círculo es: " + Circulo.calcularArea());
	System.out.println(); /*Salto de línea*/
	
	/*Impresión resultados triangulo*/
	System.out.println("TRIANGULO");
	System.out.println("El perímetro del triangulo es: "+ Triangulo1.calcularPerimetro());
	System.out.println("El áre del triangulo es: "+ Triangulo1.calcularArea());
	System.out.println(); /*Salto de línea*/
	
	/*Impresión resultados cuadrado*/
	System.out.println("CUADRADO");
	System.out.println("El perímetro del cuadrado es: "+ Cuadrado1.calcularPerimetro());
	System.out.println("El área del cuadrado es: "+ Cuadrado1.calcularArea());
	
	}
}
