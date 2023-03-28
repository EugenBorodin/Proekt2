import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Выбрать цвет (Красный/Синий/Зеленый/Желтый/Черный): ");
    String color = br.readLine();

    System.out.println("Выбрать тип двигателя: ");
    String engine = br.readLine();

    System.out.println("Выбрать коробку передач: ");
    String gear = br.readLine();
  }
}
 // Тип двигателя
// Цвет
// Коробка передач