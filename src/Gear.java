public enum Gear {
  AUTO("автомат", 9000),
  MANUAL("механика", 5000);

  public final String gearType;
  public final Integer gearPrice;

  private Gear(String gearType, Integer gearPrice) {
    this.gearType = gearType;
    this.gearPrice = gearPrice;
  }
}
