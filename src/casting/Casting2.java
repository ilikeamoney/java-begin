package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; 컴파일 오류 발생
        intValue = (int)  doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue);

        /*
        * 이렇게 데이터를 사용하기 보단
        * 확인을 위해 단순히 데이터를 보기 위해 이런식으로 명시적 형변환을 사용해야함
        * */
    }
}
