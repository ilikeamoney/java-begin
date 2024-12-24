package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue); // 자료형 최댓값을 넘지 않는한 문제 없음

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);

        /*
        자료형의 최댓값을 넘는다면
        가장 작은 최솟값부터 다시 값이 출력이 된다. (오버플로우)
         */
    }
}
