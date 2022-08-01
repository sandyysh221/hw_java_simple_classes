import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(2, calculator.addNumbers(1, 1));
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtractNumbers(5, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculator.multiplyNumbers(2, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divideNumbers(10, 2), 0.01);
    }

}
