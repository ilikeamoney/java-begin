package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 입금 | 2.출금 | 3. 계좌확인 | 4. 종료");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("입금할 금액을 입력하세요 = ");
                int deposit = sc.nextInt();
                balance = deposit(balance, deposit);
            } else if (option == 2) {
                System.out.print("출금할 금액을 입력하세요 = ");
                int withdraw = sc.nextInt();
                balance = withdraw(balance, withdraw);
            } else if (option == 3) {
                System.out.println("현재 잔액 = " + balance);
            } else if (option == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        System.out.println(depositAmount + "원 입금되었습니다.");
        return balance + depositAmount;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("잔액이 부족합니다");
            return balance;
        }

        System.out.println(withdrawAmount + "금이 출금되었습니다.");
        return balance - withdrawAmount;
    }
}
