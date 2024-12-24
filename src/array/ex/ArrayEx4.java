package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0;

        System.out.println("5개의 정수 입력");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        avg = (double) sum / numbers.length;

        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
