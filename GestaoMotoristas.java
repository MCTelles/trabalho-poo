import java.util.ArrayList;
import java.util.List;

public class GestaoMotoristas {
    private final List<Motorista> motoristas;

    public GestaoMotoristas() {
        motoristas = new ArrayList<>();
    }

    // Método para cadastrar motorista
    public void cadastrarMotorista(String nome, String id, String CNH, String nivelExperiencia) {
        Motorista motorista = new Motorista(nome, id, CNH, nivelExperiencia);
        motoristas.add(motorista);
        System.out.println("\u001B[32mMotorista cadastrado com sucesso!\u001B[0m");
    }

    public void listarMotoristas() {
        if (motoristas.isEmpty()) {
            System.out.println("\u001B[31mNenhum motorista cadastrado.\u001B[0m");
        } else {
            System.out.println("Lista de Motoristas:");
            for (Motorista motorista : motoristas) {
                System.out.println("----------------------------");
                System.out.println("Nome: " + motorista.getNome());
                System.out.println("ID: " + motorista.getId());
                System.out.println("CNH: " + motorista.getCNH());
                System.out.println("Nível de Experiência: " + motorista.getNivelExperiencia());
                System.out.println("----------------------------");
            }
        }
    }
    // Método para listar viagens dos motoristas
    public void listarViagensMotorista(String idMotorista) {
        for (Motorista motorista : motoristas) {
            if (motorista.getId().equals(idMotorista)) {
                System.out.println("Viagens de " + motorista.getNome() + ":");
                List<Viagem> viagens = motorista.getViagens();
                if (viagens.isEmpty()) {
                    System.out.println("Nenhuma viagem registrada.");
                } else {
                    for (Viagem viagem : viagens) {
                        System.out.println(viagem); // Chama o método toString da classe Viagem
                    }
                }
                return; // Sai do método após encontrar o motorista
            }
        }
        System.out.println("Motorista com ID " + idMotorista + " não encontrado.");
    }

    // Método para acessar a lista de motoristas
    public List<Motorista> getMotoristas() {
        return motoristas; // Retorna a lista de motoristas
    }
}
