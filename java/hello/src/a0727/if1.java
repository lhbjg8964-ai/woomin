package a0727;

public class if1 {public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5};

        int sum = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {      // 짝수 인덱스
                product *= arr[i];
            } else {               // 홀수 인덱스
                sum += arr[i];
            }
        }

        System.out.println("홀수 인덱스 합 : " + sum);
        System.out.println("짝수 인덱스 곱 : " + product);
        System.out.println("결과(합 - 곱) : " + (sum - product));
    }
}
