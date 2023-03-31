import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class CarMain {
  static final String Red = "\u001B[31m";
  static final String Blu = "\033[34m";
  static final String Green = "\033[32m";
  static final String RESET = "\u001B[0m";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(Red + "ДОБРО ПОЖАЛОВАТЬ В АВТОСАЛОН ===ТРИ ТОВАРИЩА===" + RESET);
    System.out.println("Введите Имя Фамилию и тел.номер:");
    Person client = new Person(br.readLine(), br.readLine());
    System.out.println(Blu + "Ваше Имя пользователя: " + RESET + client.getName());
    System.out.println(Green + "Номер Вашего телефона: " + RESET + client.getPhone());

    Car car = Car.readCar();
    car.printCar();
    System.out.println(client.getName() + " Стоимость выбранной вами комплектации == "
        + car.finalPrice() + " €");


    System.out.printf(client.getName() + Red + " Выберете способ оплаты:%nНаличный расчет" +
        " в нашем офисе -- Выберете: 1%n" +
        "Безналичный расчет -- Выберете: 2%n" + RESET);
    try {
      int payment = Integer.parseInt(br.readLine());
      if (payment == 1) {
        System.out.println(client.getName() + " Будем рады вас видеть у нас в офисе" +
            " в любой удобный для вас день");
      }
      if (payment == 2) {
        System.out.println(client.getName() + " Введите адрес EMAIL" +
            " мы отправим Вам счет на оплату:");
      } else {
        System.out.println(client.getName() + " Вы ввели некорректное число!");
      }

      String email = br.readLine();
      while (!email.contains("@")) {
        //throw new InvalidEmail(email);
        System.out.println(client.getName() + " Введите корректный EMAIL: ");
        email = br.readLine();
        if (email.contains("@")) {
          System.out.println(client.getName() + " Счет на оплату был выслан на: " + email);
        }
      }
      LocalDate date = LocalDate.now();
      System.out.println(client.getName() + Red + " Поздравляем Вас вы заказали лучший" + RESET +
         Blu + " автомобиль в нашем городе " + Green + "Дата заказа" + date);
    } catch (NumberFormatException e) {
      System.err.println("Некорректный ввод " + e.getMessage());
    }
  }
}

