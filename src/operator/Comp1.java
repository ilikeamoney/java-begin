package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // 같다
        System.out.println(a != b); // 같지 않다
        System.out.println(a > b); // 크다
        System.out.println(a < b); // 작다
        System.out.println(a >= b); // 크거나 같다
        System.out.println(a <= b); // 작거나 같다

        // 결과를 boolean에 담는다
        boolean bool = a == b;
        System.out.println(bool);
    }
}
