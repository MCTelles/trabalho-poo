public class CarroEletrico {
    protected String id;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double bateria;
    protected double autonomiaAtual;
    private boolean manutencaoNecessaria;

    public CarroEletrico(String id, String marca, String modelo, int ano, double bateria, double autonomiaAtual) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.bateria = bateria;
        this.autonomiaAtual = autonomiaAtual;
        this.manutencaoNecessaria = false;
    }

    public void marcarManutencao() {
        manutencaoNecessaria = true;
    }

    public boolean precisaDeManutencao() {
        return manutencaoNecessaria;
    }

    public void exibirManutencaoNecessaria() {
        if (precisaDeManutencao()) {
            System.out.println("O veículo " + modelo + " necessita de manutenção.");
        } else {
            System.out.println("O veículo " + modelo + " está em boas condições.");
        }
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getBateria() {
        return bateria;
    }

    public double getAutonomiaAtual() {
        return autonomiaAtual;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", Modelo:" + modelo;
    }
}
