public class CarroSUV extends CarroEletrico {
  public CarroSUV(String id, String marca, String modelo, int anoFabrica, double bateria) {
      super(id, marca, modelo, anoFabrica, bateria, 400);
  }

  public double tempoCarga() {
      return 8.0;
  }
}