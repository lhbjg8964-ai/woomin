package a0728;

//짝수인지 홀수인지 판단
public class Methodex9 {

    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println(isEven(7));

    }

    private static boolean isEven(int num) {
        return num % 2 == 0;

    }
}