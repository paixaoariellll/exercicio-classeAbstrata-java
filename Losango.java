package figuraPlana;

public class Losango extends FiguraPlana {

	private double diagonalMaior;
	private double diagonalMenor;

	public Losango(double diagonalMaior, double diagonalMenor) {
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double calculaArea() {
		return (this.getDiagonalMaior() * this.getDiagonalMenor()) / 2;
	}

	public double calculaLado() {
		double maior = this.getDiagonalMaior();
		double menor = this.getDiagonalMenor();
		double resultado = Math.pow(maior, 2) + Math.pow(menor, 2);
		double lado = Math.pow(resultado, 0.5);
		return lado;
	}

	public double calculaPerimetro() {
		return 4 * calculaLado();
	}

}
