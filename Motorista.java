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
