public enum Gear {
  AUTO("АККП", 9000),
  MANUAL("МКП", 5000);

  public final String gearType;
  public final Integer gearPrice;

  Gear(String gearType, Integer gearPrice) {
    this.gearType = gearType;
    this.gearPrice = gearPrice;
  }
}
