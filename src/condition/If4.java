package condition;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        /*
        else if 문을 사용하면 조건문을 하나로 묶을 수 있다
        특정 조건에만 해당하는 문장을 실행하고 조건문 전체가 끝남
         */

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
