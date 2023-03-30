import org.junit.Test;
import static org.junit.Assert.*;

public class CarModelTest {
  // Тестирование свойства carName
  @Test
  public void testCarModelName() {
    assertEquals("BMW-M3", CarModel.BMW3.carName);
    assertEquals("BMW-M5", CarModel.BMW5.carName);
    assertEquals("BMW-7ALPINA", CarModel.BMW7.carName);
  }
  // Тестирование свойства carPrice
  @Test
  public void testCarModelPrice() {
    assertEquals(Integer.valueOf(70000), CarModel.BMW3.carPrice);
    assertEquals(Integer.valueOf(80000), CarModel.BMW5.carPrice);
    assertEquals(Integer.valueOf(90000), CarModel.BMW7.carPrice);
  }
}
