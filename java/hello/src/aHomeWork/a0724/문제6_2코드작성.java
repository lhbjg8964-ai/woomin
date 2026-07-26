package a0724;

import java.util.Arrays;

public class 문제6_2코드작성 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};

        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random() * 5);

            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}