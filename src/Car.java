import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
  private CarModel model;
  private Color color;
  private Engine engine;
  private Gear gear;
  private Interior interior;


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


  public void printCar() {
    if (model != null) {
      System.out.println("Модель вашей машины: " + model.carName);
    }
    if (color != null) {
      System.out.println("Цвет вашей машины: " + color.colorName);
    }
    if (engine != null) {
      System.out.println("Двигатель: " + engine.engineType);
    }
    if (gear != null) {
      System.out.println("Коробка передач: " + gear.gearType);
    }

    if (interior != null) {
      System.out.println("Салон Автомобиля:" + interior.interiorName);
    }

  }

  public Integer finalPrice() {
    return model.carPrice + color.colorPrice + engine.enginePrise + gear.gearPrice
        + interior.interiorPrice;
  }

  public static Car readCar() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Car car = new Car();
    while (car.getModel() == null) {
      try {
        System.out.printf("Выберите Автомобиль своей мечты:%nBMW3-70000€%nBMW5-80000€%n" +
            "BMW7-90000€%n");
        car.setModel(CarModel.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.err.println("Такого автомобиля нет в нашем салоне: " + e.getMessage());
      }
    }

    while (car.getColor() == null) {
      try {
        System.out.printf("Выберите цвет вашей новой машины:%nRED-600€%nWHITE-500€%nBLACK-990€%n");
        car.setColor(Color.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.err.println("Такого цвета нет на складе, введите другой цвет: " + e.getMessage());
      }
    }

    while (car.getEngine() == null) {
      try {
        System.out.printf("Выберете тип двигателя:%nDIESEL-10000€%nGASOLINE-12000%n");
        car.setEngine(Engine.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.err.println("Введите тип двигателя как указано в примере!!!" +
            " (DIESEL / GASOLINE)" + e.getMessage());
      }

      while (car.getGear() == null) {
        try {
          System.out.printf("Выберите тип коробки передач:%nAUTO-9000€%nMANUEL-5000€%n");
          car.setGear(Gear.valueOf(br.readLine().toUpperCase()));
        } catch (IllegalArgumentException e) {
          System.out.println("Такой коробки передач нет в нашем салоне: " + e.getMessage());
        }
      }
      while (car.getInterior() == null) {
        try {
          System.out.printf("Выберите обшивку сидений:%nLEATHER-1000€%nALCANTARA-1400€%n" +
              "TEXTILE-500€%n");
          car.setInterior(Interior.valueOf(br.readLine().toUpperCase()));
        } catch (IllegalArgumentException e) {
          System.out.println("Такой коробки передач нет в нашем салоне: " + e.getMessage());
        }
      }
    }
    return car;
  }
}


