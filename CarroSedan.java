public class CarroSedan extends CarroEletrico {
  public CarroSedan(String id, String marca, String modelo, int anoFabrica, double bateria) {
      super(id, marca, modelo, anoFabrica, bateria, 400);
  }
  public double tempoCarga() {
      return 6.0;
  }
}