package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        /*
        메서드 매개변수에도 메모리 주소가 큰 자료형에 작은 값을 넣을 때는 문제없이 들어간다.
        하지만 반대로는 오버플로우가 발생한다.
         */
        int number = 100;
        printNumber(number);
    }

    public static void printNumber (double n) {
        System.out.println("숫자 = " + n);
    }
}
