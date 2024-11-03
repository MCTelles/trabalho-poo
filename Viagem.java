import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private CarroEletrico veiculo;
    private Motorista motorista;
    private double distanciaTotal;
    private List<Eletroposto> eletropostosUsados;

    public Viagem(CarroEletrico veiculo, Motorista motorista, double distanciaTotal) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.distanciaTotal = distanciaTotal;
        this.eletropostosUsados = new ArrayList<>();
    }

    // Método para planejar as paradas com base na autonomia do veículo
    public void planejarParadas(List<Eletroposto> eletropostos) {
        double autonomiaRestante = veiculo.getAutonomiaAtual();
        double distanciaPercorrida = 0;

        System.out.println("Planejamento de Paradas para a Viagem:");
        for (Eletroposto posto : eletropostos) {
            if (distanciaPercorrida + autonomiaRestante < distanciaTotal) {
                eletropostosUsados.add(posto);
                distanciaPercorrida += autonomiaRestante;
                autonomiaRestante = veiculo.getBateria();
                System.out.println("Parada em: " + posto.getLocal() + ", Tempo estimado de recarga: " + posto.getTempoMedioCarga() + " horas");
            } else {
                break;
            }
        }
        
        if (distanciaPercorrida < distanciaTotal) {
            System.out.println("Não foi possível planejar paradas para cobrir toda a distância da viagem. Verifique a disponibilidade de eletropostos.");
        } else {
            System.out.println("Paradas planejadas com sucesso!");
        }
    }

    // Simula a execução da viagem e atualiza a autonomia do veículo após cada parada
    public void executarViagem() {
        System.out.println("Iniciando viagem com " + motorista.getNome() + " no veículo " + veiculo.getModelo());
        double autonomiaRestante = veiculo.getAutonomiaAtual();

        for (Eletroposto posto : eletropostosUsados) {
            if (autonomiaRestante < distanciaTotal) {
                System.out.println("Parada para recarga no eletroposto em: " + posto.getLocal());
                autonomiaRestante = veiculo.getBateria();
            }
            distanciaTotal -= autonomiaRestante;
            autonomiaRestante = 0;
        }
        System.out.println("Viagem concluída!");
    }

    // Exibe um resumo da viagem
    public void exibirResumoViagem() {
        System.out.println("Resumo da Viagem:");
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Veículo: " + veiculo.getModelo() + " (" + veiculo.getMarca() + ")");
        System.out.println("Distância Total: " + distanciaTotal + " km");
        System.out.println("Eletropostos Utilizados:");
        for (Eletroposto posto : eletropostosUsados) {
            System.out.println("- Local: " + posto.getLocal() + ", Tempo Médio de Carga: " + posto.getTempoMedioCarga() + " horas");
        }
    }
}
