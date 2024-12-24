package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;

        for (int score : students) {
            total += score;
        }

        double avg = (double) total / students.length;
        System.out.println("점수 합계 = " + total);
        System.out.println("점수 평균 = " + avg);
    }
}
