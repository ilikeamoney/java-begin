package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2*3 2차원 배열을 만든다.

        int[][] arr = new int[2][3]; // 2차원 배열 선언

        // 변수값 대입
        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 1열
        arr[0][2] = 3; //0행 2열
        arr[1][0] = 4; //1행 0열
        arr[1][1] = 5; //1행 1열
        arr[1][2] = 6; //1행 2열

        for (int row = 0; row < 2; row++) {
            System.out.println(arr[row][0]);
            System.out.println(arr[row][1]);
            System.out.println(arr[row][2]);
        }
    }
}
