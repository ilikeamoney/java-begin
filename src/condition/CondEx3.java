package condition;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 10;
        int won = 0;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            won = 1300 * dollar;
        }

        System.out.println("환전금액은 = " + won + "원 입니다.");
    }
}
