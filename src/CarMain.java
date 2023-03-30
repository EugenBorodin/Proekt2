import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class CarMain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ДОБРО ПОЖАЛОВАТЬ В АВТОСАЛОН ===ТРИ ТОВАРИЩА===");

    Car car = Car.readCar();
    car.printCar();
    System.out.println("Стоимость выбранной вами комплектации = " + car.finalPrice() + " €");


    System.out.printf("Выберете способ оплаты:%nНаличный расчет в нашем офисе -- Выберете: 1%n" +
        "Безналичный расчет -- Выберете: 2%n");
    try {
      int payment = Integer.parseInt(br.readLine());
      if (payment == 1) {
        System.out.println("Будем рады вас видеть у нас в офисе в любой удобный для вас день");
      } else {
        System.out.println("Введите адрес EMAIL мы отправим Вам счет на оплату:");
      }

      String email = br.readLine();
      while (!email.contains("@")) {
        //throw new InvalidEmail(email);
        System.out.println("Введите корректный EMAIL: ");
      }
      System.out.println("Счет на оплату был выслан на: " + email);

      LocalDate date = LocalDate.now();
      System.out.println("Поздравляем Вас вы заказали лучший автомобиль в нашем городе " + date);
    } catch (NumberFormatException e) {
      System.err.println("Некорректный ввод " + e.getMessage());
    }
  }
}

