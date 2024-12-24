package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액 = " + balance);
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
