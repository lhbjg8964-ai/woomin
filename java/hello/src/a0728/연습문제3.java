package a0728;

public class 연습문제3 {

    public static void main(String[] args) {

        int[] numbers = {15, 82, 34, 91, 48};

        int result = getMax(numbers);

        System.out.println("최댓값: " + result);
    }

    // 정수형 배열을 받아 가장 큰 값을 반환하는 메서드
    private static int getMax(int[] numbers) {

        // 배열의 첫 번째 값을 최댓값으로 설정
        int max = numbers[0];

        // 두 번째 값부터 마지막 값까지 반복
        for (int i = 1; i < numbers.length; i++) {

            // 현재 배열의 값이 max보다 크면
            if (numbers[i] > max) {

                // max를 현재 값으로 변경
                max = numbers[i];
            }
        }

        // 최종적으로 찾은 가장 큰 값 반환
        return max;
    }
}