package a0727;

public class 문제5 {public static void main(String[] args) {
    int[] arr={2,3,4,5};



    // 홀수 인덱스 값의 합을 저장
        int sum = 0;

        // 짝수 인덱스 값의 곱을 저장
        // 곱셈은 1부터 시작해야 함
        int mul = 1;

        // 배열의 모든 인덱스를 반복
        for (int i = 0; i < arr.length; i++) {

            // 인덱스가 짝수인지 확인
            if (i % 2 == 0) {

                // 짝수 인덱스의 값을 곱함
                mul *= arr[i];

            } else {

                // 홀수 인덱스의 값을 더함
                sum += arr[i];
            }
        }

        // 홀수 인덱스 합에서 짝수 인덱스 곱을 뺀 결과
        System.out.println("결과 : " + (sum - mul));
}
    
}
