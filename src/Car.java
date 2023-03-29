public class Car {
  private Color color;
  private Engine engine;
  private Gear gear;
  private Integer price;

  public Car() {
  }

  public Car(Integer price) {
    this.price = price;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
  public void setPrice(Integer price){
    this.price = price;
  }
  public Integer getPrice(){
    return price;
  }
  public void printCar(){
    if(color!=null){
      System.out.println("Цвет вашей машины: " + color.colorName);
    }
  }
}
