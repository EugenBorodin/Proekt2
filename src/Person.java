public class Person {
  private final String name;

  private final String phone;


  public Person(String name, String phone) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Имя не может быть пустым.");
    }
    if (phone == null || phone.isEmpty()) {
      throw new IllegalArgumentException("Телефон не может быть пустым.");
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
