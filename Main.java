import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      // FROTA - GESTÃO DE VEICULOS

        Frota frota = new Frota();

        CarroCompacto carro1 = new CarroCompacto("1", "Marca A", "A", 2021, 50);
        CarroSedan carro2 = new CarroSedan("2", "Marca B", "B", 2020, 80);
        CarroSUV carro3 = new CarroSUV("3", "Marca C", "C", 2022, 100);

        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(carro2);
        frota.adicionarVeiculo(carro3);

        frota.listarVeiculos();

        frota.removerVeiculo("1");
        frota.listarVeiculos();

      
      //GESTÃO MOTORISTAS

        GestaoMotoristas gestao = new GestaoMotoristas();

        gestao.cadastrarMotorista("João Silva", "12345", "AB123456", "Intermediário");
        gestao.cadastrarMotorista("Maria Oliveira", "67890", "CD987654", "Avançado");

        gestao.listarMotoristas();


      // VIAGEM - veículo, motorista, distância percorrida e eletropostos utilizados.
      // Criação de um carro elétrico
      CarroEletrico carro = new CarroCompacto("1", "MarcaX", "ModeloY", 2023, 100.0); // Exemplo de CarroCompacto

      // Criação de um motorista
      Motorista motorista = new Motorista("João Silva", "M001", "1234567890", "Intermediário");

      // Definindo a distância total da viagem
      double distanciaTotal = 600.0; // Distância em km

      // Criando a viagem
      Viagem viagem = new Viagem(carro, motorista, distanciaTotal);

      // Criando uma lista de eletropostos disponíveis
      List<Eletroposto> eletropostos = new ArrayList<>();
      eletropostos.add(new Eletroposto("E1", "Eletroposto A", 5, 4.0));
      eletropostos.add(new Eletroposto("E2", "Eletroposto B", 3, 6.0));
      eletropostos.add(new Eletroposto("E3", "Eletroposto C", 2, 8.0));

      // Planejando paradas
      viagem.planejarParadas(eletropostos);

      // Executando a viagem
      viagem.executarViagem();

      // Exibindo o resumo da viagem
      viagem.exibirResumoViagem();
    }
}