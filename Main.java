package figuraPlana;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		Quadrado quadrado = new Quadrado(3);
		Triangulo triangulo = new Triangulo(3, 4, 5);
		Losango losango = new Losango(8, 6);

		System.out.println("********** Circulo **********");
		System.out.println("Perimetro " + circulo.calculaPerimetro());
		System.out.println("Area " + circulo.calculaArea());

		System.out.println("********** Quadrado **********");
		System.out.println("Perimetro " + quadrado.calculaPerimetro());
		System.out.println("Area " + quadrado.calculaArea());

		System.out.println("********** Triangulo **********");
		System.out.println("Perimetro " + triangulo.calculaPerimetro());
		System.out.println("Area " + triangulo.calculaArea());

		System.out.println("********** Losango **********");
		System.out.println("Perimetro " + losango.calculaPerimetro());
		System.out.println("Area " + losango.calculaArea());
	}
}