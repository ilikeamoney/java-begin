package method;

public class Method2 {
    public static void main(String[] args) {
        printfHeader();
        System.out.println("프로그램이 동작합니다");
        printfFooter();
    }

    public static void printfHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
    }

    public static void printfFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
