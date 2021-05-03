import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator numbers;
    @Before
    public void before() {
        numbers = new Calculator(6,4);
    }

    @Test
    public void canAdd() {
        assertEquals(10, numbers.add(), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(2, numbers.subtract(), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(24, numbers.multiply(), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(1.5, numbers.divide(), 0.01);
    }
}
