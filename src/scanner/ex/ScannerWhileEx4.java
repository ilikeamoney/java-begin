package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCoast = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine();

                System.out.println("상품의 이름을 입력");
                String itemName = sc.nextLine();

                System.out.println("상품의 가격을 입력");
                int price = sc.nextInt();

                System.out.println("수량을 입력하세요");
                int quantity = sc.nextInt();

                totalCoast += price * quantity;
                System.out.println("상품명 = " + itemName + " 가격 = " + price + " 수량 = " + quantity + " 합계" + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용 = " + totalCoast);
            } else if (option == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 입력값을 입력하세요");
            }
        }
    }
}
