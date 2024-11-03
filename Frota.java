import java.util.ArrayList;
import java.util.List;

public class Frota {
    private final List<CarroEletrico> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    // Método para adicionar um veículo
    public void adicionarVeiculo(CarroEletrico carro) {
        veiculos.add(carro);
        System.out.println("Veículo adicionado: " + carro.getModelo());
    }

    // Método para remover um veículo pelo ID
    public void removerVeiculo(String id) {
        for (CarroEletrico carro : veiculos) {
            if (carro.getId().equals(id)) {
                veiculos.remove(carro);
                System.out.println("Veículo removido: " + carro.getModelo());
                return;
            }
        }
        System.out.println("Veículo com ID " + id + " não encontrado.");
    }

    // Método para listar todos os veículos
    public void listarVeiculos() {
        System.out.println("Lista de Veículos:");
        for (CarroEletrico carro : veiculos) {
            System.out.println(carro);
        }
    }

    // Método para acessar a lista de veículos
    public List<CarroEletrico> getVeiculos() {
        return new ArrayList<>(veiculos); // Retorna uma cópia da lista de veículos
    }
}
