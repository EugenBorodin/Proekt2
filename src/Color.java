public enum Color {
  RED("\033[31mКрасный\033[0m", 600),
  WHITE("Белый", 500),
  BLACK("Черный", 990);


  public final String colorName;
  public final Integer colorPrice;


  Color(String colorName, Integer colorPrice) {
    this.colorName = colorName;
    this.colorPrice = colorPrice;
  }
}