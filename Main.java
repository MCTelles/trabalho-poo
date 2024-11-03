import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frota frota = new Frota();
        GestaoMotoristas gestaoMotoristas = new GestaoMotoristas();
        List<Eletroposto> eletropostos = new ArrayList<>();

        // Criar eletropostos
        eletropostos.add(new Eletroposto("E1", "Shopping Center", 5, 4.0));
        eletropostos.add(new Eletroposto("E2", "Posto de Combustível", 3, 2.5));

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Adicionar Motorista");
            System.out.println("4. Listar Motoristas");
            System.out.println("5. Planejar e Executar Viagem");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Adicionar veículo
                    System.out.print("Digite o tipo de veículo (compacto, sedan, suv): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite o ID do veículo: ");
                    String id = scanner.nextLine();
                    System.out.print("Digite a marca do veículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano de fabricação: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite a capacidade da bateria: ");
                    double bateria = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    switch (tipo.toLowerCase()) {
                        case "compacto":
                            frota.adicionarVeiculo(new CarroCompacto(id, marca, modelo, ano, bateria));
                            break;
                        case "sedan":
                            frota.adicionarVeiculo(new CarroSedan(id, marca, modelo, ano, bateria));
                            break;
                        case "suv":
                            frota.adicionarVeiculo(new CarroSUV(id, marca, modelo, ano, bateria));
                            break;
                        default:
                            System.out.println("Tipo de veículo inválido.");
                    }
                    break;

                case 2:
                    // Listar veículos
                    frota.listarVeiculos();
                    break;

                case 3:
                    // Adicionar motorista
                    System.out.print("Digite o nome do motorista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o ID do motorista: ");
                    String idMotorista = scanner.nextLine();
                    System.out.print("Digite a CNH do motorista: ");
                    String cnh = scanner.nextLine();
                    System.out.print("Digite o nível de experiência do motorista: ");
                    String nivelExperiencia = scanner.nextLine();

                    gestaoMotoristas.cadastrarMotorista(nome, idMotorista, cnh, nivelExperiencia);
                    break;

                case 4:
                    // Listar motoristas
                    gestaoMotoristas.listarMotoristas();
                    break;

                case 5:
                    // Planejar e executar viagem
                    System.out.print("Digite o ID do motorista: ");
                    String idMotoristaViagem = scanner.nextLine();
                    Motorista motorista = null;
                    for (Motorista m : gestaoMotoristas.getMotoristas()) { // Use o novo método
                        if (m.getId().equals(idMotoristaViagem)) {
                            motorista = m;
                            break;
                        }
                    }

                    if (motorista == null) {
                        System.out.println("Motorista não encontrado.");
                        break;
                    }

                    System.out.print("Digite o ID do veículo: ");
                    String idVeiculo = scanner.nextLine();
                    CarroEletrico veiculoViagem = null;
                    for (CarroEletrico carro : frota.getVeiculos()) {
                        if (carro.getId().equals(idVeiculo)) {
                            veiculoViagem = carro;
                            break;
                        }
                    }

                    if (veiculoViagem == null) {
                        System.out.println("Veículo não encontrado.");
                        break;
                    }

                    System.out.print("Digite a distância total da viagem (km): ");
                    double distanciaTotal = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    Viagem viagem = new Viagem(veiculoViagem, motorista, distanciaTotal);
                    viagem.planejarParadas(eletropostos);
                    viagem.executarViagem();
                    viagem.exibirResumoViagem();
                    break;

                case 6:
                    // Sair
                    running = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
