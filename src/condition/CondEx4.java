package condition;

public class CondEx4 {
    public static void main(String[] args) {
        double rating = 8;

        // 내가 설정한 평점보다 높은 영화가 추천되어야 하기 때문에
        // 설정한 값보다 낮아야 출력이 된다.
        if (rating <= 9) {
            System.out.println("어바웃 타임 추천");
        }
        if (rating <= 8) {
            System.out.println("토이 스토리 추천");
        }
        if (rating <= 7) {
            System.out.println("고질라 추천");
        }
    }
}
