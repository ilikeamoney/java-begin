package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; // a값을 먼저 증가시키고 결과를 출력
        System.out.println("a = " + a + " b = " + b);

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // 값을 증가 시키지 않고 b에 저장 후 다음줄에서 증가
        System.out.println("a = " + a + " b = " + b);
    }
}
