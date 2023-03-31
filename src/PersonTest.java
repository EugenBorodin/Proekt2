import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
  //Создание объекта Person с корректными значениями имени и телефона
  @Test
  public void testValidPerson() {
    String name = "John Smith";
    String phone = "+1 (123) 456-7890";
    Person person = new Person(name, phone);
    assertEquals(name, person.getName());
    assertEquals(phone, person.getPhone());
  }

  //Создание объекта Person с пустым значением имени:
  @Test(expected = IllegalArgumentException.class)
  public void testEmptyName() {
    String name = "";
    String phone = "+1 (123) 456-7890";
    Person person = new Person(name, phone);
  }

  // Создание объекта Person с пустым значением телефона:
  @Test(expected = IllegalArgumentException.class)
  public void testEmptyPhone() {
    String name = "John Smith";
    String phone = "";
    Person person = new Person(name, phone);
  }

  //Создание объекта Person с нулевым значением имени:
  @Test(expected = IllegalArgumentException.class)
  public void testNullName() {
    String name = null;
    String phone = "+1 (123) 456-7890";
    Person person = new Person(name, phone);
  }

  //Создание объекта Person с нулевым значением телефона:
  @Test(expected = IllegalArgumentException.class)
  public void testNullPhone() {
    String name = "John Smith";
    String phone = null;
    Person person = new Person(name, phone);
  }

  // Создание объекта Person с некорректным форматом телефона:
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidPhone() {
    String name = "John Smith";
    String phone = "12345"; // некорректный формат телефона
    Person person = new Person(name, phone);
  }
}
