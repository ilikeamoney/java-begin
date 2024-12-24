package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 0;

        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
//        System.out.println("temp = " + temp); 필요한 범위내에서 선언했기 때문에 메모리 공간이 낭비되지 않는다.
    }
}
