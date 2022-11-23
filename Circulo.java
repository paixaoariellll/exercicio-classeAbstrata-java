package figuraPlana;

public class Circulo extends FiguraPlana {

	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}

	public double calculaArea() {
		return Math.PI * (this.getRaio() * this.getRaio());
	}

	public double calculaPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
