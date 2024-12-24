package method;

public class OverLoading1 {
    public static void main(String[] args) {
        /*
        메서드 시그니처는 타입을 보고 오버로딩을 구분한다.
         */
        System.out.println("1 = " + add(1, 2));
        System.out.println("2 = " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
