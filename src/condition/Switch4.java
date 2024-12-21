package condition;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 1;

        // 자바 14부터 적용할 수 있는 새로운 switch case 문
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("할인 쿠폰 = " + coupon);
    }
}
