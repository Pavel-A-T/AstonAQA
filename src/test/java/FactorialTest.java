import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test(description = "Позитивный тест проверки расчета факториала")
    public void positiveTest() {

        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
    }

    @Test(description = "Негативный тест проверки расчета факториала")
    public void negativeTest() {
        assertNotEquals(800, Factorial.factorial(5));
    }
}
