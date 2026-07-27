package a0727;

public class 문제1 {
    public static void main(String[] args) {

        // 학생들의 점수를 배열에 저장
        int[] score = {76, 55, 45, 92, 84};

        // 총점을 저장할 변수
        int sum = 0;

        // 평균을 저장할 변수
        // 평균은 소수점이 나올 수 있으므로 double 사용
        double ave = 0;

        // 배열의 처음(0번 인덱스)부터 마지막까지 반복
        for (int i = 0; i < score.length; i++) {

            // 학생 번호는 1번부터 시작하므로 i+1 출력
            // score[i]는 현재 학생의 점수
            System.out.println((i + 1) + "번 학생 : " + score[i]);

            // 현재 학생의 점수를 총점(sum)에 계속 더하기
            // 예)
            // 첫 번째 : sum = 0 + 76
            // 두 번째 : sum = 76 + 55
            // 세 번째 : sum = 131 + 45
            sum += score[i];

            // 평균 계산
            // (double)로 형변환하여 소수점까지 계산
            // score.length는 학생 수(배열의 길이)
            ave = (double) sum / score.length;
        }

        // 반복문이 끝난 후 최종 총점 출력
        System.out.println("총점 : " + sum);

        // 최종 평균 출력
        System.out.println("평균 : " + ave);
    }
}