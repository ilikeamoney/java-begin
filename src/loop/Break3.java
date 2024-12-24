package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        // for문 안에서 선언한 변수 i는 for문 밖에서 사용할 수 없다.
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 i= "+ i +  "sum = " + sum);
                break;
            }
        }
    }
}
