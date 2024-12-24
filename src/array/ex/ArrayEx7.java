package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.print("학생 수를 입력하세요 = ");
        row = sc.nextInt();

        int[][] scores = new int[row][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < row; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }

            double avg = (double) total / scores[i].length;
            System.out.println((i + 1) + "학생의 총점 = " + total);
            System.out.println((i + 1) + "학생의 평균 = " + avg);
        }
    }
}
