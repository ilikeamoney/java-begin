package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력 (-1 종료)");

        while ((input = sc.nextInt()) != -1) {
            input = sc.nextInt();

            if (input == -1) {
                break;
            }

            sum += input;
            count++;
        }

        /*
        이렇게 축약할 수 있다.

        while ((input = sc.nextInt()) != -1) {
            sum += input;
            count++;
        }
         */

        double avg = (double) sum / count;

        System.out.println("평균 = " + avg);
    }
}
