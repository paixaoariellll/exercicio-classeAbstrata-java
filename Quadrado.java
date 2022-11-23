package figuraPlana;

public class Quadrado extends FiguraPlana {

	private double lado;

	public Quadrado(double lado) {
		this.setLado(lado);
	}

	public double calculaArea() {
		return this.getLado() * this.getLado();
	}

	public double calculaPerimetro() {
		return 4 * this.getLado();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
