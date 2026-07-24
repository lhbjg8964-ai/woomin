import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {

        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 섞기 전 배열 출력
        System.out.println("섞기 전: " + Arrays.toString(numArr));

        // 배열을 100번 섞기
        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10); // 0~9 중 임의의 값

            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        // 섞은 후 배열 출력
        System.out.println("섞은 후: " + Arrays.toString(numArr));
    }
}