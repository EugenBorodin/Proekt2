public class Engine {
  String diesel;
  String gasoline;

  public String getDiesel() {
    return diesel;
  }

  public String getGasoline() {
    return gasoline;
  }

  public void setDiesel(String diesel) {
    this.diesel = diesel;
  }

  public void setGasoline(String gasoline) {
    this.gasoline = gasoline;
  }

  public Engine(String diesel, String gasoline) {
    this.diesel = diesel;
    this.gasoline = gasoline;


  }
}
