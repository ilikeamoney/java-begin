package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수를 입력하셨습니다");
        } else {
            System.out.println("홀수를 입력하셨습니다");
        }
    }
}
