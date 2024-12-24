package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -2147483647;
        int min = 2147483647;
        int len;
        int[] numbers;

        System.out.println("입력받을 갯수를 정하세요");
        len = sc.nextInt();
        numbers = new int[len];

        System.out.println(len + "개의 입력을 받습니다.");
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("최댓값 = " + max);
        System.out.println("최솟값 = " + min);
    }
}
