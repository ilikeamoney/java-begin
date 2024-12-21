package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); // AND 연산은 둘다 참이여야 결과가 참이된다.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); // OR 연산은 하나만 참이면 결과가 참이된다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("!: NOT 연산"); // 결과를 부정하는 연산자
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
