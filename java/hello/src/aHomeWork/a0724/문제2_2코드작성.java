package a0724;

public class 문제2_2코드작성 {
    public static void main(String[] args) {
        int[] arr = { 85, 90, 78, 92, 88 };
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}