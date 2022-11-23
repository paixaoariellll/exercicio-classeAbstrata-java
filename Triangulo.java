package figuraPlana;

public class Triangulo extends FiguraPlana {

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double lado1, double lado2, double lado3) {
		this.setLado1(lado1);
		this.setLado2(lado2);
		this.setLado3(lado3);
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double calculaPerimetro() {
		return this.getLado1() + this.getLado2() + this.getLado3();
	}

	public double calculaSemiPerimetro() {
		return (calculaPerimetro()) / 2;
	}

	public double calculaArea() {
		// fórmula de Heron "IERÃO"
		// A área de qualquer triângulo é dada pela equação, sendo p = ao semiPerímetro:
		// Area = Math.pow((p*(p-L1)*(p-L2)*(p-L3)) ,1/2)
		// Math.pow(base,expoente)
		double p = calculaSemiPerimetro();
		return Math.pow((p * (p - getLado1()) * (p - getLado2()) * (p - getLado3())), 0.5);
	}
}
