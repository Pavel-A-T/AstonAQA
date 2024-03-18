import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    @DisplayName("Позитивный тест проверки расчета факториала")
    public void positiveTest() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    @DisplayName("Негативный тест проверки расчета факториала")
    public void negativeTest() {
        assertNotEquals(800, Factorial.factorial(5));

    }
}
