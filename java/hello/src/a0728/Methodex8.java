package a0728;

//함수를 이용해 배열의 평균을 구하시오
public class Methodex8 {

    public static void main(String[] args) {

        int[] score = {90, 80, 70, 100};

        System.out.println(avg(score));

    }

    // 배열의 평균을 구하는 메서드
    private static double avg(int[] score) {

        int sum = 0;

        // 배열의 모든 값을 더함
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // 평균을 계산하여 반환
        return (double) sum / score.length;
    }

}