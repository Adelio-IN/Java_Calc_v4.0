import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {
    AdvancedCalculator advancedCalc;

    @BeforeEach
    void setUp() {
        advancedCalc = new AdvancedCalculator();
        advancedCalc.setNumbers(9, 3);
    }

    // 곱셈 단위 테스트 완료
    // https://github.com/Adelio-IN/Java_Calc_V2/issues/4
    @Test
    void testMultiply() {
        assertEquals(27, advancedCalc.multiply());
    }

    // 나눗셈 단위 테스트 완료
    // https://github.com/Adelio-IN/Java_Calc_V2/issues/5
    @Test
    void testDivide() {
        assertEquals(3, advancedCalc.divide());
    }
}