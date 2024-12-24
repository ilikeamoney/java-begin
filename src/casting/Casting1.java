package casting;

public class Casting1 {
    public static void main(String[] args) {
        // int < long < double
        int intValue = 10;
        long longValue;
        double doubleValue;
        
        longValue = intValue; // 작은 범위를 큰 범위에 넣는 것은 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // 작은 범위를 큰 범위에 넣는 것은 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // 작은 범위를 큰 범위에 넣는 것은 가능
        System.out.println("doubleValue = " + doubleValue);
    }
}
