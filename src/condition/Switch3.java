package condition;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        // 비교할 대상을 switch 문에 넣음
        switch (grade) {

            // 각각의 케이스 마다 비교
            // 반드시 break;문을 넣어야 블록을 탈출하고 종료됨
            case 1:
                coupon = 1000;
                break;
            case 2:
                // break 문이 없으면 break;문을 만날때 까지 케이스 비교
            case 3:
                coupon = 3000;
                break;
            default:
                // 어떤 케이스에도 해당이 되지 않는 경우
                coupon = 500;
        }

        System.out.println("할인받은 쿠폰 = " + coupon);
    }
}
