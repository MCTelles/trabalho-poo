import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String Nome;
    private String id;
    private String CNH;
    private String nivelExperiencia;

    public Motorista(String Nome, String id, String CNH, String nivelExperiencia) {
        this.Nome = Nome;
        this.id = id;
        this.CNH = CNH;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }
}

class GestaoMotoristas {
    private List<Motorista> motoristas;

    public GestaoMotoristas() {
        motoristas = new ArrayList<>();
    }

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
    public List<Motorista> getMotoristas() {
        return motoristas;
    }
}
