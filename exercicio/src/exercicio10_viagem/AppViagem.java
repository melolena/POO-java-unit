package exercicio10_viagem;

import java.util.Date;

public class AppViagem {

    public static void main(String[] args) {
        // Criando um veículo
        Veiculo veiculo = new Veiculo(1, "ABC1234", 10000);

        // Programando uma viagem
        Date dataInicial = new Date(); // Data inicial é a data atual
        Date dataFinal = new Date(dataInicial.getTime() + 86400000); // Data final é um dia depois

        Viagem viagem = new Viagem(1, "São Paulo", dataInicial, dataFinal);

        System.out.println("Viagem Programada:");
        System.out.println("Destino: " + viagem.getDestino());
        System.out.println("Data Inicial: " + viagem.getDataInicial());
        System.out.println("Data Final: " + viagem.getDataFinal());

        System.out.println("\nDados do Veículo antes de registrar a viagem:");
        System.out.println("Placa: " + viagem.getVeiculo().getPlaca());
        System.out.println("Status: " + viagem.getVeiculo().getStatus());

        // Associando o veículo à viagem e iniciando a viagem
        if (viagem.iniciarViagem(veiculo)) {
            System.out.println("\nViagem Iniciada:");
            System.out.println("Data Inicial da Viagem: " + viagem.getDataInicial());
            System.out.println("Status do Veículo: " + viagem.getVeiculo().getStatus());
        } else {
            System.out.println("\nViagem não pode ser iniciada. Veículo já está viajando.");
        }



        // Mostrando os dados do veículo após finalizar a viagem
        viagem.getVeiculo().resgistrarRetorno(1500);
        System.out.println("\nDados do Veículo após finalizar a viagem:");
        System.out.println("Placa: " + viagem.getVeiculo().getPlaca());
        System.out.println("Status: " + viagem.getVeiculo().getStatus());
        System.out.println("Odômetro: " + viagem.getVeiculo().getKmOdometro());

        // Colocando o veículo em manutenção
        viagem.getVeiculo().revisar();

        // Mostrando os dados do veículo após colocar em manutenção
        System.out.println("\nVeículo em Manutenção:");
        System.out.println("Status: " + viagem.getVeiculo().getStatus());
    }
}
