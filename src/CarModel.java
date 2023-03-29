public enum CarModel {
  GLE("Mercedes", 60000),
  GLS("Mercedes", 100000),
  GLA("Mercedes",35000),
  GLC("Mercedes",45000);

  public final String carName;
  public final Integer carPrice;


  CarModel(String carName, Integer carPrice) {
    this.carName = carName;
    this.carPrice = carPrice;
  }
}
