import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
  private final String name;

  private final String phone;
  private static final Pattern PATTERN = Pattern.compile
      ("^\\+\\d{1,3}\\s\\d{1,3}\\s\\d{4,10}$");


  public Person(String name, String phone) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Имя не может быть пустым.");
    }
    if (phone == null || phone.isEmpty()) {
      throw new IllegalArgumentException("Телефон не может быть пустым.");
    }
    Matcher matcher = PATTERN.matcher(phone);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Некорректный формат телефона.");
    }
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }
}
