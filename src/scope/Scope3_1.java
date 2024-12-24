package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {
            /*
            if 블록에서만 필요한 temp변수를 굳이 main 메서드 안에서 선언해서
            메모리 낭비를 초례하므로 적절한 변수 생명주기를 선언해서 변수를 사용해야 한다.
             */
            temp = m * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("m = " + m);
    }
}
