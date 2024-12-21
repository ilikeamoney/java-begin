package condition;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int discount = 0;
        int age = 10;

        /*
        중복할인이 가능한 비즈니스의 경우 if문을 각각 사용한다.
         */

        if (price >= 10000) {
            discount += (int) (price * 0.1);
        }

        if (age <= 10) {
            discount += (int) (price * 0.1);
        }

        price -= discount;
        System.out.println("결제 금액 = "+ price);
        System.out.println("할인 금액 = " + discount);
    }
}
