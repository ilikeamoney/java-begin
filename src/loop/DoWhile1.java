package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // while 조건문이 참이 아니여도 반드시 실행해야 할 경우에 씀
        do {
            System.out.println("현재 숫자는 = " + i);
            i++;
        } while (i < 10);

        System.out.println("현재 숫자는 = " + i);
    }
}
