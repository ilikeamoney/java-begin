package array;

 /*
    변수는 기본형과 참조형으로 나뉜다.
    기본형은 값을 직관적으로 바로 저장해서 사용할 수 있다.
    참조형은 주소를 메모리에 저장하고 그 주소값을 참조해서 사용할 수 있다.
*/

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성 (참조 주소를 배열 변수에 대입)

        // 뱐수값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수값 사용
        System.out.println("학생1 점수 = " + students[0]);
        System.out.println("학생2 점수 = " + students[1]);
        System.out.println("학생3 점수 = " + students[2]);
        System.out.println("학생4 점수 = " + students[3]);
        System.out.println("학생5 점수 = " + students[4]);

    }
}
