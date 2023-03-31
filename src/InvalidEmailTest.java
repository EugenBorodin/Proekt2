import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class InvalidEmailTest {


  @Test  // создание объекта InvalidEmail не должно вызвать исключение
  public void testValidEmail() {
    String email = "test@example.com";
    try {

      InvalidEmail invalidEmail = new InvalidEmail(email);
    } catch (IllegalArgumentException e) {
      fail("Неожиданное исключение: " + e.getMessage());
    }
  }
}