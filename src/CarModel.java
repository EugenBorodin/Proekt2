public enum CarModel {
  BMW3("BMW-M3", 70000),
  BMW5("BMW-M5", 80000),
  BMW7("BMW-7ALPINE",90000);


  public final String carName;
  public final Integer carPrice;


  CarModel(String carName, Integer carPrice) {
    this.carName = carName;
    this.carPrice = carPrice;
  }
}
