package method;

public class OverLoading2 {
    public static void main(String[] args) {
        myMethod(1, 2.0);
        myMethod(2.0,1);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
