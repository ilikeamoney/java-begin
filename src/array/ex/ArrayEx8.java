package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = new String[10];
        int[] prices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                if (productCount == items.length - 1) {
                    System.out.println("상품을 더 이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("상품의 이름을 입력하세요");
                items[productCount] = sc.nextLine();

                System.out.println("상품의 가격을 입력하세요");
                prices[productCount] = sc.nextInt();

                productCount++;
            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                System.out.println("전체 상품을 출력합니다.");
                for (int i = 0; i < productCount; i++) {
                    System.out.print(items[i] + "   " + prices[i] + "원\n");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
