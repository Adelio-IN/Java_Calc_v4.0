// 계산기 v3.0 관련 클래스
// https://github.com/Adelio-IN/Cal_v3.0/issues/2
public class ScientificCalculator extends AdvancedCalculator {
    @Override
    public int involution() {
        result = (int)Math.pow(num1, num2);
        return result;
    }
}
