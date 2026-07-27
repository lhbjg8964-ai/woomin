package a0727;

public class 문제3 {public static void main(String[] args) {
    // 다음 배열에서 가장 큰 숫자를 출력하시오
    int[] num = {15, 8, 32, 21, 10};
    

    // 배열의 첫 번째 값을 최댓값이라고 가정
        int max = num[0];

        // 두 번째 값부터 마지막 값까지 반복
        for (int i = 1; i < num.length; i++) {

            // 현재 배열 값이 max보다 큰지 확인
            if (num[i] > max) {

                // 더 큰 값이 발견되면 max를 변경
                max = num[i];
            }
        }

        // 최종 최댓값 출력
        System.out.println("최댓값 : " + max);
}
    
}
