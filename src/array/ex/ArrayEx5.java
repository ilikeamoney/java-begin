package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers;
        int len;
        int sum = 0;
        double avg = 0;

        System.out.println("입력받을 갯수를 정하세요");

        len = sc.nextInt();
        numbers = new int[len];

        System.out.println(len + "개의 숫자를 입력하세요");
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        avg = (double) sum / len;

        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
