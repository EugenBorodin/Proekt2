public enum Color {
  RED("Красный", 600),
  WHITE("Белый", 500),
  BLACK("Черный", 990);


  public final String colorName;
  public final Integer colorPrice;


  private Color(String colorName, Integer colorPrice) {
    this.colorName = colorName;
    this.colorPrice = colorPrice;
  }
}