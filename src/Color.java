public enum Color {
  RED("Красный", 1000),
  WHITE("Белый", 500),
  BLUE("Синий", 1100),
  GREEN("Зеленый", 1150),
  YELLOW("Желтый", 900),
  BLACK("Черный", 1500);


  public final String colorName;
  public final Integer colorPrice;


  private Color(String colorName, Integer colorPrice) {
    this.colorName = colorName;
    this.colorPrice = colorPrice;
  }
}