public class Car {
  private CarModel model;
  private Color color;
  private Engine engine;
  private Gear gear;
  private Interior interior;

  private Interior price;

  public CarModel getModel() {
    return model;
  }

  public void setModel(CarModel model) {
    this.model = model;
  }

  public Car() {
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setGear(Gear gear) {
    this.gear = gear;
  }

  public Gear getGear() {
    return gear;
  }

  public Interior getInterior() {
    return interior;
  }

  public void setInterior(Interior interior) {
    this.interior = interior;
  }

  public void setPrice(Interior price) {
    this.price = price;
  }

  public void printCar(){
    if (model != null){
      System.out.println("Модель вашей машины: " + model.carName);
    }
    if (color != null){
      System.out.println("Цвет вашей машины: " + color.colorName);
    }
    if(engine != null) {
      System.out.println("Двигатель: " + engine.engineType);
    }
    if(gear !=null) {
      System.out.println("Коробка передач: " + gear.gearType);
    }

    if(interior != null){
      System.out.println("interier" + interior.interiorPrice);
    }

  }
    public Integer finalPrice(){
      return color.colorPrice + engine.enginePrise;
    }
  }

