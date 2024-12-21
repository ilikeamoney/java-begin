package condition;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;

        // 삼항 연산자 사용하는 방법 오른쪽이 참 왼쪽이 거짓
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + ", status = " + status);
    }
}
