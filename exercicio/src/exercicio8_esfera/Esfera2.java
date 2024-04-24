package exercicio8_esfera;

public class Esfera2 {
	private double raio;

	
	public Esfera2(double raio) {
		this.raio = raio;
		calcularAreaEsfera();
		calcularVolumeEsfera();
	}
	
	public  double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularAreaEsfera() {
		return 4 * Math.PI * Math.pow(raio, 2);
	}
	
	public double calcularVolumeEsfera() {
		return 4/3 * Math.PI * Math.pow(raio, 3);
	}
}
