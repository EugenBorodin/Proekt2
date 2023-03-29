import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class CarMain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ДОБРО ПОЖАЛОВАТЬ В АВТОСАЛОН ===ТРИ ТОВАРИЩА===");

    Car car = new Car();
    while (car.getModel() == null) {
      try {
        System.out.printf("Выберите Автомобиль своей мечты:%nBMW3-70000€%nBMW5-80000€%n" +
            "BMW7-90000€%n");
        car.setModel(CarModel.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.out.println("Такого автомобиля нет в нашем салоне: " + e.getMessage());
      }
    }

    while (car.getColor() == null) {
      try {
        System.out.printf("Выберите цвет вашей новой машины:%nRED-600€%nWHITE-500€%nBLACK-990€%n");
        car.setColor(Color.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.out.println("Такого цвета нет на складе, введите другой цвет: " + e.getMessage());
      }
    }

    while (car.getEngine() == null) {
      try {
        System.out.printf("Выберете тип двигателя:%nDIESEL-10000€%nGASOLINE-12000%n");
        car.setEngine(Engine.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.out.println("Введите тип двигателя как указано в примере!!!" +
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

      car.printCar();
      System.out.println("Стоимость выбранной вами комплектации = " + car.finalPrice() + " €");

      LocalDate date = LocalDate.now();
      System.out.println("Вы купили автомобиль " + date);
    }
  }
}
