public enum Interior {
  LEATHER("Кожа", 1000),
  ALCANTARA("Алькантара", 1400),
  TEXTILE("Текстиль", 500);

  public final String interiorName;
  public final Integer interiorPrice;

  Interior(String interiorName, Integer interiorPrice) {
    this.interiorName = interiorName;
    this.interiorPrice = interiorPrice;
  }
}
