public enum Color {
  КРАСНЫЙ("Красный", 1000),
  БЕЛЫЙ("Белый", 500),
  СИНИЙ("Синий", 1100),
  ЗЕЛЕНЫЙ("Зеленый", 1150),
  ЖЕЛТЫЙ("Желтый", 900),
  ЧЕРНЫЙ("Черный", 1500);


  public final String colorName;
  public final Integer colorPrice;


  private Color(String colorName, Integer colorPrice) {
    this.colorName = colorName;
    this.colorPrice = colorPrice;
  }
}