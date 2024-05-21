package exercicio10_viagem;

public class Veiculo {
	private int idVeiculo;
	private String placa;
	private char status;
	private int kmOdometro;
	
	public int getIdVeiculo() {
		return idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}
	public char getStatus() {
		return status;
	}
	public int getKmOdometro() {
		return kmOdometro;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Veiculo(int idVeiculo, String placa, int kmOdometro) {
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.kmOdometro = kmOdometro;
		this.status = 'D';
	}
	
	public void registrarViagem() {
		this.status = 'V';
	}
	
	public void resgistrarRetorno(int kmOdometro) {
		status = 'D';
		this.kmOdometro += kmOdometro;
	}
	
	public void revisar() {
		this.status = 'M';
	}

}
