package a0727;

public class 문제2 {public static void main(String[] args) {
    // 다음 배열에서 80점 이상인 학생의 수를 출력하시오
    int[] score = {95, 70, 82, 65, 88};


    // 80점 이상인 학생 수를 저장할 변수
        int count = 0;

        // 배열의 처음부터 끝까지 반복
        for (int i = 0; i < score.length; i++) {

            // 현재 점수가 80점 이상인지 확인
            if (score[i] >= 80) {

                // 80점 이상이면 학생 수를 1 증가
                count++;
            }
        }

        // 80점 이상 학생 수 출력
        System.out.println("80점 이상 학생 수 : " + count);

    }
}

    

