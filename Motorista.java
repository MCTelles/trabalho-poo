import java.util.ArrayList;
import java.util.List;

public class Motorista {
  private String Nome;
  private String id;
  private String CNH;
  private String nivelExperiencia;
  private List<Viagem> viagens;

  public Motorista(String Nome, String id, String CNH, String nivelExperiencia) {
    this.Nome = Nome;
    this.id = id;
    this.CNH = CNH;
    this.nivelExperiencia = nivelExperiencia;
    this.viagens = new ArrayList<>();
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

  public List<Viagem> getViagens() {
    return viagens;
  }

  public void adicionarViagem(Viagem viagem) {
    viagens.add(viagem);
  }
}
