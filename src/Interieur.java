public enum Interieur {
  КОЖА("Кожа",1000),
  АЛЬКАНТАРА("Алькантара", 1400),
  ТЕКСТИЛЬ("Текстиль",500);

  public final String interieurName;
  public final Integer interieurPrice;

  private Interieur(String interieurName,Integer interieurPrice){
    this interieurName = interieurName;
    this interieurPrice = interieurPrice;
  }
}
