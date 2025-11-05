import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientificCalculator scientificCalculator;

    @BeforeEach
    void setUp() {
        scientificCalculator = new ScientificCalculator();
        scientificCalculator.setNumbers(5, 2);
    }
    @Test
    void involution() {
        assertEquals(25, scientificCalculator.involution());
    }
}