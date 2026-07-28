package a0728;

public class 연습문제2 {

    public static void main(String[] args) {

        System.out.println(isEven(2));
        System.out.println(isEven(7));

    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}