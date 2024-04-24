package exercicio8_esfera;

public class Esfera1 {
	private double raio;
	private double area; 
	private double volume;
	
	public Esfera1(double raio) {
		this.raio = raio;
		calcularAreaEsfera();
		calcularVolumeEsfera();
	}
	
	public  double getRaio() {
		return raio;
	}
	
	public void AlteraRaio(double raio) {
		this.raio = raio;
		calcularAreaEsfera();
		calcularVolumeEsfera();
	}
	
	public double getArea() {
		return area;
	}
	
	public double getVolume() {
		return volume;
	}
	
	
	private void calcularAreaEsfera() {
		area = 4 * Math.PI * Math.pow(raio, 2);
	}
	
	private void calcularVolumeEsfera() {
		volume = 4/3 * Math.PI * Math.pow(raio, 3);
	}

}
