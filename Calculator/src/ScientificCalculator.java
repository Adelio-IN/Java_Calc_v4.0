// 계산기 v3.0 관련 클래스
// https://github.com/Adelio-IN/Cal_v3.0/issues/2
public class ScientificCalculator extends AdvancedCalculator {
    @Override
    public int involution() {
        result = (int) Math.pow(num1, num2);
        return result;
    }


    public long factorial() {
        if (num1 < 0) {
            System.out.println("정수로 해주세요");
            return -1; // -1 인 이유 0! = 1 이라서 0 대신 -1 을 넣었습니다.
        }

        long facto = 1;
        for (int i = 1; i <= num1; i++) {
            facto *= i;
        }

        result = (int) facto;
        return facto;
    }
}
