package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        System.out.print("음식 이름을 입력하세요 ");
        String foodName = sc.nextLine();

        System.out.print("음식 가격을 입력하세요 ");
        int foodPrice = sc.nextInt();

        System.out.print("음식 수량을 입력하세요 ");
        int foodQuantity = sc.nextInt();

        totalPrice += foodPrice * foodQuantity;

        System.out.println(foodName + " 주문 총 금액은 = " + totalPrice);
    }
}
