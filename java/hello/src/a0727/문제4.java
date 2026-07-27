package a0727;

public class 문제4 {public static void main(String[] args) {
    //다음 배열중 짝수만 합하여 총합을 구하시오
    int[] num = {3,8,11,6,9,2}; 


     // 짝수의 합을 저장할 변수
        int sum = 0;

        // 배열의 처음부터 끝까지 반복
        for (int i = 0; i < num.length; i++) {

            // 현재 값이 짝수인지 확인
            if (num[i] % 2 == 0) {

                // 짝수이면 sum에 더하기
                sum += num[i];
            }
        }

        // 짝수의 합 출력
        System.out.println("짝수의 합 : " + sum);
}
    
}
