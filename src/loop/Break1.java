package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // break문은 특정 조건에서 반복문을 종료해야 할 때 사용한다.
        while (true) {
            sum += i;
            if (sum > 10) {
                break;
            }
            i++;
        }
    }
}
