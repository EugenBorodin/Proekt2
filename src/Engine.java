public enum Engine {
  DIESEL("дизель", 10000),
  GASOLINE("бензин", 12000);

  public final String engineType;
  public final Integer enginePrise;

  private Engine(String engineType, Integer enginePrise) {
    this.engineType = engineType;
    this.enginePrise = enginePrise;
  }
}

