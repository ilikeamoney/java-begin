package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격 입력 (-1 종료)");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("수량을 입력");
            int quantity = sc.nextInt();

            int totalCoast = price * quantity;
            System.out.println("총 비용 = " + totalCoast);
        }
    }
}
