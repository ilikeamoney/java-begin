package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작 (if 문 안에서만 생존)
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

//        System.out.println("main x = " + x); x에 접근 할 수 없음
        System.out.println("main m = " + m); // m에 접근 가능
    } // m 생존 종료
}
