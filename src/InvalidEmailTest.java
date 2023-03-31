import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class InvalidEmailTest {
  @Test
  public void testValidEmail() {
    String email = "test@example.com";
    try {
      // создание объекта InvalidEmail не должно вызвать исключение
      InvalidEmail invalidEmail = new InvalidEmail(email);
    } catch (IllegalArgumentException e) {
      fail("Неожиданное исключение: " + e.getMessage());
    }
  }


  @Test
  public void testInvalidEmail() {
    String email = "test-example.com"; // некорректный формат email адреса
    try {
      // создание объекта InvalidEmail должно вызвать исключение
      InvalidEmail invalidEmail = new InvalidEmail(email);
      fail("Ожидалось исключение InvalidEmail, но оно не было выброшено");
    } catch (InvalidEmail e) {
      assertEquals("Некорректный E-MAIL: " + email, e.getMessage());
    } catch (IllegalArgumentException e) {
      fail("Ожидалось исключение InvalidEmail, но было выброшено исключение другого типа: " + e.getMessage());
    }
  }
  @Test
  public void testNullEmail() {
    String email = null;
    try {
      // создание объекта InvalidEmail должно вызвать исключение
      InvalidEmail invalidEmail = new InvalidEmail(email);
      fail("Ожидалось исключение InvalidEmail, но оно не было выброшено");
    } catch (InvalidEmail e) {
      assertEquals("Некорректный E-MAIL: " + email, e.getMessage());
    } catch (IllegalArgumentException e) {
      fail("Ожидалось исключение InvalidEmail, но было выброшено исключение другого типа: " + e.getMessage());
    }
  }
}