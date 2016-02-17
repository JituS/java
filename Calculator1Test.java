import static org.junit.Assert.assertEquals;
import org.junit.Test;
import calculator.main.Calculator;

public class Calculator1Test {
  @Test
  public void evaluatesExpression() {
    Calculator c = new Calculator();
    assertEquals(4, c.add(4).isEqaulTo());
  }
}