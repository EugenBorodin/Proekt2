import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class CarMain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Car car = new Car(30000);
    while (car.getColor() == null) {
      try {
        System.out.println("Выберите цвет вашей новой машины (RED/WHITE/BLUE/GREEN/YELLOW/BLACK): ");
        car.setColor(Color.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.out.println("Такого цвета нет на складе, введите другой цвет: " + e.getMessage());
      }
    }
    while (car.getEngine() == null) {
      try {
        System.out.println("Выберете тип двигателя (DIESEL / GASOLINE): ");
        car.setEngine(Engine.valueOf(br.readLine().toUpperCase()));
      } catch (IllegalArgumentException e) {
        System.out.println("Введите тип двигателя как указано в примере!!! (DIESEL / GASOLINE)" + e.getMessage());
      }
      car.printCar();
      System.out.println("Стоимость выбранной вами комплектации = " + car.finalPrice());

      LocalDate date = LocalDate.now();
      System.out.println("Сегодня: " + date);
    }
  }
}
